/**
 */
package enorm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Automation Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link enorm.AutomationRule#getName <em>Name</em>}</li>
 *   <li>{@link enorm.AutomationRule#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link enorm.AutomationRule#getContext <em>Context</em>}</li>
 *   <li>{@link enorm.AutomationRule#getInContext <em>In Context</em>}</li>
 *   <li>{@link enorm.AutomationRule#getOnFeedback <em>On Feedback</em>}</li>
 *   <li>{@link enorm.AutomationRule#getUses <em>Uses</em>}</li>
 *   <li>{@link enorm.AutomationRule#getConditions <em>Conditions</em>}</li>
 *   <li>{@link enorm.AutomationRule#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see enorm.EnormPackage#getAutomationRule()
 * @model
 * @generated
 */
public interface AutomationRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see enorm.EnormPackage#getAutomationRule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link enorm.AutomationRule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' attribute.
	 * The literals are from the enumeration {@link enorm.TriggerEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' attribute.
	 * @see enorm.TriggerEvent
	 * @see #setTrigger(TriggerEvent)
	 * @see enorm.EnormPackage#getAutomationRule_Trigger()
	 * @model
	 * @generated
	 */
	TriggerEvent getTrigger();

	/**
	 * Sets the value of the '{@link enorm.AutomationRule#getTrigger <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' attribute.
	 * @see enorm.TriggerEvent
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(TriggerEvent value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(ResourceType)
	 * @see enorm.EnormPackage#getAutomationRule_Context()
	 * @model
	 * @generated
	 */
	ResourceType getContext();

	/**
	 * Sets the value of the '{@link enorm.AutomationRule#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(ResourceType value);

	/**
	 * Returns the value of the '<em><b>In Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Context</em>' reference.
	 * @see #setInContext(ContextType)
	 * @see enorm.EnormPackage#getAutomationRule_InContext()
	 * @model
	 * @generated
	 */
	ContextType getInContext();

	/**
	 * Sets the value of the '{@link enorm.AutomationRule#getInContext <em>In Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Context</em>' reference.
	 * @see #getInContext()
	 * @generated
	 */
	void setInContext(ContextType value);

	/**
	 * Returns the value of the '<em><b>On Feedback</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Feedback</em>' reference.
	 * @see #setOnFeedback(FeedbackDefinition)
	 * @see enorm.EnormPackage#getAutomationRule_OnFeedback()
	 * @model
	 * @generated
	 */
	FeedbackDefinition getOnFeedback();

	/**
	 * Sets the value of the '{@link enorm.AutomationRule#getOnFeedback <em>On Feedback</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Feedback</em>' reference.
	 * @see #getOnFeedback()
	 * @generated
	 */
	void setOnFeedback(FeedbackDefinition value);

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' reference.
	 * @see #setUses(ValidationRule)
	 * @see enorm.EnormPackage#getAutomationRule_Uses()
	 * @model required="true"
	 * @generated
	 */
	ValidationRule getUses();

	/**
	 * Sets the value of the '{@link enorm.AutomationRule#getUses <em>Uses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses</em>' reference.
	 * @see #getUses()
	 * @generated
	 */
	void setUses(ValidationRule value);

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link enorm.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see enorm.EnormPackage#getAutomationRule_Conditions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Condition> getConditions();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link enorm.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see enorm.EnormPackage#getAutomationRule_Actions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Action> getActions();

} // AutomationRule
