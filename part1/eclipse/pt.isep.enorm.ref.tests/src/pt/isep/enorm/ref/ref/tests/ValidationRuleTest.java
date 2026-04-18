/**
 */
package pt.isep.enorm.ref.ref.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import pt.isep.enorm.ref.ref.RefFactory;
import pt.isep.enorm.ref.ref.ValidationRule;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Validation Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValidationRuleTest extends TestCase {

	/**
	 * The fixture for this Validation Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidationRule fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ValidationRuleTest.class);
	}

	/**
	 * Constructs a new Validation Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidationRuleTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Validation Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ValidationRule fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Validation Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidationRule getFixture() {
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
		setFixture(RefFactory.eINSTANCE.createValidationRule());
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

} //ValidationRuleTest
