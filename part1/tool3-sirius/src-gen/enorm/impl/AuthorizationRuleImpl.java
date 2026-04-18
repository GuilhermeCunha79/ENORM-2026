/**
 */
package enorm.impl;

import enorm.ActionKind;
import enorm.AuthorizationRule;
import enorm.ContextType;
import enorm.EnormPackage;
import enorm.FeedbackDefinition;
import enorm.ResourceType;
import enorm.UserType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authorization Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link enorm.impl.AuthorizationRuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link enorm.impl.AuthorizationRuleImpl#getAllowedAction <em>Allowed Action</em>}</li>
 *   <li>{@link enorm.impl.AuthorizationRuleImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link enorm.impl.AuthorizationRuleImpl#getContext <em>Context</em>}</li>
 *   <li>{@link enorm.impl.AuthorizationRuleImpl#getResourceTarget <em>Resource Target</em>}</li>
 *   <li>{@link enorm.impl.AuthorizationRuleImpl#getFeedbackTarget <em>Feedback Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthorizationRuleImpl extends MinimalEObjectImpl.Container implements AuthorizationRule {
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
	 * The default value of the '{@link #getAllowedAction() <em>Allowed Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedAction()
	 * @generated
	 * @ordered
	 */
	protected static final ActionKind ALLOWED_ACTION_EDEFAULT = ActionKind.READ;

	/**
	 * The cached value of the '{@link #getAllowedAction() <em>Allowed Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedAction()
	 * @generated
	 * @ordered
	 */
	protected ActionKind allowedAction = ALLOWED_ACTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected UserType actor;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected ContextType context;

	/**
	 * The cached value of the '{@link #getResourceTarget() <em>Resource Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceTarget()
	 * @generated
	 * @ordered
	 */
	protected ResourceType resourceTarget;

	/**
	 * The cached value of the '{@link #getFeedbackTarget() <em>Feedback Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedbackTarget()
	 * @generated
	 * @ordered
	 */
	protected FeedbackDefinition feedbackTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorizationRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnormPackage.Literals.AUTHORIZATION_RULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EnormPackage.AUTHORIZATION_RULE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionKind getAllowedAction() {
		return allowedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowedAction(ActionKind newAllowedAction) {
		ActionKind oldAllowedAction = allowedAction;
		allowedAction = newAllowedAction == null ? ALLOWED_ACTION_EDEFAULT : newAllowedAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnormPackage.AUTHORIZATION_RULE__ALLOWED_ACTION,
					oldAllowedAction, allowedAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserType getActor() {
		if (actor != null && actor.eIsProxy()) {
			InternalEObject oldActor = (InternalEObject) actor;
			actor = (UserType) eResolveProxy(oldActor);
			if (actor != oldActor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnormPackage.AUTHORIZATION_RULE__ACTOR,
							oldActor, actor));
			}
		}
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserType basicGetActor() {
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActor(UserType newActor) {
		UserType oldActor = actor;
		actor = newActor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnormPackage.AUTHORIZATION_RULE__ACTOR, oldActor,
					actor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextType getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject) context;
			context = (ContextType) eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnormPackage.AUTHORIZATION_RULE__CONTEXT,
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
	public ContextType basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContext(ContextType newContext) {
		ContextType oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnormPackage.AUTHORIZATION_RULE__CONTEXT, oldContext,
					context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceType getResourceTarget() {
		if (resourceTarget != null && resourceTarget.eIsProxy()) {
			InternalEObject oldResourceTarget = (InternalEObject) resourceTarget;
			resourceTarget = (ResourceType) eResolveProxy(oldResourceTarget);
			if (resourceTarget != oldResourceTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EnormPackage.AUTHORIZATION_RULE__RESOURCE_TARGET, oldResourceTarget, resourceTarget));
			}
		}
		return resourceTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceType basicGetResourceTarget() {
		return resourceTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceTarget(ResourceType newResourceTarget) {
		ResourceType oldResourceTarget = resourceTarget;
		resourceTarget = newResourceTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnormPackage.AUTHORIZATION_RULE__RESOURCE_TARGET,
					oldResourceTarget, resourceTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeedbackDefinition getFeedbackTarget() {
		if (feedbackTarget != null && feedbackTarget.eIsProxy()) {
			InternalEObject oldFeedbackTarget = (InternalEObject) feedbackTarget;
			feedbackTarget = (FeedbackDefinition) eResolveProxy(oldFeedbackTarget);
			if (feedbackTarget != oldFeedbackTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EnormPackage.AUTHORIZATION_RULE__FEEDBACK_TARGET, oldFeedbackTarget, feedbackTarget));
			}
		}
		return feedbackTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackDefinition basicGetFeedbackTarget() {
		return feedbackTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeedbackTarget(FeedbackDefinition newFeedbackTarget) {
		FeedbackDefinition oldFeedbackTarget = feedbackTarget;
		feedbackTarget = newFeedbackTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnormPackage.AUTHORIZATION_RULE__FEEDBACK_TARGET,
					oldFeedbackTarget, feedbackTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EnormPackage.AUTHORIZATION_RULE__NAME:
			return getName();
		case EnormPackage.AUTHORIZATION_RULE__ALLOWED_ACTION:
			return getAllowedAction();
		case EnormPackage.AUTHORIZATION_RULE__ACTOR:
			if (resolve)
				return getActor();
			return basicGetActor();
		case EnormPackage.AUTHORIZATION_RULE__CONTEXT:
			if (resolve)
				return getContext();
			return basicGetContext();
		case EnormPackage.AUTHORIZATION_RULE__RESOURCE_TARGET:
			if (resolve)
				return getResourceTarget();
			return basicGetResourceTarget();
		case EnormPackage.AUTHORIZATION_RULE__FEEDBACK_TARGET:
			if (resolve)
				return getFeedbackTarget();
			return basicGetFeedbackTarget();
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
		case EnormPackage.AUTHORIZATION_RULE__NAME:
			setName((String) newValue);
			return;
		case EnormPackage.AUTHORIZATION_RULE__ALLOWED_ACTION:
			setAllowedAction((ActionKind) newValue);
			return;
		case EnormPackage.AUTHORIZATION_RULE__ACTOR:
			setActor((UserType) newValue);
			return;
		case EnormPackage.AUTHORIZATION_RULE__CONTEXT:
			setContext((ContextType) newValue);
			return;
		case EnormPackage.AUTHORIZATION_RULE__RESOURCE_TARGET:
			setResourceTarget((ResourceType) newValue);
			return;
		case EnormPackage.AUTHORIZATION_RULE__FEEDBACK_TARGET:
			setFeedbackTarget((FeedbackDefinition) newValue);
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
		case EnormPackage.AUTHORIZATION_RULE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EnormPackage.AUTHORIZATION_RULE__ALLOWED_ACTION:
			setAllowedAction(ALLOWED_ACTION_EDEFAULT);
			return;
		case EnormPackage.AUTHORIZATION_RULE__ACTOR:
			setActor((UserType) null);
			return;
		case EnormPackage.AUTHORIZATION_RULE__CONTEXT:
			setContext((ContextType) null);
			return;
		case EnormPackage.AUTHORIZATION_RULE__RESOURCE_TARGET:
			setResourceTarget((ResourceType) null);
			return;
		case EnormPackage.AUTHORIZATION_RULE__FEEDBACK_TARGET:
			setFeedbackTarget((FeedbackDefinition) null);
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
		case EnormPackage.AUTHORIZATION_RULE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EnormPackage.AUTHORIZATION_RULE__ALLOWED_ACTION:
			return allowedAction != ALLOWED_ACTION_EDEFAULT;
		case EnormPackage.AUTHORIZATION_RULE__ACTOR:
			return actor != null;
		case EnormPackage.AUTHORIZATION_RULE__CONTEXT:
			return context != null;
		case EnormPackage.AUTHORIZATION_RULE__RESOURCE_TARGET:
			return resourceTarget != null;
		case EnormPackage.AUTHORIZATION_RULE__FEEDBACK_TARGET:
			return feedbackTarget != null;
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
		result.append(", allowedAction: ");
		result.append(allowedAction);
		result.append(')');
		return result.toString();
	}

} //AuthorizationRuleImpl
