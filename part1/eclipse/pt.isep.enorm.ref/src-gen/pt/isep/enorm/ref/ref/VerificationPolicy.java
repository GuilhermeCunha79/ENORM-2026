/**
 */
package pt.isep.enorm.ref.ref;

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
 *   <li>{@link pt.isep.enorm.ref.ref.VerificationPolicy#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.VerificationPolicy#getMode <em>Mode</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.VerificationPolicy#getAppliesWhen <em>Applies When</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.VerificationPolicy#getVerifies <em>Verifies</em>}</li>
 * </ul>
 *
 * @see pt.isep.enorm.ref.ref.RefPackage#getVerificationPolicy()
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
	 * @see pt.isep.enorm.ref.ref.RefPackage#getVerificationPolicy_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.VerificationPolicy#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link pt.isep.enorm.ref.ref.ValidationKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see pt.isep.enorm.ref.ref.ValidationKind
	 * @see #setMode(ValidationKind)
	 * @see pt.isep.enorm.ref.ref.RefPackage#getVerificationPolicy_Mode()
	 * @model
	 * @generated
	 */
	ValidationKind getMode();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.VerificationPolicy#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see pt.isep.enorm.ref.ref.ValidationKind
	 * @see #getMode()
	 * @generated
	 */
	void setMode(ValidationKind value);

	/**
	 * Returns the value of the '<em><b>Applies When</b></em>' attribute.
	 * The literals are from the enumeration {@link pt.isep.enorm.ref.ref.TriggerEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies When</em>' attribute.
	 * @see pt.isep.enorm.ref.ref.TriggerEvent
	 * @see #setAppliesWhen(TriggerEvent)
	 * @see pt.isep.enorm.ref.ref.RefPackage#getVerificationPolicy_AppliesWhen()
	 * @model
	 * @generated
	 */
	TriggerEvent getAppliesWhen();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.VerificationPolicy#getAppliesWhen <em>Applies When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applies When</em>' attribute.
	 * @see pt.isep.enorm.ref.ref.TriggerEvent
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
	 * @see pt.isep.enorm.ref.ref.RefPackage#getVerificationPolicy_Verifies()
	 * @model required="true"
	 * @generated
	 */
	FeedbackDefinition getVerifies();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.VerificationPolicy#getVerifies <em>Verifies</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verifies</em>' reference.
	 * @see #getVerifies()
	 * @generated
	 */
	void setVerifies(FeedbackDefinition value);

} // VerificationPolicy
