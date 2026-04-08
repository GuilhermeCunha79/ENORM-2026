/**
 */
package pt.isep.enorm.ref.sirius.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pt.isep.enorm.ref.sirius.FeedbackDefinition;
import pt.isep.enorm.ref.sirius.SiriusPackage;
import pt.isep.enorm.ref.sirius.ValidationKind;
import pt.isep.enorm.ref.sirius.VerificationPolicy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verification Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.enorm.ref.sirius.impl.VerificationPolicyImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.impl.VerificationPolicyImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.impl.VerificationPolicyImpl#getAppliesWhen <em>Applies When</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.impl.VerificationPolicyImpl#getVerifies <em>Verifies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerificationPolicyImpl extends MinimalEObjectImpl.Container implements VerificationPolicy {
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
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final ValidationKind MODE_EDEFAULT = ValidationKind.AUTOMATIC;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected ValidationKind mode = MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAppliesWhen() <em>Applies When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliesWhen()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLIES_WHEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAppliesWhen() <em>Applies When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliesWhen()
	 * @generated
	 * @ordered
	 */
	protected String appliesWhen = APPLIES_WHEN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVerifies() <em>Verifies</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifies()
	 * @generated
	 * @ordered
	 */
	protected FeedbackDefinition verifies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerificationPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiriusPackage.Literals.VERIFICATION_POLICY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SiriusPackage.VERIFICATION_POLICY__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidationKind getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMode(ValidationKind newMode) {
		ValidationKind oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiriusPackage.VERIFICATION_POLICY__MODE, oldMode,
					mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAppliesWhen() {
		return appliesWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAppliesWhen(String newAppliesWhen) {
		String oldAppliesWhen = appliesWhen;
		appliesWhen = newAppliesWhen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiriusPackage.VERIFICATION_POLICY__APPLIES_WHEN,
					oldAppliesWhen, appliesWhen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeedbackDefinition getVerifies() {
		if (verifies != null && verifies.eIsProxy()) {
			InternalEObject oldVerifies = (InternalEObject) verifies;
			verifies = (FeedbackDefinition) eResolveProxy(oldVerifies);
			if (verifies != oldVerifies) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SiriusPackage.VERIFICATION_POLICY__VERIFIES, oldVerifies, verifies));
			}
		}
		return verifies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackDefinition basicGetVerifies() {
		return verifies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerifies(FeedbackDefinition newVerifies) {
		FeedbackDefinition oldVerifies = verifies;
		verifies = newVerifies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiriusPackage.VERIFICATION_POLICY__VERIFIES,
					oldVerifies, verifies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SiriusPackage.VERIFICATION_POLICY__NAME:
			return getName();
		case SiriusPackage.VERIFICATION_POLICY__MODE:
			return getMode();
		case SiriusPackage.VERIFICATION_POLICY__APPLIES_WHEN:
			return getAppliesWhen();
		case SiriusPackage.VERIFICATION_POLICY__VERIFIES:
			if (resolve)
				return getVerifies();
			return basicGetVerifies();
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
		case SiriusPackage.VERIFICATION_POLICY__NAME:
			setName((String) newValue);
			return;
		case SiriusPackage.VERIFICATION_POLICY__MODE:
			setMode((ValidationKind) newValue);
			return;
		case SiriusPackage.VERIFICATION_POLICY__APPLIES_WHEN:
			setAppliesWhen((String) newValue);
			return;
		case SiriusPackage.VERIFICATION_POLICY__VERIFIES:
			setVerifies((FeedbackDefinition) newValue);
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
		case SiriusPackage.VERIFICATION_POLICY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SiriusPackage.VERIFICATION_POLICY__MODE:
			setMode(MODE_EDEFAULT);
			return;
		case SiriusPackage.VERIFICATION_POLICY__APPLIES_WHEN:
			setAppliesWhen(APPLIES_WHEN_EDEFAULT);
			return;
		case SiriusPackage.VERIFICATION_POLICY__VERIFIES:
			setVerifies((FeedbackDefinition) null);
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
		case SiriusPackage.VERIFICATION_POLICY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SiriusPackage.VERIFICATION_POLICY__MODE:
			return mode != MODE_EDEFAULT;
		case SiriusPackage.VERIFICATION_POLICY__APPLIES_WHEN:
			return APPLIES_WHEN_EDEFAULT == null ? appliesWhen != null : !APPLIES_WHEN_EDEFAULT.equals(appliesWhen);
		case SiriusPackage.VERIFICATION_POLICY__VERIFIES:
			return verifies != null;
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
		result.append(", mode: ");
		result.append(mode);
		result.append(", appliesWhen: ");
		result.append(appliesWhen);
		result.append(')');
		return result.toString();
	}

} //VerificationPolicyImpl
