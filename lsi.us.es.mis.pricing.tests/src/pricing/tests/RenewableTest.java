/**
 */
package pricing.tests;

import junit.textui.TestRunner;

import pricing.PricingFactory;
import pricing.Renewable;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Renewable</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RenewableTest extends UsageLimitTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RenewableTest.class);
	}

	/**
	 * Constructs a new Renewable test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenewableTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Renewable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Renewable getFixture() {
		return (Renewable)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PricingFactory.eINSTANCE.createRenewable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //RenewableTest
