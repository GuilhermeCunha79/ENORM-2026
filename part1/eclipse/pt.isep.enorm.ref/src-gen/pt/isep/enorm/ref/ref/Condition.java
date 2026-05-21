/**
 */
package pt.isep.enorm.ref.ref;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.enorm.ref.ref.Condition#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.Condition#getOperator <em>Operator</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.Condition#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.Condition#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see pt.isep.enorm.ref.ref.RefPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pt.isep.enorm.ref.ref.RefPackage#getCondition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.Condition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link pt.isep.enorm.ref.ref.ConditionOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see pt.isep.enorm.ref.ref.ConditionOperator
	 * @see #setOperator(ConditionOperator)
	 * @see pt.isep.enorm.ref.ref.RefPackage#getCondition_Operator()
	 * @model
	 * @generated
	 */
	ConditionOperator getOperator();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.Condition#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see pt.isep.enorm.ref.ref.ConditionOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ConditionOperator value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attribute)
	 * @see pt.isep.enorm.ref.ref.RefPackage#getCondition_Attribute()
	 * @model required="true"
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.Condition#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.enorm.ref.ref.ConditionValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see pt.isep.enorm.ref.ref.RefPackage#getCondition_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConditionValue> getChildren();

} // Condition
