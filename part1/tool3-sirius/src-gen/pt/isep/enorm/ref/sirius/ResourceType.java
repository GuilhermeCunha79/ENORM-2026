/**
 */
package pt.isep.enorm.ref.sirius;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.enorm.ref.sirius.ResourceType#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.ResourceType#isSupportsMedia <em>Supports Media</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.ResourceType#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.ResourceType#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getResourceType()
 * @model
 * @generated
 */
public interface ResourceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getResourceType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.sirius.ResourceType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Supports Media</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supports Media</em>' attribute.
	 * @see #setSupportsMedia(boolean)
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getResourceType_SupportsMedia()
	 * @model
	 * @generated
	 */
	boolean isSupportsMedia();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.sirius.ResourceType#isSupportsMedia <em>Supports Media</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supports Media</em>' attribute.
	 * @see #isSupportsMedia()
	 * @generated
	 */
	void setSupportsMedia(boolean value);

	/**
	 * Returns the value of the '<em><b>Super Types</b></em>' reference list.
	 * The list contents are of type {@link pt.isep.enorm.ref.sirius.ResourceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Types</em>' reference list.
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getResourceType_SuperTypes()
	 * @model
	 * @generated
	 */
	EList<ResourceType> getSuperTypes();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.enorm.ref.sirius.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getResourceType_Attributes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

} // ResourceType
