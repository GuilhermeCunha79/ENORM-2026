/**
 */
package pt.isep.enorm.ref.sirius;

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
 *   <li>{@link pt.isep.enorm.ref.sirius.ModerationPolicy#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.ModerationPolicy#getMode <em>Mode</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.ModerationPolicy#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.ModerationPolicy#getDecision <em>Decision</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.ModerationPolicy#getMonitorsResource <em>Monitors Resource</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.ModerationPolicy#getMonitorsFeedback <em>Monitors Feedback</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.ModerationPolicy#getExecutedBy <em>Executed By</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.ModerationPolicy#getInContext <em>In Context</em>}</li>
 * </ul>
 *
 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getModerationPolicy()
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
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getModerationPolicy_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.sirius.ModerationPolicy#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link pt.isep.enorm.ref.sirius.ModerationMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see pt.isep.enorm.ref.sirius.ModerationMode
	 * @see #setMode(ModerationMode)
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getModerationPolicy_Mode()
	 * @model
	 * @generated
	 */
	ModerationMode getMode();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.sirius.ModerationPolicy#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see pt.isep.enorm.ref.sirius.ModerationMode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(ModerationMode value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' attribute.
	 * @see #setTrigger(String)
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getModerationPolicy_Trigger()
	 * @model
	 * @generated
	 */
	String getTrigger();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.sirius.ModerationPolicy#getTrigger <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' attribute.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(String value);

	/**
	 * Returns the value of the '<em><b>Decision</b></em>' attribute.
	 * The literals are from the enumeration {@link pt.isep.enorm.ref.sirius.ModerationDecision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision</em>' attribute.
	 * @see pt.isep.enorm.ref.sirius.ModerationDecision
	 * @see #setDecision(ModerationDecision)
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getModerationPolicy_Decision()
	 * @model
	 * @generated
	 */
	ModerationDecision getDecision();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.sirius.ModerationPolicy#getDecision <em>Decision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision</em>' attribute.
	 * @see pt.isep.enorm.ref.sirius.ModerationDecision
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
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getModerationPolicy_MonitorsResource()
	 * @model required="true"
	 * @generated
	 */
	ResourceType getMonitorsResource();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.sirius.ModerationPolicy#getMonitorsResource <em>Monitors Resource</em>}' reference.
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
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getModerationPolicy_MonitorsFeedback()
	 * @model required="true"
	 * @generated
	 */
	FeedbackDefinition getMonitorsFeedback();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.sirius.ModerationPolicy#getMonitorsFeedback <em>Monitors Feedback</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitors Feedback</em>' reference.
	 * @see #getMonitorsFeedback()
	 * @generated
	 */
	void setMonitorsFeedback(FeedbackDefinition value);

	/**
	 * Returns the value of the '<em><b>Executed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executed By</em>' reference.
	 * @see #setExecutedBy(UserType)
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getModerationPolicy_ExecutedBy()
	 * @model required="true"
	 * @generated
	 */
	UserType getExecutedBy();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.sirius.ModerationPolicy#getExecutedBy <em>Executed By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executed By</em>' reference.
	 * @see #getExecutedBy()
	 * @generated
	 */
	void setExecutedBy(UserType value);

	/**
	 * Returns the value of the '<em><b>In Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Context</em>' reference.
	 * @see #setInContext(ContextType)
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getModerationPolicy_InContext()
	 * @model
	 * @generated
	 */
	ContextType getInContext();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.sirius.ModerationPolicy#getInContext <em>In Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Context</em>' reference.
	 * @see #getInContext()
	 * @generated
	 */
	void setInContext(ContextType value);

} // ModerationPolicy
