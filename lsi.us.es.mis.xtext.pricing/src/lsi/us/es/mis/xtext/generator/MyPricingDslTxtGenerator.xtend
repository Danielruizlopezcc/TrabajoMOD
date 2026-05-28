package lsi.us.es.mis.xtext.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import pricing.Pricing
import pricing.Plan
import pricing.Feature
import pricing.UsageLimit
import pricing.Renewable
import pricing.NonRenewable
import pricing.AddOn

/**
 * Generador M2T que produce un fichero .txt a partir del modelo Pricing.
 * Usa plantillas con triple comilla y expresiones «» (patrón slides 14-32).
 */
class MyPricingDslTxtGenerator extends AbstractGenerator {

    override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        fsa.generateFile(
            resource.className + ".txt",
            toCode(resource.contents.head as Pricing)
        )
    }

    // Obtiene el nombre del fichero de salida a partir del recurso (slide 14)
    def className(Resource res) {
        var name = res.URI.lastSegment
        return name.substring(0, name.indexOf('.'))
    }

    // -------------------------------------------------------------------------
    // Método principal de transformación (patrón triple comilla, slide 16-17)
    // -------------------------------------------------------------------------
    def toCode(Pricing pricing) {
        val counters = getCounters(pricing)
    '''This file has been created automatically

=== PRICING SPECIFICATION ===
SaaS:     «pricing.saasName»
«IF pricing.version !== null && !pricing.version.empty»Version:  «pricing.version»
«ENDIF»«IF pricing.currency !== null && !pricing.currency.empty»Currency: «pricing.currency»
«ENDIF»«IF pricing.url !== null && !pricing.url.empty»URL:      «pricing.url»
«ENDIF»«IF pricing.createdAt !== null && !pricing.createdAt.empty»Created:  «pricing.createdAt»
«ENDIF»
This pricing has:
  «counters.get(0)» plan«IF counters.get(0) > 1»s«ENDIF»,
  «counters.get(1)» add-on«IF counters.get(1) > 1»s«ENDIF»,
  «counters.get(2)» feature«IF counters.get(2) > 1»s«ENDIF» (total across all plans),
  «counters.get(3)» usage limit«IF counters.get(3) > 1»s«ENDIF» (total across all plans)

--- PLANS ---
«FOR plan : pricing.plans»
«planToTxt(plan)»
«ENDFOR»
«IF !pricing.addOns.empty»--- ADD-ONS ---
«FOR addOn : pricing.addOns»
«addOnToTxt(addOn)»
«ENDFOR»«ENDIF»'''
    }

    // -------------------------------------------------------------------------
    // Genera el bloque de texto de un Plan (FOR + IF anidados, slide 30-32)
    // -------------------------------------------------------------------------
    def planToTxt(Plan plan) {
    '''Plan: «plan.name» — «getPriceStr(plan.price)»
«IF plan.description !== null && !plan.description.empty»  Description: «plan.description»
«ENDIF»«IF !plan.features.empty»  Features («plan.features.size»):
«FOR f : plan.features»    · «featureToTxt(f)»
«ENDFOR»«ENDIF»«IF !plan.usageLimits.empty»  Usage Limits («plan.usageLimits.size»):
«FOR ul : plan.usageLimits»    · «usageLimitToTxt(ul)»
«ENDFOR»«ENDIF»'''
    }

    // -------------------------------------------------------------------------
    // Genera el texto de una Feature
    // -------------------------------------------------------------------------
    def featureToTxt(Feature f) {
        var res = f.name
        if (f.valueType !== null)
            res += " [" + f.valueType + "]"
        if (f.value !== null && !f.value.empty)
            res += " = " + f.value
        return res
    }

    // -------------------------------------------------------------------------
    // Genera el texto de un UsageLimit usando eClass.name + casting (slide 27-28)
    // -------------------------------------------------------------------------
    def usageLimitToTxt(UsageLimit ul) {
        val className = ul.eClass.name   // API de reflexión EMF (slide 23)

        if (className.equals("Renewable")) {
            val r = ul as Renewable      // Casting para acceder a atributos (slide 23)
            var res = "Renewable — " + r.name
            if (r.limit > 0)
                res += " (limit: " + r.limit
                    + (if (r.unit !== null && !r.unit.empty) " " + r.unit else "")
                    + ")"
            res += " · renews every "
                + r.period.value + " " + r.period.unit
            return res
        } else {
            val nr = ul as NonRenewable  // Casting NonRenewable
            var res = "NonRenewable — " + nr.name
            if (nr.limit > 0)
                res += " (limit: " + nr.limit
                    + (if (nr.unit !== null && !nr.unit.empty) " " + nr.unit else "")
                    + ")"
            if (nr.trackable)
                res += " [trackable]"
            return res
        }
    }

    // -------------------------------------------------------------------------
    // Genera el bloque de texto de un AddOn
    // -------------------------------------------------------------------------
    def addOnToTxt(AddOn addOn) {
    '''Add-On: «addOn.name» — «getPriceStr(addOn.price)»
«IF addOn.description !== null && !addOn.description.empty»  Description: «addOn.description»
«ENDIF»«IF !addOn.availableFor.empty»  Available for: «addOn.availableFor.map[name].join(", ")»
«ENDIF»«IF !addOn.dependsOn.empty»  Depends on: «addOn.dependsOn.map[name].join(", ")»
«ENDIF»«IF !addOn.excludes.empty»  Excludes: «addOn.excludes.map[name].join(", ")»
«ENDIF»«IF !addOn.features.empty»  Features:
«FOR f : addOn.features»    · «featureToTxt(f)»
«ENDFOR»«ENDIF»'''
    }

    // -------------------------------------------------------------------------
    // Métodos auxiliares (patrón slide 20-21)
    // -------------------------------------------------------------------------

    // Devuelve una lista con [numPlans, numAddOns, numFeatures, numUsageLimits]
    def getCounters(Pricing pricing) {
        val res = newArrayList()
        var features = 0
        var usageLimits = 0
        for (plan : pricing.plans) {
            features += plan.features.size
            usageLimits += plan.usageLimits.size
        }
        res.add(pricing.plans.size)
        res.add(pricing.addOns.size)
        res.add(features)
        res.add(usageLimits)
        return res
    }

    // Formatea el precio de un plan (0.0 = gratis)
    def getPriceStr(double price) {
        if (price == 0.0) "Free"
        else price + " /month"
    }
}
