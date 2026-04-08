/**
 */
package pt.isep.enorm.ref.sirius;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.enorm.ref.sirius.UserType#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.UserType#getKind <em>Kind</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.UserType#getSuperTypes <em>Super Types</em>}</li>
 * </ul>
 *
 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getUserType()
 * @model
 * @generated
 */
public interface UserType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getUserType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.sirius.UserType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link pt.isep.enorm.ref.sirius.UserKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see pt.isep.enorm.ref.sirius.UserKind
	 * @see #setKind(UserKind)
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getUserType_Kind()
	 * @model
	 * @generated
	 */
	UserKind getKind();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.sirius.UserType#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see pt.isep.enorm.ref.sirius.UserKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(UserKind value);

	/**
	 * Returns the value of the '<em><b>Super Types</b></em>' reference list.
	 * The list contents are of type {@link pt.isep.enorm.ref.sirius.UserType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Types</em>' reference list.
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getUserType_SuperTypes()
	 * @model
	 * @generated
	 */
	EList<UserType> getSuperTypes();

} // UserType
