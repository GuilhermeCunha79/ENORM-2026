/**
 */
package pt.isep.enorm.ref.ref.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pt.isep.enorm.ref.ref.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RefFactoryImpl extends EFactoryImpl implements RefFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RefFactory init() {
		try {
			RefFactory theRefFactory = (RefFactory) EPackage.Registry.INSTANCE.getEFactory(RefPackage.eNS_URI);
			if (theRefFactory != null) {
				return theRefFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RefFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case RefPackage.REF_MODEL:
			return createRefModel();
		case RefPackage.USER_TYPE:
			return createUserType();
		case RefPackage.CONTEXT_TYPE:
			return createContextType();
		case RefPackage.RESOURCE_TYPE:
			return createResourceType();
		case RefPackage.ATTRIBUTE:
			return createAttribute();
		case RefPackage.RESOURCE_RELATION:
			return createResourceRelation();
		case RefPackage.FEEDBACK_TYPE:
			return createFeedbackType();
		case RefPackage.FEEDBACK_POLICY:
			return createFeedbackPolicy();
		case RefPackage.RATING_POLICY:
			return createRatingPolicy();
		case RefPackage.FEEDBACK_DEFINITION:
			return createFeedbackDefinition();
		case RefPackage.VALIDATION_RULE:
			return createValidationRule();
		case RefPackage.MODERATION_POLICY:
			return createModerationPolicy();
		case RefPackage.AUTHORIZATION_RULE:
			return createAuthorizationRule();
		case RefPackage.AUTOMATION_RULE:
			return createAutomationRule();
		case RefPackage.CONDITION:
			return createCondition();
		case RefPackage.CONDITION_VALUE:
			return createConditionValue();
		case RefPackage.ACTION:
			return createAction();
		case RefPackage.VERIFICATION_POLICY:
			return createVerificationPolicy();
		case RefPackage.SORTING_POLICY:
			return createSortingPolicy();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case RefPackage.USER_KIND:
			return createUserKindFromString(eDataType, initialValue);
		case RefPackage.CONTEXT_KIND:
			return createContextKindFromString(eDataType, initialValue);
		case RefPackage.PRIMITIVE_TYPE:
			return createPrimitiveTypeFromString(eDataType, initialValue);
		case RefPackage.FEEDBACK_KIND:
			return createFeedbackKindFromString(eDataType, initialValue);
		case RefPackage.FEEDBACK_SUBJECT_SCOPE:
			return createFeedbackSubjectScopeFromString(eDataType, initialValue);
		case RefPackage.FEEDBACK_POLARITY:
			return createFeedbackPolarityFromString(eDataType, initialValue);
		case RefPackage.FEEDBACK_STATUS:
			return createFeedbackStatusFromString(eDataType, initialValue);
		case RefPackage.VERIFICATION_REQUIREMENT:
			return createVerificationRequirementFromString(eDataType, initialValue);
		case RefPackage.VALIDATION_KIND:
			return createValidationKindFromString(eDataType, initialValue);
		case RefPackage.RULE_SEVERITY:
			return createRuleSeverityFromString(eDataType, initialValue);
		case RefPackage.MODERATION_MODE:
			return createModerationModeFromString(eDataType, initialValue);
		case RefPackage.MODERATION_DECISION:
			return createModerationDecisionFromString(eDataType, initialValue);
		case RefPackage.ACTION_KIND:
			return createActionKindFromString(eDataType, initialValue);
		case RefPackage.TRIGGER_EVENT:
			return createTriggerEventFromString(eDataType, initialValue);
		case RefPackage.CONDITION_OPERATOR:
			return createConditionOperatorFromString(eDataType, initialValue);
		case RefPackage.ACTION_RESULT_KIND:
			return createActionResultKindFromString(eDataType, initialValue);
		case RefPackage.SORT_CRITERION:
			return createSortCriterionFromString(eDataType, initialValue);
		case RefPackage.SORT_DIRECTION:
			return createSortDirectionFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case RefPackage.USER_KIND:
			return convertUserKindToString(eDataType, instanceValue);
		case RefPackage.CONTEXT_KIND:
			return convertContextKindToString(eDataType, instanceValue);
		case RefPackage.PRIMITIVE_TYPE:
			return convertPrimitiveTypeToString(eDataType, instanceValue);
		case RefPackage.FEEDBACK_KIND:
			return convertFeedbackKindToString(eDataType, instanceValue);
		case RefPackage.FEEDBACK_SUBJECT_SCOPE:
			return convertFeedbackSubjectScopeToString(eDataType, instanceValue);
		case RefPackage.FEEDBACK_POLARITY:
			return convertFeedbackPolarityToString(eDataType, instanceValue);
		case RefPackage.FEEDBACK_STATUS:
			return convertFeedbackStatusToString(eDataType, instanceValue);
		case RefPackage.VERIFICATION_REQUIREMENT:
			return convertVerificationRequirementToString(eDataType, instanceValue);
		case RefPackage.VALIDATION_KIND:
			return convertValidationKindToString(eDataType, instanceValue);
		case RefPackage.RULE_SEVERITY:
			return convertRuleSeverityToString(eDataType, instanceValue);
		case RefPackage.MODERATION_MODE:
			return convertModerationModeToString(eDataType, instanceValue);
		case RefPackage.MODERATION_DECISION:
			return convertModerationDecisionToString(eDataType, instanceValue);
		case RefPackage.ACTION_KIND:
			return convertActionKindToString(eDataType, instanceValue);
		case RefPackage.TRIGGER_EVENT:
			return convertTriggerEventToString(eDataType, instanceValue);
		case RefPackage.CONDITION_OPERATOR:
			return convertConditionOperatorToString(eDataType, instanceValue);
		case RefPackage.ACTION_RESULT_KIND:
			return convertActionResultKindToString(eDataType, instanceValue);
		case RefPackage.SORT_CRITERION:
			return convertSortCriterionToString(eDataType, instanceValue);
		case RefPackage.SORT_DIRECTION:
			return convertSortDirectionToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefModel createRefModel() {
		RefModelImpl refModel = new RefModelImpl();
		return refModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserType createUserType() {
		UserTypeImpl userType = new UserTypeImpl();
		return userType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextType createContextType() {
		ContextTypeImpl contextType = new ContextTypeImpl();
		return contextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceType createResourceType() {
		ResourceTypeImpl resourceType = new ResourceTypeImpl();
		return resourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceRelation createResourceRelation() {
		ResourceRelationImpl resourceRelation = new ResourceRelationImpl();
		return resourceRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeedbackType createFeedbackType() {
		FeedbackTypeImpl feedbackType = new FeedbackTypeImpl();
		return feedbackType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeedbackPolicy createFeedbackPolicy() {
		FeedbackPolicyImpl feedbackPolicy = new FeedbackPolicyImpl();
		return feedbackPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RatingPolicy createRatingPolicy() {
		RatingPolicyImpl ratingPolicy = new RatingPolicyImpl();
		return ratingPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeedbackDefinition createFeedbackDefinition() {
		FeedbackDefinitionImpl feedbackDefinition = new FeedbackDefinitionImpl();
		return feedbackDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionValue createConditionValue() {
		ConditionValueImpl conditionValue = new ConditionValueImpl();
		return conditionValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SortingPolicy createSortingPolicy() {
		SortingPolicyImpl sortingPolicy = new SortingPolicyImpl();
		return sortingPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidationRule createValidationRule() {
		ValidationRuleImpl validationRule = new ValidationRuleImpl();
		return validationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModerationPolicy createModerationPolicy() {
		ModerationPolicyImpl moderationPolicy = new ModerationPolicyImpl();
		return moderationPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthorizationRule createAuthorizationRule() {
		AuthorizationRuleImpl authorizationRule = new AuthorizationRuleImpl();
		return authorizationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AutomationRule createAutomationRule() {
		AutomationRuleImpl automationRule = new AutomationRuleImpl();
		return automationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerificationPolicy createVerificationPolicy() {
		VerificationPolicyImpl verificationPolicy = new VerificationPolicyImpl();
		return verificationPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserKind createUserKindFromString(EDataType eDataType, String initialValue) {
		UserKind result = UserKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUserKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextKind createContextKindFromString(EDataType eDataType, String initialValue) {
		ContextKind result = ContextKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContextKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType createPrimitiveTypeFromString(EDataType eDataType, String initialValue) {
		PrimitiveType result = PrimitiveType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrimitiveTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackKind createFeedbackKindFromString(EDataType eDataType, String initialValue) {
		FeedbackKind result = FeedbackKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFeedbackKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackSubjectScope createFeedbackSubjectScopeFromString(EDataType eDataType, String initialValue) {
		FeedbackSubjectScope result = FeedbackSubjectScope.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFeedbackSubjectScopeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackStatus createFeedbackStatusFromString(EDataType eDataType, String initialValue) {
		FeedbackStatus result = FeedbackStatus.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFeedbackStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackPolarity createFeedbackPolarityFromString(EDataType eDataType, String initialValue) {
		FeedbackPolarity result = FeedbackPolarity.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFeedbackPolarityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerificationRequirement createVerificationRequirementFromString(EDataType eDataType, String initialValue) {
		VerificationRequirement result = VerificationRequirement.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVerificationRequirementToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidationKind createValidationKindFromString(EDataType eDataType, String initialValue) {
		ValidationKind result = ValidationKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValidationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleSeverity createRuleSeverityFromString(EDataType eDataType, String initialValue) {
		RuleSeverity result = RuleSeverity.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRuleSeverityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModerationMode createModerationModeFromString(EDataType eDataType, String initialValue) {
		ModerationMode result = ModerationMode.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModerationModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModerationDecision createModerationDecisionFromString(EDataType eDataType, String initialValue) {
		ModerationDecision result = ModerationDecision.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModerationDecisionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionKind createActionKindFromString(EDataType eDataType, String initialValue) {
		ActionKind result = ActionKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerEvent createTriggerEventFromString(EDataType eDataType, String initialValue) {
		TriggerEvent result = TriggerEvent.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTriggerEventToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionOperator createConditionOperatorFromString(EDataType eDataType, String initialValue) {
		ConditionOperator result = ConditionOperator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionResultKind createActionResultKindFromString(EDataType eDataType, String initialValue) {
		ActionResultKind result = ActionResultKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionResultKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortCriterion createSortCriterionFromString(EDataType eDataType, String initialValue) {
		SortCriterion result = SortCriterion.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSortCriterionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortDirection createSortDirectionFromString(EDataType eDataType, String initialValue) {
		SortDirection result = SortDirection.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSortDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefPackage getRefPackage() {
		return (RefPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RefPackage getPackage() {
		return RefPackage.eINSTANCE;
	}

} //RefFactoryImpl
