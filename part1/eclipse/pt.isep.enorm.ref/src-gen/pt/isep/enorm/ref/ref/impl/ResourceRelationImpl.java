/**
 */
package pt.isep.enorm.ref.ref.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pt.isep.enorm.ref.ref.RefPackage;
import pt.isep.enorm.ref.ref.ResourceRelation;
import pt.isep.enorm.ref.ref.ResourceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.ResourceRelationImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.ResourceRelationImpl#getSourceCardinality <em>Source Cardinality</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.ResourceRelationImpl#getTargetCardinality <em>Target Cardinality</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.ResourceRelationImpl#isContainment <em>Containment</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.ResourceRelationImpl#isRecursive <em>Recursive</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.ResourceRelationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.ResourceRelationImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceRelationImpl extends MinimalEObjectImpl.Container implements ResourceRelation {
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
	 * The default value of the '{@link #getSourceCardinality() <em>Source Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_CARDINALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceCardinality() <em>Source Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCardinality()
	 * @generated
	 * @ordered
	 */
	protected String sourceCardinality = SOURCE_CARDINALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetCardinality() <em>Target Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_CARDINALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetCardinality() <em>Target Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCardinality()
	 * @generated
	 * @ordered
	 */
	protected String targetCardinality = TARGET_CARDINALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isContainment() <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContainment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTAINMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isContainment() <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContainment()
	 * @generated
	 * @ordered
	 */
	protected boolean containment = CONTAINMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isRecursive() <em>Recursive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRecursive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RECURSIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRecursive() <em>Recursive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRecursive()
	 * @generated
	 * @ordered
	 */
	protected boolean recursive = RECURSIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ResourceType source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ResourceType target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefPackage.Literals.RESOURCE_RELATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefPackage.RESOURCE_RELATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceCardinality() {
		return sourceCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceCardinality(String newSourceCardinality) {
		String oldSourceCardinality = sourceCardinality;
		sourceCardinality = newSourceCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefPackage.RESOURCE_RELATION__SOURCE_CARDINALITY,
					oldSourceCardinality, sourceCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetCardinality() {
		return targetCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetCardinality(String newTargetCardinality) {
		String oldTargetCardinality = targetCardinality;
		targetCardinality = newTargetCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefPackage.RESOURCE_RELATION__TARGET_CARDINALITY,
					oldTargetCardinality, targetCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isContainment() {
		return containment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainment(boolean newContainment) {
		boolean oldContainment = containment;
		containment = newContainment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefPackage.RESOURCE_RELATION__CONTAINMENT,
					oldContainment, containment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRecursive() {
		return recursive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecursive(boolean newRecursive) {
		boolean oldRecursive = recursive;
		recursive = newRecursive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefPackage.RESOURCE_RELATION__RECURSIVE, oldRecursive,
					recursive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceType getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (ResourceType) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefPackage.RESOURCE_RELATION__SOURCE,
							oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceType basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(ResourceType newSource) {
		ResourceType oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefPackage.RESOURCE_RELATION__SOURCE, oldSource,
					source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceType getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (ResourceType) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefPackage.RESOURCE_RELATION__TARGET,
							oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceType basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(ResourceType newTarget) {
		ResourceType oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefPackage.RESOURCE_RELATION__TARGET, oldTarget,
					target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RefPackage.RESOURCE_RELATION__NAME:
			return getName();
		case RefPackage.RESOURCE_RELATION__SOURCE_CARDINALITY:
			return getSourceCardinality();
		case RefPackage.RESOURCE_RELATION__TARGET_CARDINALITY:
			return getTargetCardinality();
		case RefPackage.RESOURCE_RELATION__CONTAINMENT:
			return isContainment();
		case RefPackage.RESOURCE_RELATION__RECURSIVE:
			return isRecursive();
		case RefPackage.RESOURCE_RELATION__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case RefPackage.RESOURCE_RELATION__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
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
		case RefPackage.RESOURCE_RELATION__NAME:
			setName((String) newValue);
			return;
		case RefPackage.RESOURCE_RELATION__SOURCE_CARDINALITY:
			setSourceCardinality((String) newValue);
			return;
		case RefPackage.RESOURCE_RELATION__TARGET_CARDINALITY:
			setTargetCardinality((String) newValue);
			return;
		case RefPackage.RESOURCE_RELATION__CONTAINMENT:
			setContainment((Boolean) newValue);
			return;
		case RefPackage.RESOURCE_RELATION__RECURSIVE:
			setRecursive((Boolean) newValue);
			return;
		case RefPackage.RESOURCE_RELATION__SOURCE:
			setSource((ResourceType) newValue);
			return;
		case RefPackage.RESOURCE_RELATION__TARGET:
			setTarget((ResourceType) newValue);
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
		case RefPackage.RESOURCE_RELATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case RefPackage.RESOURCE_RELATION__SOURCE_CARDINALITY:
			setSourceCardinality(SOURCE_CARDINALITY_EDEFAULT);
			return;
		case RefPackage.RESOURCE_RELATION__TARGET_CARDINALITY:
			setTargetCardinality(TARGET_CARDINALITY_EDEFAULT);
			return;
		case RefPackage.RESOURCE_RELATION__CONTAINMENT:
			setContainment(CONTAINMENT_EDEFAULT);
			return;
		case RefPackage.RESOURCE_RELATION__RECURSIVE:
			setRecursive(RECURSIVE_EDEFAULT);
			return;
		case RefPackage.RESOURCE_RELATION__SOURCE:
			setSource((ResourceType) null);
			return;
		case RefPackage.RESOURCE_RELATION__TARGET:
			setTarget((ResourceType) null);
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
		case RefPackage.RESOURCE_RELATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case RefPackage.RESOURCE_RELATION__SOURCE_CARDINALITY:
			return SOURCE_CARDINALITY_EDEFAULT == null ? sourceCardinality != null
					: !SOURCE_CARDINALITY_EDEFAULT.equals(sourceCardinality);
		case RefPackage.RESOURCE_RELATION__TARGET_CARDINALITY:
			return TARGET_CARDINALITY_EDEFAULT == null ? targetCardinality != null
					: !TARGET_CARDINALITY_EDEFAULT.equals(targetCardinality);
		case RefPackage.RESOURCE_RELATION__CONTAINMENT:
			return containment != CONTAINMENT_EDEFAULT;
		case RefPackage.RESOURCE_RELATION__RECURSIVE:
			return recursive != RECURSIVE_EDEFAULT;
		case RefPackage.RESOURCE_RELATION__SOURCE:
			return source != null;
		case RefPackage.RESOURCE_RELATION__TARGET:
			return target != null;
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
		result.append(", sourceCardinality: ");
		result.append(sourceCardinality);
		result.append(", targetCardinality: ");
		result.append(targetCardinality);
		result.append(", containment: ");
		result.append(containment);
		result.append(", recursive: ");
		result.append(recursive);
		result.append(')');
		return result.toString();
	}

} //ResourceRelationImpl
