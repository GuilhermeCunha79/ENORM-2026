/**
 */
package enorm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link enorm.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link enorm.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link enorm.Attribute#isRequired <em>Required</em>}</li>
 *   <li>{@link enorm.Attribute#isMultiValued <em>Multi Valued</em>}</li>
 * </ul>
 *
 * @see enorm.EnormPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see enorm.EnormPackage#getAttribute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link enorm.Attribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link enorm.PrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see enorm.PrimitiveType
	 * @see #setType(PrimitiveType)
	 * @see enorm.EnormPackage#getAttribute_Type()
	 * @model
	 * @generated
	 */
	PrimitiveType getType();

	/**
	 * Sets the value of the '{@link enorm.Attribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see enorm.PrimitiveType
	 * @see #getType()
	 * @generated
	 */
	void setType(PrimitiveType value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see enorm.EnormPackage#getAttribute_Required()
	 * @model
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link enorm.Attribute#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Multi Valued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Valued</em>' attribute.
	 * @see #setMultiValued(boolean)
	 * @see enorm.EnormPackage#getAttribute_MultiValued()
	 * @model
	 * @generated
	 */
	boolean isMultiValued();

	/**
	 * Sets the value of the '{@link enorm.Attribute#isMultiValued <em>Multi Valued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Valued</em>' attribute.
	 * @see #isMultiValued()
	 * @generated
	 */
	void setMultiValued(boolean value);

} // Attribute
