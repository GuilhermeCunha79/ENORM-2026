/**
 */
package pt.isep.enorm.ref.ref.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import pt.isep.enorm.ref.ref.FeedbackPolicy;
import pt.isep.enorm.ref.ref.RefFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Feedback Policy</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeedbackPolicyTest extends TestCase {

	/**
	 * The fixture for this Feedback Policy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeedbackPolicy fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FeedbackPolicyTest.class);
	}

	/**
	 * Constructs a new Feedback Policy test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackPolicyTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Feedback Policy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(FeedbackPolicy fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Feedback Policy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeedbackPolicy getFixture() {
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
		setFixture(RefFactory.eINSTANCE.createFeedbackPolicy());
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

} //FeedbackPolicyTest
