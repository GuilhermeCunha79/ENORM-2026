/**
 */
package pt.isep.enorm.ref.sirius.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.isep.enorm.ref.sirius.EvolutionRule;
import pt.isep.enorm.ref.sirius.RefactoringOperation;
import pt.isep.enorm.ref.sirius.SiriusPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evolution Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.enorm.ref.sirius.impl.EvolutionRuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.impl.EvolutionRuleImpl#getFromVersion <em>From Version</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.impl.EvolutionRuleImpl#getToVersion <em>To Version</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.impl.EvolutionRuleImpl#getTransformationId <em>Transformation Id</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.impl.EvolutionRuleImpl#getApplies <em>Applies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvolutionRuleImpl extends MinimalEObjectImpl.Container implements EvolutionRule {
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
	 * The default value of the '{@link #getFromVersion() <em>From Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromVersion() <em>From Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromVersion()
	 * @generated
	 * @ordered
	 */
	protected String fromVersion = FROM_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getToVersion() <em>To Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToVersion() <em>To Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToVersion()
	 * @generated
	 * @ordered
	 */
	protected String toVersion = TO_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransformationId() <em>Transformation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationId()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSFORMATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransformationId() <em>Transformation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationId()
	 * @generated
	 * @ordered
	 */
	protected String transformationId = TRANSFORMATION_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getApplies() <em>Applies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplies()
	 * @generated
	 * @ordered
	 */
	protected EList<RefactoringOperation> applies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvolutionRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiriusPackage.Literals.EVOLUTION_RULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SiriusPackage.EVOLUTION_RULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFromVersion() {
		return fromVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromVersion(String newFromVersion) {
		String oldFromVersion = fromVersion;
		fromVersion = newFromVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiriusPackage.EVOLUTION_RULE__FROM_VERSION,
					oldFromVersion, fromVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getToVersion() {
		return toVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToVersion(String newToVersion) {
		String oldToVersion = toVersion;
		toVersion = newToVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiriusPackage.EVOLUTION_RULE__TO_VERSION,
					oldToVersion, toVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTransformationId() {
		return transformationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransformationId(String newTransformationId) {
		String oldTransformationId = transformationId;
		transformationId = newTransformationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiriusPackage.EVOLUTION_RULE__TRANSFORMATION_ID,
					oldTransformationId, transformationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RefactoringOperation> getApplies() {
		if (applies == null) {
			applies = new EObjectContainmentEList<RefactoringOperation>(RefactoringOperation.class, this,
					SiriusPackage.EVOLUTION_RULE__APPLIES);
		}
		return applies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SiriusPackage.EVOLUTION_RULE__APPLIES:
			return ((InternalEList<?>) getApplies()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SiriusPackage.EVOLUTION_RULE__NAME:
			return getName();
		case SiriusPackage.EVOLUTION_RULE__FROM_VERSION:
			return getFromVersion();
		case SiriusPackage.EVOLUTION_RULE__TO_VERSION:
			return getToVersion();
		case SiriusPackage.EVOLUTION_RULE__TRANSFORMATION_ID:
			return getTransformationId();
		case SiriusPackage.EVOLUTION_RULE__APPLIES:
			return getApplies();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SiriusPackage.EVOLUTION_RULE__NAME:
			setName((String) newValue);
			return;
		case SiriusPackage.EVOLUTION_RULE__FROM_VERSION:
			setFromVersion((String) newValue);
			return;
		case SiriusPackage.EVOLUTION_RULE__TO_VERSION:
			setToVersion((String) newValue);
			return;
		case SiriusPackage.EVOLUTION_RULE__TRANSFORMATION_ID:
			setTransformationId((String) newValue);
			return;
		case SiriusPackage.EVOLUTION_RULE__APPLIES:
			getApplies().clear();
			getApplies().addAll((Collection<? extends RefactoringOperation>) newValue);
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
		case SiriusPackage.EVOLUTION_RULE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SiriusPackage.EVOLUTION_RULE__FROM_VERSION:
			setFromVersion(FROM_VERSION_EDEFAULT);
			return;
		case SiriusPackage.EVOLUTION_RULE__TO_VERSION:
			setToVersion(TO_VERSION_EDEFAULT);
			return;
		case SiriusPackage.EVOLUTION_RULE__TRANSFORMATION_ID:
			setTransformationId(TRANSFORMATION_ID_EDEFAULT);
			return;
		case SiriusPackage.EVOLUTION_RULE__APPLIES:
			getApplies().clear();
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
		case SiriusPackage.EVOLUTION_RULE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SiriusPackage.EVOLUTION_RULE__FROM_VERSION:
			return FROM_VERSION_EDEFAULT == null ? fromVersion != null : !FROM_VERSION_EDEFAULT.equals(fromVersion);
		case SiriusPackage.EVOLUTION_RULE__TO_VERSION:
			return TO_VERSION_EDEFAULT == null ? toVersion != null : !TO_VERSION_EDEFAULT.equals(toVersion);
		case SiriusPackage.EVOLUTION_RULE__TRANSFORMATION_ID:
			return TRANSFORMATION_ID_EDEFAULT == null ? transformationId != null
					: !TRANSFORMATION_ID_EDEFAULT.equals(transformationId);
		case SiriusPackage.EVOLUTION_RULE__APPLIES:
			return applies != null && !applies.isEmpty();
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
		result.append(", fromVersion: ");
		result.append(fromVersion);
		result.append(", toVersion: ");
		result.append(toVersion);
		result.append(", transformationId: ");
		result.append(transformationId);
		result.append(')');
		return result.toString();
	}

} //EvolutionRuleImpl
