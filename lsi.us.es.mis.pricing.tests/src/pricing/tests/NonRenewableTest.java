/**
 */
package pricing.tests;

import junit.textui.TestRunner;

import pricing.NonRenewable;
import pricing.PricingFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Non Renewable</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NonRenewableTest extends UsageLimitTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NonRenewableTest.class);
	}

	/**
	 * Constructs a new Non Renewable test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonRenewableTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Non Renewable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NonRenewable getFixture() {
		return (NonRenewable)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PricingFactory.eINSTANCE.createNonRenewable());
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

} //NonRenewableTest
