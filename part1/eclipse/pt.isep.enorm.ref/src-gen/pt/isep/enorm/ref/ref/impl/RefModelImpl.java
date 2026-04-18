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
import org.eclipse.emf.ecore.util.InternalEList;

import pt.isep.enorm.ref.ref.AuthorizationRule;
import pt.isep.enorm.ref.ref.AutomationRule;
import pt.isep.enorm.ref.ref.ContextType;
import pt.isep.enorm.ref.ref.FeedbackDefinition;
import pt.isep.enorm.ref.ref.FeedbackType;
import pt.isep.enorm.ref.ref.ModerationPolicy;
import pt.isep.enorm.ref.ref.RefModel;
import pt.isep.enorm.ref.ref.RefPackage;
import pt.isep.enorm.ref.ref.ResourceRelation;
import pt.isep.enorm.ref.ref.ResourceType;
import pt.isep.enorm.ref.ref.SortingPolicy;
import pt.isep.enorm.ref.ref.UserType;
import pt.isep.enorm.ref.ref.ValidationRule;
import pt.isep.enorm.ref.ref.VerificationPolicy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.RefModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.RefModelImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.RefModelImpl#getUserTypes <em>User Types</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.RefModelImpl#getResourceTypes <em>Resource Types</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.RefModelImpl#getContextTypes <em>Context Types</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.RefModelImpl#getResourceRelations <em>Resource Relations</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.RefModelImpl#getFeedbackTypes <em>Feedback Types</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.RefModelImpl#getFeedbackDefinitions <em>Feedback Definitions</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.RefModelImpl#getAuthorizationRules <em>Authorization Rules</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.RefModelImpl#getValidationRules <em>Validation Rules</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.RefModelImpl#getModerationPolicies <em>Moderation Policies</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.RefModelImpl#getAutomationRules <em>Automation Rules</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.RefModelImpl#getVerificationPolicies <em>Verification Policies</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.RefModelImpl#getSortingPolicies <em>Sorting Policies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefModelImpl extends MinimalEObjectImpl.Container implements RefModel {
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
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUserTypes() <em>User Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<UserType> userTypes;

	/**
	 * The cached value of the '{@link #getResourceTypes() <em>Resource Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceType> resourceTypes;

	/**
	 * The cached value of the '{@link #getContextTypes() <em>Context Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextType> contextTypes;

	/**
	 * The cached value of the '{@link #getResourceRelations() <em>Resource Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceRelation> resourceRelations;

	/**
	 * The cached value of the '{@link #getFeedbackTypes() <em>Feedback Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedbackTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<FeedbackType> feedbackTypes;

	/**
	 * The cached value of the '{@link #getFeedbackDefinitions() <em>Feedback Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedbackDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<FeedbackDefinition> feedbackDefinitions;

	/**
	 * The cached value of the '{@link #getAuthorizationRules() <em>Authorization Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizationRules()
	 * @generated
	 * @ordered
	 */
	protected EList<AuthorizationRule> authorizationRules;

	/**
	 * The cached value of the '{@link #getValidationRules() <em>Validation Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationRules()
	 * @generated
	 * @ordered
	 */
	protected EList<ValidationRule> validationRules;

	/**
	 * The cached value of the '{@link #getModerationPolicies() <em>Moderation Policies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModerationPolicies()
	 * @generated
	 * @ordered
	 */
	protected EList<ModerationPolicy> moderationPolicies;

	/**
	 * The cached value of the '{@link #getAutomationRules() <em>Automation Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomationRules()
	 * @generated
	 * @ordered
	 */
	protected EList<AutomationRule> automationRules;

	/**
	 * The cached value of the '{@link #getVerificationPolicies() <em>Verification Policies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationPolicies()
	 * @generated
	 * @ordered
	 */
	protected EList<VerificationPolicy> verificationPolicies;

	/**
	 * The cached value of the '{@link #getSortingPolicies() <em>Sorting Policies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingPolicies()
	 * @generated
	 * @ordered
	 */
	protected EList<SortingPolicy> sortingPolicies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefPackage.Literals.REF_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefPackage.REF_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefPackage.REF_MODEL__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UserType> getUserTypes() {
		if (userTypes == null) {
			userTypes = new EObjectContainmentEList<UserType>(UserType.class, this, RefPackage.REF_MODEL__USER_TYPES);
		}
		return userTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResourceType> getResourceTypes() {
		if (resourceTypes == null) {
			resourceTypes = new EObjectContainmentEList<ResourceType>(ResourceType.class, this,
					RefPackage.REF_MODEL__RESOURCE_TYPES);
		}
		return resourceTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContextType> getContextTypes() {
		if (contextTypes == null) {
			contextTypes = new EObjectContainmentEList<ContextType>(ContextType.class, this,
					RefPackage.REF_MODEL__CONTEXT_TYPES);
		}
		return contextTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResourceRelation> getResourceRelations() {
		if (resourceRelations == null) {
			resourceRelations = new EObjectContainmentEList<ResourceRelation>(ResourceRelation.class, this,
					RefPackage.REF_MODEL__RESOURCE_RELATIONS);
		}
		return resourceRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FeedbackType> getFeedbackTypes() {
		if (feedbackTypes == null) {
			feedbackTypes = new EObjectContainmentEList<FeedbackType>(FeedbackType.class, this,
					RefPackage.REF_MODEL__FEEDBACK_TYPES);
		}
		return feedbackTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FeedbackDefinition> getFeedbackDefinitions() {
		if (feedbackDefinitions == null) {
			feedbackDefinitions = new EObjectContainmentEList<FeedbackDefinition>(FeedbackDefinition.class, this,
					RefPackage.REF_MODEL__FEEDBACK_DEFINITIONS);
		}
		return feedbackDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AuthorizationRule> getAuthorizationRules() {
		if (authorizationRules == null) {
			authorizationRules = new EObjectContainmentEList<AuthorizationRule>(AuthorizationRule.class, this,
					RefPackage.REF_MODEL__AUTHORIZATION_RULES);
		}
		return authorizationRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValidationRule> getValidationRules() {
		if (validationRules == null) {
			validationRules = new EObjectContainmentEList<ValidationRule>(ValidationRule.class, this,
					RefPackage.REF_MODEL__VALIDATION_RULES);
		}
		return validationRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModerationPolicy> getModerationPolicies() {
		if (moderationPolicies == null) {
			moderationPolicies = new EObjectContainmentEList<ModerationPolicy>(ModerationPolicy.class, this,
					RefPackage.REF_MODEL__MODERATION_POLICIES);
		}
		return moderationPolicies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AutomationRule> getAutomationRules() {
		if (automationRules == null) {
			automationRules = new EObjectContainmentEList<AutomationRule>(AutomationRule.class, this,
					RefPackage.REF_MODEL__AUTOMATION_RULES);
		}
		return automationRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VerificationPolicy> getVerificationPolicies() {
		if (verificationPolicies == null) {
			verificationPolicies = new EObjectContainmentEList<VerificationPolicy>(VerificationPolicy.class, this,
					RefPackage.REF_MODEL__VERIFICATION_POLICIES);
		}
		return verificationPolicies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SortingPolicy> getSortingPolicies() {
		if (sortingPolicies == null) {
			sortingPolicies = new EObjectContainmentEList<SortingPolicy>(SortingPolicy.class, this,
					RefPackage.REF_MODEL__SORTING_POLICIES);
		}
		return sortingPolicies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RefPackage.REF_MODEL__USER_TYPES:
			return ((InternalEList<?>) getUserTypes()).basicRemove(otherEnd, msgs);
		case RefPackage.REF_MODEL__RESOURCE_TYPES:
			return ((InternalEList<?>) getResourceTypes()).basicRemove(otherEnd, msgs);
		case RefPackage.REF_MODEL__CONTEXT_TYPES:
			return ((InternalEList<?>) getContextTypes()).basicRemove(otherEnd, msgs);
		case RefPackage.REF_MODEL__RESOURCE_RELATIONS:
			return ((InternalEList<?>) getResourceRelations()).basicRemove(otherEnd, msgs);
		case RefPackage.REF_MODEL__FEEDBACK_TYPES:
			return ((InternalEList<?>) getFeedbackTypes()).basicRemove(otherEnd, msgs);
		case RefPackage.REF_MODEL__FEEDBACK_DEFINITIONS:
			return ((InternalEList<?>) getFeedbackDefinitions()).basicRemove(otherEnd, msgs);
		case RefPackage.REF_MODEL__AUTHORIZATION_RULES:
			return ((InternalEList<?>) getAuthorizationRules()).basicRemove(otherEnd, msgs);
		case RefPackage.REF_MODEL__VALIDATION_RULES:
			return ((InternalEList<?>) getValidationRules()).basicRemove(otherEnd, msgs);
		case RefPackage.REF_MODEL__MODERATION_POLICIES:
			return ((InternalEList<?>) getModerationPolicies()).basicRemove(otherEnd, msgs);
		case RefPackage.REF_MODEL__AUTOMATION_RULES:
			return ((InternalEList<?>) getAutomationRules()).basicRemove(otherEnd, msgs);
		case RefPackage.REF_MODEL__VERIFICATION_POLICIES:
			return ((InternalEList<?>) getVerificationPolicies()).basicRemove(otherEnd, msgs);
		case RefPackage.REF_MODEL__SORTING_POLICIES:
			return ((InternalEList<?>) getSortingPolicies()).basicRemove(otherEnd, msgs);
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
		case RefPackage.REF_MODEL__NAME:
			return getName();
		case RefPackage.REF_MODEL__VERSION:
			return getVersion();
		case RefPackage.REF_MODEL__USER_TYPES:
			return getUserTypes();
		case RefPackage.REF_MODEL__RESOURCE_TYPES:
			return getResourceTypes();
		case RefPackage.REF_MODEL__CONTEXT_TYPES:
			return getContextTypes();
		case RefPackage.REF_MODEL__RESOURCE_RELATIONS:
			return getResourceRelations();
		case RefPackage.REF_MODEL__FEEDBACK_TYPES:
			return getFeedbackTypes();
		case RefPackage.REF_MODEL__FEEDBACK_DEFINITIONS:
			return getFeedbackDefinitions();
		case RefPackage.REF_MODEL__AUTHORIZATION_RULES:
			return getAuthorizationRules();
		case RefPackage.REF_MODEL__VALIDATION_RULES:
			return getValidationRules();
		case RefPackage.REF_MODEL__MODERATION_POLICIES:
			return getModerationPolicies();
		case RefPackage.REF_MODEL__AUTOMATION_RULES:
			return getAutomationRules();
		case RefPackage.REF_MODEL__VERIFICATION_POLICIES:
			return getVerificationPolicies();
		case RefPackage.REF_MODEL__SORTING_POLICIES:
			return getSortingPolicies();
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
		case RefPackage.REF_MODEL__NAME:
			setName((String) newValue);
			return;
		case RefPackage.REF_MODEL__VERSION:
			setVersion((String) newValue);
			return;
		case RefPackage.REF_MODEL__USER_TYPES:
			getUserTypes().clear();
			getUserTypes().addAll((Collection<? extends UserType>) newValue);
			return;
		case RefPackage.REF_MODEL__RESOURCE_TYPES:
			getResourceTypes().clear();
			getResourceTypes().addAll((Collection<? extends ResourceType>) newValue);
			return;
		case RefPackage.REF_MODEL__CONTEXT_TYPES:
			getContextTypes().clear();
			getContextTypes().addAll((Collection<? extends ContextType>) newValue);
			return;
		case RefPackage.REF_MODEL__RESOURCE_RELATIONS:
			getResourceRelations().clear();
			getResourceRelations().addAll((Collection<? extends ResourceRelation>) newValue);
			return;
		case RefPackage.REF_MODEL__FEEDBACK_TYPES:
			getFeedbackTypes().clear();
			getFeedbackTypes().addAll((Collection<? extends FeedbackType>) newValue);
			return;
		case RefPackage.REF_MODEL__FEEDBACK_DEFINITIONS:
			getFeedbackDefinitions().clear();
			getFeedbackDefinitions().addAll((Collection<? extends FeedbackDefinition>) newValue);
			return;
		case RefPackage.REF_MODEL__AUTHORIZATION_RULES:
			getAuthorizationRules().clear();
			getAuthorizationRules().addAll((Collection<? extends AuthorizationRule>) newValue);
			return;
		case RefPackage.REF_MODEL__VALIDATION_RULES:
			getValidationRules().clear();
			getValidationRules().addAll((Collection<? extends ValidationRule>) newValue);
			return;
		case RefPackage.REF_MODEL__MODERATION_POLICIES:
			getModerationPolicies().clear();
			getModerationPolicies().addAll((Collection<? extends ModerationPolicy>) newValue);
			return;
		case RefPackage.REF_MODEL__AUTOMATION_RULES:
			getAutomationRules().clear();
			getAutomationRules().addAll((Collection<? extends AutomationRule>) newValue);
			return;
		case RefPackage.REF_MODEL__VERIFICATION_POLICIES:
			getVerificationPolicies().clear();
			getVerificationPolicies().addAll((Collection<? extends VerificationPolicy>) newValue);
			return;
		case RefPackage.REF_MODEL__SORTING_POLICIES:
			getSortingPolicies().clear();
			getSortingPolicies().addAll((Collection<? extends SortingPolicy>) newValue);
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
		case RefPackage.REF_MODEL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case RefPackage.REF_MODEL__VERSION:
			setVersion(VERSION_EDEFAULT);
			return;
		case RefPackage.REF_MODEL__USER_TYPES:
			getUserTypes().clear();
			return;
		case RefPackage.REF_MODEL__RESOURCE_TYPES:
			getResourceTypes().clear();
			return;
		case RefPackage.REF_MODEL__CONTEXT_TYPES:
			getContextTypes().clear();
			return;
		case RefPackage.REF_MODEL__RESOURCE_RELATIONS:
			getResourceRelations().clear();
			return;
		case RefPackage.REF_MODEL__FEEDBACK_TYPES:
			getFeedbackTypes().clear();
			return;
		case RefPackage.REF_MODEL__FEEDBACK_DEFINITIONS:
			getFeedbackDefinitions().clear();
			return;
		case RefPackage.REF_MODEL__AUTHORIZATION_RULES:
			getAuthorizationRules().clear();
			return;
		case RefPackage.REF_MODEL__VALIDATION_RULES:
			getValidationRules().clear();
			return;
		case RefPackage.REF_MODEL__MODERATION_POLICIES:
			getModerationPolicies().clear();
			return;
		case RefPackage.REF_MODEL__AUTOMATION_RULES:
			getAutomationRules().clear();
			return;
		case RefPackage.REF_MODEL__VERIFICATION_POLICIES:
			getVerificationPolicies().clear();
			return;
		case RefPackage.REF_MODEL__SORTING_POLICIES:
			getSortingPolicies().clear();
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
		case RefPackage.REF_MODEL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case RefPackage.REF_MODEL__VERSION:
			return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
		case RefPackage.REF_MODEL__USER_TYPES:
			return userTypes != null && !userTypes.isEmpty();
		case RefPackage.REF_MODEL__RESOURCE_TYPES:
			return resourceTypes != null && !resourceTypes.isEmpty();
		case RefPackage.REF_MODEL__CONTEXT_TYPES:
			return contextTypes != null && !contextTypes.isEmpty();
		case RefPackage.REF_MODEL__RESOURCE_RELATIONS:
			return resourceRelations != null && !resourceRelations.isEmpty();
		case RefPackage.REF_MODEL__FEEDBACK_TYPES:
			return feedbackTypes != null && !feedbackTypes.isEmpty();
		case RefPackage.REF_MODEL__FEEDBACK_DEFINITIONS:
			return feedbackDefinitions != null && !feedbackDefinitions.isEmpty();
		case RefPackage.REF_MODEL__AUTHORIZATION_RULES:
			return authorizationRules != null && !authorizationRules.isEmpty();
		case RefPackage.REF_MODEL__VALIDATION_RULES:
			return validationRules != null && !validationRules.isEmpty();
		case RefPackage.REF_MODEL__MODERATION_POLICIES:
			return moderationPolicies != null && !moderationPolicies.isEmpty();
		case RefPackage.REF_MODEL__AUTOMATION_RULES:
			return automationRules != null && !automationRules.isEmpty();
		case RefPackage.REF_MODEL__VERIFICATION_POLICIES:
			return verificationPolicies != null && !verificationPolicies.isEmpty();
		case RefPackage.REF_MODEL__SORTING_POLICIES:
			return sortingPolicies != null && !sortingPolicies.isEmpty();
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
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //RefModelImpl
