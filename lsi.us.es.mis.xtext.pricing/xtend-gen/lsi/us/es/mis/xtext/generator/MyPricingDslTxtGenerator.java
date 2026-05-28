package lsi.us.es.mis.xtext.generator;

import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import pricing.AddOn;
import pricing.Feature;
import pricing.NonRenewable;
import pricing.Plan;
import pricing.Pricing;
import pricing.Renewable;
import pricing.TimeUnit;
import pricing.UsageLimit;
import pricing.ValueType;

/**
 * Generador M2T que produce un fichero .txt a partir del modelo Pricing.
 * Usa plantillas con triple comilla y expresiones «» (patrón slides 14-32).
 */
@SuppressWarnings("all")
public class MyPricingDslTxtGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    String _className = this.className(resource);
    String _plus = (_className + ".txt");
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    fsa.generateFile(_plus, 
      this.toCode(((Pricing) _head)));
  }

  public String className(final Resource res) {
    String name = res.getURI().lastSegment();
    return name.substring(0, name.indexOf("."));
  }

  public CharSequence toCode(final Pricing pricing) {
    CharSequence _xblockexpression = null;
    {
      final ArrayList<Integer> counters = this.getCounters(pricing);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("This file has been created automatically");
      _builder.newLine();
      _builder.newLine();
      _builder.append("=== PRICING SPECIFICATION ===");
      _builder.newLine();
      _builder.append("SaaS:     ");
      String _saasName = pricing.getSaasName();
      _builder.append(_saasName);
      _builder.newLineIfNotEmpty();
      {
        if (((pricing.getVersion() != null) && (!pricing.getVersion().isEmpty()))) {
          _builder.append("Version:  ");
          String _version = pricing.getVersion();
          _builder.append(_version);
          _builder.newLineIfNotEmpty();
        }
      }
      {
        if (((pricing.getCurrency() != null) && (!pricing.getCurrency().isEmpty()))) {
          _builder.append("Currency: ");
          String _currency = pricing.getCurrency();
          _builder.append(_currency);
          _builder.newLineIfNotEmpty();
        }
      }
      {
        if (((pricing.getUrl() != null) && (!pricing.getUrl().isEmpty()))) {
          _builder.append("URL:      ");
          String _url = pricing.getUrl();
          _builder.append(_url);
          _builder.newLineIfNotEmpty();
        }
      }
      {
        if (((pricing.getCreatedAt() != null) && (!pricing.getCreatedAt().isEmpty()))) {
          _builder.append("Created:  ");
          String _createdAt = pricing.getCreatedAt();
          _builder.append(_createdAt);
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("This pricing has:");
      _builder.newLine();
      _builder.append("  ");
      Integer _get = counters.get(0);
      _builder.append(_get, "  ");
      _builder.append(" plan");
      {
        Integer _get_1 = counters.get(0);
        boolean _greaterThan = ((_get_1).intValue() > 1);
        if (_greaterThan) {
          _builder.append("s");
        }
      }
      _builder.append(",");
      _builder.newLineIfNotEmpty();
      _builder.append("  ");
      Integer _get_2 = counters.get(1);
      _builder.append(_get_2, "  ");
      _builder.append(" add-on");
      {
        Integer _get_3 = counters.get(1);
        boolean _greaterThan_1 = ((_get_3).intValue() > 1);
        if (_greaterThan_1) {
          _builder.append("s");
        }
      }
      _builder.append(",");
      _builder.newLineIfNotEmpty();
      _builder.append("  ");
      Integer _get_4 = counters.get(2);
      _builder.append(_get_4, "  ");
      _builder.append(" feature");
      {
        Integer _get_5 = counters.get(2);
        boolean _greaterThan_2 = ((_get_5).intValue() > 1);
        if (_greaterThan_2) {
          _builder.append("s");
        }
      }
      _builder.append(" (total across all plans),");
      _builder.newLineIfNotEmpty();
      _builder.append("  ");
      Integer _get_6 = counters.get(3);
      _builder.append(_get_6, "  ");
      _builder.append(" usage limit");
      {
        Integer _get_7 = counters.get(3);
        boolean _greaterThan_3 = ((_get_7).intValue() > 1);
        if (_greaterThan_3) {
          _builder.append("s");
        }
      }
      _builder.append(" (total across all plans)");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("--- PLANS ---");
      _builder.newLine();
      {
        EList<Plan> _plans = pricing.getPlans();
        for(final Plan plan : _plans) {
          CharSequence _planToTxt = this.planToTxt(plan);
          _builder.append(_planToTxt);
          _builder.newLineIfNotEmpty();
        }
      }
      {
        boolean _isEmpty = pricing.getAddOns().isEmpty();
        boolean _not = (!_isEmpty);
        if (_not) {
          _builder.append("--- ADD-ONS ---");
          _builder.newLineIfNotEmpty();
          {
            EList<AddOn> _addOns = pricing.getAddOns();
            for(final AddOn addOn : _addOns) {
              CharSequence _addOnToTxt = this.addOnToTxt(addOn);
              _builder.append(_addOnToTxt);
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }

  public CharSequence planToTxt(final Plan plan) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Plan: ");
    String _name = plan.getName();
    _builder.append(_name);
    _builder.append(" — ");
    String _priceStr = this.getPriceStr(plan.getPrice());
    _builder.append(_priceStr);
    _builder.newLineIfNotEmpty();
    {
      if (((plan.getDescription() != null) && (!plan.getDescription().isEmpty()))) {
        _builder.append("  Description: ");
        String _description = plan.getDescription();
        _builder.append(_description);
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isEmpty = plan.getFeatures().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("  Features (");
        int _size = plan.getFeatures().size();
        _builder.append(_size);
        _builder.append("):");
        _builder.newLineIfNotEmpty();
        {
          EList<Feature> _features = plan.getFeatures();
          for(final Feature f : _features) {
            _builder.append("    · ");
            String _featureToTxt = this.featureToTxt(f);
            _builder.append(_featureToTxt);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      boolean _isEmpty_1 = plan.getUsageLimits().isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("  Usage Limits (");
        int _size_1 = plan.getUsageLimits().size();
        _builder.append(_size_1);
        _builder.append("):");
        _builder.newLineIfNotEmpty();
        {
          EList<UsageLimit> _usageLimits = plan.getUsageLimits();
          for(final UsageLimit ul : _usageLimits) {
            _builder.append("    · ");
            String _usageLimitToTxt = this.usageLimitToTxt(ul);
            _builder.append(_usageLimitToTxt);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }

  public String featureToTxt(final Feature f) {
    String res = f.getName();
    ValueType _valueType = f.getValueType();
    boolean _tripleNotEquals = (_valueType != null);
    if (_tripleNotEquals) {
      String _res = res;
      ValueType _valueType_1 = f.getValueType();
      String _plus = (" [" + _valueType_1);
      String _plus_1 = (_plus + "]");
      res = (_res + _plus_1);
    }
    if (((f.getValue() != null) && (!f.getValue().isEmpty()))) {
      String _res_1 = res;
      String _value = f.getValue();
      String _plus_2 = (" = " + _value);
      res = (_res_1 + _plus_2);
    }
    return res;
  }

  public String usageLimitToTxt(final UsageLimit ul) {
    final String className = ul.eClass().getName();
    boolean _equals = className.equals("Renewable");
    if (_equals) {
      final Renewable r = ((Renewable) ul);
      String _name = r.getName();
      String res = ("Renewable — " + _name);
      double _limit = r.getLimit();
      boolean _greaterThan = (_limit > 0);
      if (_greaterThan) {
        String _res = res;
        double _limit_1 = r.getLimit();
        String _plus = (" (limit: " + Double.valueOf(_limit_1));
        String _xifexpression = null;
        if (((r.getUnit() != null) && (!r.getUnit().isEmpty()))) {
          String _unit = r.getUnit();
          _xifexpression = (" " + _unit);
        } else {
          _xifexpression = "";
        }
        String _plus_1 = (_plus + _xifexpression);
        String _plus_2 = (_plus_1 + ")");
        res = (_res + _plus_2);
      }
      String _res_1 = res;
      int _value = r.getPeriod().getValue();
      String _plus_3 = (" · renews every " + Integer.valueOf(_value));
      String _plus_4 = (_plus_3 + " ");
      TimeUnit _unit_1 = r.getPeriod().getUnit();
      String _plus_5 = (_plus_4 + _unit_1);
      res = (_res_1 + _plus_5);
      return res;
    } else {
      final NonRenewable nr = ((NonRenewable) ul);
      String _name_1 = nr.getName();
      String res_1 = ("NonRenewable — " + _name_1);
      double _limit_2 = nr.getLimit();
      boolean _greaterThan_1 = (_limit_2 > 0);
      if (_greaterThan_1) {
        String _res_2 = res_1;
        double _limit_3 = nr.getLimit();
        String _plus_6 = (" (limit: " + Double.valueOf(_limit_3));
        String _xifexpression_1 = null;
        if (((nr.getUnit() != null) && (!nr.getUnit().isEmpty()))) {
          String _unit_2 = nr.getUnit();
          _xifexpression_1 = (" " + _unit_2);
        } else {
          _xifexpression_1 = "";
        }
        String _plus_7 = (_plus_6 + _xifexpression_1);
        String _plus_8 = (_plus_7 + ")");
        res_1 = (_res_2 + _plus_8);
      }
      boolean _isTrackable = nr.isTrackable();
      if (_isTrackable) {
        String _res_3 = res_1;
        res_1 = (_res_3 + " [trackable]");
      }
      return res_1;
    }
  }

  public CharSequence addOnToTxt(final AddOn addOn) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Add-On: ");
    String _name = addOn.getName();
    _builder.append(_name);
    _builder.append(" — ");
    String _priceStr = this.getPriceStr(addOn.getPrice());
    _builder.append(_priceStr);
    _builder.newLineIfNotEmpty();
    {
      if (((addOn.getDescription() != null) && (!addOn.getDescription().isEmpty()))) {
        _builder.append("  Description: ");
        String _description = addOn.getDescription();
        _builder.append(_description);
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isEmpty = addOn.getAvailableFor().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("  Available for: ");
        final Function1<Plan, String> _function = (Plan it) -> {
          return it.getName();
        };
        String _join = IterableExtensions.join(ListExtensions.<Plan, String>map(addOn.getAvailableFor(), _function), ", ");
        _builder.append(_join);
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isEmpty_1 = addOn.getDependsOn().isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("  Depends on: ");
        final Function1<AddOn, String> _function_1 = (AddOn it) -> {
          return it.getName();
        };
        String _join_1 = IterableExtensions.join(ListExtensions.<AddOn, String>map(addOn.getDependsOn(), _function_1), ", ");
        _builder.append(_join_1);
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isEmpty_2 = addOn.getExcludes().isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        _builder.append("  Excludes: ");
        final Function1<AddOn, String> _function_2 = (AddOn it) -> {
          return it.getName();
        };
        String _join_2 = IterableExtensions.join(ListExtensions.<AddOn, String>map(addOn.getExcludes(), _function_2), ", ");
        _builder.append(_join_2);
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isEmpty_3 = addOn.getFeatures().isEmpty();
      boolean _not_3 = (!_isEmpty_3);
      if (_not_3) {
        _builder.append("  Features:");
        _builder.newLineIfNotEmpty();
        {
          EList<Feature> _features = addOn.getFeatures();
          for(final Feature f : _features) {
            _builder.append("    · ");
            String _featureToTxt = this.featureToTxt(f);
            _builder.append(_featureToTxt);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }

  public ArrayList<Integer> getCounters(final Pricing pricing) {
    final ArrayList<Integer> res = CollectionLiterals.<Integer>newArrayList();
    int features = 0;
    int usageLimits = 0;
    EList<Plan> _plans = pricing.getPlans();
    for (final Plan plan : _plans) {
      {
        int _features = features;
        int _size = plan.getFeatures().size();
        features = (_features + _size);
        int _usageLimits = usageLimits;
        int _size_1 = plan.getUsageLimits().size();
        usageLimits = (_usageLimits + _size_1);
      }
    }
    res.add(Integer.valueOf(pricing.getPlans().size()));
    res.add(Integer.valueOf(pricing.getAddOns().size()));
    res.add(Integer.valueOf(features));
    res.add(Integer.valueOf(usageLimits));
    return res;
  }

  public String getPriceStr(final double price) {
    String _xifexpression = null;
    if ((price == 0.0)) {
      _xifexpression = "Free";
    } else {
      _xifexpression = (Double.valueOf(price) + " /month");
    }
    return _xifexpression;
  }
}
