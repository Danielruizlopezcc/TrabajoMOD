/**
 */
package pricing.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import pricing.Pricing;
import pricing.PricingFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pricing</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PricingTest extends TestCase {

	/**
	 * The fixture for this Pricing test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pricing fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PricingTest.class);
	}

	/**
	 * Constructs a new Pricing test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PricingTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Pricing test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Pricing fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Pricing test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pricing getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PricingFactory.eINSTANCE.createPricing());
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

} //PricingTest
