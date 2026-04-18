/**
 */
package enorm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Moderation Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link enorm.ModerationPolicy#getName <em>Name</em>}</li>
 *   <li>{@link enorm.ModerationPolicy#getMode <em>Mode</em>}</li>
 *   <li>{@link enorm.ModerationPolicy#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link enorm.ModerationPolicy#getDecision <em>Decision</em>}</li>
 *   <li>{@link enorm.ModerationPolicy#getMonitorsResource <em>Monitors Resource</em>}</li>
 *   <li>{@link enorm.ModerationPolicy#getMonitorsFeedback <em>Monitors Feedback</em>}</li>
 *   <li>{@link enorm.ModerationPolicy#getExecutedBy <em>Executed By</em>}</li>
 *   <li>{@link enorm.ModerationPolicy#getInContext <em>In Context</em>}</li>
 * </ul>
 *
 * @see enorm.EnormPackage#getModerationPolicy()
 * @model
 * @generated
 */
public interface ModerationPolicy extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see enorm.EnormPackage#getModerationPolicy_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link enorm.ModerationPolicy#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link enorm.ModerationMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see enorm.ModerationMode
	 * @see #setMode(ModerationMode)
	 * @see enorm.EnormPackage#getModerationPolicy_Mode()
	 * @model
	 * @generated
	 */
	ModerationMode getMode();

	/**
	 * Sets the value of the '{@link enorm.ModerationPolicy#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see enorm.ModerationMode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(ModerationMode value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' attribute.
	 * The literals are from the enumeration {@link enorm.TriggerEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' attribute.
	 * @see enorm.TriggerEvent
	 * @see #setTrigger(TriggerEvent)
	 * @see enorm.EnormPackage#getModerationPolicy_Trigger()
	 * @model
	 * @generated
	 */
	TriggerEvent getTrigger();

	/**
	 * Sets the value of the '{@link enorm.ModerationPolicy#getTrigger <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' attribute.
	 * @see enorm.TriggerEvent
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(TriggerEvent value);

	/**
	 * Returns the value of the '<em><b>Decision</b></em>' attribute.
	 * The literals are from the enumeration {@link enorm.ModerationDecision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision</em>' attribute.
	 * @see enorm.ModerationDecision
	 * @see #setDecision(ModerationDecision)
	 * @see enorm.EnormPackage#getModerationPolicy_Decision()
	 * @model
	 * @generated
	 */
	ModerationDecision getDecision();

	/**
	 * Sets the value of the '{@link enorm.ModerationPolicy#getDecision <em>Decision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision</em>' attribute.
	 * @see enorm.ModerationDecision
	 * @see #getDecision()
	 * @generated
	 */
	void setDecision(ModerationDecision value);

	/**
	 * Returns the value of the '<em><b>Monitors Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitors Resource</em>' reference.
	 * @see #setMonitorsResource(ResourceType)
	 * @see enorm.EnormPackage#getModerationPolicy_MonitorsResource()
	 * @model
	 * @generated
	 */
	ResourceType getMonitorsResource();

	/**
	 * Sets the value of the '{@link enorm.ModerationPolicy#getMonitorsResource <em>Monitors Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitors Resource</em>' reference.
	 * @see #getMonitorsResource()
	 * @generated
	 */
	void setMonitorsResource(ResourceType value);

	/**
	 * Returns the value of the '<em><b>Monitors Feedback</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitors Feedback</em>' reference.
	 * @see #setMonitorsFeedback(FeedbackDefinition)
	 * @see enorm.EnormPackage#getModerationPolicy_MonitorsFeedback()
	 * @model
	 * @generated
	 */
	FeedbackDefinition getMonitorsFeedback();

	/**
	 * Sets the value of the '{@link enorm.ModerationPolicy#getMonitorsFeedback <em>Monitors Feedback</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitors Feedback</em>' reference.
	 * @see #getMonitorsFeedback()
	 * @generated
	 */
	void setMonitorsFeedback(FeedbackDefinition value);

	/**
	 * Returns the value of the '<em><b>Executed By</b></em>' reference list.
	 * The list contents are of type {@link enorm.UserType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executed By</em>' reference list.
	 * @see enorm.EnormPackage#getModerationPolicy_ExecutedBy()
	 * @model
	 * @generated
	 */
	EList<UserType> getExecutedBy();

	/**
	 * Returns the value of the '<em><b>In Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Context</em>' reference.
	 * @see #setInContext(ContextType)
	 * @see enorm.EnormPackage#getModerationPolicy_InContext()
	 * @model
	 * @generated
	 */
	ContextType getInContext();

	/**
	 * Sets the value of the '{@link enorm.ModerationPolicy#getInContext <em>In Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Context</em>' reference.
	 * @see #getInContext()
	 * @generated
	 */
	void setInContext(ContextType value);

} // ModerationPolicy
