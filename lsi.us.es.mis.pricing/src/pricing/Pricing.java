/**
 */
package pricing;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pricing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pricing.Pricing#getSaasName <em>Saas Name</em>}</li>
 *   <li>{@link pricing.Pricing#getVersion <em>Version</em>}</li>
 *   <li>{@link pricing.Pricing#getCurrency <em>Currency</em>}</li>
 *   <li>{@link pricing.Pricing#getUrl <em>Url</em>}</li>
 *   <li>{@link pricing.Pricing#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link pricing.Pricing#getTags <em>Tags</em>}</li>
 *   <li>{@link pricing.Pricing#getPlans <em>Plans</em>}</li>
 *   <li>{@link pricing.Pricing#getAddOns <em>Add Ons</em>}</li>
 * </ul>
 *
 * @see pricing.PricingPackage#getPricing()
 * @model
 * @generated
 */
public interface Pricing extends EObject {
	/**
	 * Returns the value of the '<em><b>Saas Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Saas Name</em>' attribute.
	 * @see #setSaasName(String)
	 * @see pricing.PricingPackage#getPricing_SaasName()
	 * @model
	 * @generated
	 */
	String getSaasName();

	/**
	 * Sets the value of the '{@link pricing.Pricing#getSaasName <em>Saas Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Saas Name</em>' attribute.
	 * @see #getSaasName()
	 * @generated
	 */
	void setSaasName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see pricing.PricingPackage#getPricing_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link pricing.Pricing#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency</em>' attribute.
	 * @see #setCurrency(String)
	 * @see pricing.PricingPackage#getPricing_Currency()
	 * @model
	 * @generated
	 */
	String getCurrency();

	/**
	 * Sets the value of the '{@link pricing.Pricing#getCurrency <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' attribute.
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see pricing.PricingPackage#getPricing_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link pricing.Pricing#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created At</em>' attribute.
	 * @see #setCreatedAt(String)
	 * @see pricing.PricingPackage#getPricing_CreatedAt()
	 * @model
	 * @generated
	 */
	String getCreatedAt();

	/**
	 * Sets the value of the '{@link pricing.Pricing#getCreatedAt <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created At</em>' attribute.
	 * @see #getCreatedAt()
	 * @generated
	 */
	void setCreatedAt(String value);

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' attribute list.
	 * @see pricing.PricingPackage#getPricing_Tags()
	 * @model
	 * @generated
	 */
	EList<String> getTags();

	/**
	 * Returns the value of the '<em><b>Plans</b></em>' containment reference list.
	 * The list contents are of type {@link pricing.Plan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plans</em>' containment reference list.
	 * @see pricing.PricingPackage#getPricing_Plans()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Plan> getPlans();

	/**
	 * Returns the value of the '<em><b>Add Ons</b></em>' containment reference list.
	 * The list contents are of type {@link pricing.AddOn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Ons</em>' containment reference list.
	 * @see pricing.PricingPackage#getPricing_AddOns()
	 * @model containment="true"
	 * @generated
	 */
	EList<AddOn> getAddOns();

} // Pricing
