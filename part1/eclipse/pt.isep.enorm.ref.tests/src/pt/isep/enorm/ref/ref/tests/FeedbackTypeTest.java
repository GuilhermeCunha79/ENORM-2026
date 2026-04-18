/**
 */
package pt.isep.enorm.ref.ref.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import pt.isep.enorm.ref.ref.FeedbackType;
import pt.isep.enorm.ref.ref.RefFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Feedback Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeedbackTypeTest extends TestCase {

	/**
	 * The fixture for this Feedback Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeedbackType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FeedbackTypeTest.class);
	}

	/**
	 * Constructs a new Feedback Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Feedback Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(FeedbackType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Feedback Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeedbackType getFixture() {
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
		setFixture(RefFactory.eINSTANCE.createFeedbackType());
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

} //FeedbackTypeTest
