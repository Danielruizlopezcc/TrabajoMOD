package lsi.us.es.mis.xtext.generator


import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import pricing.Pricing
import pricing.Plan
import pricing.Feature
import pricing.Renewable
import pricing.NonRenewable
import pricing.AddOn

/**
 * Generador M2T que produce un fichero .yaml a partir del modelo Pricing.
 * Usa concatenación de Strings con \n para respetar la indentación YAML
 * (patrón slides 35-50 — obligatorio para YAML porque la indentación es semántica).
 */
class MyPricingDslYAMLGenerator extends AbstractGenerator {

    override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        fsa.generateFile(
            resource.className + ".yaml",
            toYAML(resource.contents.head as Pricing)
        )
    }

    def className(Resource res) {
        var name = res.URI.lastSegment
        return name.substring(0, name.indexOf('.'))
    }

    // -------------------------------------------------------------------------
    // Métodos auxiliares de indentación (patrón slide 41)
    // -------------------------------------------------------------------------
    def tab() { return "  " }           // 2 espacios por nivel

    // -------------------------------------------------------------------------
    // Generando el mundo (pricing) — patrón slide 41
    // -------------------------------------------------------------------------
    def toYAML(Pricing pricing) {
        var res = "pricing:\n"
        if (pricing.saasName !== null && !pricing.saasName.empty)
            res += tab + "saasName: " + pricing.saasName + "\n"
        if (pricing.version !== null && !pricing.version.empty)
            res += tab + "version: \"" + pricing.version + "\"\n"
        if (pricing.currency !== null && !pricing.currency.empty)
            res += tab + "currency: " + pricing.currency + "\n"
        if (pricing.url !== null && !pricing.url.empty)
            res += tab + "url: " + pricing.url + "\n"
        if (pricing.createdAt !== null && !pricing.createdAt.empty)
            res += tab + "createdAt: \"" + pricing.createdAt + "\"\n"
        if (!pricing.tags.empty)
            res += tab + "tags: [" + pricing.tags.join(", ") + "]\n"

        // Planes
        if (!pricing.plans.empty) {
            res += tab + "plans:\n"
            for (plan : pricing.plans)
                res += toYAML(plan)
        }

        // Add-ons
        if (!pricing.addOns.empty) {
            res += tab + "addOns:\n"
            for (addOn : pricing.addOns)
                res += toYAML(addOn)
        }

        return res
    }

    // -------------------------------------------------------------------------
    // Generando planes — patrón slide 43-45
    // -------------------------------------------------------------------------
    def toYAML(Plan plan) {
        var res = tab + tab + "- plan: &" + sanitizeAnchor(plan.name) + "\n"
        res += tab + tab + tab + "name: \"" + plan.name + "\"\n"
        res += tab + tab + tab + "price: " + plan.price + "\n"

        if (plan.description !== null && !plan.description.empty)
            res += tab + tab + tab + "description: \"" + plan.description + "\"\n"

        // Features del plan
        if (!plan.features.empty) {
            res += tab + tab + tab + "features:\n"
            for (f : plan.features)
                res += toYAML(f, 4)   // 4 niveles de indentación
        }

        // UsageLimits del plan — usa eClass.name + casting (patrón slide 41)
        if (!plan.usageLimits.empty) {
            res += tab + tab + tab + "usageLimits:\n"
            for (ul : plan.usageLimits) {
                val className = ul.eClass.name   // API de reflexión EMF
                if (className.equals("Renewable")) {
                    val r = ul as Renewable      // Casting (slide 41)
                    res += toYAMLRenewable(r, 4)
                } else {
                    val nr = ul as NonRenewable
                    res += toYAMLNonRenewable(nr, 4)
                }
            }
        }

        return res
    }

    // -------------------------------------------------------------------------
    // Generando add-ons — patrón slide 46-49
    // -------------------------------------------------------------------------
    def toYAML(AddOn addOn) {
        var res = tab + tab + "- addOn: &" + sanitizeAnchor(addOn.name) + "\n"
        res += tab + tab + tab + "name: \"" + addOn.name + "\"\n"
        res += tab + tab + tab + "price: " + addOn.price + "\n"

        if (addOn.description !== null && !addOn.description.empty)
            res += tab + tab + tab + "description: \"" + addOn.description + "\"\n"

        // availableFor — referencias con *anchor (patrón slide 46)
        if (!addOn.availableFor.empty) {
            res += tab + tab + tab + "availableFor: ["
            res += "*" + addOn.availableFor.get(0).name.replaceAll("\\s+", "")
            for (var i = 1; i < addOn.availableFor.size; i++)
                res += ", *" + addOn.availableFor.get(i).name.replaceAll("\\s+", "")
            res += "]\n"
        }

        // dependsOn
        if (!addOn.dependsOn.empty) {
            res += tab + tab + tab + "dependsOn: ["
            res += "*" + addOn.dependsOn.get(0).name.replaceAll("\\s+", "")
            for (var i = 1; i < addOn.dependsOn.size; i++)
                res += ", *" + addOn.dependsOn.get(i).name.replaceAll("\\s+", "")
            res += "]\n"
        }

        // excludes
        if (!addOn.excludes.empty) {
            res += tab + tab + tab + "excludes: ["
            res += "*" + addOn.excludes.get(0).name.replaceAll("\\s+", "")
            for (var i = 1; i < addOn.excludes.size; i++)
                res += ", *" + addOn.excludes.get(i).name.replaceAll("\\s+", "")
            res += "]\n"
        }

        // Features del add-on
        if (!addOn.features.empty) {
            res += tab + tab + tab + "features:\n"
            for (f : addOn.features)
                res += toYAML(f, 4)
        }

        return res
    }

    // -------------------------------------------------------------------------
    // Generando features — reutilizable para planes y add-ons
    // -------------------------------------------------------------------------
    def toYAML(Feature f, int indent) {
        val i = indentStr(indent)
        var res = i + "- name: \"" + f.name + "\"\n"
        if (f.valueType !== null)
            res += i + tab + "valueType: " + f.valueType + "\n"
        if (f.value !== null && !f.value.empty)
            res += i + tab + "value: \"" + f.value + "\"\n"
        if (f.defaultValue !== null && !f.defaultValue.empty)
            res += i + tab + "defaultValue: \"" + f.defaultValue + "\"\n"
        if (f.description !== null && !f.description.empty)
            res += i + tab + "description: \"" + f.description + "\"\n"
        return res
    }

    // -------------------------------------------------------------------------
    // Generando Renewable y NonRenewable — patrón slide 50
    // -------------------------------------------------------------------------
    def toYAMLRenewable(Renewable r, int indent) {
        val i = indentStr(indent)
        var res = i + "- renewable: &" + sanitizeAnchor(r.name) + "\n"
        res += i + tab + "name: \"" + r.name + "\"\n"
        if (r.limit > 0)
            res += i + tab + "limit: " + r.limit + "\n"
        if (r.unit !== null && !r.unit.empty)
            res += i + tab + "unit: " + r.unit + "\n"
        if (r.valueType !== null)
            res += i + tab + "valueType: " + r.valueType + "\n"
        if (r.description !== null && !r.description.empty)
            res += i + tab + "description: \"" + r.description + "\"\n"
        // Period (obligatorio en Renewable, slide metamodelo)
        res += i + tab + "period:\n"
        res += i + tab + tab + "value: " + r.period.value + "\n"
        res += i + tab + tab + "unit: " + r.period.unit + "\n"
        return res
    }

    def toYAMLNonRenewable(NonRenewable nr, int indent) {
        val i = indentStr(indent)
        var res = i + "- nonRenewable: &" + sanitizeAnchor(nr.name) + "\n"
        res += i + tab + "name: \"" + nr.name + "\"\n"
        if (nr.limit > 0)
            res += i + tab + "limit: " + nr.limit + "\n"
        if (nr.unit !== null && !nr.unit.empty)
            res += i + tab + "unit: " + nr.unit + "\n"
        if (nr.valueType !== null)
            res += i + tab + "valueType: " + nr.valueType + "\n"
        if (nr.description !== null && !nr.description.empty)
            res += i + tab + "description: \"" + nr.description + "\"\n"
        res += i + tab + "trackable: " + nr.trackable + "\n"
        return res
    }

    // -------------------------------------------------------------------------
    // Utilidades auxiliares
    // -------------------------------------------------------------------------

    // Genera la cadena de indentación para N niveles (slide 41 — tab helper)
    def indentStr(int levels) {
        var res = ""
        for (var i = 0; i < levels; i++)
            res += tab
        return res
    }

    // Sanitiza el nombre para usarlo como anchor YAML (sin espacios ni caracteres raros)
    def sanitizeAnchor(String name) {
        if (name === null || name.empty) return "unnamed"
        return name.replaceAll("\\s+", "").replaceAll("[^a-zA-Z0-9_\\-]", "")
    }
}
