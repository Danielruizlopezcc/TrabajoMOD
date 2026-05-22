/**
 */
package pricing;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add On</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pricing.AddOn#getName <em>Name</em>}</li>
 *   <li>{@link pricing.AddOn#getDescription <em>Description</em>}</li>
 *   <li>{@link pricing.AddOn#getPrice <em>Price</em>}</li>
 *   <li>{@link pricing.AddOn#getFeatures <em>Features</em>}</li>
 *   <li>{@link pricing.AddOn#getUsageLimits <em>Usage Limits</em>}</li>
 *   <li>{@link pricing.AddOn#getAvailableFor <em>Available For</em>}</li>
 *   <li>{@link pricing.AddOn#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link pricing.AddOn#getExcludes <em>Excludes</em>}</li>
 * </ul>
 *
 * @see pricing.PricingPackage#getAddOn()
 * @model
 * @generated
 */
public interface AddOn extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pricing.PricingPackage#getAddOn_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pricing.AddOn#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see pricing.PricingPackage#getAddOn_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link pricing.AddOn#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(double)
	 * @see pricing.PricingPackage#getAddOn_Price()
	 * @model
	 * @generated
	 */
	double getPrice();

	/**
	 * Sets the value of the '{@link pricing.AddOn#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(double value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link pricing.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see pricing.PricingPackage#getAddOn_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Usage Limits</b></em>' reference list.
	 * The list contents are of type {@link pricing.UsageLimit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Limits</em>' reference list.
	 * @see pricing.PricingPackage#getAddOn_UsageLimits()
	 * @model
	 * @generated
	 */
	EList<UsageLimit> getUsageLimits();

	/**
	 * Returns the value of the '<em><b>Available For</b></em>' reference list.
	 * The list contents are of type {@link pricing.Plan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available For</em>' reference list.
	 * @see pricing.PricingPackage#getAddOn_AvailableFor()
	 * @model
	 * @generated
	 */
	EList<Plan> getAvailableFor();

	/**
	 * Returns the value of the '<em><b>Depends On</b></em>' reference list.
	 * The list contents are of type {@link pricing.AddOn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends On</em>' reference list.
	 * @see pricing.PricingPackage#getAddOn_DependsOn()
	 * @model
	 * @generated
	 */
	EList<AddOn> getDependsOn();

	/**
	 * Returns the value of the '<em><b>Excludes</b></em>' reference list.
	 * The list contents are of type {@link pricing.AddOn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Excludes</em>' reference list.
	 * @see pricing.PricingPackage#getAddOn_Excludes()
	 * @model
	 * @generated
	 */
	EList<AddOn> getExcludes();

} // AddOn
