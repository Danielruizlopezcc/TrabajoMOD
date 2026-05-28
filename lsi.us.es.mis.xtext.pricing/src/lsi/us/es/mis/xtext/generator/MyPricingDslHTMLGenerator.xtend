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
 * Generador M2T que produce un fichero .html a partir del modelo Pricing.
 * Combina partes estáticas (CSS/HTML fijo) con partes dinámicas («»)
 * para generar una página de pricing navegable. (patrón slides 16-32)
 */
class MyPricingDslHTMLGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile(
			resource.className + ".html",
			toHTML(resource.contents.head as Pricing)
		)
	}

	def className(Resource res) {
		var name = res.URI.lastSegment
		return name.substring(0, name.indexOf('.'))
	}

	// -------------------------------------------------------------------------
	// Método principal — plantilla triple comilla (parte estática + dinámica)
	// -------------------------------------------------------------------------
	def toHTML(Pricing pricing) {
		val counters = getCounters(pricing)
		val allFeatures = getAllFeatureNames(pricing)
		'''<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8"/>
<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
<title>«pricing.saasName» — Pricing</title>
<style>
  * { box-sizing: border-box; margin: 0; padding: 0; }
  body { font-family: 'Segoe UI', system-ui, sans-serif; background: #f8f9fb; color: #1a1a2e; }
  header { background: #1a1a2e; color: #fff; padding: 3rem 2rem 2.5rem; text-align: center; }
  header h1 { font-size: 2.8rem; font-weight: 800; letter-spacing: -1.5px; }
  header p { margin-top: .5rem; color: #a0aec0; font-size: 1rem; }
  header .meta { display: flex; justify-content: center; gap: 1rem; margin-top: 1.5rem; flex-wrap: wrap; }
  header .meta span { font-size: .78rem; background: rgba(255,255,255,.08); border: 1px solid rgba(255,255,255,.15); border-radius: 999px; padding: .3rem .9rem; color: #cbd5e0; }
  .stats { display: flex; justify-content: center; gap: 2rem; padding: 1.8rem 2rem; background: #fff; border-bottom: 1px solid #e8eaf0; flex-wrap: wrap; }
  .stat { text-align: center; padding: .5rem 1.5rem; }
  .stat .n { font-size: 2rem; font-weight: 700; color: #4f46e5; line-height: 1; }
  .stat .l { font-size: .72rem; color: #718096; text-transform: uppercase; letter-spacing: .06em; margin-top: .3rem; }
  section { max-width: 1100px; margin: 2.5rem auto; padding: 0 1.5rem; }
  section > h2 { font-size: .85rem; font-weight: 700; color: #718096; text-transform: uppercase; letter-spacing: .1em; margin-bottom: 1.5rem; padding-bottom: .5rem; border-bottom: 2px solid #e8eaf0; }
  .plans-grid { display: grid; grid-template-columns: repeat(auto-fit, minmax(280px, 1fr)); gap: 1.25rem; }
  .plan-card { background: #fff; border: 1.5px solid #e8eaf0; border-radius: 16px; padding: 1.75rem; display: flex; flex-direction: column; }
  .plan-card.featured { border-color: #4f46e5; border-width: 2px; }
  .badge { display: inline-block; background: #eef2ff; color: #4338ca; font-size: .68rem; font-weight: 700; border-radius: 999px; padding: .2rem .8rem; margin-bottom: .75rem; letter-spacing: .04em; text-transform: uppercase; }
  .plan-name { font-size: 1.6rem; font-weight: 800; color: #1a1a2e; letter-spacing: -.5px; }
  .plan-price { font-size: 1rem; font-weight: 600; margin: .4rem 0 1.25rem; padding: .35rem .75rem; background: #eef2ff; color: #3730a3; border-radius: 8px; display: inline-block; }
  .plan-price.free { background: #f0fdf4; color: #166534; }
  .section-label { font-size: .68rem; font-weight: 700; color: #a0aec0; text-transform: uppercase; letter-spacing: .1em; margin: .9rem 0 .5rem; padding-top: .9rem; border-top: 1px solid #f0f2f7; }
  .section-label.first { border-top: none; margin-top: 0; padding-top: 0; }
  .feat-list { list-style: none; }
  .feat-list li { display: flex; align-items: center; gap: .55rem; font-size: .875rem; padding: .32rem 0; border-bottom: 1px solid #f8f9fb; }
  .feat-list li:last-child { border-bottom: none; }
  .feat-list li.has { color: #1e293b; }
  .feat-list li.has .icon { color: #4f46e5; font-weight: 800; font-size: .9rem; width: 16px; text-align: center; flex-shrink: 0; }
  .feat-list li.missing { color: #c1c9d4; }
  .feat-list li.missing .icon { color: #dde3eb; font-weight: 700; font-size: .9rem; width: 16px; text-align: center; flex-shrink: 0; }
  .limits-wrap { display: flex; flex-direction: column; gap: .5rem; }
  .limit-tag { display: flex; flex-direction: column; gap: .25rem; font-size: .8rem; border-radius: 10px; padding: .5rem .7rem; font-weight: 500; }
  .limit-tag .dot { width: 7px; height: 7px; border-radius: 50%; flex-shrink: 0; }
  .limit-top { display: flex; align-items: center; gap: .4rem; }
  .limit-tag.renewable { background: #eff6ff; color: #1d4ed8; border: 1px solid #bfdbfe; }
  .limit-tag.renewable .dot { background: #3b82f6; }
  .limit-tag.nonrenewable { background: #fdf4ff; color: #7e22ce; border: 1px solid #e9d5ff; }
  .limit-tag.nonrenewable .dot { background: #a855f7; }
  .type-label { font-size: .62rem; font-weight: 700; opacity: .7; text-transform: uppercase; letter-spacing: .04em; }
  .limit-name { font-weight: 600; }
  .resets { font-size: .72rem; opacity: .75; padding-left: 1.1rem; }
  .addon-ref { font-size: .75rem; background: #fefce8; color: #92400e; border: 1px solid #fde68a; border-radius: 999px; padding: .2rem .65rem; font-weight: 500; display: inline-block; margin: .15rem; }
  .addons-grid { display: grid; grid-template-columns: repeat(auto-fit, minmax(300px, 1fr)); gap: 1rem; }
  .addon-card { background: #fff; border: 1.5px solid #e8eaf0; border-radius: 14px; padding: 1.5rem; }
  .addon-card h3 { font-size: 1.1rem; font-weight: 800; color: #1a1a2e; }
  .addon-price { font-size: 1rem; font-weight: 600; margin: .5rem 0 .75rem; display: inline-block; padding: .3rem .7rem; border-radius: 8px; background: #f0fdf4; color: #166534; }
  .addon-price.paid { background: #eef2ff; color: #3730a3; }
  .addon-desc { font-size: .85rem; color: #718096; margin-bottom: .9rem; }
  .avail-plans { display: flex; flex-wrap: wrap; gap: .5rem; margin-top: .4rem; }
  .avail-plan-pill { display: flex; align-items: center; gap: .4rem; background: #1a1a2e; color: #fff; border-radius: 8px; padding: .35rem .75rem; font-size: .8rem; font-weight: 600; }
  .avail-plan-pill .dot { width: 7px; height: 7px; border-radius: 50%; background: #4f46e5; flex-shrink: 0; }
  .pill-list { display: flex; flex-wrap: wrap; gap: .4rem; margin-top: .4rem; }
  .pill { font-size: .75rem; padding: .25rem .65rem; border-radius: 999px; background: #f0fdf4; color: #166534; border: 1px solid #bbf7d0; }
  footer { text-align: center; padding: 2.5rem 1rem; color: #a0aec0; font-size: .8rem; border-top: 1px solid #e8eaf0; margin-top: 3rem; }
  footer strong { color: #4f46e5; }
</style>
</head>
<body>

<header>
  <h1>«pricing.saasName»</h1>
  <p>Simple, transparent pricing.</p>
  <div class="meta">
    «IF pricing.version !== null && !pricing.version.empty»<span>v«pricing.version»</span>«ENDIF»
    «IF pricing.currency !== null && !pricing.currency.empty»<span>«pricing.currency»</span>«ENDIF»
    «IF pricing.url !== null && !pricing.url.empty»<span>«pricing.url»</span>«ENDIF»
    «IF pricing.createdAt !== null && !pricing.createdAt.empty»<span>«pricing.createdAt»</span>«ENDIF»
  </div>
</header>

<div class="stats">
  <div class="stat"><div class="n">«counters.get(0)»</div><div class="l">Plan«IF counters.get(0)>1»s«ENDIF»</div></div>
  <div class="stat"><div class="n">«counters.get(1)»</div><div class="l">Add-on«IF counters.get(1)>1»s«ENDIF»</div></div>
  <div class="stat"><div class="n">«counters.get(2)»</div><div class="l">Feature«IF counters.get(2)>1»s«ENDIF»</div></div>
  <div class="stat"><div class="n">«counters.get(3)»</div><div class="l">Usage limit«IF counters.get(3)>1»s«ENDIF»</div></div>
</div>

<section>
  <h2>Plans</h2>
  <div class="plans-grid">
    «FOR plan : pricing.plans»«planToHTML(plan, isPricedPlan(plan, pricing), allFeatures, pricing)»«ENDFOR»
  </div>
</section>

«IF !pricing.addOns.empty»
<section>
  <h2>Add-ons</h2>
  <div class="addons-grid">
    «FOR addOn : pricing.addOns»«addOnToHTML(addOn)»«ENDFOR»
  </div>
</section>
«ENDIF»

<footer>
  Generated automatically from the <strong>«pricing.saasName»</strong> pricing model
  &nbsp;·&nbsp; Model-to-Text transformation with Xtend
</footer>

</body>
</html>'''
	}

	// -------------------------------------------------------------------------
	// Genera la card HTML de un Plan con matriz completa de features
	// -------------------------------------------------------------------------
	def planToHTML(Plan plan, boolean featured, java.util.List<String> allFeatures, Pricing pricing) {
		val planAddOns = getAddOnsForPlan(plan, pricing)
		'''<div class="plan-card«IF featured» featured«ENDIF»">
      «IF featured»<div class="badge">Most popular</div>«ENDIF»
      <div class="plan-name">«plan.name»</div>
      «IF plan.price == 0.0»<div class="plan-price free">Free</div>«ELSE»<div class="plan-price">$«plan.price» <span style="font-size:.8rem;font-weight:400;opacity:.7">/month</span></div>«ENDIF»
      <div class="section-label first">Features</div>
      <ul class="feat-list">
        «FOR featName : allFeatures»«featureRowHTML(featName, plan)»«ENDFOR»
      </ul>
      «IF !plan.usageLimits.empty»
      <div class="section-label">Usage limits</div>
      <div class="limits-wrap">
        «FOR ul : plan.usageLimits»«usageLimitToHTML(ul)»«ENDFOR»
      </div>
      «ENDIF»
      «IF !planAddOns.empty»
      <div class="section-label">Add-ons available</div>
      <div style="margin-top:.2rem">
        «FOR ao : planAddOns»<span class="addon-ref">«ao.name»</span>«ENDFOR»
      </div>
      «ENDIF»
    </div>'''
	}

	// Fila de feature con ✓ o ✕ según si el plan la tiene (slide 30 — IF anidado)
	def featureRowHTML(String featName, Plan plan) {
		if (planHasFeature(plan, featName))
			'''<li class="has"><span class="icon">&#10003;</span>«featName»</li>
'''
		else
			'''<li class="missing"><span class="icon">&#10005;</span>«featName»</li>
'''
	}

	// -------------------------------------------------------------------------
	// Genera el tag HTML de un UsageLimit — eClass.name + casting (slide 27-28)
	// -------------------------------------------------------------------------
	def usageLimitToHTML(UsageLimit ul) {
		val className = ul.eClass.name // API reflexión EMF
		if (className.equals("Renewable")) {
			val r = ul as Renewable // Casting (slide 23)
			return '''<div class="limit-tag renewable">
          <div class="limit-top"><span class="dot"></span><span class="type-label">Renew</span><span class="limit-name">«r.name»</span></div>
          «IF r.period !== null && r.period.value > 0»<div class="resets">&#x21BA; resets every «r.period.value» «r.period.unit»</div>«ENDIF»
        </div>
'''
		} else {
			val nr = ul as NonRenewable
			return '''<div class="limit-tag nonrenewable">
          <div class="limit-top"><span class="dot"></span><span class="type-label">Non-renew</span><span class="limit-name">«nr.name»</span></div>
        </div>
'''
		}
	}

	// -------------------------------------------------------------------------
	// Genera la card HTML de un AddOn
	// -------------------------------------------------------------------------
	def addOnToHTML(AddOn addOn) {
		'''<div class="addon-card">
      <h3>«addOn.name»</h3>
      «IF addOn.price == 0.0»<div class="addon-price">Free</div>«ELSE»<div class="addon-price paid">$«addOn.price» <span style="font-size:.8rem;font-weight:400;opacity:.7">/month</span></div>«ENDIF»
      «IF addOn.description !== null && !addOn.description.empty»<div class="addon-desc">«addOn.description»</div>«ENDIF»
      «IF !addOn.availableFor.empty»
      <div class="section-label first">Available for plans</div>
      <div class="avail-plans">
        «FOR plan : addOn.availableFor»<div class="avail-plan-pill"><span class="dot"></span>«plan.name»</div>«ENDFOR»
      </div>
      «ENDIF»
      «IF !addOn.features.empty»
      <div class="section-label«IF addOn.availableFor.empty» first«ENDIF»">Features</div>
      <div class="pill-list">
        «FOR f : addOn.features»<span class="pill">«f.name»</span>«ENDFOR»
      </div>
      «ENDIF»
    </div>'''
	}

	// -------------------------------------------------------------------------
	// Métodos auxiliares (patrón slide 20-21)
	// -------------------------------------------------------------------------
	// Contadores: [planes, addons, features únicas, usage limits totales]
	def getCounters(Pricing pricing) {
		val res = newArrayList()
		res.add(pricing.plans.size)
		res.add(pricing.addOns.size)
		res.add(getAllFeatureNames(pricing).size)
		res.add(getAllUniqueLimitNames(pricing).size)
		return res
	}

	// Unión de todas las features de todos los planes (sin duplicados)
	def getAllFeatureNames(Pricing pricing) {
		val res = newArrayList()
		for (plan : pricing.plans)
			for (f : plan.features)
				if (!res.contains(f.name))
					res.add(f.name)
		return res
	}

	def getAllUniqueLimitNames(Pricing pricing) {
		val res = newArrayList()
		for (plan : pricing.plans)
			for (ul : plan.usageLimits)
				if (!res.contains(ul.name))
					res.add(ul.name)
		return res
	}

	// Comprueba si un plan tiene una feature con ese nombre
	def planHasFeature(Plan plan, String featName) {
		for (f : plan.features)
			if(f.name.equals(featName)) return true
		return false
	}

	// Devuelve los add-ons disponibles para un plan concreto
	def getAddOnsForPlan(Plan plan, Pricing pricing) {
		val res = newArrayList()
		for (ao : pricing.addOns)
			for (p : ao.availableFor)
				if(p.name.equals(plan.name)) res.add(ao)
		return res
	}

	// El plan de mayor precio se marca como "featured"
	def isPricedPlan(Plan plan, Pricing pricing) {
		var maxPrice = 0.0
		for (p : pricing.plans)
			if(p.price > maxPrice) maxPrice = p.price
		return plan.price == maxPrice && maxPrice > 0.0
	}
}
