/**
 */
package pricing;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Renewable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pricing.NonRenewable#isTrackable <em>Trackable</em>}</li>
 * </ul>
 *
 * @see pricing.PricingPackage#getNonRenewable()
 * @model
 * @generated
 */
public interface NonRenewable extends UsageLimit {
	/**
	 * Returns the value of the '<em><b>Trackable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trackable</em>' attribute.
	 * @see #setTrackable(boolean)
	 * @see pricing.PricingPackage#getNonRenewable_Trackable()
	 * @model
	 * @generated
	 */
	boolean isTrackable();

	/**
	 * Sets the value of the '{@link pricing.NonRenewable#isTrackable <em>Trackable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trackable</em>' attribute.
	 * @see #isTrackable()
	 * @generated
	 */
	void setTrackable(boolean value);

} // NonRenewable
