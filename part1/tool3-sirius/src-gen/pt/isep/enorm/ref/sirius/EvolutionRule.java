/**
 */
package pt.isep.enorm.ref.sirius;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evolution Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.enorm.ref.sirius.EvolutionRule#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.EvolutionRule#getFromVersion <em>From Version</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.EvolutionRule#getToVersion <em>To Version</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.EvolutionRule#getTransformationId <em>Transformation Id</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.EvolutionRule#getApplies <em>Applies</em>}</li>
 * </ul>
 *
 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getEvolutionRule()
 * @model
 * @generated
 */
public interface EvolutionRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getEvolutionRule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.sirius.EvolutionRule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>From Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Version</em>' attribute.
	 * @see #setFromVersion(String)
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getEvolutionRule_FromVersion()
	 * @model
	 * @generated
	 */
	String getFromVersion();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.sirius.EvolutionRule#getFromVersion <em>From Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Version</em>' attribute.
	 * @see #getFromVersion()
	 * @generated
	 */
	void setFromVersion(String value);

	/**
	 * Returns the value of the '<em><b>To Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Version</em>' attribute.
	 * @see #setToVersion(String)
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getEvolutionRule_ToVersion()
	 * @model
	 * @generated
	 */
	String getToVersion();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.sirius.EvolutionRule#getToVersion <em>To Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Version</em>' attribute.
	 * @see #getToVersion()
	 * @generated
	 */
	void setToVersion(String value);

	/**
	 * Returns the value of the '<em><b>Transformation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation Id</em>' attribute.
	 * @see #setTransformationId(String)
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getEvolutionRule_TransformationId()
	 * @model
	 * @generated
	 */
	String getTransformationId();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.sirius.EvolutionRule#getTransformationId <em>Transformation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation Id</em>' attribute.
	 * @see #getTransformationId()
	 * @generated
	 */
	void setTransformationId(String value);

	/**
	 * Returns the value of the '<em><b>Applies</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.enorm.ref.sirius.RefactoringOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies</em>' containment reference list.
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getEvolutionRule_Applies()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RefactoringOperation> getApplies();

} // EvolutionRule
