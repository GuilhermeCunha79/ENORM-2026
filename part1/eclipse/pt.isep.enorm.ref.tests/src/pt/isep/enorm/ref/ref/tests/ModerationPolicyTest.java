/**
 */
package pt.isep.enorm.ref.ref.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import pt.isep.enorm.ref.ref.ModerationPolicy;
import pt.isep.enorm.ref.ref.RefFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Moderation Policy</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModerationPolicyTest extends TestCase {

	/**
	 * The fixture for this Moderation Policy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModerationPolicy fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ModerationPolicyTest.class);
	}

	/**
	 * Constructs a new Moderation Policy test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModerationPolicyTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Moderation Policy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ModerationPolicy fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Moderation Policy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModerationPolicy getFixture() {
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
		setFixture(RefFactory.eINSTANCE.createModerationPolicy());
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

} //ModerationPolicyTest
