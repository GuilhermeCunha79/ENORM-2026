/**
 */
package pt.isep.enorm.ref.sirius.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pt.isep.enorm.ref.sirius.RefactoringKind;
import pt.isep.enorm.ref.sirius.RefactoringOperation;
import pt.isep.enorm.ref.sirius.SiriusPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refactoring Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.enorm.ref.sirius.impl.RefactoringOperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.impl.RefactoringOperationImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.impl.RefactoringOperationImpl#getScriptId <em>Script Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefactoringOperationImpl extends MinimalEObjectImpl.Container implements RefactoringOperation {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final RefactoringKind KIND_EDEFAULT = RefactoringKind.RENAME_ELEMENT;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected RefactoringKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getScriptId() <em>Script Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptId()
	 * @generated
	 * @ordered
	 */
	protected static final String SCRIPT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScriptId() <em>Script Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptId()
	 * @generated
	 * @ordered
	 */
	protected String scriptId = SCRIPT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefactoringOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiriusPackage.Literals.REFACTORING_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiriusPackage.REFACTORING_OPERATION__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefactoringKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(RefactoringKind newKind) {
		RefactoringKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiriusPackage.REFACTORING_OPERATION__KIND, oldKind,
					kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScriptId() {
		return scriptId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScriptId(String newScriptId) {
		String oldScriptId = scriptId;
		scriptId = newScriptId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiriusPackage.REFACTORING_OPERATION__SCRIPT_ID,
					oldScriptId, scriptId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SiriusPackage.REFACTORING_OPERATION__NAME:
			return getName();
		case SiriusPackage.REFACTORING_OPERATION__KIND:
			return getKind();
		case SiriusPackage.REFACTORING_OPERATION__SCRIPT_ID:
			return getScriptId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SiriusPackage.REFACTORING_OPERATION__NAME:
			setName((String) newValue);
			return;
		case SiriusPackage.REFACTORING_OPERATION__KIND:
			setKind((RefactoringKind) newValue);
			return;
		case SiriusPackage.REFACTORING_OPERATION__SCRIPT_ID:
			setScriptId((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SiriusPackage.REFACTORING_OPERATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SiriusPackage.REFACTORING_OPERATION__KIND:
			setKind(KIND_EDEFAULT);
			return;
		case SiriusPackage.REFACTORING_OPERATION__SCRIPT_ID:
			setScriptId(SCRIPT_ID_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SiriusPackage.REFACTORING_OPERATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SiriusPackage.REFACTORING_OPERATION__KIND:
			return kind != KIND_EDEFAULT;
		case SiriusPackage.REFACTORING_OPERATION__SCRIPT_ID:
			return SCRIPT_ID_EDEFAULT == null ? scriptId != null : !SCRIPT_ID_EDEFAULT.equals(scriptId);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", kind: ");
		result.append(kind);
		result.append(", scriptId: ");
		result.append(scriptId);
		result.append(')');
		return result.toString();
	}

} //RefactoringOperationImpl
