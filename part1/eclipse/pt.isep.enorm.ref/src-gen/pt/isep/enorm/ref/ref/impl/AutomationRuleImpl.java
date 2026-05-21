/**
 */
package pt.isep.enorm.ref.ref.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import pt.isep.enorm.ref.ref.Action;
import pt.isep.enorm.ref.ref.AutomationRule;
import pt.isep.enorm.ref.ref.Condition;
import pt.isep.enorm.ref.ref.ContextType;
import pt.isep.enorm.ref.ref.FeedbackDefinition;
import pt.isep.enorm.ref.ref.RefPackage;
import pt.isep.enorm.ref.ref.ResourceType;
import pt.isep.enorm.ref.ref.TriggerEvent;
import pt.isep.enorm.ref.ref.ValidationRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Automation Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.AutomationRuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.AutomationRuleImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.AutomationRuleImpl#getContext <em>Context</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.AutomationRuleImpl#getInContext <em>In Context</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.AutomationRuleImpl#getOnFeedback <em>On Feedback</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.AutomationRuleImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.AutomationRuleImpl#getInvokedValidationRules <em>Invoked Validation Rules</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.AutomationRuleImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.AutomationRuleImpl#getActions <em>Actions</em>}</li>
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
	 * The cached value of the '{@link #getInvokedValidationRules() <em>Invoked Validation Rules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvokedValidationRules()
	 * @generated
	 * @ordered
	 */
	protected EList<ValidationRule> invokedValidationRules;

	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> conditions;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

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
		return RefPackage.Literals.AUTOMATION_RULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefPackage.AUTOMATION_RULE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefPackage.AUTOMATION_RULE__TRIGGER, oldTrigger,
					trigger));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefPackage.AUTOMATION_RULE__CONTEXT,
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefPackage.AUTOMATION_RULE__CONTEXT, oldContext,
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefPackage.AUTOMATION_RULE__IN_CONTEXT,
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefPackage.AUTOMATION_RULE__IN_CONTEXT, oldInContext,
					inContext));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefPackage.AUTOMATION_RULE__ON_FEEDBACK,
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefPackage.AUTOMATION_RULE__ON_FEEDBACK,
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefPackage.AUTOMATION_RULE__USES, oldUses,
							uses));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefPackage.AUTOMATION_RULE__USES, oldUses, uses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValidationRule> getInvokedValidationRules() {
		if (invokedValidationRules == null) {
			invokedValidationRules = new EObjectWithInverseResolvingEList<ValidationRule>(ValidationRule.class, this,
					RefPackage.AUTOMATION_RULE__INVOKED_VALIDATION_RULES, RefPackage.VALIDATION_RULE__INVOKED_BY);
		}
		return invokedValidationRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Condition> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<Condition>(Condition.class, this,
					RefPackage.AUTOMATION_RULE__CONDITIONS);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, RefPackage.AUTOMATION_RULE__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RefPackage.AUTOMATION_RULE__INVOKED_VALIDATION_RULES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInvokedValidationRules()).basicAdd(otherEnd,
					msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RefPackage.AUTOMATION_RULE__INVOKED_VALIDATION_RULES:
			return ((InternalEList<?>) getInvokedValidationRules()).basicRemove(otherEnd, msgs);
		case RefPackage.AUTOMATION_RULE__CONDITIONS:
			return ((InternalEList<?>) getConditions()).basicRemove(otherEnd, msgs);
		case RefPackage.AUTOMATION_RULE__ACTIONS:
			return ((InternalEList<?>) getActions()).basicRemove(otherEnd, msgs);
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
		case RefPackage.AUTOMATION_RULE__NAME:
			return getName();
		case RefPackage.AUTOMATION_RULE__TRIGGER:
			return getTrigger();
		case RefPackage.AUTOMATION_RULE__CONTEXT:
			if (resolve)
				return getContext();
			return basicGetContext();
		case RefPackage.AUTOMATION_RULE__IN_CONTEXT:
			if (resolve)
				return getInContext();
			return basicGetInContext();
		case RefPackage.AUTOMATION_RULE__ON_FEEDBACK:
			if (resolve)
				return getOnFeedback();
			return basicGetOnFeedback();
		case RefPackage.AUTOMATION_RULE__USES:
			if (resolve)
				return getUses();
			return basicGetUses();
		case RefPackage.AUTOMATION_RULE__INVOKED_VALIDATION_RULES:
			return getInvokedValidationRules();
		case RefPackage.AUTOMATION_RULE__CONDITIONS:
			return getConditions();
		case RefPackage.AUTOMATION_RULE__ACTIONS:
			return getActions();
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
		case RefPackage.AUTOMATION_RULE__NAME:
			setName((String) newValue);
			return;
		case RefPackage.AUTOMATION_RULE__TRIGGER:
			setTrigger((TriggerEvent) newValue);
			return;
		case RefPackage.AUTOMATION_RULE__CONTEXT:
			setContext((ResourceType) newValue);
			return;
		case RefPackage.AUTOMATION_RULE__IN_CONTEXT:
			setInContext((ContextType) newValue);
			return;
		case RefPackage.AUTOMATION_RULE__ON_FEEDBACK:
			setOnFeedback((FeedbackDefinition) newValue);
			return;
		case RefPackage.AUTOMATION_RULE__USES:
			setUses((ValidationRule) newValue);
			return;
		case RefPackage.AUTOMATION_RULE__INVOKED_VALIDATION_RULES:
			getInvokedValidationRules().clear();
			getInvokedValidationRules().addAll((Collection<? extends ValidationRule>) newValue);
			return;
		case RefPackage.AUTOMATION_RULE__CONDITIONS:
			getConditions().clear();
			getConditions().addAll((Collection<? extends Condition>) newValue);
			return;
		case RefPackage.AUTOMATION_RULE__ACTIONS:
			getActions().clear();
			getActions().addAll((Collection<? extends Action>) newValue);
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
		case RefPackage.AUTOMATION_RULE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case RefPackage.AUTOMATION_RULE__TRIGGER:
			setTrigger(TRIGGER_EDEFAULT);
			return;
		case RefPackage.AUTOMATION_RULE__CONTEXT:
			setContext((ResourceType) null);
			return;
		case RefPackage.AUTOMATION_RULE__IN_CONTEXT:
			setInContext((ContextType) null);
			return;
		case RefPackage.AUTOMATION_RULE__ON_FEEDBACK:
			setOnFeedback((FeedbackDefinition) null);
			return;
		case RefPackage.AUTOMATION_RULE__USES:
			setUses((ValidationRule) null);
			return;
		case RefPackage.AUTOMATION_RULE__INVOKED_VALIDATION_RULES:
			getInvokedValidationRules().clear();
			return;
		case RefPackage.AUTOMATION_RULE__CONDITIONS:
			getConditions().clear();
			return;
		case RefPackage.AUTOMATION_RULE__ACTIONS:
			getActions().clear();
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
		case RefPackage.AUTOMATION_RULE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case RefPackage.AUTOMATION_RULE__TRIGGER:
			return trigger != TRIGGER_EDEFAULT;
		case RefPackage.AUTOMATION_RULE__CONTEXT:
			return context != null;
		case RefPackage.AUTOMATION_RULE__IN_CONTEXT:
			return inContext != null;
		case RefPackage.AUTOMATION_RULE__ON_FEEDBACK:
			return onFeedback != null;
		case RefPackage.AUTOMATION_RULE__USES:
			return uses != null;
		case RefPackage.AUTOMATION_RULE__INVOKED_VALIDATION_RULES:
			return invokedValidationRules != null && !invokedValidationRules.isEmpty();
		case RefPackage.AUTOMATION_RULE__CONDITIONS:
			return conditions != null && !conditions.isEmpty();
		case RefPackage.AUTOMATION_RULE__ACTIONS:
			return actions != null && !actions.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //AutomationRuleImpl
