/**
 */
package pt.isep.enorm.ref.ref.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pt.isep.enorm.ref.ref.ContextType;
import pt.isep.enorm.ref.ref.FeedbackDefinition;
import pt.isep.enorm.ref.ref.RefPackage;
import pt.isep.enorm.ref.ref.ResourceType;
import pt.isep.enorm.ref.ref.SortCriterion;
import pt.isep.enorm.ref.ref.SortDirection;
import pt.isep.enorm.ref.ref.SortingPolicy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sorting Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.SortingPolicyImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.SortingPolicyImpl#getCriterion <em>Criterion</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.SortingPolicyImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.SortingPolicyImpl#getAppliesToResource <em>Applies To Resource</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.SortingPolicyImpl#getAppliesToFeedback <em>Applies To Feedback</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.SortingPolicyImpl#getInContext <em>In Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SortingPolicyImpl extends MinimalEObjectImpl.Container implements SortingPolicy {
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
	 * The default value of the '{@link #getCriterion() <em>Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriterion()
	 * @generated
	 * @ordered
	 */
	protected static final SortCriterion CRITERION_EDEFAULT = SortCriterion.DATE;

	/**
	 * The cached value of the '{@link #getCriterion() <em>Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriterion()
	 * @generated
	 * @ordered
	 */
	protected SortCriterion criterion = CRITERION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final SortDirection DIRECTION_EDEFAULT = SortDirection.ASC;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected SortDirection direction = DIRECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAppliesToResource() <em>Applies To Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliesToResource()
	 * @generated
	 * @ordered
	 */
	protected ResourceType appliesToResource;

	/**
	 * The cached value of the '{@link #getAppliesToFeedback() <em>Applies To Feedback</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliesToFeedback()
	 * @generated
	 * @ordered
	 */
	protected FeedbackDefinition appliesToFeedback;

	/**
	 * The cached value of the '{@link #getInContext() <em>In Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInContext()
	 * @generated
	 * @ordered
	 */
	protected ContextType inContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SortingPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefPackage.Literals.SORTING_POLICY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefPackage.SORTING_POLICY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SortCriterion getCriterion() {
		return criterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCriterion(SortCriterion newCriterion) {
		SortCriterion oldCriterion = criterion;
		criterion = newCriterion == null ? CRITERION_EDEFAULT : newCriterion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefPackage.SORTING_POLICY__CRITERION, oldCriterion,
					criterion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SortDirection getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirection(SortDirection newDirection) {
		SortDirection oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefPackage.SORTING_POLICY__DIRECTION, oldDirection,
					direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceType getAppliesToResource() {
		if (appliesToResource != null && appliesToResource.eIsProxy()) {
			InternalEObject oldAppliesToResource = (InternalEObject) appliesToResource;
			appliesToResource = (ResourceType) eResolveProxy(oldAppliesToResource);
			if (appliesToResource != oldAppliesToResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RefPackage.SORTING_POLICY__APPLIES_TO_RESOURCE, oldAppliesToResource, appliesToResource));
			}
		}
		return appliesToResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceType basicGetAppliesToResource() {
		return appliesToResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAppliesToResource(ResourceType newAppliesToResource) {
		ResourceType oldAppliesToResource = appliesToResource;
		appliesToResource = newAppliesToResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefPackage.SORTING_POLICY__APPLIES_TO_RESOURCE,
					oldAppliesToResource, appliesToResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeedbackDefinition getAppliesToFeedback() {
		if (appliesToFeedback != null && appliesToFeedback.eIsProxy()) {
			InternalEObject oldAppliesToFeedback = (InternalEObject) appliesToFeedback;
			appliesToFeedback = (FeedbackDefinition) eResolveProxy(oldAppliesToFeedback);
			if (appliesToFeedback != oldAppliesToFeedback) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RefPackage.SORTING_POLICY__APPLIES_TO_FEEDBACK, oldAppliesToFeedback, appliesToFeedback));
			}
		}
		return appliesToFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackDefinition basicGetAppliesToFeedback() {
		return appliesToFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAppliesToFeedback(FeedbackDefinition newAppliesToFeedback) {
		FeedbackDefinition oldAppliesToFeedback = appliesToFeedback;
		appliesToFeedback = newAppliesToFeedback;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefPackage.SORTING_POLICY__APPLIES_TO_FEEDBACK,
					oldAppliesToFeedback, appliesToFeedback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextType getInContext() {
		if (inContext != null && inContext.eIsProxy()) {
			InternalEObject oldInContext = (InternalEObject) inContext;
			inContext = (ContextType) eResolveProxy(oldInContext);
			if (inContext != oldInContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefPackage.SORTING_POLICY__IN_CONTEXT,
							oldInContext, inContext));
			}
		}
		return inContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextType basicGetInContext() {
		return inContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInContext(ContextType newInContext) {
		ContextType oldInContext = inContext;
		inContext = newInContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefPackage.SORTING_POLICY__IN_CONTEXT, oldInContext,
					inContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RefPackage.SORTING_POLICY__NAME:
			return getName();
		case RefPackage.SORTING_POLICY__CRITERION:
			return getCriterion();
		case RefPackage.SORTING_POLICY__DIRECTION:
			return getDirection();
		case RefPackage.SORTING_POLICY__APPLIES_TO_RESOURCE:
			if (resolve)
				return getAppliesToResource();
			return basicGetAppliesToResource();
		case RefPackage.SORTING_POLICY__APPLIES_TO_FEEDBACK:
			if (resolve)
				return getAppliesToFeedback();
			return basicGetAppliesToFeedback();
		case RefPackage.SORTING_POLICY__IN_CONTEXT:
			if (resolve)
				return getInContext();
			return basicGetInContext();
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
		case RefPackage.SORTING_POLICY__NAME:
			setName((String) newValue);
			return;
		case RefPackage.SORTING_POLICY__CRITERION:
			setCriterion((SortCriterion) newValue);
			return;
		case RefPackage.SORTING_POLICY__DIRECTION:
			setDirection((SortDirection) newValue);
			return;
		case RefPackage.SORTING_POLICY__APPLIES_TO_RESOURCE:
			setAppliesToResource((ResourceType) newValue);
			return;
		case RefPackage.SORTING_POLICY__APPLIES_TO_FEEDBACK:
			setAppliesToFeedback((FeedbackDefinition) newValue);
			return;
		case RefPackage.SORTING_POLICY__IN_CONTEXT:
			setInContext((ContextType) newValue);
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
		case RefPackage.SORTING_POLICY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case RefPackage.SORTING_POLICY__CRITERION:
			setCriterion(CRITERION_EDEFAULT);
			return;
		case RefPackage.SORTING_POLICY__DIRECTION:
			setDirection(DIRECTION_EDEFAULT);
			return;
		case RefPackage.SORTING_POLICY__APPLIES_TO_RESOURCE:
			setAppliesToResource((ResourceType) null);
			return;
		case RefPackage.SORTING_POLICY__APPLIES_TO_FEEDBACK:
			setAppliesToFeedback((FeedbackDefinition) null);
			return;
		case RefPackage.SORTING_POLICY__IN_CONTEXT:
			setInContext((ContextType) null);
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
		case RefPackage.SORTING_POLICY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case RefPackage.SORTING_POLICY__CRITERION:
			return criterion != CRITERION_EDEFAULT;
		case RefPackage.SORTING_POLICY__DIRECTION:
			return direction != DIRECTION_EDEFAULT;
		case RefPackage.SORTING_POLICY__APPLIES_TO_RESOURCE:
			return appliesToResource != null;
		case RefPackage.SORTING_POLICY__APPLIES_TO_FEEDBACK:
			return appliesToFeedback != null;
		case RefPackage.SORTING_POLICY__IN_CONTEXT:
			return inContext != null;
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
		result.append(", criterion: ");
		result.append(criterion);
		result.append(", direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //SortingPolicyImpl
