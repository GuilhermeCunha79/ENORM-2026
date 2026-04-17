/**
 */
package enorm;

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
 *   <li>{@link enorm.AutomationRule#getCondition <em>Condition</em>}</li>
 *   <li>{@link enorm.AutomationRule#getActionDescription <em>Action Description</em>}</li>
 *   <li>{@link enorm.AutomationRule#getContext <em>Context</em>}</li>
 *   <li>{@link enorm.AutomationRule#getInContext <em>In Context</em>}</li>
 *   <li>{@link enorm.AutomationRule#getOnFeedback <em>On Feedback</em>}</li>
 *   <li>{@link enorm.AutomationRule#getUses <em>Uses</em>}</li>
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' attribute.
	 * @see #setTrigger(String)
	 * @see enorm.EnormPackage#getAutomationRule_Trigger()
	 * @model
	 * @generated
	 */
	String getTrigger();

	/**
	 * Sets the value of the '{@link enorm.AutomationRule#getTrigger <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' attribute.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(String value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see enorm.EnormPackage#getAutomationRule_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link enorm.AutomationRule#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Action Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Description</em>' attribute.
	 * @see #setActionDescription(String)
	 * @see enorm.EnormPackage#getAutomationRule_ActionDescription()
	 * @model
	 * @generated
	 */
	String getActionDescription();

	/**
	 * Sets the value of the '{@link enorm.AutomationRule#getActionDescription <em>Action Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Description</em>' attribute.
	 * @see #getActionDescription()
	 * @generated
	 */
	void setActionDescription(String value);

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
	 * @model required="true"
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

} // AutomationRule
