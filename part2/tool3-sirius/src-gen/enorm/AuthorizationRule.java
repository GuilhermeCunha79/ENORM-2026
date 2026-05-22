/**
 */
package enorm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authorization Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link enorm.AuthorizationRule#getName <em>Name</em>}</li>
 *   <li>{@link enorm.AuthorizationRule#getAllowedAction <em>Allowed Action</em>}</li>
 *   <li>{@link enorm.AuthorizationRule#getActor <em>Actor</em>}</li>
 *   <li>{@link enorm.AuthorizationRule#getContext <em>Context</em>}</li>
 *   <li>{@link enorm.AuthorizationRule#getResourceTarget <em>Resource Target</em>}</li>
 *   <li>{@link enorm.AuthorizationRule#getFeedbackTarget <em>Feedback Target</em>}</li>
 * </ul>
 *
 * @see enorm.EnormPackage#getAuthorizationRule()
 * @model
 * @generated
 */
public interface AuthorizationRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see enorm.EnormPackage#getAuthorizationRule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link enorm.AuthorizationRule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Allowed Action</b></em>' attribute.
	 * The literals are from the enumeration {@link enorm.ActionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Action</em>' attribute.
	 * @see enorm.ActionKind
	 * @see #setAllowedAction(ActionKind)
	 * @see enorm.EnormPackage#getAuthorizationRule_AllowedAction()
	 * @model
	 * @generated
	 */
	ActionKind getAllowedAction();

	/**
	 * Sets the value of the '{@link enorm.AuthorizationRule#getAllowedAction <em>Allowed Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed Action</em>' attribute.
	 * @see enorm.ActionKind
	 * @see #getAllowedAction()
	 * @generated
	 */
	void setAllowedAction(ActionKind value);

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' reference.
	 * @see #setActor(UserType)
	 * @see enorm.EnormPackage#getAuthorizationRule_Actor()
	 * @model required="true"
	 * @generated
	 */
	UserType getActor();

	/**
	 * Sets the value of the '{@link enorm.AuthorizationRule#getActor <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(UserType value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(ContextType)
	 * @see enorm.EnormPackage#getAuthorizationRule_Context()
	 * @model
	 * @generated
	 */
	ContextType getContext();

	/**
	 * Sets the value of the '{@link enorm.AuthorizationRule#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(ContextType value);

	/**
	 * Returns the value of the '<em><b>Resource Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Target</em>' reference.
	 * @see #setResourceTarget(ResourceType)
	 * @see enorm.EnormPackage#getAuthorizationRule_ResourceTarget()
	 * @model required="true"
	 * @generated
	 */
	ResourceType getResourceTarget();

	/**
	 * Sets the value of the '{@link enorm.AuthorizationRule#getResourceTarget <em>Resource Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Target</em>' reference.
	 * @see #getResourceTarget()
	 * @generated
	 */
	void setResourceTarget(ResourceType value);

	/**
	 * Returns the value of the '<em><b>Feedback Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedback Target</em>' reference.
	 * @see #setFeedbackTarget(FeedbackDefinition)
	 * @see enorm.EnormPackage#getAuthorizationRule_FeedbackTarget()
	 * @model
	 * @generated
	 */
	FeedbackDefinition getFeedbackTarget();

	/**
	 * Sets the value of the '{@link enorm.AuthorizationRule#getFeedbackTarget <em>Feedback Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feedback Target</em>' reference.
	 * @see #getFeedbackTarget()
	 * @generated
	 */
	void setFeedbackTarget(FeedbackDefinition value);

} // AuthorizationRule
