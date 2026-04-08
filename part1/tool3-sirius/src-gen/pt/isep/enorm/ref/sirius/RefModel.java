/**
 */
package pt.isep.enorm.ref.sirius;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.enorm.ref.sirius.RefModel#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.RefModel#getVersion <em>Version</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.RefModel#getUserTypes <em>User Types</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.RefModel#getResourceTypes <em>Resource Types</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.RefModel#getFeedbackPolicies <em>Feedback Policies</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.RefModel#getContextTypes <em>Context Types</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.RefModel#getResourceRelations <em>Resource Relations</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.RefModel#getFeedbackTypes <em>Feedback Types</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.RefModel#getFeedbackDefinitions <em>Feedback Definitions</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.RefModel#getRatingPolicies <em>Rating Policies</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.RefModel#getValidationRules <em>Validation Rules</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.RefModel#getModerationPolicies <em>Moderation Policies</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.RefModel#getAutomationRules <em>Automation Rules</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.RefModel#getVerificationPolicies <em>Verification Policies</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.RefModel#getEvolutionRules <em>Evolution Rules</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.RefModel#getRefactoringOperations <em>Refactoring Operations</em>}</li>
 * </ul>
 *
 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getRefModel()
 * @model
 * @generated
 */
public interface RefModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getRefModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.sirius.RefModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getRefModel_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.sirius.RefModel#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>User Types</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.enorm.ref.sirius.UserType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Types</em>' containment reference list.
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getRefModel_UserTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<UserType> getUserTypes();

	/**
	 * Returns the value of the '<em><b>Resource Types</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.enorm.ref.sirius.ResourceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Types</em>' containment reference list.
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getRefModel_ResourceTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceType> getResourceTypes();

	/**
	 * Returns the value of the '<em><b>Feedback Policies</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.enorm.ref.sirius.FeedbackPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedback Policies</em>' containment reference list.
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getRefModel_FeedbackPolicies()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeedbackPolicy> getFeedbackPolicies();

	/**
	 * Returns the value of the '<em><b>Context Types</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.enorm.ref.sirius.ContextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Types</em>' containment reference list.
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getRefModel_ContextTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContextType> getContextTypes();

	/**
	 * Returns the value of the '<em><b>Resource Relations</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.enorm.ref.sirius.ResourceRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Relations</em>' containment reference list.
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getRefModel_ResourceRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceRelation> getResourceRelations();

	/**
	 * Returns the value of the '<em><b>Feedback Types</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.enorm.ref.sirius.FeedbackType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedback Types</em>' containment reference list.
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getRefModel_FeedbackTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeedbackType> getFeedbackTypes();

	/**
	 * Returns the value of the '<em><b>Feedback Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.enorm.ref.sirius.FeedbackDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedback Definitions</em>' containment reference list.
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getRefModel_FeedbackDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeedbackDefinition> getFeedbackDefinitions();

	/**
	 * Returns the value of the '<em><b>Rating Policies</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.enorm.ref.sirius.RatingPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rating Policies</em>' containment reference list.
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getRefModel_RatingPolicies()
	 * @model containment="true"
	 * @generated
	 */
	EList<RatingPolicy> getRatingPolicies();

	/**
	 * Returns the value of the '<em><b>Validation Rules</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.enorm.ref.sirius.ValidationRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation Rules</em>' containment reference list.
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getRefModel_ValidationRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValidationRule> getValidationRules();

	/**
	 * Returns the value of the '<em><b>Moderation Policies</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.enorm.ref.sirius.ModerationPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moderation Policies</em>' containment reference list.
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getRefModel_ModerationPolicies()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModerationPolicy> getModerationPolicies();

	/**
	 * Returns the value of the '<em><b>Automation Rules</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.enorm.ref.sirius.AutomationRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automation Rules</em>' containment reference list.
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getRefModel_AutomationRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<AutomationRule> getAutomationRules();

	/**
	 * Returns the value of the '<em><b>Verification Policies</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.enorm.ref.sirius.VerificationPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verification Policies</em>' containment reference list.
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getRefModel_VerificationPolicies()
	 * @model containment="true"
	 * @generated
	 */
	EList<VerificationPolicy> getVerificationPolicies();

	/**
	 * Returns the value of the '<em><b>Evolution Rules</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.enorm.ref.sirius.EvolutionRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evolution Rules</em>' containment reference list.
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getRefModel_EvolutionRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<EvolutionRule> getEvolutionRules();

	/**
	 * Returns the value of the '<em><b>Refactoring Operations</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.enorm.ref.sirius.RefactoringOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refactoring Operations</em>' containment reference list.
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getRefModel_RefactoringOperations()
	 * @model containment="true"
	 * @generated
	 */
	EList<RefactoringOperation> getRefactoringOperations();

} // RefModel
