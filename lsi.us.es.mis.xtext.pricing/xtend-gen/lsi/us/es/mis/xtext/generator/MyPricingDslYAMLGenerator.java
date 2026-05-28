package lsi.us.es.mis.xtext.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
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
 * Generador M2T que produce un fichero .yaml a partir del modelo Pricing.
 * Usa concatenación de Strings con \n para respetar la indentación YAML
 * (patrón slides 35-50 — obligatorio para YAML porque la indentación es semántica).
 */
@SuppressWarnings("all")
public class MyPricingDslYAMLGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    String _className = this.className(resource);
    String _plus = (_className + ".yaml");
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    fsa.generateFile(_plus, 
      this.toYAML(((Pricing) _head)));
  }

  public String className(final Resource res) {
    String name = res.getURI().lastSegment();
    return name.substring(0, name.indexOf("."));
  }

  public String tab() {
    return "  ";
  }

  public String toYAML(final Pricing pricing) {
    String res = "pricing:\n";
    if (((pricing.getSaasName() != null) && (!pricing.getSaasName().isEmpty()))) {
      String _res = res;
      String _tab = this.tab();
      String _plus = (_tab + "saasName: ");
      String _saasName = pricing.getSaasName();
      String _plus_1 = (_plus + _saasName);
      String _plus_2 = (_plus_1 + "\n");
      res = (_res + _plus_2);
    }
    if (((pricing.getVersion() != null) && (!pricing.getVersion().isEmpty()))) {
      String _res_1 = res;
      String _tab_1 = this.tab();
      String _plus_3 = (_tab_1 + "version: \"");
      String _version = pricing.getVersion();
      String _plus_4 = (_plus_3 + _version);
      String _plus_5 = (_plus_4 + "\"\n");
      res = (_res_1 + _plus_5);
    }
    if (((pricing.getCurrency() != null) && (!pricing.getCurrency().isEmpty()))) {
      String _res_2 = res;
      String _tab_2 = this.tab();
      String _plus_6 = (_tab_2 + "currency: ");
      String _currency = pricing.getCurrency();
      String _plus_7 = (_plus_6 + _currency);
      String _plus_8 = (_plus_7 + "\n");
      res = (_res_2 + _plus_8);
    }
    if (((pricing.getUrl() != null) && (!pricing.getUrl().isEmpty()))) {
      String _res_3 = res;
      String _tab_3 = this.tab();
      String _plus_9 = (_tab_3 + "url: ");
      String _url = pricing.getUrl();
      String _plus_10 = (_plus_9 + _url);
      String _plus_11 = (_plus_10 + "\n");
      res = (_res_3 + _plus_11);
    }
    if (((pricing.getCreatedAt() != null) && (!pricing.getCreatedAt().isEmpty()))) {
      String _res_4 = res;
      String _tab_4 = this.tab();
      String _plus_12 = (_tab_4 + "createdAt: \"");
      String _createdAt = pricing.getCreatedAt();
      String _plus_13 = (_plus_12 + _createdAt);
      String _plus_14 = (_plus_13 + "\"\n");
      res = (_res_4 + _plus_14);
    }
    boolean _isEmpty = pricing.getTags().isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      String _res_5 = res;
      String _tab_5 = this.tab();
      String _plus_15 = (_tab_5 + "tags: [");
      String _join = IterableExtensions.join(pricing.getTags(), ", ");
      String _plus_16 = (_plus_15 + _join);
      String _plus_17 = (_plus_16 + "]\n");
      res = (_res_5 + _plus_17);
    }
    boolean _isEmpty_1 = pricing.getPlans().isEmpty();
    boolean _not_1 = (!_isEmpty_1);
    if (_not_1) {
      String _res_6 = res;
      String _tab_6 = this.tab();
      String _plus_18 = (_tab_6 + "plans:\n");
      res = (_res_6 + _plus_18);
      EList<Plan> _plans = pricing.getPlans();
      for (final Plan plan : _plans) {
        String _res_7 = res;
        String _yAML = this.toYAML(plan);
        res = (_res_7 + _yAML);
      }
    }
    boolean _isEmpty_2 = pricing.getAddOns().isEmpty();
    boolean _not_2 = (!_isEmpty_2);
    if (_not_2) {
      String _res_8 = res;
      String _tab_7 = this.tab();
      String _plus_19 = (_tab_7 + "addOns:\n");
      res = (_res_8 + _plus_19);
      EList<AddOn> _addOns = pricing.getAddOns();
      for (final AddOn addOn : _addOns) {
        String _res_9 = res;
        String _yAML_1 = this.toYAML(addOn);
        res = (_res_9 + _yAML_1);
      }
    }
    return res;
  }

  public String toYAML(final Plan plan) {
    String _tab = this.tab();
    String _tab_1 = this.tab();
    String _plus = (_tab + _tab_1);
    String _plus_1 = (_plus + "- plan: &");
    String _sanitizeAnchor = this.sanitizeAnchor(plan.getName());
    String _plus_2 = (_plus_1 + _sanitizeAnchor);
    String res = (_plus_2 + "\n");
    String _res = res;
    String _tab_2 = this.tab();
    String _tab_3 = this.tab();
    String _plus_3 = (_tab_2 + _tab_3);
    String _tab_4 = this.tab();
    String _plus_4 = (_plus_3 + _tab_4);
    String _plus_5 = (_plus_4 + "name: \"");
    String _name = plan.getName();
    String _plus_6 = (_plus_5 + _name);
    String _plus_7 = (_plus_6 + "\"\n");
    res = (_res + _plus_7);
    String _res_1 = res;
    String _tab_5 = this.tab();
    String _tab_6 = this.tab();
    String _plus_8 = (_tab_5 + _tab_6);
    String _tab_7 = this.tab();
    String _plus_9 = (_plus_8 + _tab_7);
    String _plus_10 = (_plus_9 + "price: ");
    double _price = plan.getPrice();
    String _plus_11 = (_plus_10 + Double.valueOf(_price));
    String _plus_12 = (_plus_11 + "\n");
    res = (_res_1 + _plus_12);
    if (((plan.getDescription() != null) && (!plan.getDescription().isEmpty()))) {
      String _res_2 = res;
      String _tab_8 = this.tab();
      String _tab_9 = this.tab();
      String _plus_13 = (_tab_8 + _tab_9);
      String _tab_10 = this.tab();
      String _plus_14 = (_plus_13 + _tab_10);
      String _plus_15 = (_plus_14 + "description: \"");
      String _description = plan.getDescription();
      String _plus_16 = (_plus_15 + _description);
      String _plus_17 = (_plus_16 + "\"\n");
      res = (_res_2 + _plus_17);
    }
    boolean _isEmpty = plan.getFeatures().isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      String _res_3 = res;
      String _tab_11 = this.tab();
      String _tab_12 = this.tab();
      String _plus_18 = (_tab_11 + _tab_12);
      String _tab_13 = this.tab();
      String _plus_19 = (_plus_18 + _tab_13);
      String _plus_20 = (_plus_19 + "features:\n");
      res = (_res_3 + _plus_20);
      EList<Feature> _features = plan.getFeatures();
      for (final Feature f : _features) {
        String _res_4 = res;
        String _yAML = this.toYAML(f, 4);
        res = (_res_4 + _yAML);
      }
    }
    boolean _isEmpty_1 = plan.getUsageLimits().isEmpty();
    boolean _not_1 = (!_isEmpty_1);
    if (_not_1) {
      String _res_5 = res;
      String _tab_14 = this.tab();
      String _tab_15 = this.tab();
      String _plus_21 = (_tab_14 + _tab_15);
      String _tab_16 = this.tab();
      String _plus_22 = (_plus_21 + _tab_16);
      String _plus_23 = (_plus_22 + "usageLimits:\n");
      res = (_res_5 + _plus_23);
      EList<UsageLimit> _usageLimits = plan.getUsageLimits();
      for (final UsageLimit ul : _usageLimits) {
        {
          final String className = ul.eClass().getName();
          boolean _equals = className.equals("Renewable");
          if (_equals) {
            final Renewable r = ((Renewable) ul);
            String _res_6 = res;
            String _yAMLRenewable = this.toYAMLRenewable(r, 4);
            res = (_res_6 + _yAMLRenewable);
          } else {
            final NonRenewable nr = ((NonRenewable) ul);
            String _res_7 = res;
            String _yAMLNonRenewable = this.toYAMLNonRenewable(nr, 4);
            res = (_res_7 + _yAMLNonRenewable);
          }
        }
      }
    }
    return res;
  }

  public String toYAML(final AddOn addOn) {
    String _tab = this.tab();
    String _tab_1 = this.tab();
    String _plus = (_tab + _tab_1);
    String _plus_1 = (_plus + "- addOn: &");
    String _sanitizeAnchor = this.sanitizeAnchor(addOn.getName());
    String _plus_2 = (_plus_1 + _sanitizeAnchor);
    String res = (_plus_2 + "\n");
    String _res = res;
    String _tab_2 = this.tab();
    String _tab_3 = this.tab();
    String _plus_3 = (_tab_2 + _tab_3);
    String _tab_4 = this.tab();
    String _plus_4 = (_plus_3 + _tab_4);
    String _plus_5 = (_plus_4 + "name: \"");
    String _name = addOn.getName();
    String _plus_6 = (_plus_5 + _name);
    String _plus_7 = (_plus_6 + "\"\n");
    res = (_res + _plus_7);
    String _res_1 = res;
    String _tab_5 = this.tab();
    String _tab_6 = this.tab();
    String _plus_8 = (_tab_5 + _tab_6);
    String _tab_7 = this.tab();
    String _plus_9 = (_plus_8 + _tab_7);
    String _plus_10 = (_plus_9 + "price: ");
    double _price = addOn.getPrice();
    String _plus_11 = (_plus_10 + Double.valueOf(_price));
    String _plus_12 = (_plus_11 + "\n");
    res = (_res_1 + _plus_12);
    if (((addOn.getDescription() != null) && (!addOn.getDescription().isEmpty()))) {
      String _res_2 = res;
      String _tab_8 = this.tab();
      String _tab_9 = this.tab();
      String _plus_13 = (_tab_8 + _tab_9);
      String _tab_10 = this.tab();
      String _plus_14 = (_plus_13 + _tab_10);
      String _plus_15 = (_plus_14 + "description: \"");
      String _description = addOn.getDescription();
      String _plus_16 = (_plus_15 + _description);
      String _plus_17 = (_plus_16 + "\"\n");
      res = (_res_2 + _plus_17);
    }
    boolean _isEmpty = addOn.getAvailableFor().isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      String _res_3 = res;
      String _tab_11 = this.tab();
      String _tab_12 = this.tab();
      String _plus_18 = (_tab_11 + _tab_12);
      String _tab_13 = this.tab();
      String _plus_19 = (_plus_18 + _tab_13);
      String _plus_20 = (_plus_19 + "availableFor: [");
      res = (_res_3 + _plus_20);
      String _res_4 = res;
      String _replaceAll = addOn.getAvailableFor().get(0).getName().replaceAll("\\s+", "");
      String _plus_21 = ("*" + _replaceAll);
      res = (_res_4 + _plus_21);
      for (int i = 1; (i < addOn.getAvailableFor().size()); i++) {
        String _res_5 = res;
        String _replaceAll_1 = addOn.getAvailableFor().get(i).getName().replaceAll("\\s+", "");
        String _plus_22 = (", *" + _replaceAll_1);
        res = (_res_5 + _plus_22);
      }
      String _res_5 = res;
      res = (_res_5 + "]\n");
    }
    boolean _isEmpty_1 = addOn.getDependsOn().isEmpty();
    boolean _not_1 = (!_isEmpty_1);
    if (_not_1) {
      String _res_6 = res;
      String _tab_14 = this.tab();
      String _tab_15 = this.tab();
      String _plus_22 = (_tab_14 + _tab_15);
      String _tab_16 = this.tab();
      String _plus_23 = (_plus_22 + _tab_16);
      String _plus_24 = (_plus_23 + "dependsOn: [");
      res = (_res_6 + _plus_24);
      String _res_7 = res;
      String _replaceAll_1 = addOn.getDependsOn().get(0).getName().replaceAll("\\s+", "");
      String _plus_25 = ("*" + _replaceAll_1);
      res = (_res_7 + _plus_25);
      for (int i = 1; (i < addOn.getDependsOn().size()); i++) {
        String _res_8 = res;
        String _replaceAll_2 = addOn.getDependsOn().get(i).getName().replaceAll("\\s+", "");
        String _plus_26 = (", *" + _replaceAll_2);
        res = (_res_8 + _plus_26);
      }
      String _res_8 = res;
      res = (_res_8 + "]\n");
    }
    boolean _isEmpty_2 = addOn.getExcludes().isEmpty();
    boolean _not_2 = (!_isEmpty_2);
    if (_not_2) {
      String _res_9 = res;
      String _tab_17 = this.tab();
      String _tab_18 = this.tab();
      String _plus_26 = (_tab_17 + _tab_18);
      String _tab_19 = this.tab();
      String _plus_27 = (_plus_26 + _tab_19);
      String _plus_28 = (_plus_27 + "excludes: [");
      res = (_res_9 + _plus_28);
      String _res_10 = res;
      String _replaceAll_2 = addOn.getExcludes().get(0).getName().replaceAll("\\s+", "");
      String _plus_29 = ("*" + _replaceAll_2);
      res = (_res_10 + _plus_29);
      for (int i = 1; (i < addOn.getExcludes().size()); i++) {
        String _res_11 = res;
        String _replaceAll_3 = addOn.getExcludes().get(i).getName().replaceAll("\\s+", "");
        String _plus_30 = (", *" + _replaceAll_3);
        res = (_res_11 + _plus_30);
      }
      String _res_11 = res;
      res = (_res_11 + "]\n");
    }
    boolean _isEmpty_3 = addOn.getFeatures().isEmpty();
    boolean _not_3 = (!_isEmpty_3);
    if (_not_3) {
      String _res_12 = res;
      String _tab_20 = this.tab();
      String _tab_21 = this.tab();
      String _plus_30 = (_tab_20 + _tab_21);
      String _tab_22 = this.tab();
      String _plus_31 = (_plus_30 + _tab_22);
      String _plus_32 = (_plus_31 + "features:\n");
      res = (_res_12 + _plus_32);
      EList<Feature> _features = addOn.getFeatures();
      for (final Feature f : _features) {
        String _res_13 = res;
        String _yAML = this.toYAML(f, 4);
        res = (_res_13 + _yAML);
      }
    }
    return res;
  }

  public String toYAML(final Feature f, final int indent) {
    final String i = this.indentStr(indent);
    String _name = f.getName();
    String _plus = ((i + "- name: \"") + _name);
    String res = (_plus + "\"\n");
    ValueType _valueType = f.getValueType();
    boolean _tripleNotEquals = (_valueType != null);
    if (_tripleNotEquals) {
      String _res = res;
      String _tab = this.tab();
      String _plus_1 = (i + _tab);
      String _plus_2 = (_plus_1 + "valueType: ");
      ValueType _valueType_1 = f.getValueType();
      String _plus_3 = (_plus_2 + _valueType_1);
      String _plus_4 = (_plus_3 + "\n");
      res = (_res + _plus_4);
    }
    if (((f.getValue() != null) && (!f.getValue().isEmpty()))) {
      String _res_1 = res;
      String _tab_1 = this.tab();
      String _plus_5 = (i + _tab_1);
      String _plus_6 = (_plus_5 + "value: \"");
      String _value = f.getValue();
      String _plus_7 = (_plus_6 + _value);
      String _plus_8 = (_plus_7 + "\"\n");
      res = (_res_1 + _plus_8);
    }
    if (((f.getDefaultValue() != null) && (!f.getDefaultValue().isEmpty()))) {
      String _res_2 = res;
      String _tab_2 = this.tab();
      String _plus_9 = (i + _tab_2);
      String _plus_10 = (_plus_9 + "defaultValue: \"");
      String _defaultValue = f.getDefaultValue();
      String _plus_11 = (_plus_10 + _defaultValue);
      String _plus_12 = (_plus_11 + "\"\n");
      res = (_res_2 + _plus_12);
    }
    if (((f.getDescription() != null) && (!f.getDescription().isEmpty()))) {
      String _res_3 = res;
      String _tab_3 = this.tab();
      String _plus_13 = (i + _tab_3);
      String _plus_14 = (_plus_13 + "description: \"");
      String _description = f.getDescription();
      String _plus_15 = (_plus_14 + _description);
      String _plus_16 = (_plus_15 + "\"\n");
      res = (_res_3 + _plus_16);
    }
    return res;
  }

  public String toYAMLRenewable(final Renewable r, final int indent) {
    final String i = this.indentStr(indent);
    String _sanitizeAnchor = this.sanitizeAnchor(r.getName());
    String _plus = ((i + "- renewable: &") + _sanitizeAnchor);
    String res = (_plus + "\n");
    String _res = res;
    String _tab = this.tab();
    String _plus_1 = (i + _tab);
    String _plus_2 = (_plus_1 + "name: \"");
    String _name = r.getName();
    String _plus_3 = (_plus_2 + _name);
    String _plus_4 = (_plus_3 + "\"\n");
    res = (_res + _plus_4);
    double _limit = r.getLimit();
    boolean _greaterThan = (_limit > 0);
    if (_greaterThan) {
      String _res_1 = res;
      String _tab_1 = this.tab();
      String _plus_5 = (i + _tab_1);
      String _plus_6 = (_plus_5 + "limit: ");
      double _limit_1 = r.getLimit();
      String _plus_7 = (_plus_6 + Double.valueOf(_limit_1));
      String _plus_8 = (_plus_7 + "\n");
      res = (_res_1 + _plus_8);
    }
    if (((r.getUnit() != null) && (!r.getUnit().isEmpty()))) {
      String _res_2 = res;
      String _tab_2 = this.tab();
      String _plus_9 = (i + _tab_2);
      String _plus_10 = (_plus_9 + "unit: ");
      String _unit = r.getUnit();
      String _plus_11 = (_plus_10 + _unit);
      String _plus_12 = (_plus_11 + "\n");
      res = (_res_2 + _plus_12);
    }
    ValueType _valueType = r.getValueType();
    boolean _tripleNotEquals = (_valueType != null);
    if (_tripleNotEquals) {
      String _res_3 = res;
      String _tab_3 = this.tab();
      String _plus_13 = (i + _tab_3);
      String _plus_14 = (_plus_13 + "valueType: ");
      ValueType _valueType_1 = r.getValueType();
      String _plus_15 = (_plus_14 + _valueType_1);
      String _plus_16 = (_plus_15 + "\n");
      res = (_res_3 + _plus_16);
    }
    if (((r.getDescription() != null) && (!r.getDescription().isEmpty()))) {
      String _res_4 = res;
      String _tab_4 = this.tab();
      String _plus_17 = (i + _tab_4);
      String _plus_18 = (_plus_17 + "description: \"");
      String _description = r.getDescription();
      String _plus_19 = (_plus_18 + _description);
      String _plus_20 = (_plus_19 + "\"\n");
      res = (_res_4 + _plus_20);
    }
    String _res_5 = res;
    String _tab_5 = this.tab();
    String _plus_21 = (i + _tab_5);
    String _plus_22 = (_plus_21 + "period:\n");
    res = (_res_5 + _plus_22);
    String _res_6 = res;
    String _tab_6 = this.tab();
    String _plus_23 = (i + _tab_6);
    String _tab_7 = this.tab();
    String _plus_24 = (_plus_23 + _tab_7);
    String _plus_25 = (_plus_24 + "value: ");
    int _value = r.getPeriod().getValue();
    String _plus_26 = (_plus_25 + Integer.valueOf(_value));
    String _plus_27 = (_plus_26 + "\n");
    res = (_res_6 + _plus_27);
    String _res_7 = res;
    String _tab_8 = this.tab();
    String _plus_28 = (i + _tab_8);
    String _tab_9 = this.tab();
    String _plus_29 = (_plus_28 + _tab_9);
    String _plus_30 = (_plus_29 + "unit: ");
    TimeUnit _unit_1 = r.getPeriod().getUnit();
    String _plus_31 = (_plus_30 + _unit_1);
    String _plus_32 = (_plus_31 + "\n");
    res = (_res_7 + _plus_32);
    return res;
  }

  public String toYAMLNonRenewable(final NonRenewable nr, final int indent) {
    final String i = this.indentStr(indent);
    String _sanitizeAnchor = this.sanitizeAnchor(nr.getName());
    String _plus = ((i + "- nonRenewable: &") + _sanitizeAnchor);
    String res = (_plus + "\n");
    String _res = res;
    String _tab = this.tab();
    String _plus_1 = (i + _tab);
    String _plus_2 = (_plus_1 + "name: \"");
    String _name = nr.getName();
    String _plus_3 = (_plus_2 + _name);
    String _plus_4 = (_plus_3 + "\"\n");
    res = (_res + _plus_4);
    double _limit = nr.getLimit();
    boolean _greaterThan = (_limit > 0);
    if (_greaterThan) {
      String _res_1 = res;
      String _tab_1 = this.tab();
      String _plus_5 = (i + _tab_1);
      String _plus_6 = (_plus_5 + "limit: ");
      double _limit_1 = nr.getLimit();
      String _plus_7 = (_plus_6 + Double.valueOf(_limit_1));
      String _plus_8 = (_plus_7 + "\n");
      res = (_res_1 + _plus_8);
    }
    if (((nr.getUnit() != null) && (!nr.getUnit().isEmpty()))) {
      String _res_2 = res;
      String _tab_2 = this.tab();
      String _plus_9 = (i + _tab_2);
      String _plus_10 = (_plus_9 + "unit: ");
      String _unit = nr.getUnit();
      String _plus_11 = (_plus_10 + _unit);
      String _plus_12 = (_plus_11 + "\n");
      res = (_res_2 + _plus_12);
    }
    ValueType _valueType = nr.getValueType();
    boolean _tripleNotEquals = (_valueType != null);
    if (_tripleNotEquals) {
      String _res_3 = res;
      String _tab_3 = this.tab();
      String _plus_13 = (i + _tab_3);
      String _plus_14 = (_plus_13 + "valueType: ");
      ValueType _valueType_1 = nr.getValueType();
      String _plus_15 = (_plus_14 + _valueType_1);
      String _plus_16 = (_plus_15 + "\n");
      res = (_res_3 + _plus_16);
    }
    if (((nr.getDescription() != null) && (!nr.getDescription().isEmpty()))) {
      String _res_4 = res;
      String _tab_4 = this.tab();
      String _plus_17 = (i + _tab_4);
      String _plus_18 = (_plus_17 + "description: \"");
      String _description = nr.getDescription();
      String _plus_19 = (_plus_18 + _description);
      String _plus_20 = (_plus_19 + "\"\n");
      res = (_res_4 + _plus_20);
    }
    String _res_5 = res;
    String _tab_5 = this.tab();
    String _plus_21 = (i + _tab_5);
    String _plus_22 = (_plus_21 + "trackable: ");
    boolean _isTrackable = nr.isTrackable();
    String _plus_23 = (_plus_22 + Boolean.valueOf(_isTrackable));
    String _plus_24 = (_plus_23 + "\n");
    res = (_res_5 + _plus_24);
    return res;
  }

  public String indentStr(final int levels) {
    String res = "";
    for (int i = 0; (i < levels); i++) {
      String _res = res;
      String _tab = this.tab();
      res = (_res + _tab);
    }
    return res;
  }

  public String sanitizeAnchor(final String name) {
    if (((name == null) || name.isEmpty())) {
      return "unnamed";
    }
    return name.replaceAll("\\s+", "").replaceAll("[^a-zA-Z0-9_\\-]", "");
  }
}
