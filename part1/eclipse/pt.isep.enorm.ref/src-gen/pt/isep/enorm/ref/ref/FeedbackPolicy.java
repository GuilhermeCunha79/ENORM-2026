/**
 */
package pt.isep.enorm.ref.ref;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feedback Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.enorm.ref.ref.FeedbackPolicy#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see pt.isep.enorm.ref.ref.RefPackage#getFeedbackPolicy()
 * @model
 * @generated
 */
public interface FeedbackPolicy extends EObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link pt.isep.enorm.ref.ref.FeedbackStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see pt.isep.enorm.ref.ref.FeedbackStatus
	 * @see #setStatus(FeedbackStatus)
	 * @see pt.isep.enorm.ref.ref.RefPackage#getFeedbackPolicy_Status()
	 * @model
	 * @generated
	 */
	FeedbackStatus getStatus();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.FeedbackPolicy#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see pt.isep.enorm.ref.ref.FeedbackStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(FeedbackStatus value);

} // FeedbackPolicy
