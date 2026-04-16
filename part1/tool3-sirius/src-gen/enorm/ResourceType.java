/**
 */
package enorm;

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
 *   <li>{@link enorm.ResourceType#getName <em>Name</em>}</li>
 *   <li>{@link enorm.ResourceType#isSupportsMedia <em>Supports Media</em>}</li>
 *   <li>{@link enorm.ResourceType#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link enorm.ResourceType#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see enorm.EnormPackage#getResourceType()
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
	 * @see enorm.EnormPackage#getResourceType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link enorm.ResourceType#getName <em>Name</em>}' attribute.
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
	 * @see enorm.EnormPackage#getResourceType_SupportsMedia()
	 * @model
	 * @generated
	 */
	boolean isSupportsMedia();

	/**
	 * Sets the value of the '{@link enorm.ResourceType#isSupportsMedia <em>Supports Media</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supports Media</em>' attribute.
	 * @see #isSupportsMedia()
	 * @generated
	 */
	void setSupportsMedia(boolean value);

	/**
	 * Returns the value of the '<em><b>Super Types</b></em>' reference list.
	 * The list contents are of type {@link enorm.ResourceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Types</em>' reference list.
	 * @see enorm.EnormPackage#getResourceType_SuperTypes()
	 * @model
	 * @generated
	 */
	EList<ResourceType> getSuperTypes();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link enorm.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see enorm.EnormPackage#getResourceType_Attributes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

} // ResourceType
