/**
 */
package pricing.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import pricing.AddOn;
import pricing.PricingFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Add On</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AddOnTest extends TestCase {

	/**
	 * The fixture for this Add On test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddOn fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AddOnTest.class);
	}

	/**
	 * Constructs a new Add On test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddOnTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Add On test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AddOn fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Add On test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddOn getFixture() {
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
		setFixture(PricingFactory.eINSTANCE.createAddOn());
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

} //AddOnTest
