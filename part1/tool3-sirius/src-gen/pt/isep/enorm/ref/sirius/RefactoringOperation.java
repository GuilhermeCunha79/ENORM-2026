/**
 */
package pt.isep.enorm.ref.sirius;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refactoring Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.enorm.ref.sirius.RefactoringOperation#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.RefactoringOperation#getKind <em>Kind</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.RefactoringOperation#getScriptId <em>Script Id</em>}</li>
 * </ul>
 *
 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getRefactoringOperation()
 * @model
 * @generated
 */
public interface RefactoringOperation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getRefactoringOperation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.sirius.RefactoringOperation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link pt.isep.enorm.ref.sirius.RefactoringKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see pt.isep.enorm.ref.sirius.RefactoringKind
	 * @see #setKind(RefactoringKind)
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getRefactoringOperation_Kind()
	 * @model
	 * @generated
	 */
	RefactoringKind getKind();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.sirius.RefactoringOperation#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see pt.isep.enorm.ref.sirius.RefactoringKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(RefactoringKind value);

	/**
	 * Returns the value of the '<em><b>Script Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script Id</em>' attribute.
	 * @see #setScriptId(String)
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getRefactoringOperation_ScriptId()
	 * @model
	 * @generated
	 */
	String getScriptId();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.sirius.RefactoringOperation#getScriptId <em>Script Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script Id</em>' attribute.
	 * @see #getScriptId()
	 * @generated
	 */
	void setScriptId(String value);

} // RefactoringOperation
