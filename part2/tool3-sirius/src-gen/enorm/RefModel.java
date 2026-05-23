/**
 */
package enorm;

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
 *   <li>{@link enorm.RefModel#getName <em>Name</em>}</li>
 *   <li>{@link enorm.RefModel#getVersion <em>Version</em>}</li>
 *   <li>{@link enorm.RefModel#getUserTypes <em>User Types</em>}</li>
 *   <li>{@link enorm.RefModel#getResourceTypes <em>Resource Types</em>}</li>
 *   <li>{@link enorm.RefModel#getContextTypes <em>Context Types</em>}</li>
 *   <li>{@link enorm.RefModel#getResourceRelations <em>Resource Relations</em>}</li>
 *   <li>{@link enorm.RefModel#getFeedbackTypes <em>Feedback Types</em>}</li>
 *   <li>{@link enorm.RefModel#getFeedbackDefinitions <em>Feedback Definitions</em>}</li>
 *   <li>{@link enorm.RefModel#getAuthorizationRules <em>Authorization Rules</em>}</li>
 *   <li>{@link enorm.RefModel#getValidationRules <em>Validation Rules</em>}</li>
 *   <li>{@link enorm.RefModel#getModerationPolicies <em>Moderation Policies</em>}</li>
 *   <li>{@link enorm.RefModel#getAutomationRules <em>Automation Rules</em>}</li>
 *   <li>{@link enorm.RefModel#getVerificationPolicies <em>Verification Policies</em>}</li>
 *   <li>{@link enorm.RefModel#getSortingPolicies <em>Sorting Policies</em>}</li>
 * </ul>
 *
 * @see enorm.EnormPackage#getRefModel()
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
	 * @see enorm.EnormPackage#getRefModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link enorm.RefModel#getName <em>Name</em>}' attribute.
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
	 * @see enorm.EnormPackage#getRefModel_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link enorm.RefModel#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>User Types</b></em>' containment reference list.
	 * The list contents are of type {@link enorm.UserType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Types</em>' containment reference list.
	 * @see enorm.EnormPackage#getRefModel_UserTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<UserType> getUserTypes();

	/**
	 * Returns the value of the '<em><b>Resource Types</b></em>' containment reference list.
	 * The list contents are of type {@link enorm.ResourceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Types</em>' containment reference list.
	 * @see enorm.EnormPackage#getRefModel_ResourceTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceType> getResourceTypes();

	/**
	 * Returns the value of the '<em><b>Context Types</b></em>' containment reference list.
	 * The list contents are of type {@link enorm.ContextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Types</em>' containment reference list.
	 * @see enorm.EnormPackage#getRefModel_ContextTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContextType> getContextTypes();

	/**
	 * Returns the value of the '<em><b>Resource Relations</b></em>' containment reference list.
	 * The list contents are of type {@link enorm.ResourceRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Relations</em>' containment reference list.
	 * @see enorm.EnormPackage#getRefModel_ResourceRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceRelation> getResourceRelations();

	/**
	 * Returns the value of the '<em><b>Feedback Types</b></em>' containment reference list.
	 * The list contents are of type {@link enorm.FeedbackType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedback Types</em>' containment reference list.
	 * @see enorm.EnormPackage#getRefModel_FeedbackTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeedbackType> getFeedbackTypes();

	/**
	 * Returns the value of the '<em><b>Feedback Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link enorm.FeedbackDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedback Definitions</em>' containment reference list.
	 * @see enorm.EnormPackage#getRefModel_FeedbackDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeedbackDefinition> getFeedbackDefinitions();

	/**
	 * Returns the value of the '<em><b>Authorization Rules</b></em>' containment reference list.
	 * The list contents are of type {@link enorm.AuthorizationRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorization Rules</em>' containment reference list.
	 * @see enorm.EnormPackage#getRefModel_AuthorizationRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<AuthorizationRule> getAuthorizationRules();

	/**
	 * Returns the value of the '<em><b>Validation Rules</b></em>' containment reference list.
	 * The list contents are of type {@link enorm.ValidationRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation Rules</em>' containment reference list.
	 * @see enorm.EnormPackage#getRefModel_ValidationRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValidationRule> getValidationRules();

	/**
	 * Returns the value of the '<em><b>Moderation Policies</b></em>' containment reference list.
	 * The list contents are of type {@link enorm.ModerationPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moderation Policies</em>' containment reference list.
	 * @see enorm.EnormPackage#getRefModel_ModerationPolicies()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModerationPolicy> getModerationPolicies();

	/**
	 * Returns the value of the '<em><b>Automation Rules</b></em>' containment reference list.
	 * The list contents are of type {@link enorm.AutomationRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automation Rules</em>' containment reference list.
	 * @see enorm.EnormPackage#getRefModel_AutomationRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<AutomationRule> getAutomationRules();

	/**
	 * Returns the value of the '<em><b>Verification Policies</b></em>' containment reference list.
	 * The list contents are of type {@link enorm.VerificationPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verification Policies</em>' containment reference list.
	 * @see enorm.EnormPackage#getRefModel_VerificationPolicies()
	 * @model containment="true"
	 * @generated
	 */
	EList<VerificationPolicy> getVerificationPolicies();

	/**
	 * Returns the value of the '<em><b>Sorting Policies</b></em>' containment reference list.
	 * The list contents are of type {@link enorm.SortingPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Policies</em>' containment reference list.
	 * @see enorm.EnormPackage#getRefModel_SortingPolicies()
	 * @model containment="true"
	 * @generated
	 */
	EList<SortingPolicy> getSortingPolicies();

} // RefModel
