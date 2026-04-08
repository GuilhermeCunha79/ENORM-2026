/**
 */
package pt.isep.enorm.ref.sirius;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pt.isep.enorm.ref.sirius.SiriusPackage
 * @generated
 */
public interface SiriusFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SiriusFactory eINSTANCE = pt.isep.enorm.ref.sirius.impl.SiriusFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ref Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ref Model</em>'.
	 * @generated
	 */
	RefModel createRefModel();

	/**
	 * Returns a new object of class '<em>User Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Type</em>'.
	 * @generated
	 */
	UserType createUserType();

	/**
	 * Returns a new object of class '<em>Context Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Type</em>'.
	 * @generated
	 */
	ContextType createContextType();

	/**
	 * Returns a new object of class '<em>Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Type</em>'.
	 * @generated
	 */
	ResourceType createResourceType();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Resource Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Relation</em>'.
	 * @generated
	 */
	ResourceRelation createResourceRelation();

	/**
	 * Returns a new object of class '<em>Feedback Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feedback Type</em>'.
	 * @generated
	 */
	FeedbackType createFeedbackType();

	/**
	 * Returns a new object of class '<em>Feedback Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feedback Definition</em>'.
	 * @generated
	 */
	FeedbackDefinition createFeedbackDefinition();

	/**
	 * Returns a new object of class '<em>Feedback Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feedback Policy</em>'.
	 * @generated
	 */
	FeedbackPolicy createFeedbackPolicy();

	/**
	 * Returns a new object of class '<em>Rating Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rating Policy</em>'.
	 * @generated
	 */
	RatingPolicy createRatingPolicy();

	/**
	 * Returns a new object of class '<em>Validation Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Validation Rule</em>'.
	 * @generated
	 */
	ValidationRule createValidationRule();

	/**
	 * Returns a new object of class '<em>Moderation Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Moderation Policy</em>'.
	 * @generated
	 */
	ModerationPolicy createModerationPolicy();

	/**
	 * Returns a new object of class '<em>Authorization Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authorization Rule</em>'.
	 * @generated
	 */
	AuthorizationRule createAuthorizationRule();

	/**
	 * Returns a new object of class '<em>Automation Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Automation Rule</em>'.
	 * @generated
	 */
	AutomationRule createAutomationRule();

	/**
	 * Returns a new object of class '<em>Verification Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Verification Policy</em>'.
	 * @generated
	 */
	VerificationPolicy createVerificationPolicy();

	/**
	 * Returns a new object of class '<em>Evolution Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evolution Rule</em>'.
	 * @generated
	 */
	EvolutionRule createEvolutionRule();

	/**
	 * Returns a new object of class '<em>Refactoring Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Refactoring Operation</em>'.
	 * @generated
	 */
	RefactoringOperation createRefactoringOperation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SiriusPackage getSiriusPackage();

} //SiriusFactory
