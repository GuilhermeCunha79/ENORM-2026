/**
 */
package pt.isep.enorm.ref.ref;

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
 *   <li>{@link pt.isep.enorm.ref.ref.AuthorizationRule#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.AuthorizationRule#getAllowedAction <em>Allowed Action</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.AuthorizationRule#getActor <em>Actor</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.AuthorizationRule#getContext <em>Context</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.AuthorizationRule#getResourceTarget <em>Resource Target</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.AuthorizationRule#getFeedbackTarget <em>Feedback Target</em>}</li>
 * </ul>
 *
 * @see pt.isep.enorm.ref.ref.RefPackage#getAuthorizationRule()
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
	 * @see pt.isep.enorm.ref.ref.RefPackage#getAuthorizationRule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.AuthorizationRule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Allowed Action</b></em>' attribute.
	 * The literals are from the enumeration {@link pt.isep.enorm.ref.ref.ActionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Action</em>' attribute.
	 * @see pt.isep.enorm.ref.ref.ActionKind
	 * @see #setAllowedAction(ActionKind)
	 * @see pt.isep.enorm.ref.ref.RefPackage#getAuthorizationRule_AllowedAction()
	 * @model
	 * @generated
	 */
	ActionKind getAllowedAction();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.AuthorizationRule#getAllowedAction <em>Allowed Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed Action</em>' attribute.
	 * @see pt.isep.enorm.ref.ref.ActionKind
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
	 * @see pt.isep.enorm.ref.ref.RefPackage#getAuthorizationRule_Actor()
	 * @model required="true"
	 * @generated
	 */
	UserType getActor();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.AuthorizationRule#getActor <em>Actor</em>}' reference.
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
	 * @see pt.isep.enorm.ref.ref.RefPackage#getAuthorizationRule_Context()
	 * @model
	 * @generated
	 */
	ContextType getContext();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.AuthorizationRule#getContext <em>Context</em>}' reference.
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
	 * @see pt.isep.enorm.ref.ref.RefPackage#getAuthorizationRule_ResourceTarget()
	 * @model required="true"
	 * @generated
	 */
	ResourceType getResourceTarget();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.AuthorizationRule#getResourceTarget <em>Resource Target</em>}' reference.
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
	 * @see pt.isep.enorm.ref.ref.RefPackage#getAuthorizationRule_FeedbackTarget()
	 * @model
	 * @generated
	 */
	FeedbackDefinition getFeedbackTarget();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.AuthorizationRule#getFeedbackTarget <em>Feedback Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feedback Target</em>' reference.
	 * @see #getFeedbackTarget()
	 * @generated
	 */
	void setFeedbackTarget(FeedbackDefinition value);

} // AuthorizationRule
