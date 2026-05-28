package lsi.us.es.mis.xtext.generator;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import pricing.AddOn;
import pricing.Feature;
import pricing.NonRenewable;
import pricing.Plan;
import pricing.Pricing;
import pricing.Renewable;
import pricing.TimeUnit;
import pricing.UsageLimit;

/**
 * Generador M2T que produce un fichero .html a partir del modelo Pricing.
 * Combina partes estáticas (CSS/HTML fijo) con partes dinámicas («»)
 * para generar una página de pricing navegable. (patrón slides 16-32)
 */
@SuppressWarnings("all")
public class MyPricingDslHTMLGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    String _className = this.className(resource);
    String _plus = (_className + ".html");
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    fsa.generateFile(_plus, 
      this.toHTML(((Pricing) _head)));
  }

  public String className(final Resource res) {
    String name = res.getURI().lastSegment();
    return name.substring(0, name.indexOf("."));
  }

  public CharSequence toHTML(final Pricing pricing) {
    CharSequence _xblockexpression = null;
    {
      final ArrayList<Integer> counters = this.getCounters(pricing);
      final ArrayList<String> allFeatures = this.getAllFeatureNames(pricing);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<!DOCTYPE html>");
      _builder.newLine();
      _builder.append("<html lang=\"en\">");
      _builder.newLine();
      _builder.append("<head>");
      _builder.newLine();
      _builder.append("<meta charset=\"UTF-8\"/>");
      _builder.newLine();
      _builder.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>");
      _builder.newLine();
      _builder.append("<title>");
      String _saasName = pricing.getSaasName();
      _builder.append(_saasName);
      _builder.append(" — Pricing</title>");
      _builder.newLineIfNotEmpty();
      _builder.append("<style>");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("* { box-sizing: border-box; margin: 0; padding: 0; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("body { font-family: \'Segoe UI\', system-ui, sans-serif; background: #f8f9fb; color: #1a1a2e; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("header { background: #1a1a2e; color: #fff; padding: 3rem 2rem 2.5rem; text-align: center; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("header h1 { font-size: 2.8rem; font-weight: 800; letter-spacing: -1.5px; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("header p { margin-top: .5rem; color: #a0aec0; font-size: 1rem; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("header .meta { display: flex; justify-content: center; gap: 1rem; margin-top: 1.5rem; flex-wrap: wrap; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("header .meta span { font-size: .78rem; background: rgba(255,255,255,.08); border: 1px solid rgba(255,255,255,.15); border-radius: 999px; padding: .3rem .9rem; color: #cbd5e0; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".stats { display: flex; justify-content: center; gap: 2rem; padding: 1.8rem 2rem; background: #fff; border-bottom: 1px solid #e8eaf0; flex-wrap: wrap; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".stat { text-align: center; padding: .5rem 1.5rem; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".stat .n { font-size: 2rem; font-weight: 700; color: #4f46e5; line-height: 1; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".stat .l { font-size: .72rem; color: #718096; text-transform: uppercase; letter-spacing: .06em; margin-top: .3rem; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("section { max-width: 1100px; margin: 2.5rem auto; padding: 0 1.5rem; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("section > h2 { font-size: .85rem; font-weight: 700; color: #718096; text-transform: uppercase; letter-spacing: .1em; margin-bottom: 1.5rem; padding-bottom: .5rem; border-bottom: 2px solid #e8eaf0; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".plans-grid { display: grid; grid-template-columns: repeat(auto-fit, minmax(280px, 1fr)); gap: 1.25rem; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".plan-card { background: #fff; border: 1.5px solid #e8eaf0; border-radius: 16px; padding: 1.75rem; display: flex; flex-direction: column; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".plan-card.featured { border-color: #4f46e5; border-width: 2px; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".badge { display: inline-block; background: #eef2ff; color: #4338ca; font-size: .68rem; font-weight: 700; border-radius: 999px; padding: .2rem .8rem; margin-bottom: .75rem; letter-spacing: .04em; text-transform: uppercase; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".plan-name { font-size: 1.6rem; font-weight: 800; color: #1a1a2e; letter-spacing: -.5px; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".plan-price { font-size: 1rem; font-weight: 600; margin: .4rem 0 1.25rem; padding: .35rem .75rem; background: #eef2ff; color: #3730a3; border-radius: 8px; display: inline-block; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".plan-price.free { background: #f0fdf4; color: #166534; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".section-label { font-size: .68rem; font-weight: 700; color: #a0aec0; text-transform: uppercase; letter-spacing: .1em; margin: .9rem 0 .5rem; padding-top: .9rem; border-top: 1px solid #f0f2f7; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".section-label.first { border-top: none; margin-top: 0; padding-top: 0; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".feat-list { list-style: none; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".feat-list li { display: flex; align-items: center; gap: .55rem; font-size: .875rem; padding: .32rem 0; border-bottom: 1px solid #f8f9fb; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".feat-list li:last-child { border-bottom: none; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".feat-list li.has { color: #1e293b; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".feat-list li.has .icon { color: #4f46e5; font-weight: 800; font-size: .9rem; width: 16px; text-align: center; flex-shrink: 0; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".feat-list li.missing { color: #c1c9d4; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".feat-list li.missing .icon { color: #dde3eb; font-weight: 700; font-size: .9rem; width: 16px; text-align: center; flex-shrink: 0; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".limits-wrap { display: flex; flex-direction: column; gap: .5rem; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".limit-tag { display: flex; flex-direction: column; gap: .25rem; font-size: .8rem; border-radius: 10px; padding: .5rem .7rem; font-weight: 500; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".limit-tag .dot { width: 7px; height: 7px; border-radius: 50%; flex-shrink: 0; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".limit-top { display: flex; align-items: center; gap: .4rem; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".limit-tag.renewable { background: #eff6ff; color: #1d4ed8; border: 1px solid #bfdbfe; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".limit-tag.renewable .dot { background: #3b82f6; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".limit-tag.nonrenewable { background: #fdf4ff; color: #7e22ce; border: 1px solid #e9d5ff; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".limit-tag.nonrenewable .dot { background: #a855f7; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".type-label { font-size: .62rem; font-weight: 700; opacity: .7; text-transform: uppercase; letter-spacing: .04em; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".limit-name { font-weight: 600; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".resets { font-size: .72rem; opacity: .75; padding-left: 1.1rem; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".addon-ref { font-size: .75rem; background: #fefce8; color: #92400e; border: 1px solid #fde68a; border-radius: 999px; padding: .2rem .65rem; font-weight: 500; display: inline-block; margin: .15rem; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".addons-grid { display: grid; grid-template-columns: repeat(auto-fit, minmax(300px, 1fr)); gap: 1rem; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".addon-card { background: #fff; border: 1.5px solid #e8eaf0; border-radius: 14px; padding: 1.5rem; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".addon-card h3 { font-size: 1.1rem; font-weight: 800; color: #1a1a2e; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".addon-price { font-size: 1rem; font-weight: 600; margin: .5rem 0 .75rem; display: inline-block; padding: .3rem .7rem; border-radius: 8px; background: #f0fdf4; color: #166534; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".addon-price.paid { background: #eef2ff; color: #3730a3; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".addon-desc { font-size: .85rem; color: #718096; margin-bottom: .9rem; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".avail-plans { display: flex; flex-wrap: wrap; gap: .5rem; margin-top: .4rem; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".avail-plan-pill { display: flex; align-items: center; gap: .4rem; background: #1a1a2e; color: #fff; border-radius: 8px; padding: .35rem .75rem; font-size: .8rem; font-weight: 600; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".avail-plan-pill .dot { width: 7px; height: 7px; border-radius: 50%; background: #4f46e5; flex-shrink: 0; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".pill-list { display: flex; flex-wrap: wrap; gap: .4rem; margin-top: .4rem; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append(".pill { font-size: .75rem; padding: .25rem .65rem; border-radius: 999px; background: #f0fdf4; color: #166534; border: 1px solid #bbf7d0; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("footer { text-align: center; padding: 2.5rem 1rem; color: #a0aec0; font-size: .8rem; border-top: 1px solid #e8eaf0; margin-top: 3rem; }");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("footer strong { color: #4f46e5; }");
      _builder.newLine();
      _builder.append("</style>");
      _builder.newLine();
      _builder.append("</head>");
      _builder.newLine();
      _builder.append("<body>");
      _builder.newLine();
      _builder.newLine();
      _builder.append("<header>");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("<h1>");
      String _saasName_1 = pricing.getSaasName();
      _builder.append(_saasName_1, "  ");
      _builder.append("</h1>");
      _builder.newLineIfNotEmpty();
      _builder.append("  ");
      _builder.append("<p>Simple, transparent pricing.</p>");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("<div class=\"meta\">");
      _builder.newLine();
      _builder.append("    ");
      {
        if (((pricing.getVersion() != null) && (!pricing.getVersion().isEmpty()))) {
          _builder.append("<span>v");
          String _version = pricing.getVersion();
          _builder.append(_version, "    ");
          _builder.append("</span>");
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      {
        if (((pricing.getCurrency() != null) && (!pricing.getCurrency().isEmpty()))) {
          _builder.append("<span>");
          String _currency = pricing.getCurrency();
          _builder.append(_currency, "    ");
          _builder.append("</span>");
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      {
        if (((pricing.getUrl() != null) && (!pricing.getUrl().isEmpty()))) {
          _builder.append("<span>");
          String _url = pricing.getUrl();
          _builder.append(_url, "    ");
          _builder.append("</span>");
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      {
        if (((pricing.getCreatedAt() != null) && (!pricing.getCreatedAt().isEmpty()))) {
          _builder.append("<span>");
          String _createdAt = pricing.getCreatedAt();
          _builder.append(_createdAt, "    ");
          _builder.append("</span>");
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.append("  ");
      _builder.append("</div>");
      _builder.newLine();
      _builder.append("</header>");
      _builder.newLine();
      _builder.newLine();
      _builder.append("<div class=\"stats\">");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("<div class=\"stat\"><div class=\"n\">");
      Integer _get = counters.get(0);
      _builder.append(_get, "  ");
      _builder.append("</div><div class=\"l\">Plan");
      {
        Integer _get_1 = counters.get(0);
        boolean _greaterThan = ((_get_1).intValue() > 1);
        if (_greaterThan) {
          _builder.append("s");
        }
      }
      _builder.append("</div></div>");
      _builder.newLineIfNotEmpty();
      _builder.append("  ");
      _builder.append("<div class=\"stat\"><div class=\"n\">");
      Integer _get_2 = counters.get(1);
      _builder.append(_get_2, "  ");
      _builder.append("</div><div class=\"l\">Add-on");
      {
        Integer _get_3 = counters.get(1);
        boolean _greaterThan_1 = ((_get_3).intValue() > 1);
        if (_greaterThan_1) {
          _builder.append("s");
        }
      }
      _builder.append("</div></div>");
      _builder.newLineIfNotEmpty();
      _builder.append("  ");
      _builder.append("<div class=\"stat\"><div class=\"n\">");
      Integer _get_4 = counters.get(2);
      _builder.append(_get_4, "  ");
      _builder.append("</div><div class=\"l\">Feature");
      {
        Integer _get_5 = counters.get(2);
        boolean _greaterThan_2 = ((_get_5).intValue() > 1);
        if (_greaterThan_2) {
          _builder.append("s");
        }
      }
      _builder.append("</div></div>");
      _builder.newLineIfNotEmpty();
      _builder.append("  ");
      _builder.append("<div class=\"stat\"><div class=\"n\">");
      Integer _get_6 = counters.get(3);
      _builder.append(_get_6, "  ");
      _builder.append("</div><div class=\"l\">Usage limit");
      {
        Integer _get_7 = counters.get(3);
        boolean _greaterThan_3 = ((_get_7).intValue() > 1);
        if (_greaterThan_3) {
          _builder.append("s");
        }
      }
      _builder.append("</div></div>");
      _builder.newLineIfNotEmpty();
      _builder.append("</div>");
      _builder.newLine();
      _builder.newLine();
      _builder.append("<section>");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("<h2>Plans</h2>");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("<div class=\"plans-grid\">");
      _builder.newLine();
      _builder.append("    ");
      {
        EList<Plan> _plans = pricing.getPlans();
        for(final Plan plan : _plans) {
          CharSequence _planToHTML = this.planToHTML(plan, this.isPricedPlan(plan, pricing), allFeatures, pricing);
          _builder.append(_planToHTML, "    ");
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.append("  ");
      _builder.append("</div>");
      _builder.newLine();
      _builder.append("</section>");
      _builder.newLine();
      _builder.newLine();
      {
        boolean _isEmpty = pricing.getAddOns().isEmpty();
        boolean _not = (!_isEmpty);
        if (_not) {
          _builder.append("<section>");
          _builder.newLine();
          _builder.append("  ");
          _builder.append("<h2>Add-ons</h2>");
          _builder.newLine();
          _builder.append("  ");
          _builder.append("<div class=\"addons-grid\">");
          _builder.newLine();
          _builder.append("    ");
          {
            EList<AddOn> _addOns = pricing.getAddOns();
            for(final AddOn addOn : _addOns) {
              CharSequence _addOnToHTML = this.addOnToHTML(addOn);
              _builder.append(_addOnToHTML, "    ");
            }
          }
          _builder.newLineIfNotEmpty();
          _builder.append("  ");
          _builder.append("</div>");
          _builder.newLine();
          _builder.append("</section>");
          _builder.newLine();
        }
      }
      _builder.newLine();
      _builder.append("<footer>");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("Generated automatically from the <strong>");
      String _saasName_2 = pricing.getSaasName();
      _builder.append(_saasName_2, "  ");
      _builder.append("</strong> pricing model");
      _builder.newLineIfNotEmpty();
      _builder.append("  ");
      _builder.append("&nbsp;·&nbsp; Model-to-Text transformation with Xtend");
      _builder.newLine();
      _builder.append("</footer>");
      _builder.newLine();
      _builder.newLine();
      _builder.append("</body>");
      _builder.newLine();
      _builder.append("</html>");
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }

  public CharSequence planToHTML(final Plan plan, final boolean featured, final List<String> allFeatures, final Pricing pricing) {
    CharSequence _xblockexpression = null;
    {
      final ArrayList<AddOn> planAddOns = this.getAddOnsForPlan(plan, pricing);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<div class=\"plan-card");
      {
        if (featured) {
          _builder.append(" featured");
        }
      }
      _builder.append("\">");
      _builder.newLineIfNotEmpty();
      _builder.append("      ");
      {
        if (featured) {
          _builder.append("<div class=\"badge\">Most popular</div>");
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.append("      ");
      _builder.append("<div class=\"plan-name\">");
      String _name = plan.getName();
      _builder.append(_name, "      ");
      _builder.append("</div>");
      _builder.newLineIfNotEmpty();
      _builder.append("      ");
      {
        double _price = plan.getPrice();
        boolean _equals = (_price == 0.0);
        if (_equals) {
          _builder.append("<div class=\"plan-price free\">Free</div>");
        } else {
          _builder.append("<div class=\"plan-price\">$");
          double _price_1 = plan.getPrice();
          _builder.append(_price_1, "      ");
          _builder.append(" <span style=\"font-size:.8rem;font-weight:400;opacity:.7\">/month</span></div>");
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.append("      ");
      _builder.append("<div class=\"section-label first\">Features</div>");
      _builder.newLine();
      _builder.append("      ");
      _builder.append("<ul class=\"feat-list\">");
      _builder.newLine();
      _builder.append("        ");
      {
        for(final String featName : allFeatures) {
          CharSequence _featureRowHTML = this.featureRowHTML(featName, plan);
          _builder.append(_featureRowHTML, "        ");
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.append("      ");
      _builder.append("</ul>");
      _builder.newLine();
      {
        boolean _isEmpty = plan.getUsageLimits().isEmpty();
        boolean _not = (!_isEmpty);
        if (_not) {
          _builder.append("      ");
          _builder.append("<div class=\"section-label\">Usage limits</div>");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("<div class=\"limits-wrap\">");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("  ");
          {
            EList<UsageLimit> _usageLimits = plan.getUsageLimits();
            for(final UsageLimit ul : _usageLimits) {
              String _usageLimitToHTML = this.usageLimitToHTML(ul);
              _builder.append(_usageLimitToHTML, "        ");
            }
          }
          _builder.newLineIfNotEmpty();
          _builder.append("      ");
          _builder.append("</div>");
          _builder.newLine();
        }
      }
      {
        boolean _isEmpty_1 = planAddOns.isEmpty();
        boolean _not_1 = (!_isEmpty_1);
        if (_not_1) {
          _builder.append("      ");
          _builder.append("<div class=\"section-label\">Add-ons available</div>");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("<div style=\"margin-top:.2rem\">");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("  ");
          {
            for(final AddOn ao : planAddOns) {
              _builder.append("<span class=\"addon-ref\">");
              String _name_1 = ao.getName();
              _builder.append(_name_1, "        ");
              _builder.append("</span>");
            }
          }
          _builder.newLineIfNotEmpty();
          _builder.append("      ");
          _builder.append("</div>");
          _builder.newLine();
        }
      }
      _builder.append("    ");
      _builder.append("</div>");
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }

  public CharSequence featureRowHTML(final String featName, final Plan plan) {
    CharSequence _xifexpression = null;
    boolean _planHasFeature = this.planHasFeature(plan, featName);
    if (_planHasFeature) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<li class=\"has\"><span class=\"icon\">&#10003;</span>");
      _builder.append(featName);
      _builder.append("</li>");
      _builder.newLineIfNotEmpty();
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("<li class=\"missing\"><span class=\"icon\">&#10005;</span>");
      _builder_1.append(featName);
      _builder_1.append("</li>");
      _builder_1.newLineIfNotEmpty();
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }

  public String usageLimitToHTML(final UsageLimit ul) {
    final String className = ul.eClass().getName();
    boolean _equals = className.equals("Renewable");
    if (_equals) {
      final Renewable r = ((Renewable) ul);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<div class=\"limit-tag renewable\">");
      _builder.newLine();
      _builder.append("          ");
      _builder.append("<div class=\"limit-top\"><span class=\"dot\"></span><span class=\"type-label\">Renew</span><span class=\"limit-name\">");
      String _name = r.getName();
      _builder.append(_name, "          ");
      _builder.append("</span></div>");
      _builder.newLineIfNotEmpty();
      _builder.append("          ");
      {
        if (((r.getPeriod() != null) && (r.getPeriod().getValue() > 0))) {
          _builder.append("<div class=\"resets\">&#x21BA; resets every ");
          int _value = r.getPeriod().getValue();
          _builder.append(_value, "          ");
          _builder.append(" ");
          TimeUnit _unit = r.getPeriod().getUnit();
          _builder.append(_unit, "          ");
          _builder.append("</div>");
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.append("        ");
      _builder.append("</div>");
      _builder.newLine();
      return _builder.toString();
    } else {
      final NonRenewable nr = ((NonRenewable) ul);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("<div class=\"limit-tag nonrenewable\">");
      _builder_1.newLine();
      _builder_1.append("          ");
      _builder_1.append("<div class=\"limit-top\"><span class=\"dot\"></span><span class=\"type-label\">Non-renew</span><span class=\"limit-name\">");
      String _name_1 = nr.getName();
      _builder_1.append(_name_1, "          ");
      _builder_1.append("</span></div>");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("        ");
      _builder_1.append("</div>");
      _builder_1.newLine();
      return _builder_1.toString();
    }
  }

  public CharSequence addOnToHTML(final AddOn addOn) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div class=\"addon-card\">");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<h3>");
    String _name = addOn.getName();
    _builder.append(_name, "      ");
    _builder.append("</h3>");
    _builder.newLineIfNotEmpty();
    _builder.append("      ");
    {
      double _price = addOn.getPrice();
      boolean _equals = (_price == 0.0);
      if (_equals) {
        _builder.append("<div class=\"addon-price\">Free</div>");
      } else {
        _builder.append("<div class=\"addon-price paid\">$");
        double _price_1 = addOn.getPrice();
        _builder.append(_price_1, "      ");
        _builder.append(" <span style=\"font-size:.8rem;font-weight:400;opacity:.7\">/month</span></div>");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("      ");
    {
      if (((addOn.getDescription() != null) && (!addOn.getDescription().isEmpty()))) {
        _builder.append("<div class=\"addon-desc\">");
        String _description = addOn.getDescription();
        _builder.append(_description, "      ");
        _builder.append("</div>");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      boolean _isEmpty = addOn.getAvailableFor().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("      ");
        _builder.append("<div class=\"section-label first\">Available for plans</div>");
        _builder.newLine();
        _builder.append("      ");
        _builder.append("<div class=\"avail-plans\">");
        _builder.newLine();
        _builder.append("      ");
        _builder.append("  ");
        {
          EList<Plan> _availableFor = addOn.getAvailableFor();
          for(final Plan plan : _availableFor) {
            _builder.append("<div class=\"avail-plan-pill\"><span class=\"dot\"></span>");
            String _name_1 = plan.getName();
            _builder.append(_name_1, "        ");
            _builder.append("</div>");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("      ");
        _builder.append("</div>");
        _builder.newLine();
      }
    }
    {
      boolean _isEmpty_1 = addOn.getFeatures().isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("      ");
        _builder.append("<div class=\"section-label");
        {
          boolean _isEmpty_2 = addOn.getAvailableFor().isEmpty();
          if (_isEmpty_2) {
            _builder.append(" first");
          }
        }
        _builder.append("\">Features</div>");
        _builder.newLineIfNotEmpty();
        _builder.append("      ");
        _builder.append("<div class=\"pill-list\">");
        _builder.newLine();
        _builder.append("      ");
        _builder.append("  ");
        {
          EList<Feature> _features = addOn.getFeatures();
          for(final Feature f : _features) {
            _builder.append("<span class=\"pill\">");
            String _name_2 = f.getName();
            _builder.append(_name_2, "        ");
            _builder.append("</span>");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("      ");
        _builder.append("</div>");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.append("</div>");
    return _builder;
  }

  public ArrayList<Integer> getCounters(final Pricing pricing) {
    final ArrayList<Integer> res = CollectionLiterals.<Integer>newArrayList();
    res.add(Integer.valueOf(pricing.getPlans().size()));
    res.add(Integer.valueOf(pricing.getAddOns().size()));
    res.add(Integer.valueOf(this.getAllFeatureNames(pricing).size()));
    res.add(Integer.valueOf(this.getAllUniqueLimitNames(pricing).size()));
    return res;
  }

  public ArrayList<String> getAllFeatureNames(final Pricing pricing) {
    final ArrayList<String> res = CollectionLiterals.<String>newArrayList();
    EList<Plan> _plans = pricing.getPlans();
    for (final Plan plan : _plans) {
      EList<Feature> _features = plan.getFeatures();
      for (final Feature f : _features) {
        boolean _contains = res.contains(f.getName());
        boolean _not = (!_contains);
        if (_not) {
          res.add(f.getName());
        }
      }
    }
    return res;
  }

  public ArrayList<String> getAllUniqueLimitNames(final Pricing pricing) {
    final ArrayList<String> res = CollectionLiterals.<String>newArrayList();
    EList<Plan> _plans = pricing.getPlans();
    for (final Plan plan : _plans) {
      EList<UsageLimit> _usageLimits = plan.getUsageLimits();
      for (final UsageLimit ul : _usageLimits) {
        boolean _contains = res.contains(ul.getName());
        boolean _not = (!_contains);
        if (_not) {
          res.add(ul.getName());
        }
      }
    }
    return res;
  }

  public boolean planHasFeature(final Plan plan, final String featName) {
    EList<Feature> _features = plan.getFeatures();
    for (final Feature f : _features) {
      boolean _equals = f.getName().equals(featName);
      if (_equals) {
        return true;
      }
    }
    return false;
  }

  public ArrayList<AddOn> getAddOnsForPlan(final Plan plan, final Pricing pricing) {
    final ArrayList<AddOn> res = CollectionLiterals.<AddOn>newArrayList();
    EList<AddOn> _addOns = pricing.getAddOns();
    for (final AddOn ao : _addOns) {
      EList<Plan> _availableFor = ao.getAvailableFor();
      for (final Plan p : _availableFor) {
        boolean _equals = p.getName().equals(plan.getName());
        if (_equals) {
          res.add(ao);
        }
      }
    }
    return res;
  }

  public boolean isPricedPlan(final Plan plan, final Pricing pricing) {
    double maxPrice = 0.0;
    EList<Plan> _plans = pricing.getPlans();
    for (final Plan p : _plans) {
      double _price = p.getPrice();
      boolean _greaterThan = (_price > maxPrice);
      if (_greaterThan) {
        maxPrice = p.getPrice();
      }
    }
    return ((plan.getPrice() == maxPrice) && (maxPrice > 0.0));
  }
}
