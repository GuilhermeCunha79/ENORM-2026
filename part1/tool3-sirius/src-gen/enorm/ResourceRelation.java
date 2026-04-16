/**
 */
package enorm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link enorm.ResourceRelation#getName <em>Name</em>}</li>
 *   <li>{@link enorm.ResourceRelation#getSourceCardinality <em>Source Cardinality</em>}</li>
 *   <li>{@link enorm.ResourceRelation#getTargetCardinality <em>Target Cardinality</em>}</li>
 *   <li>{@link enorm.ResourceRelation#isContainment <em>Containment</em>}</li>
 *   <li>{@link enorm.ResourceRelation#isRecursive <em>Recursive</em>}</li>
 *   <li>{@link enorm.ResourceRelation#getSource <em>Source</em>}</li>
 *   <li>{@link enorm.ResourceRelation#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see enorm.EnormPackage#getResourceRelation()
 * @model
 * @generated
 */
public interface ResourceRelation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see enorm.EnormPackage#getResourceRelation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link enorm.ResourceRelation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Cardinality</em>' attribute.
	 * @see #setSourceCardinality(String)
	 * @see enorm.EnormPackage#getResourceRelation_SourceCardinality()
	 * @model
	 * @generated
	 */
	String getSourceCardinality();

	/**
	 * Sets the value of the '{@link enorm.ResourceRelation#getSourceCardinality <em>Source Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Cardinality</em>' attribute.
	 * @see #getSourceCardinality()
	 * @generated
	 */
	void setSourceCardinality(String value);

	/**
	 * Returns the value of the '<em><b>Target Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Cardinality</em>' attribute.
	 * @see #setTargetCardinality(String)
	 * @see enorm.EnormPackage#getResourceRelation_TargetCardinality()
	 * @model
	 * @generated
	 */
	String getTargetCardinality();

	/**
	 * Sets the value of the '{@link enorm.ResourceRelation#getTargetCardinality <em>Target Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Cardinality</em>' attribute.
	 * @see #getTargetCardinality()
	 * @generated
	 */
	void setTargetCardinality(String value);

	/**
	 * Returns the value of the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containment</em>' attribute.
	 * @see #setContainment(boolean)
	 * @see enorm.EnormPackage#getResourceRelation_Containment()
	 * @model
	 * @generated
	 */
	boolean isContainment();

	/**
	 * Sets the value of the '{@link enorm.ResourceRelation#isContainment <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containment</em>' attribute.
	 * @see #isContainment()
	 * @generated
	 */
	void setContainment(boolean value);

	/**
	 * Returns the value of the '<em><b>Recursive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recursive</em>' attribute.
	 * @see #setRecursive(boolean)
	 * @see enorm.EnormPackage#getResourceRelation_Recursive()
	 * @model
	 * @generated
	 */
	boolean isRecursive();

	/**
	 * Sets the value of the '{@link enorm.ResourceRelation#isRecursive <em>Recursive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recursive</em>' attribute.
	 * @see #isRecursive()
	 * @generated
	 */
	void setRecursive(boolean value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ResourceType)
	 * @see enorm.EnormPackage#getResourceRelation_Source()
	 * @model required="true"
	 * @generated
	 */
	ResourceType getSource();

	/**
	 * Sets the value of the '{@link enorm.ResourceRelation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ResourceType value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ResourceType)
	 * @see enorm.EnormPackage#getResourceRelation_Target()
	 * @model required="true"
	 * @generated
	 */
	ResourceType getTarget();

	/**
	 * Sets the value of the '{@link enorm.ResourceRelation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ResourceType value);

} // ResourceRelation
