/**
 */
package enorm;

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
 *   <li>{@link enorm.UserType#getName <em>Name</em>}</li>
 *   <li>{@link enorm.UserType#getKind <em>Kind</em>}</li>
 *   <li>{@link enorm.UserType#getSuperTypes <em>Super Types</em>}</li>
 * </ul>
 *
 * @see enorm.EnormPackage#getUserType()
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
	 * @see enorm.EnormPackage#getUserType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link enorm.UserType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link enorm.UserKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see enorm.UserKind
	 * @see #setKind(UserKind)
	 * @see enorm.EnormPackage#getUserType_Kind()
	 * @model
	 * @generated
	 */
	UserKind getKind();

	/**
	 * Sets the value of the '{@link enorm.UserType#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see enorm.UserKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(UserKind value);

	/**
	 * Returns the value of the '<em><b>Super Types</b></em>' reference list.
	 * The list contents are of type {@link enorm.UserType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Types</em>' reference list.
	 * @see enorm.EnormPackage#getUserType_SuperTypes()
	 * @model
	 * @generated
	 */
	EList<UserType> getSuperTypes();

} // UserType
