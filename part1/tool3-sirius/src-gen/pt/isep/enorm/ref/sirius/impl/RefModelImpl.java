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

import pt.isep.enorm.ref.sirius.AutomationRule;
import pt.isep.enorm.ref.sirius.ContextType;
import pt.isep.enorm.ref.sirius.EvolutionRule;
import pt.isep.enorm.ref.sirius.FeedbackDefinition;
import pt.isep.enorm.ref.sirius.FeedbackPolicy;
import pt.isep.enorm.ref.sirius.FeedbackType;
import pt.isep.enorm.ref.sirius.ModerationPolicy;
import pt.isep.enorm.ref.sirius.RatingPolicy;
import pt.isep.enorm.ref.sirius.RefModel;
import pt.isep.enorm.ref.sirius.RefactoringOperation;
import pt.isep.enorm.ref.sirius.ResourceRelation;
import pt.isep.enorm.ref.sirius.ResourceType;
import pt.isep.enorm.ref.sirius.SiriusPackage;
import pt.isep.enorm.ref.sirius.UserType;
import pt.isep.enorm.ref.sirius.ValidationRule;
import pt.isep.enorm.ref.sirius.VerificationPolicy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.enorm.ref.sirius.impl.RefModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.impl.RefModelImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.impl.RefModelImpl#getUserTypes <em>User Types</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.impl.RefModelImpl#getResourceTypes <em>Resource Types</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.impl.RefModelImpl#getFeedbackPolicies <em>Feedback Policies</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.impl.RefModelImpl#getContextTypes <em>Context Types</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.impl.RefModelImpl#getResourceRelations <em>Resource Relations</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.impl.RefModelImpl#getFeedbackTypes <em>Feedback Types</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.impl.RefModelImpl#getFeedbackDefinitions <em>Feedback Definitions</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.impl.RefModelImpl#getRatingPolicies <em>Rating Policies</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.impl.RefModelImpl#getValidationRules <em>Validation Rules</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.impl.RefModelImpl#getModerationPolicies <em>Moderation Policies</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.impl.RefModelImpl#getAutomationRules <em>Automation Rules</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.impl.RefModelImpl#getVerificationPolicies <em>Verification Policies</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.impl.RefModelImpl#getEvolutionRules <em>Evolution Rules</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.impl.RefModelImpl#getRefactoringOperations <em>Refactoring Operations</em>}</li>
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
	 * The cached value of the '{@link #getFeedbackPolicies() <em>Feedback Policies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedbackPolicies()
	 * @generated
	 * @ordered
	 */
	protected EList<FeedbackPolicy> feedbackPolicies;

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
	 * The cached value of the '{@link #getRatingPolicies() <em>Rating Policies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatingPolicies()
	 * @generated
	 * @ordered
	 */
	protected EList<RatingPolicy> ratingPolicies;

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
	 * The cached value of the '{@link #getEvolutionRules() <em>Evolution Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvolutionRules()
	 * @generated
	 * @ordered
	 */
	protected EList<EvolutionRule> evolutionRules;

	/**
	 * The cached value of the '{@link #getRefactoringOperations() <em>Refactoring Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefactoringOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<RefactoringOperation> refactoringOperations;

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
		return SiriusPackage.Literals.REF_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SiriusPackage.REF_MODEL__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SiriusPackage.REF_MODEL__VERSION, oldVersion,
					version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UserType> getUserTypes() {
		if (userTypes == null) {
			userTypes = new EObjectContainmentEList<UserType>(UserType.class, this,
					SiriusPackage.REF_MODEL__USER_TYPES);
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
					SiriusPackage.REF_MODEL__RESOURCE_TYPES);
		}
		return resourceTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FeedbackPolicy> getFeedbackPolicies() {
		if (feedbackPolicies == null) {
			feedbackPolicies = new EObjectContainmentEList<FeedbackPolicy>(FeedbackPolicy.class, this,
					SiriusPackage.REF_MODEL__FEEDBACK_POLICIES);
		}
		return feedbackPolicies;
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
					SiriusPackage.REF_MODEL__CONTEXT_TYPES);
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
					SiriusPackage.REF_MODEL__RESOURCE_RELATIONS);
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
					SiriusPackage.REF_MODEL__FEEDBACK_TYPES);
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
					SiriusPackage.REF_MODEL__FEEDBACK_DEFINITIONS);
		}
		return feedbackDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RatingPolicy> getRatingPolicies() {
		if (ratingPolicies == null) {
			ratingPolicies = new EObjectContainmentEList<RatingPolicy>(RatingPolicy.class, this,
					SiriusPackage.REF_MODEL__RATING_POLICIES);
		}
		return ratingPolicies;
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
					SiriusPackage.REF_MODEL__VALIDATION_RULES);
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
					SiriusPackage.REF_MODEL__MODERATION_POLICIES);
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
					SiriusPackage.REF_MODEL__AUTOMATION_RULES);
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
					SiriusPackage.REF_MODEL__VERIFICATION_POLICIES);
		}
		return verificationPolicies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EvolutionRule> getEvolutionRules() {
		if (evolutionRules == null) {
			evolutionRules = new EObjectContainmentEList<EvolutionRule>(EvolutionRule.class, this,
					SiriusPackage.REF_MODEL__EVOLUTION_RULES);
		}
		return evolutionRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RefactoringOperation> getRefactoringOperations() {
		if (refactoringOperations == null) {
			refactoringOperations = new EObjectContainmentEList<RefactoringOperation>(RefactoringOperation.class, this,
					SiriusPackage.REF_MODEL__REFACTORING_OPERATIONS);
		}
		return refactoringOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SiriusPackage.REF_MODEL__USER_TYPES:
			return ((InternalEList<?>) getUserTypes()).basicRemove(otherEnd, msgs);
		case SiriusPackage.REF_MODEL__RESOURCE_TYPES:
			return ((InternalEList<?>) getResourceTypes()).basicRemove(otherEnd, msgs);
		case SiriusPackage.REF_MODEL__FEEDBACK_POLICIES:
			return ((InternalEList<?>) getFeedbackPolicies()).basicRemove(otherEnd, msgs);
		case SiriusPackage.REF_MODEL__CONTEXT_TYPES:
			return ((InternalEList<?>) getContextTypes()).basicRemove(otherEnd, msgs);
		case SiriusPackage.REF_MODEL__RESOURCE_RELATIONS:
			return ((InternalEList<?>) getResourceRelations()).basicRemove(otherEnd, msgs);
		case SiriusPackage.REF_MODEL__FEEDBACK_TYPES:
			return ((InternalEList<?>) getFeedbackTypes()).basicRemove(otherEnd, msgs);
		case SiriusPackage.REF_MODEL__FEEDBACK_DEFINITIONS:
			return ((InternalEList<?>) getFeedbackDefinitions()).basicRemove(otherEnd, msgs);
		case SiriusPackage.REF_MODEL__RATING_POLICIES:
			return ((InternalEList<?>) getRatingPolicies()).basicRemove(otherEnd, msgs);
		case SiriusPackage.REF_MODEL__VALIDATION_RULES:
			return ((InternalEList<?>) getValidationRules()).basicRemove(otherEnd, msgs);
		case SiriusPackage.REF_MODEL__MODERATION_POLICIES:
			return ((InternalEList<?>) getModerationPolicies()).basicRemove(otherEnd, msgs);
		case SiriusPackage.REF_MODEL__AUTOMATION_RULES:
			return ((InternalEList<?>) getAutomationRules()).basicRemove(otherEnd, msgs);
		case SiriusPackage.REF_MODEL__VERIFICATION_POLICIES:
			return ((InternalEList<?>) getVerificationPolicies()).basicRemove(otherEnd, msgs);
		case SiriusPackage.REF_MODEL__EVOLUTION_RULES:
			return ((InternalEList<?>) getEvolutionRules()).basicRemove(otherEnd, msgs);
		case SiriusPackage.REF_MODEL__REFACTORING_OPERATIONS:
			return ((InternalEList<?>) getRefactoringOperations()).basicRemove(otherEnd, msgs);
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
		case SiriusPackage.REF_MODEL__NAME:
			return getName();
		case SiriusPackage.REF_MODEL__VERSION:
			return getVersion();
		case SiriusPackage.REF_MODEL__USER_TYPES:
			return getUserTypes();
		case SiriusPackage.REF_MODEL__RESOURCE_TYPES:
			return getResourceTypes();
		case SiriusPackage.REF_MODEL__FEEDBACK_POLICIES:
			return getFeedbackPolicies();
		case SiriusPackage.REF_MODEL__CONTEXT_TYPES:
			return getContextTypes();
		case SiriusPackage.REF_MODEL__RESOURCE_RELATIONS:
			return getResourceRelations();
		case SiriusPackage.REF_MODEL__FEEDBACK_TYPES:
			return getFeedbackTypes();
		case SiriusPackage.REF_MODEL__FEEDBACK_DEFINITIONS:
			return getFeedbackDefinitions();
		case SiriusPackage.REF_MODEL__RATING_POLICIES:
			return getRatingPolicies();
		case SiriusPackage.REF_MODEL__VALIDATION_RULES:
			return getValidationRules();
		case SiriusPackage.REF_MODEL__MODERATION_POLICIES:
			return getModerationPolicies();
		case SiriusPackage.REF_MODEL__AUTOMATION_RULES:
			return getAutomationRules();
		case SiriusPackage.REF_MODEL__VERIFICATION_POLICIES:
			return getVerificationPolicies();
		case SiriusPackage.REF_MODEL__EVOLUTION_RULES:
			return getEvolutionRules();
		case SiriusPackage.REF_MODEL__REFACTORING_OPERATIONS:
			return getRefactoringOperations();
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
		case SiriusPackage.REF_MODEL__NAME:
			setName((String) newValue);
			return;
		case SiriusPackage.REF_MODEL__VERSION:
			setVersion((String) newValue);
			return;
		case SiriusPackage.REF_MODEL__USER_TYPES:
			getUserTypes().clear();
			getUserTypes().addAll((Collection<? extends UserType>) newValue);
			return;
		case SiriusPackage.REF_MODEL__RESOURCE_TYPES:
			getResourceTypes().clear();
			getResourceTypes().addAll((Collection<? extends ResourceType>) newValue);
			return;
		case SiriusPackage.REF_MODEL__FEEDBACK_POLICIES:
			getFeedbackPolicies().clear();
			getFeedbackPolicies().addAll((Collection<? extends FeedbackPolicy>) newValue);
			return;
		case SiriusPackage.REF_MODEL__CONTEXT_TYPES:
			getContextTypes().clear();
			getContextTypes().addAll((Collection<? extends ContextType>) newValue);
			return;
		case SiriusPackage.REF_MODEL__RESOURCE_RELATIONS:
			getResourceRelations().clear();
			getResourceRelations().addAll((Collection<? extends ResourceRelation>) newValue);
			return;
		case SiriusPackage.REF_MODEL__FEEDBACK_TYPES:
			getFeedbackTypes().clear();
			getFeedbackTypes().addAll((Collection<? extends FeedbackType>) newValue);
			return;
		case SiriusPackage.REF_MODEL__FEEDBACK_DEFINITIONS:
			getFeedbackDefinitions().clear();
			getFeedbackDefinitions().addAll((Collection<? extends FeedbackDefinition>) newValue);
			return;
		case SiriusPackage.REF_MODEL__RATING_POLICIES:
			getRatingPolicies().clear();
			getRatingPolicies().addAll((Collection<? extends RatingPolicy>) newValue);
			return;
		case SiriusPackage.REF_MODEL__VALIDATION_RULES:
			getValidationRules().clear();
			getValidationRules().addAll((Collection<? extends ValidationRule>) newValue);
			return;
		case SiriusPackage.REF_MODEL__MODERATION_POLICIES:
			getModerationPolicies().clear();
			getModerationPolicies().addAll((Collection<? extends ModerationPolicy>) newValue);
			return;
		case SiriusPackage.REF_MODEL__AUTOMATION_RULES:
			getAutomationRules().clear();
			getAutomationRules().addAll((Collection<? extends AutomationRule>) newValue);
			return;
		case SiriusPackage.REF_MODEL__VERIFICATION_POLICIES:
			getVerificationPolicies().clear();
			getVerificationPolicies().addAll((Collection<? extends VerificationPolicy>) newValue);
			return;
		case SiriusPackage.REF_MODEL__EVOLUTION_RULES:
			getEvolutionRules().clear();
			getEvolutionRules().addAll((Collection<? extends EvolutionRule>) newValue);
			return;
		case SiriusPackage.REF_MODEL__REFACTORING_OPERATIONS:
			getRefactoringOperations().clear();
			getRefactoringOperations().addAll((Collection<? extends RefactoringOperation>) newValue);
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
		case SiriusPackage.REF_MODEL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SiriusPackage.REF_MODEL__VERSION:
			setVersion(VERSION_EDEFAULT);
			return;
		case SiriusPackage.REF_MODEL__USER_TYPES:
			getUserTypes().clear();
			return;
		case SiriusPackage.REF_MODEL__RESOURCE_TYPES:
			getResourceTypes().clear();
			return;
		case SiriusPackage.REF_MODEL__FEEDBACK_POLICIES:
			getFeedbackPolicies().clear();
			return;
		case SiriusPackage.REF_MODEL__CONTEXT_TYPES:
			getContextTypes().clear();
			return;
		case SiriusPackage.REF_MODEL__RESOURCE_RELATIONS:
			getResourceRelations().clear();
			return;
		case SiriusPackage.REF_MODEL__FEEDBACK_TYPES:
			getFeedbackTypes().clear();
			return;
		case SiriusPackage.REF_MODEL__FEEDBACK_DEFINITIONS:
			getFeedbackDefinitions().clear();
			return;
		case SiriusPackage.REF_MODEL__RATING_POLICIES:
			getRatingPolicies().clear();
			return;
		case SiriusPackage.REF_MODEL__VALIDATION_RULES:
			getValidationRules().clear();
			return;
		case SiriusPackage.REF_MODEL__MODERATION_POLICIES:
			getModerationPolicies().clear();
			return;
		case SiriusPackage.REF_MODEL__AUTOMATION_RULES:
			getAutomationRules().clear();
			return;
		case SiriusPackage.REF_MODEL__VERIFICATION_POLICIES:
			getVerificationPolicies().clear();
			return;
		case SiriusPackage.REF_MODEL__EVOLUTION_RULES:
			getEvolutionRules().clear();
			return;
		case SiriusPackage.REF_MODEL__REFACTORING_OPERATIONS:
			getRefactoringOperations().clear();
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
		case SiriusPackage.REF_MODEL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SiriusPackage.REF_MODEL__VERSION:
			return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
		case SiriusPackage.REF_MODEL__USER_TYPES:
			return userTypes != null && !userTypes.isEmpty();
		case SiriusPackage.REF_MODEL__RESOURCE_TYPES:
			return resourceTypes != null && !resourceTypes.isEmpty();
		case SiriusPackage.REF_MODEL__FEEDBACK_POLICIES:
			return feedbackPolicies != null && !feedbackPolicies.isEmpty();
		case SiriusPackage.REF_MODEL__CONTEXT_TYPES:
			return contextTypes != null && !contextTypes.isEmpty();
		case SiriusPackage.REF_MODEL__RESOURCE_RELATIONS:
			return resourceRelations != null && !resourceRelations.isEmpty();
		case SiriusPackage.REF_MODEL__FEEDBACK_TYPES:
			return feedbackTypes != null && !feedbackTypes.isEmpty();
		case SiriusPackage.REF_MODEL__FEEDBACK_DEFINITIONS:
			return feedbackDefinitions != null && !feedbackDefinitions.isEmpty();
		case SiriusPackage.REF_MODEL__RATING_POLICIES:
			return ratingPolicies != null && !ratingPolicies.isEmpty();
		case SiriusPackage.REF_MODEL__VALIDATION_RULES:
			return validationRules != null && !validationRules.isEmpty();
		case SiriusPackage.REF_MODEL__MODERATION_POLICIES:
			return moderationPolicies != null && !moderationPolicies.isEmpty();
		case SiriusPackage.REF_MODEL__AUTOMATION_RULES:
			return automationRules != null && !automationRules.isEmpty();
		case SiriusPackage.REF_MODEL__VERIFICATION_POLICIES:
			return verificationPolicies != null && !verificationPolicies.isEmpty();
		case SiriusPackage.REF_MODEL__EVOLUTION_RULES:
			return evolutionRules != null && !evolutionRules.isEmpty();
		case SiriusPackage.REF_MODEL__REFACTORING_OPERATIONS:
			return refactoringOperations != null && !refactoringOperations.isEmpty();
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
