/**
 */
package pt.isep.enorm.ref.ref.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import pt.isep.enorm.ref.ref.FeedbackDefinition;
import pt.isep.enorm.ref.ref.RefFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Feedback Definition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeedbackDefinitionTest extends TestCase {

	/**
	 * The fixture for this Feedback Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeedbackDefinition fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FeedbackDefinitionTest.class);
	}

	/**
	 * Constructs a new Feedback Definition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackDefinitionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Feedback Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(FeedbackDefinition fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Feedback Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeedbackDefinition getFixture() {
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
		setFixture(RefFactory.eINSTANCE.createFeedbackDefinition());
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

} //FeedbackDefinitionTest
