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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pricing.AddOn;
import pricing.Feature;
import pricing.Plan;
import pricing.PricingPackage;
import pricing.UsageLimit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add On</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pricing.impl.AddOnImpl#getName <em>Name</em>}</li>
 *   <li>{@link pricing.impl.AddOnImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link pricing.impl.AddOnImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link pricing.impl.AddOnImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link pricing.impl.AddOnImpl#getUsageLimits <em>Usage Limits</em>}</li>
 *   <li>{@link pricing.impl.AddOnImpl#getAvailableFor <em>Available For</em>}</li>
 *   <li>{@link pricing.impl.AddOnImpl#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link pricing.impl.AddOnImpl#getExcludes <em>Excludes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddOnImpl extends MinimalEObjectImpl.Container implements AddOn {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected double price = PRICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> features;

	/**
	 * The cached value of the '{@link #getUsageLimits() <em>Usage Limits</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageLimits()
	 * @generated
	 * @ordered
	 */
	protected EList<UsageLimit> usageLimits;

	/**
	 * The cached value of the '{@link #getAvailableFor() <em>Available For</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableFor()
	 * @generated
	 * @ordered
	 */
	protected EList<Plan> availableFor;

	/**
	 * The cached value of the '{@link #getDependsOn() <em>Depends On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsOn()
	 * @generated
	 * @ordered
	 */
	protected EList<AddOn> dependsOn;

	/**
	 * The cached value of the '{@link #getExcludes() <em>Excludes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludes()
	 * @generated
	 * @ordered
	 */
	protected EList<AddOn> excludes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddOnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PricingPackage.Literals.ADD_ON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricingPackage.ADD_ON__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricingPackage.ADD_ON__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(double newPrice) {
		double oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricingPackage.ADD_ON__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<Feature>(Feature.class, this, PricingPackage.ADD_ON__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsageLimit> getUsageLimits() {
		if (usageLimits == null) {
			usageLimits = new EObjectResolvingEList<UsageLimit>(UsageLimit.class, this, PricingPackage.ADD_ON__USAGE_LIMITS);
		}
		return usageLimits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Plan> getAvailableFor() {
		if (availableFor == null) {
			availableFor = new EObjectResolvingEList<Plan>(Plan.class, this, PricingPackage.ADD_ON__AVAILABLE_FOR);
		}
		return availableFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddOn> getDependsOn() {
		if (dependsOn == null) {
			dependsOn = new EObjectResolvingEList<AddOn>(AddOn.class, this, PricingPackage.ADD_ON__DEPENDS_ON);
		}
		return dependsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddOn> getExcludes() {
		if (excludes == null) {
			excludes = new EObjectResolvingEList<AddOn>(AddOn.class, this, PricingPackage.ADD_ON__EXCLUDES);
		}
		return excludes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PricingPackage.ADD_ON__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
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
			case PricingPackage.ADD_ON__NAME:
				return getName();
			case PricingPackage.ADD_ON__DESCRIPTION:
				return getDescription();
			case PricingPackage.ADD_ON__PRICE:
				return getPrice();
			case PricingPackage.ADD_ON__FEATURES:
				return getFeatures();
			case PricingPackage.ADD_ON__USAGE_LIMITS:
				return getUsageLimits();
			case PricingPackage.ADD_ON__AVAILABLE_FOR:
				return getAvailableFor();
			case PricingPackage.ADD_ON__DEPENDS_ON:
				return getDependsOn();
			case PricingPackage.ADD_ON__EXCLUDES:
				return getExcludes();
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
			case PricingPackage.ADD_ON__NAME:
				setName((String)newValue);
				return;
			case PricingPackage.ADD_ON__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case PricingPackage.ADD_ON__PRICE:
				setPrice((Double)newValue);
				return;
			case PricingPackage.ADD_ON__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case PricingPackage.ADD_ON__USAGE_LIMITS:
				getUsageLimits().clear();
				getUsageLimits().addAll((Collection<? extends UsageLimit>)newValue);
				return;
			case PricingPackage.ADD_ON__AVAILABLE_FOR:
				getAvailableFor().clear();
				getAvailableFor().addAll((Collection<? extends Plan>)newValue);
				return;
			case PricingPackage.ADD_ON__DEPENDS_ON:
				getDependsOn().clear();
				getDependsOn().addAll((Collection<? extends AddOn>)newValue);
				return;
			case PricingPackage.ADD_ON__EXCLUDES:
				getExcludes().clear();
				getExcludes().addAll((Collection<? extends AddOn>)newValue);
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
			case PricingPackage.ADD_ON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PricingPackage.ADD_ON__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case PricingPackage.ADD_ON__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case PricingPackage.ADD_ON__FEATURES:
				getFeatures().clear();
				return;
			case PricingPackage.ADD_ON__USAGE_LIMITS:
				getUsageLimits().clear();
				return;
			case PricingPackage.ADD_ON__AVAILABLE_FOR:
				getAvailableFor().clear();
				return;
			case PricingPackage.ADD_ON__DEPENDS_ON:
				getDependsOn().clear();
				return;
			case PricingPackage.ADD_ON__EXCLUDES:
				getExcludes().clear();
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
			case PricingPackage.ADD_ON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PricingPackage.ADD_ON__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case PricingPackage.ADD_ON__PRICE:
				return price != PRICE_EDEFAULT;
			case PricingPackage.ADD_ON__FEATURES:
				return features != null && !features.isEmpty();
			case PricingPackage.ADD_ON__USAGE_LIMITS:
				return usageLimits != null && !usageLimits.isEmpty();
			case PricingPackage.ADD_ON__AVAILABLE_FOR:
				return availableFor != null && !availableFor.isEmpty();
			case PricingPackage.ADD_ON__DEPENDS_ON:
				return dependsOn != null && !dependsOn.isEmpty();
			case PricingPackage.ADD_ON__EXCLUDES:
				return excludes != null && !excludes.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", price: ");
		result.append(price);
		result.append(')');
		return result.toString();
	}

} //AddOnImpl
