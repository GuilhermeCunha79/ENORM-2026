/**
 */
package pt.isep.enorm.ref.ref.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import pt.isep.enorm.ref.ref.RefFactory;
import pt.isep.enorm.ref.ref.VerificationPolicy;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Verification Policy</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VerificationPolicyTest extends TestCase {

	/**
	 * The fixture for this Verification Policy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerificationPolicy fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VerificationPolicyTest.class);
	}

	/**
	 * Constructs a new Verification Policy test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerificationPolicyTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Verification Policy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(VerificationPolicy fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Verification Policy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerificationPolicy getFixture() {
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
		setFixture(RefFactory.eINSTANCE.createVerificationPolicy());
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

} //VerificationPolicyTest
