/**
 */
package enorm.impl;

import enorm.ContextType;
import enorm.EnormPackage;
import enorm.FeedbackDefinition;
import enorm.ModerationDecision;
import enorm.ModerationMode;
import enorm.ModerationPolicy;
import enorm.ResourceType;
import enorm.TriggerEvent;
import enorm.UserType;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Moderation Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link enorm.impl.ModerationPolicyImpl#getName <em>Name</em>}</li>
 *   <li>{@link enorm.impl.ModerationPolicyImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link enorm.impl.ModerationPolicyImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link enorm.impl.ModerationPolicyImpl#getDecision <em>Decision</em>}</li>
 *   <li>{@link enorm.impl.ModerationPolicyImpl#getMonitorsResource <em>Monitors Resource</em>}</li>
 *   <li>{@link enorm.impl.ModerationPolicyImpl#getMonitorsFeedback <em>Monitors Feedback</em>}</li>
 *   <li>{@link enorm.impl.ModerationPolicyImpl#getExecutedBy <em>Executed By</em>}</li>
 *   <li>{@link enorm.impl.ModerationPolicyImpl#getInContext <em>In Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModerationPolicyImpl extends MinimalEObjectImpl.Container implements ModerationPolicy {
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
	protected static final ModerationMode MODE_EDEFAULT = ModerationMode.AUTOMATIC;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected ModerationMode mode = MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected static final TriggerEvent TRIGGER_EDEFAULT = TriggerEvent.ON_RESOURCE_CREATE;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected TriggerEvent trigger = TRIGGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecision() <em>Decision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecision()
	 * @generated
	 * @ordered
	 */
	protected static final ModerationDecision DECISION_EDEFAULT = ModerationDecision.APPROVED;

	/**
	 * The cached value of the '{@link #getDecision() <em>Decision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecision()
	 * @generated
	 * @ordered
	 */
	protected ModerationDecision decision = DECISION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMonitorsResource() <em>Monitors Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitorsResource()
	 * @generated
	 * @ordered
	 */
	protected ResourceType monitorsResource;

	/**
	 * The cached value of the '{@link #getMonitorsFeedback() <em>Monitors Feedback</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitorsFeedback()
	 * @generated
	 * @ordered
	 */
	protected FeedbackDefinition monitorsFeedback;

	/**
	 * The cached value of the '{@link #getExecutedBy() <em>Executed By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<UserType> executedBy;

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
	protected ModerationPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnormPackage.Literals.MODERATION_POLICY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EnormPackage.MODERATION_POLICY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModerationMode getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMode(ModerationMode newMode) {
		ModerationMode oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnormPackage.MODERATION_POLICY__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriggerEvent getTrigger() {
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrigger(TriggerEvent newTrigger) {
		TriggerEvent oldTrigger = trigger;
		trigger = newTrigger == null ? TRIGGER_EDEFAULT : newTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnormPackage.MODERATION_POLICY__TRIGGER, oldTrigger,
					trigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModerationDecision getDecision() {
		return decision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecision(ModerationDecision newDecision) {
		ModerationDecision oldDecision = decision;
		decision = newDecision == null ? DECISION_EDEFAULT : newDecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnormPackage.MODERATION_POLICY__DECISION, oldDecision,
					decision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceType getMonitorsResource() {
		if (monitorsResource != null && monitorsResource.eIsProxy()) {
			InternalEObject oldMonitorsResource = (InternalEObject) monitorsResource;
			monitorsResource = (ResourceType) eResolveProxy(oldMonitorsResource);
			if (monitorsResource != oldMonitorsResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EnormPackage.MODERATION_POLICY__MONITORS_RESOURCE, oldMonitorsResource, monitorsResource));
			}
		}
		return monitorsResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceType basicGetMonitorsResource() {
		return monitorsResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMonitorsResource(ResourceType newMonitorsResource) {
		ResourceType oldMonitorsResource = monitorsResource;
		monitorsResource = newMonitorsResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnormPackage.MODERATION_POLICY__MONITORS_RESOURCE,
					oldMonitorsResource, monitorsResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeedbackDefinition getMonitorsFeedback() {
		if (monitorsFeedback != null && monitorsFeedback.eIsProxy()) {
			InternalEObject oldMonitorsFeedback = (InternalEObject) monitorsFeedback;
			monitorsFeedback = (FeedbackDefinition) eResolveProxy(oldMonitorsFeedback);
			if (monitorsFeedback != oldMonitorsFeedback) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EnormPackage.MODERATION_POLICY__MONITORS_FEEDBACK, oldMonitorsFeedback, monitorsFeedback));
			}
		}
		return monitorsFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackDefinition basicGetMonitorsFeedback() {
		return monitorsFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMonitorsFeedback(FeedbackDefinition newMonitorsFeedback) {
		FeedbackDefinition oldMonitorsFeedback = monitorsFeedback;
		monitorsFeedback = newMonitorsFeedback;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnormPackage.MODERATION_POLICY__MONITORS_FEEDBACK,
					oldMonitorsFeedback, monitorsFeedback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UserType> getExecutedBy() {
		if (executedBy == null) {
			executedBy = new EObjectResolvingEList<UserType>(UserType.class, this,
					EnormPackage.MODERATION_POLICY__EXECUTED_BY);
		}
		return executedBy;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EnormPackage.MODERATION_POLICY__IN_CONTEXT, oldInContext, inContext));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EnormPackage.MODERATION_POLICY__IN_CONTEXT,
					oldInContext, inContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EnormPackage.MODERATION_POLICY__NAME:
			return getName();
		case EnormPackage.MODERATION_POLICY__MODE:
			return getMode();
		case EnormPackage.MODERATION_POLICY__TRIGGER:
			return getTrigger();
		case EnormPackage.MODERATION_POLICY__DECISION:
			return getDecision();
		case EnormPackage.MODERATION_POLICY__MONITORS_RESOURCE:
			if (resolve)
				return getMonitorsResource();
			return basicGetMonitorsResource();
		case EnormPackage.MODERATION_POLICY__MONITORS_FEEDBACK:
			if (resolve)
				return getMonitorsFeedback();
			return basicGetMonitorsFeedback();
		case EnormPackage.MODERATION_POLICY__EXECUTED_BY:
			return getExecutedBy();
		case EnormPackage.MODERATION_POLICY__IN_CONTEXT:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EnormPackage.MODERATION_POLICY__NAME:
			setName((String) newValue);
			return;
		case EnormPackage.MODERATION_POLICY__MODE:
			setMode((ModerationMode) newValue);
			return;
		case EnormPackage.MODERATION_POLICY__TRIGGER:
			setTrigger((TriggerEvent) newValue);
			return;
		case EnormPackage.MODERATION_POLICY__DECISION:
			setDecision((ModerationDecision) newValue);
			return;
		case EnormPackage.MODERATION_POLICY__MONITORS_RESOURCE:
			setMonitorsResource((ResourceType) newValue);
			return;
		case EnormPackage.MODERATION_POLICY__MONITORS_FEEDBACK:
			setMonitorsFeedback((FeedbackDefinition) newValue);
			return;
		case EnormPackage.MODERATION_POLICY__EXECUTED_BY:
			getExecutedBy().clear();
			getExecutedBy().addAll((Collection<? extends UserType>) newValue);
			return;
		case EnormPackage.MODERATION_POLICY__IN_CONTEXT:
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
		case EnormPackage.MODERATION_POLICY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EnormPackage.MODERATION_POLICY__MODE:
			setMode(MODE_EDEFAULT);
			return;
		case EnormPackage.MODERATION_POLICY__TRIGGER:
			setTrigger(TRIGGER_EDEFAULT);
			return;
		case EnormPackage.MODERATION_POLICY__DECISION:
			setDecision(DECISION_EDEFAULT);
			return;
		case EnormPackage.MODERATION_POLICY__MONITORS_RESOURCE:
			setMonitorsResource((ResourceType) null);
			return;
		case EnormPackage.MODERATION_POLICY__MONITORS_FEEDBACK:
			setMonitorsFeedback((FeedbackDefinition) null);
			return;
		case EnormPackage.MODERATION_POLICY__EXECUTED_BY:
			getExecutedBy().clear();
			return;
		case EnormPackage.MODERATION_POLICY__IN_CONTEXT:
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
		case EnormPackage.MODERATION_POLICY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EnormPackage.MODERATION_POLICY__MODE:
			return mode != MODE_EDEFAULT;
		case EnormPackage.MODERATION_POLICY__TRIGGER:
			return trigger != TRIGGER_EDEFAULT;
		case EnormPackage.MODERATION_POLICY__DECISION:
			return decision != DECISION_EDEFAULT;
		case EnormPackage.MODERATION_POLICY__MONITORS_RESOURCE:
			return monitorsResource != null;
		case EnormPackage.MODERATION_POLICY__MONITORS_FEEDBACK:
			return monitorsFeedback != null;
		case EnormPackage.MODERATION_POLICY__EXECUTED_BY:
			return executedBy != null && !executedBy.isEmpty();
		case EnormPackage.MODERATION_POLICY__IN_CONTEXT:
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
		result.append(", mode: ");
		result.append(mode);
		result.append(", trigger: ");
		result.append(trigger);
		result.append(", decision: ");
		result.append(decision);
		result.append(')');
		return result.toString();
	}

} //ModerationPolicyImpl
