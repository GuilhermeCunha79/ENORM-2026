/**
 */
package enorm;

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
 *   <li>{@link enorm.FeedbackPolicy#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see enorm.EnormPackage#getFeedbackPolicy()
 * @model
 * @generated
 */
public interface FeedbackPolicy extends EObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link enorm.FeedbackStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see enorm.FeedbackStatus
	 * @see #setStatus(FeedbackStatus)
	 * @see enorm.EnormPackage#getFeedbackPolicy_Status()
	 * @model
	 * @generated
	 */
	FeedbackStatus getStatus();

	/**
	 * Sets the value of the '{@link enorm.FeedbackPolicy#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see enorm.FeedbackStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(FeedbackStatus value);

} // FeedbackPolicy
