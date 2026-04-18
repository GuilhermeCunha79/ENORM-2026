/**
 */
package pt.isep.enorm.ref.ref;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.enorm.ref.ref.ContextType#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.ContextType#getKind <em>Kind</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.ContextType#getContains <em>Contains</em>}</li>
 * </ul>
 *
 * @see pt.isep.enorm.ref.ref.RefPackage#getContextType()
 * @model
 * @generated
 */
public interface ContextType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pt.isep.enorm.ref.ref.RefPackage#getContextType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.ContextType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link pt.isep.enorm.ref.ref.ContextKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see pt.isep.enorm.ref.ref.ContextKind
	 * @see #setKind(ContextKind)
	 * @see pt.isep.enorm.ref.ref.RefPackage#getContextType_Kind()
	 * @model
	 * @generated
	 */
	ContextKind getKind();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.ContextType#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see pt.isep.enorm.ref.ref.ContextKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ContextKind value);

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' reference list.
	 * The list contents are of type {@link pt.isep.enorm.ref.ref.ResourceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' reference list.
	 * @see pt.isep.enorm.ref.ref.RefPackage#getContextType_Contains()
	 * @model
	 * @generated
	 */
	EList<ResourceType> getContains();

} // ContextType
