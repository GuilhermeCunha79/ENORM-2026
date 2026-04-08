/**
 */
package pt.isep.enorm.ref.sirius;

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
 *   <li>{@link pt.isep.enorm.ref.sirius.ContextType#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.ContextType#getKind <em>Kind</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.ContextType#getContains <em>Contains</em>}</li>
 * </ul>
 *
 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getContextType()
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
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getContextType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.sirius.ContextType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link pt.isep.enorm.ref.sirius.ContextKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see pt.isep.enorm.ref.sirius.ContextKind
	 * @see #setKind(ContextKind)
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getContextType_Kind()
	 * @model
	 * @generated
	 */
	ContextKind getKind();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.sirius.ContextType#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see pt.isep.enorm.ref.sirius.ContextKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ContextKind value);

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.enorm.ref.sirius.ResourceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getContextType_Contains()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceType> getContains();

} // ContextType
