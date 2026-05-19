/**
 */
package pt.isep.enorm.ref.ref.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pt.isep.enorm.ref.ref.AutomationRule;
import pt.isep.enorm.ref.ref.FeedbackDefinition;
import pt.isep.enorm.ref.ref.RefPackage;
import pt.isep.enorm.ref.ref.ResourceType;
import pt.isep.enorm.ref.ref.RuleSeverity;
import pt.isep.enorm.ref.ref.ValidationKind;
import pt.isep.enorm.ref.ref.ValidationRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validation Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.ValidationRuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.ValidationRuleImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.ValidationRuleImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.ValidationRuleImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.ValidationRuleImpl#getImplementationId <em>Implementation Id</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.ValidationRuleImpl#getAppliesToResource <em>Applies To Resource</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.ValidationRuleImpl#getAppliesToFeedback <em>Applies To Feedback</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.ValidationRuleImpl#getInvokedBy <em>Invoked By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValidationRuleImpl extends MinimalEObjectImpl.Container implements ValidationRule {
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
	protected static final ValidationKind KIND_EDEFAULT = ValidationKind.AUTOMATIC;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ValidationKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final RuleSeverity SEVERITY_EDEFAULT = RuleSeverity.INFO;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected RuleSeverity severity = SEVERITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplementationId() <em>Implementation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationId()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLEMENTATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImplementationId() <em>Implementation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationId()
	 * @generated
	 * @ordered
	 */
	protected String implementationId = IMPLEMENTATION_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getInvokedBy() <em>Invoked By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvokedBy()
	 * @generated
	 * @ordered
	 */
	protected AutomationRule invokedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidationRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefPackage.Literals.VALIDATION_RULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefPackage.VALIDATION_RULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidationKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(ValidationKind newKind) {
		ValidationKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefPackage.VALIDATION_RULE__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RuleSeverity getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeverity(RuleSeverity newSeverity) {
		RuleSeverity oldSeverity = severity;
		severity = newSeverity == null ? SEVERITY_EDEFAULT : newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefPackage.VALIDATION_RULE__SEVERITY, oldSeverity,
					severity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpression(String newExpression) {
		String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefPackage.VALIDATION_RULE__EXPRESSION, oldExpression,
					expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplementationId() {
		return implementationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplementationId(String newImplementationId) {
		String oldImplementationId = implementationId;
		implementationId = newImplementationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefPackage.VALIDATION_RULE__IMPLEMENTATION_ID,
					oldImplementationId, implementationId));
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
							RefPackage.VALIDATION_RULE__APPLIES_TO_RESOURCE, oldAppliesToResource, appliesToResource));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefPackage.VALIDATION_RULE__APPLIES_TO_RESOURCE,
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
							RefPackage.VALIDATION_RULE__APPLIES_TO_FEEDBACK, oldAppliesToFeedback, appliesToFeedback));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefPackage.VALIDATION_RULE__APPLIES_TO_FEEDBACK,
					oldAppliesToFeedback, appliesToFeedback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AutomationRule getInvokedBy() {
		if (invokedBy != null && invokedBy.eIsProxy()) {
			InternalEObject oldInvokedBy = (InternalEObject) invokedBy;
			invokedBy = (AutomationRule) eResolveProxy(oldInvokedBy);
			if (invokedBy != oldInvokedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefPackage.VALIDATION_RULE__INVOKED_BY,
							oldInvokedBy, invokedBy));
			}
		}
		return invokedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutomationRule basicGetInvokedBy() {
		return invokedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInvokedBy(AutomationRule newInvokedBy, NotificationChain msgs) {
		AutomationRule oldInvokedBy = invokedBy;
		invokedBy = newInvokedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RefPackage.VALIDATION_RULE__INVOKED_BY, oldInvokedBy, newInvokedBy);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvokedBy(AutomationRule newInvokedBy) {
		if (newInvokedBy != invokedBy) {
			NotificationChain msgs = null;
			if (invokedBy != null)
				msgs = ((InternalEObject) invokedBy).eInverseRemove(this,
						RefPackage.AUTOMATION_RULE__INVOKED_VALIDATION_RULES, AutomationRule.class, msgs);
			if (newInvokedBy != null)
				msgs = ((InternalEObject) newInvokedBy).eInverseAdd(this,
						RefPackage.AUTOMATION_RULE__INVOKED_VALIDATION_RULES, AutomationRule.class, msgs);
			msgs = basicSetInvokedBy(newInvokedBy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefPackage.VALIDATION_RULE__INVOKED_BY, newInvokedBy,
					newInvokedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RefPackage.VALIDATION_RULE__INVOKED_BY:
			if (invokedBy != null)
				msgs = ((InternalEObject) invokedBy).eInverseRemove(this,
						RefPackage.AUTOMATION_RULE__INVOKED_VALIDATION_RULES, AutomationRule.class, msgs);
			return basicSetInvokedBy((AutomationRule) otherEnd, msgs);
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
		case RefPackage.VALIDATION_RULE__INVOKED_BY:
			return basicSetInvokedBy(null, msgs);
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
		case RefPackage.VALIDATION_RULE__NAME:
			return getName();
		case RefPackage.VALIDATION_RULE__KIND:
			return getKind();
		case RefPackage.VALIDATION_RULE__SEVERITY:
			return getSeverity();
		case RefPackage.VALIDATION_RULE__EXPRESSION:
			return getExpression();
		case RefPackage.VALIDATION_RULE__IMPLEMENTATION_ID:
			return getImplementationId();
		case RefPackage.VALIDATION_RULE__APPLIES_TO_RESOURCE:
			if (resolve)
				return getAppliesToResource();
			return basicGetAppliesToResource();
		case RefPackage.VALIDATION_RULE__APPLIES_TO_FEEDBACK:
			if (resolve)
				return getAppliesToFeedback();
			return basicGetAppliesToFeedback();
		case RefPackage.VALIDATION_RULE__INVOKED_BY:
			if (resolve)
				return getInvokedBy();
			return basicGetInvokedBy();
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
		case RefPackage.VALIDATION_RULE__NAME:
			setName((String) newValue);
			return;
		case RefPackage.VALIDATION_RULE__KIND:
			setKind((ValidationKind) newValue);
			return;
		case RefPackage.VALIDATION_RULE__SEVERITY:
			setSeverity((RuleSeverity) newValue);
			return;
		case RefPackage.VALIDATION_RULE__EXPRESSION:
			setExpression((String) newValue);
			return;
		case RefPackage.VALIDATION_RULE__IMPLEMENTATION_ID:
			setImplementationId((String) newValue);
			return;
		case RefPackage.VALIDATION_RULE__APPLIES_TO_RESOURCE:
			setAppliesToResource((ResourceType) newValue);
			return;
		case RefPackage.VALIDATION_RULE__APPLIES_TO_FEEDBACK:
			setAppliesToFeedback((FeedbackDefinition) newValue);
			return;
		case RefPackage.VALIDATION_RULE__INVOKED_BY:
			setInvokedBy((AutomationRule) newValue);
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
		case RefPackage.VALIDATION_RULE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case RefPackage.VALIDATION_RULE__KIND:
			setKind(KIND_EDEFAULT);
			return;
		case RefPackage.VALIDATION_RULE__SEVERITY:
			setSeverity(SEVERITY_EDEFAULT);
			return;
		case RefPackage.VALIDATION_RULE__EXPRESSION:
			setExpression(EXPRESSION_EDEFAULT);
			return;
		case RefPackage.VALIDATION_RULE__IMPLEMENTATION_ID:
			setImplementationId(IMPLEMENTATION_ID_EDEFAULT);
			return;
		case RefPackage.VALIDATION_RULE__APPLIES_TO_RESOURCE:
			setAppliesToResource((ResourceType) null);
			return;
		case RefPackage.VALIDATION_RULE__APPLIES_TO_FEEDBACK:
			setAppliesToFeedback((FeedbackDefinition) null);
			return;
		case RefPackage.VALIDATION_RULE__INVOKED_BY:
			setInvokedBy((AutomationRule) null);
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
		case RefPackage.VALIDATION_RULE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case RefPackage.VALIDATION_RULE__KIND:
			return kind != KIND_EDEFAULT;
		case RefPackage.VALIDATION_RULE__SEVERITY:
			return severity != SEVERITY_EDEFAULT;
		case RefPackage.VALIDATION_RULE__EXPRESSION:
			return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
		case RefPackage.VALIDATION_RULE__IMPLEMENTATION_ID:
			return IMPLEMENTATION_ID_EDEFAULT == null ? implementationId != null
					: !IMPLEMENTATION_ID_EDEFAULT.equals(implementationId);
		case RefPackage.VALIDATION_RULE__APPLIES_TO_RESOURCE:
			return appliesToResource != null;
		case RefPackage.VALIDATION_RULE__APPLIES_TO_FEEDBACK:
			return appliesToFeedback != null;
		case RefPackage.VALIDATION_RULE__INVOKED_BY:
			return invokedBy != null;
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
		result.append(", severity: ");
		result.append(severity);
		result.append(", expression: ");
		result.append(expression);
		result.append(", implementationId: ");
		result.append(implementationId);
		result.append(')');
		return result.toString();
	}

} //ValidationRuleImpl
