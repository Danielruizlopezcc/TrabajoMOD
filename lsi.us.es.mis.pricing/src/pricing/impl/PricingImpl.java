/**
 */
package pricing.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pricing.AddOn;
import pricing.Plan;
import pricing.Pricing;
import pricing.PricingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pricing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pricing.impl.PricingImpl#getSaasName <em>Saas Name</em>}</li>
 *   <li>{@link pricing.impl.PricingImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link pricing.impl.PricingImpl#getCurrency <em>Currency</em>}</li>
 *   <li>{@link pricing.impl.PricingImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link pricing.impl.PricingImpl#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link pricing.impl.PricingImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link pricing.impl.PricingImpl#getPlans <em>Plans</em>}</li>
 *   <li>{@link pricing.impl.PricingImpl#getAddOns <em>Add Ons</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PricingImpl extends MinimalEObjectImpl.Container implements Pricing {
	/**
	 * The default value of the '{@link #getSaasName() <em>Saas Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaasName()
	 * @generated
	 * @ordered
	 */
	protected static final String SAAS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSaasName() <em>Saas Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaasName()
	 * @generated
	 * @ordered
	 */
	protected String saasName = SAAS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected String currency = CURRENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedAt() <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedAt()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedAt() <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedAt()
	 * @generated
	 * @ordered
	 */
	protected String createdAt = CREATED_AT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<String> tags;

	/**
	 * The cached value of the '{@link #getPlans() <em>Plans</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlans()
	 * @generated
	 * @ordered
	 */
	protected EList<Plan> plans;

	/**
	 * The cached value of the '{@link #getAddOns() <em>Add Ons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddOns()
	 * @generated
	 * @ordered
	 */
	protected EList<AddOn> addOns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PricingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PricingPackage.Literals.PRICING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSaasName() {
		return saasName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSaasName(String newSaasName) {
		String oldSaasName = saasName;
		saasName = newSaasName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricingPackage.PRICING__SAAS_NAME, oldSaasName, saasName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricingPackage.PRICING__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrency(String newCurrency) {
		String oldCurrency = currency;
		currency = newCurrency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricingPackage.PRICING__CURRENCY, oldCurrency, currency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricingPackage.PRICING__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreatedAt() {
		return createdAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedAt(String newCreatedAt) {
		String oldCreatedAt = createdAt;
		createdAt = newCreatedAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricingPackage.PRICING__CREATED_AT, oldCreatedAt, createdAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTags() {
		if (tags == null) {
			tags = new EDataTypeUniqueEList<String>(String.class, this, PricingPackage.PRICING__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Plan> getPlans() {
		if (plans == null) {
			plans = new EObjectContainmentEList<Plan>(Plan.class, this, PricingPackage.PRICING__PLANS);
		}
		return plans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddOn> getAddOns() {
		if (addOns == null) {
			addOns = new EObjectContainmentEList<AddOn>(AddOn.class, this, PricingPackage.PRICING__ADD_ONS);
		}
		return addOns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PricingPackage.PRICING__PLANS:
				return ((InternalEList<?>)getPlans()).basicRemove(otherEnd, msgs);
			case PricingPackage.PRICING__ADD_ONS:
				return ((InternalEList<?>)getAddOns()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PricingPackage.PRICING__SAAS_NAME:
				return getSaasName();
			case PricingPackage.PRICING__VERSION:
				return getVersion();
			case PricingPackage.PRICING__CURRENCY:
				return getCurrency();
			case PricingPackage.PRICING__URL:
				return getUrl();
			case PricingPackage.PRICING__CREATED_AT:
				return getCreatedAt();
			case PricingPackage.PRICING__TAGS:
				return getTags();
			case PricingPackage.PRICING__PLANS:
				return getPlans();
			case PricingPackage.PRICING__ADD_ONS:
				return getAddOns();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PricingPackage.PRICING__SAAS_NAME:
				setSaasName((String)newValue);
				return;
			case PricingPackage.PRICING__VERSION:
				setVersion((String)newValue);
				return;
			case PricingPackage.PRICING__CURRENCY:
				setCurrency((String)newValue);
				return;
			case PricingPackage.PRICING__URL:
				setUrl((String)newValue);
				return;
			case PricingPackage.PRICING__CREATED_AT:
				setCreatedAt((String)newValue);
				return;
			case PricingPackage.PRICING__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends String>)newValue);
				return;
			case PricingPackage.PRICING__PLANS:
				getPlans().clear();
				getPlans().addAll((Collection<? extends Plan>)newValue);
				return;
			case PricingPackage.PRICING__ADD_ONS:
				getAddOns().clear();
				getAddOns().addAll((Collection<? extends AddOn>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PricingPackage.PRICING__SAAS_NAME:
				setSaasName(SAAS_NAME_EDEFAULT);
				return;
			case PricingPackage.PRICING__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case PricingPackage.PRICING__CURRENCY:
				setCurrency(CURRENCY_EDEFAULT);
				return;
			case PricingPackage.PRICING__URL:
				setUrl(URL_EDEFAULT);
				return;
			case PricingPackage.PRICING__CREATED_AT:
				setCreatedAt(CREATED_AT_EDEFAULT);
				return;
			case PricingPackage.PRICING__TAGS:
				getTags().clear();
				return;
			case PricingPackage.PRICING__PLANS:
				getPlans().clear();
				return;
			case PricingPackage.PRICING__ADD_ONS:
				getAddOns().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PricingPackage.PRICING__SAAS_NAME:
				return SAAS_NAME_EDEFAULT == null ? saasName != null : !SAAS_NAME_EDEFAULT.equals(saasName);
			case PricingPackage.PRICING__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case PricingPackage.PRICING__CURRENCY:
				return CURRENCY_EDEFAULT == null ? currency != null : !CURRENCY_EDEFAULT.equals(currency);
			case PricingPackage.PRICING__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case PricingPackage.PRICING__CREATED_AT:
				return CREATED_AT_EDEFAULT == null ? createdAt != null : !CREATED_AT_EDEFAULT.equals(createdAt);
			case PricingPackage.PRICING__TAGS:
				return tags != null && !tags.isEmpty();
			case PricingPackage.PRICING__PLANS:
				return plans != null && !plans.isEmpty();
			case PricingPackage.PRICING__ADD_ONS:
				return addOns != null && !addOns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (saasName: ");
		result.append(saasName);
		result.append(", version: ");
		result.append(version);
		result.append(", currency: ");
		result.append(currency);
		result.append(", url: ");
		result.append(url);
		result.append(", createdAt: ");
		result.append(createdAt);
		result.append(", tags: ");
		result.append(tags);
		result.append(')');
		return result.toString();
	}

} //PricingImpl
