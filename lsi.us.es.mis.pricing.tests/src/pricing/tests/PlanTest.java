/**
 */
package pricing.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import pricing.Plan;
import pricing.PricingFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Plan</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlanTest extends TestCase {

	/**
	 * The fixture for this Plan test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Plan fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PlanTest.class);
	}

	/**
	 * Constructs a new Plan test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Plan test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Plan fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Plan test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Plan getFixture() {
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
		setFixture(PricingFactory.eINSTANCE.createPlan());
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

} //PlanTest
