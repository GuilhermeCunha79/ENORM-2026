/**
 */
package pt.isep.enorm.ref.ref.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import pt.isep.enorm.ref.ref.AuthorizationRule;
import pt.isep.enorm.ref.ref.RefFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Authorization Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AuthorizationRuleTest extends TestCase {

	/**
	 * The fixture for this Authorization Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorizationRule fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AuthorizationRuleTest.class);
	}

	/**
	 * Constructs a new Authorization Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationRuleTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Authorization Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AuthorizationRule fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Authorization Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorizationRule getFixture() {
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
		setFixture(RefFactory.eINSTANCE.createAuthorizationRule());
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

} //AuthorizationRuleTest
