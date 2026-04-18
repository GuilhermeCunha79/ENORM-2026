/**
 */
package enorm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verification Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link enorm.VerificationPolicy#getName <em>Name</em>}</li>
 *   <li>{@link enorm.VerificationPolicy#getMode <em>Mode</em>}</li>
 *   <li>{@link enorm.VerificationPolicy#getAppliesWhen <em>Applies When</em>}</li>
 *   <li>{@link enorm.VerificationPolicy#getVerifies <em>Verifies</em>}</li>
 * </ul>
 *
 * @see enorm.EnormPackage#getVerificationPolicy()
 * @model
 * @generated
 */
public interface VerificationPolicy extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see enorm.EnormPackage#getVerificationPolicy_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link enorm.VerificationPolicy#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link enorm.ValidationKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see enorm.ValidationKind
	 * @see #setMode(ValidationKind)
	 * @see enorm.EnormPackage#getVerificationPolicy_Mode()
	 * @model
	 * @generated
	 */
	ValidationKind getMode();

	/**
	 * Sets the value of the '{@link enorm.VerificationPolicy#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see enorm.ValidationKind
	 * @see #getMode()
	 * @generated
	 */
	void setMode(ValidationKind value);

	/**
	 * Returns the value of the '<em><b>Applies When</b></em>' attribute.
	 * The literals are from the enumeration {@link enorm.TriggerEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies When</em>' attribute.
	 * @see enorm.TriggerEvent
	 * @see #setAppliesWhen(TriggerEvent)
	 * @see enorm.EnormPackage#getVerificationPolicy_AppliesWhen()
	 * @model
	 * @generated
	 */
	TriggerEvent getAppliesWhen();

	/**
	 * Sets the value of the '{@link enorm.VerificationPolicy#getAppliesWhen <em>Applies When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applies When</em>' attribute.
	 * @see enorm.TriggerEvent
	 * @see #getAppliesWhen()
	 * @generated
	 */
	void setAppliesWhen(TriggerEvent value);

	/**
	 * Returns the value of the '<em><b>Verifies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verifies</em>' reference.
	 * @see #setVerifies(FeedbackDefinition)
	 * @see enorm.EnormPackage#getVerificationPolicy_Verifies()
	 * @model required="true"
	 * @generated
	 */
	FeedbackDefinition getVerifies();

	/**
	 * Sets the value of the '{@link enorm.VerificationPolicy#getVerifies <em>Verifies</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verifies</em>' reference.
	 * @see #getVerifies()
	 * @generated
	 */
	void setVerifies(FeedbackDefinition value);

} // VerificationPolicy
