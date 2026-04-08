/**
 */
package pt.isep.enorm.ref.sirius;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feedback Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * If status = DISABLED, creation of new instances for the associated FeedbackDefinition is not allowed.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.enorm.ref.sirius.FeedbackPolicy#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getFeedbackPolicy()
 * @model
 * @generated
 */
public interface FeedbackPolicy extends EObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link pt.isep.enorm.ref.sirius.FeedbackStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see pt.isep.enorm.ref.sirius.FeedbackStatus
	 * @see #setStatus(FeedbackStatus)
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getFeedbackPolicy_Status()
	 * @model
	 * @generated
	 */
	FeedbackStatus getStatus();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.sirius.FeedbackPolicy#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see pt.isep.enorm.ref.sirius.FeedbackStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(FeedbackStatus value);

} // FeedbackPolicy
