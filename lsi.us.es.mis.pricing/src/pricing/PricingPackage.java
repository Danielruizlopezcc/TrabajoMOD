/**
 */
package pricing;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pricing.PricingFactory
 * @model kind="package"
 * @generated
 */
public interface PricingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pricing";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://lsi.us.es/mis/pricing";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pricing";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PricingPackage eINSTANCE = pricing.impl.PricingPackageImpl.init();

	/**
	 * The meta object id for the '{@link pricing.impl.PricingImpl <em>Pricing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pricing.impl.PricingImpl
	 * @see pricing.impl.PricingPackageImpl#getPricing()
	 * @generated
	 */
	int PRICING = 0;

	/**
	 * The feature id for the '<em><b>Saas Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING__SAAS_NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING__CURRENCY = 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING__URL = 3;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING__CREATED_AT = 4;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING__TAGS = 5;

	/**
	 * The feature id for the '<em><b>Plans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING__PLANS = 6;

	/**
	 * The feature id for the '<em><b>Add Ons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING__ADD_ONS = 7;

	/**
	 * The number of structural features of the '<em>Pricing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Pricing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pricing.impl.PlanImpl <em>Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pricing.impl.PlanImpl
	 * @see pricing.impl.PricingPackageImpl#getPlan()
	 * @generated
	 */
	int PLAN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN__PRICE = 2;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN__FEATURES = 3;

	/**
	 * The feature id for the '<em><b>Usage Limits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN__USAGE_LIMITS = 4;

	/**
	 * The number of structural features of the '<em>Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pricing.impl.AddOnImpl <em>Add On</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pricing.impl.AddOnImpl
	 * @see pricing.impl.PricingPackageImpl#getAddOn()
	 * @generated
	 */
	int ADD_ON = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ON__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ON__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ON__PRICE = 2;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ON__FEATURES = 3;

	/**
	 * The feature id for the '<em><b>Usage Limits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ON__USAGE_LIMITS = 4;

	/**
	 * The feature id for the '<em><b>Available For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ON__AVAILABLE_FOR = 5;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ON__DEPENDS_ON = 6;

	/**
	 * The feature id for the '<em><b>Excludes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ON__EXCLUDES = 7;

	/**
	 * The number of structural features of the '<em>Add On</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ON_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Add On</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pricing.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pricing.impl.FeatureImpl
	 * @see pricing.impl.PricingPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Server Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SERVER_EXPRESSION = 4;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DEFAULT_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__VALUE_TYPE = 6;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pricing.impl.UsageLimitImpl <em>Usage Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pricing.impl.UsageLimitImpl
	 * @see pricing.impl.PricingPackageImpl#getUsageLimit()
	 * @generated
	 */
	int USAGE_LIMIT = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_LIMIT__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_LIMIT__DEFAULT_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_LIMIT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_LIMIT__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_LIMIT__UNIT = 4;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_LIMIT__VALUE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_LIMIT__LIMIT = 6;

	/**
	 * The feature id for the '<em><b>Linked To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_LIMIT__LINKED_TO = 7;

	/**
	 * The number of structural features of the '<em>Usage Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_LIMIT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Usage Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_LIMIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pricing.impl.PeriodImpl <em>Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pricing.impl.PeriodImpl
	 * @see pricing.impl.PricingPackageImpl#getPeriod()
	 * @generated
	 */
	int PERIOD = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pricing.impl.RenewableImpl <em>Renewable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pricing.impl.RenewableImpl
	 * @see pricing.impl.PricingPackageImpl#getRenewable()
	 * @generated
	 */
	int RENEWABLE = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENEWABLE__VALUE = USAGE_LIMIT__VALUE;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENEWABLE__DEFAULT_VALUE = USAGE_LIMIT__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENEWABLE__NAME = USAGE_LIMIT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENEWABLE__DESCRIPTION = USAGE_LIMIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENEWABLE__UNIT = USAGE_LIMIT__UNIT;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENEWABLE__VALUE_TYPE = USAGE_LIMIT__VALUE_TYPE;

	/**
	 * The feature id for the '<em><b>Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENEWABLE__LIMIT = USAGE_LIMIT__LIMIT;

	/**
	 * The feature id for the '<em><b>Linked To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENEWABLE__LINKED_TO = USAGE_LIMIT__LINKED_TO;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENEWABLE__PERIOD = USAGE_LIMIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Renewable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENEWABLE_FEATURE_COUNT = USAGE_LIMIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Renewable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENEWABLE_OPERATION_COUNT = USAGE_LIMIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pricing.impl.NonRenewableImpl <em>Non Renewable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pricing.impl.NonRenewableImpl
	 * @see pricing.impl.PricingPackageImpl#getNonRenewable()
	 * @generated
	 */
	int NON_RENEWABLE = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_RENEWABLE__VALUE = USAGE_LIMIT__VALUE;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_RENEWABLE__DEFAULT_VALUE = USAGE_LIMIT__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_RENEWABLE__NAME = USAGE_LIMIT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_RENEWABLE__DESCRIPTION = USAGE_LIMIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_RENEWABLE__UNIT = USAGE_LIMIT__UNIT;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_RENEWABLE__VALUE_TYPE = USAGE_LIMIT__VALUE_TYPE;

	/**
	 * The feature id for the '<em><b>Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_RENEWABLE__LIMIT = USAGE_LIMIT__LIMIT;

	/**
	 * The feature id for the '<em><b>Linked To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_RENEWABLE__LINKED_TO = USAGE_LIMIT__LINKED_TO;

	/**
	 * The feature id for the '<em><b>Trackable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_RENEWABLE__TRACKABLE = USAGE_LIMIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Non Renewable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_RENEWABLE_FEATURE_COUNT = USAGE_LIMIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Non Renewable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_RENEWABLE_OPERATION_COUNT = USAGE_LIMIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pricing.ValueType <em>Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pricing.ValueType
	 * @see pricing.impl.PricingPackageImpl#getValueType()
	 * @generated
	 */
	int VALUE_TYPE = 8;

	/**
	 * The meta object id for the '{@link pricing.TimeUnit <em>Time Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pricing.TimeUnit
	 * @see pricing.impl.PricingPackageImpl#getTimeUnit()
	 * @generated
	 */
	int TIME_UNIT = 9;


	/**
	 * Returns the meta object for class '{@link pricing.Pricing <em>Pricing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pricing</em>'.
	 * @see pricing.Pricing
	 * @generated
	 */
	EClass getPricing();

	/**
	 * Returns the meta object for the attribute '{@link pricing.Pricing#getSaasName <em>Saas Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Saas Name</em>'.
	 * @see pricing.Pricing#getSaasName()
	 * @see #getPricing()
	 * @generated
	 */
	EAttribute getPricing_SaasName();

	/**
	 * Returns the meta object for the attribute '{@link pricing.Pricing#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see pricing.Pricing#getVersion()
	 * @see #getPricing()
	 * @generated
	 */
	EAttribute getPricing_Version();

	/**
	 * Returns the meta object for the attribute '{@link pricing.Pricing#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency</em>'.
	 * @see pricing.Pricing#getCurrency()
	 * @see #getPricing()
	 * @generated
	 */
	EAttribute getPricing_Currency();

	/**
	 * Returns the meta object for the attribute '{@link pricing.Pricing#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see pricing.Pricing#getUrl()
	 * @see #getPricing()
	 * @generated
	 */
	EAttribute getPricing_Url();

	/**
	 * Returns the meta object for the attribute '{@link pricing.Pricing#getCreatedAt <em>Created At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created At</em>'.
	 * @see pricing.Pricing#getCreatedAt()
	 * @see #getPricing()
	 * @generated
	 */
	EAttribute getPricing_CreatedAt();

	/**
	 * Returns the meta object for the attribute list '{@link pricing.Pricing#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tags</em>'.
	 * @see pricing.Pricing#getTags()
	 * @see #getPricing()
	 * @generated
	 */
	EAttribute getPricing_Tags();

	/**
	 * Returns the meta object for the containment reference list '{@link pricing.Pricing#getPlans <em>Plans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plans</em>'.
	 * @see pricing.Pricing#getPlans()
	 * @see #getPricing()
	 * @generated
	 */
	EReference getPricing_Plans();

	/**
	 * Returns the meta object for the containment reference list '{@link pricing.Pricing#getAddOns <em>Add Ons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Add Ons</em>'.
	 * @see pricing.Pricing#getAddOns()
	 * @see #getPricing()
	 * @generated
	 */
	EReference getPricing_AddOns();

	/**
	 * Returns the meta object for class '{@link pricing.Plan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan</em>'.
	 * @see pricing.Plan
	 * @generated
	 */
	EClass getPlan();

	/**
	 * Returns the meta object for the attribute '{@link pricing.Plan#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pricing.Plan#getName()
	 * @see #getPlan()
	 * @generated
	 */
	EAttribute getPlan_Name();

	/**
	 * Returns the meta object for the attribute '{@link pricing.Plan#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see pricing.Plan#getDescription()
	 * @see #getPlan()
	 * @generated
	 */
	EAttribute getPlan_Description();

	/**
	 * Returns the meta object for the attribute '{@link pricing.Plan#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see pricing.Plan#getPrice()
	 * @see #getPlan()
	 * @generated
	 */
	EAttribute getPlan_Price();

	/**
	 * Returns the meta object for the containment reference list '{@link pricing.Plan#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see pricing.Plan#getFeatures()
	 * @see #getPlan()
	 * @generated
	 */
	EReference getPlan_Features();

	/**
	 * Returns the meta object for the containment reference list '{@link pricing.Plan#getUsageLimits <em>Usage Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Usage Limits</em>'.
	 * @see pricing.Plan#getUsageLimits()
	 * @see #getPlan()
	 * @generated
	 */
	EReference getPlan_UsageLimits();

	/**
	 * Returns the meta object for class '{@link pricing.AddOn <em>Add On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add On</em>'.
	 * @see pricing.AddOn
	 * @generated
	 */
	EClass getAddOn();

	/**
	 * Returns the meta object for the attribute '{@link pricing.AddOn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pricing.AddOn#getName()
	 * @see #getAddOn()
	 * @generated
	 */
	EAttribute getAddOn_Name();

	/**
	 * Returns the meta object for the attribute '{@link pricing.AddOn#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see pricing.AddOn#getDescription()
	 * @see #getAddOn()
	 * @generated
	 */
	EAttribute getAddOn_Description();

	/**
	 * Returns the meta object for the attribute '{@link pricing.AddOn#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see pricing.AddOn#getPrice()
	 * @see #getAddOn()
	 * @generated
	 */
	EAttribute getAddOn_Price();

	/**
	 * Returns the meta object for the containment reference list '{@link pricing.AddOn#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see pricing.AddOn#getFeatures()
	 * @see #getAddOn()
	 * @generated
	 */
	EReference getAddOn_Features();

	/**
	 * Returns the meta object for the reference list '{@link pricing.AddOn#getUsageLimits <em>Usage Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usage Limits</em>'.
	 * @see pricing.AddOn#getUsageLimits()
	 * @see #getAddOn()
	 * @generated
	 */
	EReference getAddOn_UsageLimits();

	/**
	 * Returns the meta object for the reference list '{@link pricing.AddOn#getAvailableFor <em>Available For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Available For</em>'.
	 * @see pricing.AddOn#getAvailableFor()
	 * @see #getAddOn()
	 * @generated
	 */
	EReference getAddOn_AvailableFor();

	/**
	 * Returns the meta object for the reference list '{@link pricing.AddOn#getDependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Depends On</em>'.
	 * @see pricing.AddOn#getDependsOn()
	 * @see #getAddOn()
	 * @generated
	 */
	EReference getAddOn_DependsOn();

	/**
	 * Returns the meta object for the reference list '{@link pricing.AddOn#getExcludes <em>Excludes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Excludes</em>'.
	 * @see pricing.AddOn#getExcludes()
	 * @see #getAddOn()
	 * @generated
	 */
	EReference getAddOn_Excludes();

	/**
	 * Returns the meta object for class '{@link pricing.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see pricing.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link pricing.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pricing.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

	/**
	 * Returns the meta object for the attribute '{@link pricing.Feature#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see pricing.Feature#getDescription()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Description();

	/**
	 * Returns the meta object for the attribute '{@link pricing.Feature#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see pricing.Feature#getValue()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Value();

	/**
	 * Returns the meta object for the attribute '{@link pricing.Feature#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see pricing.Feature#getExpression()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Expression();

	/**
	 * Returns the meta object for the attribute '{@link pricing.Feature#getServerExpression <em>Server Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Expression</em>'.
	 * @see pricing.Feature#getServerExpression()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_ServerExpression();

	/**
	 * Returns the meta object for the attribute '{@link pricing.Feature#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see pricing.Feature#getDefaultValue()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link pricing.Feature#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see pricing.Feature#getValueType()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_ValueType();

	/**
	 * Returns the meta object for class '{@link pricing.UsageLimit <em>Usage Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usage Limit</em>'.
	 * @see pricing.UsageLimit
	 * @generated
	 */
	EClass getUsageLimit();

	/**
	 * Returns the meta object for the attribute '{@link pricing.UsageLimit#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see pricing.UsageLimit#getValue()
	 * @see #getUsageLimit()
	 * @generated
	 */
	EAttribute getUsageLimit_Value();

	/**
	 * Returns the meta object for the attribute '{@link pricing.UsageLimit#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see pricing.UsageLimit#getDefaultValue()
	 * @see #getUsageLimit()
	 * @generated
	 */
	EAttribute getUsageLimit_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link pricing.UsageLimit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pricing.UsageLimit#getName()
	 * @see #getUsageLimit()
	 * @generated
	 */
	EAttribute getUsageLimit_Name();

	/**
	 * Returns the meta object for the attribute '{@link pricing.UsageLimit#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see pricing.UsageLimit#getDescription()
	 * @see #getUsageLimit()
	 * @generated
	 */
	EAttribute getUsageLimit_Description();

	/**
	 * Returns the meta object for the attribute '{@link pricing.UsageLimit#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see pricing.UsageLimit#getUnit()
	 * @see #getUsageLimit()
	 * @generated
	 */
	EAttribute getUsageLimit_Unit();

	/**
	 * Returns the meta object for the attribute '{@link pricing.UsageLimit#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see pricing.UsageLimit#getValueType()
	 * @see #getUsageLimit()
	 * @generated
	 */
	EAttribute getUsageLimit_ValueType();

	/**
	 * Returns the meta object for the attribute '{@link pricing.UsageLimit#getLimit <em>Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limit</em>'.
	 * @see pricing.UsageLimit#getLimit()
	 * @see #getUsageLimit()
	 * @generated
	 */
	EAttribute getUsageLimit_Limit();

	/**
	 * Returns the meta object for the containment reference list '{@link pricing.UsageLimit#getLinkedTo <em>Linked To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Linked To</em>'.
	 * @see pricing.UsageLimit#getLinkedTo()
	 * @see #getUsageLimit()
	 * @generated
	 */
	EReference getUsageLimit_LinkedTo();

	/**
	 * Returns the meta object for class '{@link pricing.Period <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Period</em>'.
	 * @see pricing.Period
	 * @generated
	 */
	EClass getPeriod();

	/**
	 * Returns the meta object for the attribute '{@link pricing.Period#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see pricing.Period#getValue()
	 * @see #getPeriod()
	 * @generated
	 */
	EAttribute getPeriod_Value();

	/**
	 * Returns the meta object for the attribute '{@link pricing.Period#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see pricing.Period#getUnit()
	 * @see #getPeriod()
	 * @generated
	 */
	EAttribute getPeriod_Unit();

	/**
	 * Returns the meta object for class '{@link pricing.Renewable <em>Renewable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Renewable</em>'.
	 * @see pricing.Renewable
	 * @generated
	 */
	EClass getRenewable();

	/**
	 * Returns the meta object for the containment reference '{@link pricing.Renewable#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see pricing.Renewable#getPeriod()
	 * @see #getRenewable()
	 * @generated
	 */
	EReference getRenewable_Period();

	/**
	 * Returns the meta object for class '{@link pricing.NonRenewable <em>Non Renewable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Renewable</em>'.
	 * @see pricing.NonRenewable
	 * @generated
	 */
	EClass getNonRenewable();

	/**
	 * Returns the meta object for the attribute '{@link pricing.NonRenewable#isTrackable <em>Trackable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trackable</em>'.
	 * @see pricing.NonRenewable#isTrackable()
	 * @see #getNonRenewable()
	 * @generated
	 */
	EAttribute getNonRenewable_Trackable();

	/**
	 * Returns the meta object for enum '{@link pricing.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Value Type</em>'.
	 * @see pricing.ValueType
	 * @generated
	 */
	EEnum getValueType();

	/**
	 * Returns the meta object for enum '{@link pricing.TimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Unit</em>'.
	 * @see pricing.TimeUnit
	 * @generated
	 */
	EEnum getTimeUnit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PricingFactory getPricingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pricing.impl.PricingImpl <em>Pricing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pricing.impl.PricingImpl
		 * @see pricing.impl.PricingPackageImpl#getPricing()
		 * @generated
		 */
		EClass PRICING = eINSTANCE.getPricing();

		/**
		 * The meta object literal for the '<em><b>Saas Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICING__SAAS_NAME = eINSTANCE.getPricing_SaasName();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICING__VERSION = eINSTANCE.getPricing_Version();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICING__CURRENCY = eINSTANCE.getPricing_Currency();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICING__URL = eINSTANCE.getPricing_Url();

		/**
		 * The meta object literal for the '<em><b>Created At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICING__CREATED_AT = eINSTANCE.getPricing_CreatedAt();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICING__TAGS = eINSTANCE.getPricing_Tags();

		/**
		 * The meta object literal for the '<em><b>Plans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRICING__PLANS = eINSTANCE.getPricing_Plans();

		/**
		 * The meta object literal for the '<em><b>Add Ons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRICING__ADD_ONS = eINSTANCE.getPricing_AddOns();

		/**
		 * The meta object literal for the '{@link pricing.impl.PlanImpl <em>Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pricing.impl.PlanImpl
		 * @see pricing.impl.PricingPackageImpl#getPlan()
		 * @generated
		 */
		EClass PLAN = eINSTANCE.getPlan();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAN__NAME = eINSTANCE.getPlan_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAN__DESCRIPTION = eINSTANCE.getPlan_Description();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAN__PRICE = eINSTANCE.getPlan_Price();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAN__FEATURES = eINSTANCE.getPlan_Features();

		/**
		 * The meta object literal for the '<em><b>Usage Limits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAN__USAGE_LIMITS = eINSTANCE.getPlan_UsageLimits();

		/**
		 * The meta object literal for the '{@link pricing.impl.AddOnImpl <em>Add On</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pricing.impl.AddOnImpl
		 * @see pricing.impl.PricingPackageImpl#getAddOn()
		 * @generated
		 */
		EClass ADD_ON = eINSTANCE.getAddOn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_ON__NAME = eINSTANCE.getAddOn_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_ON__DESCRIPTION = eINSTANCE.getAddOn_Description();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_ON__PRICE = eINSTANCE.getAddOn_Price();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_ON__FEATURES = eINSTANCE.getAddOn_Features();

		/**
		 * The meta object literal for the '<em><b>Usage Limits</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_ON__USAGE_LIMITS = eINSTANCE.getAddOn_UsageLimits();

		/**
		 * The meta object literal for the '<em><b>Available For</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_ON__AVAILABLE_FOR = eINSTANCE.getAddOn_AvailableFor();

		/**
		 * The meta object literal for the '<em><b>Depends On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_ON__DEPENDS_ON = eINSTANCE.getAddOn_DependsOn();

		/**
		 * The meta object literal for the '<em><b>Excludes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_ON__EXCLUDES = eINSTANCE.getAddOn_Excludes();

		/**
		 * The meta object literal for the '{@link pricing.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pricing.impl.FeatureImpl
		 * @see pricing.impl.PricingPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__DESCRIPTION = eINSTANCE.getFeature_Description();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__VALUE = eINSTANCE.getFeature_Value();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__EXPRESSION = eINSTANCE.getFeature_Expression();

		/**
		 * The meta object literal for the '<em><b>Server Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__SERVER_EXPRESSION = eINSTANCE.getFeature_ServerExpression();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__DEFAULT_VALUE = eINSTANCE.getFeature_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__VALUE_TYPE = eINSTANCE.getFeature_ValueType();

		/**
		 * The meta object literal for the '{@link pricing.impl.UsageLimitImpl <em>Usage Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pricing.impl.UsageLimitImpl
		 * @see pricing.impl.PricingPackageImpl#getUsageLimit()
		 * @generated
		 */
		EClass USAGE_LIMIT = eINSTANCE.getUsageLimit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USAGE_LIMIT__VALUE = eINSTANCE.getUsageLimit_Value();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USAGE_LIMIT__DEFAULT_VALUE = eINSTANCE.getUsageLimit_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USAGE_LIMIT__NAME = eINSTANCE.getUsageLimit_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USAGE_LIMIT__DESCRIPTION = eINSTANCE.getUsageLimit_Description();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USAGE_LIMIT__UNIT = eINSTANCE.getUsageLimit_Unit();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USAGE_LIMIT__VALUE_TYPE = eINSTANCE.getUsageLimit_ValueType();

		/**
		 * The meta object literal for the '<em><b>Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USAGE_LIMIT__LIMIT = eINSTANCE.getUsageLimit_Limit();

		/**
		 * The meta object literal for the '<em><b>Linked To</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USAGE_LIMIT__LINKED_TO = eINSTANCE.getUsageLimit_LinkedTo();

		/**
		 * The meta object literal for the '{@link pricing.impl.PeriodImpl <em>Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pricing.impl.PeriodImpl
		 * @see pricing.impl.PricingPackageImpl#getPeriod()
		 * @generated
		 */
		EClass PERIOD = eINSTANCE.getPeriod();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIOD__VALUE = eINSTANCE.getPeriod_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIOD__UNIT = eINSTANCE.getPeriod_Unit();

		/**
		 * The meta object literal for the '{@link pricing.impl.RenewableImpl <em>Renewable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pricing.impl.RenewableImpl
		 * @see pricing.impl.PricingPackageImpl#getRenewable()
		 * @generated
		 */
		EClass RENEWABLE = eINSTANCE.getRenewable();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENEWABLE__PERIOD = eINSTANCE.getRenewable_Period();

		/**
		 * The meta object literal for the '{@link pricing.impl.NonRenewableImpl <em>Non Renewable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pricing.impl.NonRenewableImpl
		 * @see pricing.impl.PricingPackageImpl#getNonRenewable()
		 * @generated
		 */
		EClass NON_RENEWABLE = eINSTANCE.getNonRenewable();

		/**
		 * The meta object literal for the '<em><b>Trackable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NON_RENEWABLE__TRACKABLE = eINSTANCE.getNonRenewable_Trackable();

		/**
		 * The meta object literal for the '{@link pricing.ValueType <em>Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pricing.ValueType
		 * @see pricing.impl.PricingPackageImpl#getValueType()
		 * @generated
		 */
		EEnum VALUE_TYPE = eINSTANCE.getValueType();

		/**
		 * The meta object literal for the '{@link pricing.TimeUnit <em>Time Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pricing.TimeUnit
		 * @see pricing.impl.PricingPackageImpl#getTimeUnit()
		 * @generated
		 */
		EEnum TIME_UNIT = eINSTANCE.getTimeUnit();

	}

} //PricingPackage
