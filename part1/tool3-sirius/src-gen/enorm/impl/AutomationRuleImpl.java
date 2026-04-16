/**
 */
package enorm.impl;

import enorm.AutomationRule;
import enorm.ContextType;
import enorm.EnormPackage;
import enorm.FeedbackDefinition;
import enorm.ResourceType;
import enorm.ValidationRule;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Automation Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link enorm.impl.AutomationRuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link enorm.impl.AutomationRuleImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link enorm.impl.AutomationRuleImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link enorm.impl.AutomationRuleImpl#getActionDescription <em>Action Description</em>}</li>
 *   <li>{@link enorm.impl.AutomationRuleImpl#getContext <em>Context</em>}</li>
 *   <li>{@link enorm.impl.AutomationRuleImpl#getInContext <em>In Context</em>}</li>
 *   <li>{@link enorm.impl.AutomationRuleImpl#getOnFeedback <em>On Feedback</em>}</li>
 *   <li>{@link enorm.impl.AutomationRuleImpl#getUses <em>Uses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AutomationRuleImpl extends MinimalEObjectImpl.Container implements AutomationRule {
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
	 * The default value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected static final String TRIGGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected String trigger = TRIGGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionDescription() <em>Action Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionDescription() <em>Action Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionDescription()
	 * @generated
	 * @ordered
	 */
	protected String actionDescription = ACTION_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected ResourceType context;

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
	 * The cached value of the '{@link #getOnFeedback() <em>On Feedback</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnFeedback()
	 * @generated
	 * @ordered
	 */
	protected FeedbackDefinition onFeedback;

	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected ValidationRule uses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AutomationRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnormPackage.Literals.AUTOMATION_RULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EnormPackage.AUTOMATION_RULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrigger() {
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrigger(String newTrigger) {
		String oldTrigger = trigger;
		trigger = newTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnormPackage.AUTOMATION_RULE__TRIGGER, oldTrigger,
					trigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnormPackage.AUTOMATION_RULE__CONDITION, oldCondition,
					condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getActionDescription() {
		return actionDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActionDescription(String newActionDescription) {
		String oldActionDescription = actionDescription;
		actionDescription = newActionDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnormPackage.AUTOMATION_RULE__ACTION_DESCRIPTION,
					oldActionDescription, actionDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceType getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject) context;
			context = (ResourceType) eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnormPackage.AUTOMATION_RULE__CONTEXT,
							oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceType basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContext(ResourceType newContext) {
		ResourceType oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnormPackage.AUTOMATION_RULE__CONTEXT, oldContext,
					context));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnormPackage.AUTOMATION_RULE__IN_CONTEXT,
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
			eNotify(new ENotificationImpl(this, Notification.SET, EnormPackage.AUTOMATION_RULE__IN_CONTEXT,
					oldInContext, inContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeedbackDefinition getOnFeedback() {
		if (onFeedback != null && onFeedback.eIsProxy()) {
			InternalEObject oldOnFeedback = (InternalEObject) onFeedback;
			onFeedback = (FeedbackDefinition) eResolveProxy(oldOnFeedback);
			if (onFeedback != oldOnFeedback) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnormPackage.AUTOMATION_RULE__ON_FEEDBACK,
							oldOnFeedback, onFeedback));
			}
		}
		return onFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackDefinition basicGetOnFeedback() {
		return onFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnFeedback(FeedbackDefinition newOnFeedback) {
		FeedbackDefinition oldOnFeedback = onFeedback;
		onFeedback = newOnFeedback;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnormPackage.AUTOMATION_RULE__ON_FEEDBACK,
					oldOnFeedback, onFeedback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidationRule getUses() {
		if (uses != null && uses.eIsProxy()) {
			InternalEObject oldUses = (InternalEObject) uses;
			uses = (ValidationRule) eResolveProxy(oldUses);
			if (uses != oldUses) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnormPackage.AUTOMATION_RULE__USES,
							oldUses, uses));
			}
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidationRule basicGetUses() {
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUses(ValidationRule newUses) {
		ValidationRule oldUses = uses;
		uses = newUses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnormPackage.AUTOMATION_RULE__USES, oldUses, uses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EnormPackage.AUTOMATION_RULE__NAME:
			return getName();
		case EnormPackage.AUTOMATION_RULE__TRIGGER:
			return getTrigger();
		case EnormPackage.AUTOMATION_RULE__CONDITION:
			return getCondition();
		case EnormPackage.AUTOMATION_RULE__ACTION_DESCRIPTION:
			return getActionDescription();
		case EnormPackage.AUTOMATION_RULE__CONTEXT:
			if (resolve)
				return getContext();
			return basicGetContext();
		case EnormPackage.AUTOMATION_RULE__IN_CONTEXT:
			if (resolve)
				return getInContext();
			return basicGetInContext();
		case EnormPackage.AUTOMATION_RULE__ON_FEEDBACK:
			if (resolve)
				return getOnFeedback();
			return basicGetOnFeedback();
		case EnormPackage.AUTOMATION_RULE__USES:
			if (resolve)
				return getUses();
			return basicGetUses();
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
		case EnormPackage.AUTOMATION_RULE__NAME:
			setName((String) newValue);
			return;
		case EnormPackage.AUTOMATION_RULE__TRIGGER:
			setTrigger((String) newValue);
			return;
		case EnormPackage.AUTOMATION_RULE__CONDITION:
			setCondition((String) newValue);
			return;
		case EnormPackage.AUTOMATION_RULE__ACTION_DESCRIPTION:
			setActionDescription((String) newValue);
			return;
		case EnormPackage.AUTOMATION_RULE__CONTEXT:
			setContext((ResourceType) newValue);
			return;
		case EnormPackage.AUTOMATION_RULE__IN_CONTEXT:
			setInContext((ContextType) newValue);
			return;
		case EnormPackage.AUTOMATION_RULE__ON_FEEDBACK:
			setOnFeedback((FeedbackDefinition) newValue);
			return;
		case EnormPackage.AUTOMATION_RULE__USES:
			setUses((ValidationRule) newValue);
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
		case EnormPackage.AUTOMATION_RULE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EnormPackage.AUTOMATION_RULE__TRIGGER:
			setTrigger(TRIGGER_EDEFAULT);
			return;
		case EnormPackage.AUTOMATION_RULE__CONDITION:
			setCondition(CONDITION_EDEFAULT);
			return;
		case EnormPackage.AUTOMATION_RULE__ACTION_DESCRIPTION:
			setActionDescription(ACTION_DESCRIPTION_EDEFAULT);
			return;
		case EnormPackage.AUTOMATION_RULE__CONTEXT:
			setContext((ResourceType) null);
			return;
		case EnormPackage.AUTOMATION_RULE__IN_CONTEXT:
			setInContext((ContextType) null);
			return;
		case EnormPackage.AUTOMATION_RULE__ON_FEEDBACK:
			setOnFeedback((FeedbackDefinition) null);
			return;
		case EnormPackage.AUTOMATION_RULE__USES:
			setUses((ValidationRule) null);
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
		case EnormPackage.AUTOMATION_RULE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EnormPackage.AUTOMATION_RULE__TRIGGER:
			return TRIGGER_EDEFAULT == null ? trigger != null : !TRIGGER_EDEFAULT.equals(trigger);
		case EnormPackage.AUTOMATION_RULE__CONDITION:
			return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
		case EnormPackage.AUTOMATION_RULE__ACTION_DESCRIPTION:
			return ACTION_DESCRIPTION_EDEFAULT == null ? actionDescription != null
					: !ACTION_DESCRIPTION_EDEFAULT.equals(actionDescription);
		case EnormPackage.AUTOMATION_RULE__CONTEXT:
			return context != null;
		case EnormPackage.AUTOMATION_RULE__IN_CONTEXT:
			return inContext != null;
		case EnormPackage.AUTOMATION_RULE__ON_FEEDBACK:
			return onFeedback != null;
		case EnormPackage.AUTOMATION_RULE__USES:
			return uses != null;
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
		result.append(", trigger: ");
		result.append(trigger);
		result.append(", condition: ");
		result.append(condition);
		result.append(", actionDescription: ");
		result.append(actionDescription);
		result.append(')');
		return result.toString();
	}

} //AutomationRuleImpl
