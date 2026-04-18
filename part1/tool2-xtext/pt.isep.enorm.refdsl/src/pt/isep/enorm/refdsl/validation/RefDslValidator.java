/*
 * Validation aligned with diagrams/metamodel/Metamodel_Constraints.md (Activity 5).
 * After changing RefDsl.xtext, run GenerateRefDsl.mwe2 → MWE2 Workflow, then Clean projects.
 */
package pt.isep.enorm.refdsl.validation;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;

import pt.isep.enorm.refdsl.refDsl.Attribute;
import pt.isep.enorm.refdsl.refDsl.AuthorizationRule;
import pt.isep.enorm.refdsl.refDsl.AutomationRule;
import pt.isep.enorm.refdsl.refDsl.ContextType;
import pt.isep.enorm.refdsl.refDsl.FeedbackDefinition;
import pt.isep.enorm.refdsl.refDsl.FeedbackKind;
import pt.isep.enorm.refdsl.refDsl.FeedbackSubjectScope;
import pt.isep.enorm.refdsl.refDsl.FeedbackType;
import pt.isep.enorm.refdsl.refDsl.ModerationMode;
import pt.isep.enorm.refdsl.refDsl.ModerationPolicy;
import pt.isep.enorm.refdsl.refDsl.RatingPolicy;
import pt.isep.enorm.refdsl.refDsl.RefModel;
import pt.isep.enorm.refdsl.refDsl.RefDslPackage;
import pt.isep.enorm.refdsl.refDsl.ResourceRelation;
import pt.isep.enorm.refdsl.refDsl.ResourceType;
import pt.isep.enorm.refdsl.refDsl.UserType;
import pt.isep.enorm.refdsl.refDsl.ValidationKind;
import pt.isep.enorm.refdsl.refDsl.ValidationRule;
import pt.isep.enorm.refdsl.refDsl.VerificationPolicy;

public class RefDslValidator extends AbstractRefDslValidator {

	private static final Pattern SEMVER = Pattern.compile("[0-9]+\\.[0-9]+\\.[0-9]+");

	public static final String INVALID_REF_MODEL_NAME_EMPTY = "invalidRefModelNameEmpty";
	public static final String INVALID_REF_MODEL_NAME = "invalidRefModelName";
	public static final String INVALID_REF_MODEL_NAME_LENGTH = "invalidRefModelNameLength";
	public static final String INVALID_REF_MODEL_VERSION_SEMVER = "invalidRefModelVersionSemver";

	public static final String INVALID_USER_TYPE_NAME = "invalidUserTypeName";
	public static final String INVALID_USER_TYPE_NAME_DUPLICATE = "invalidUserTypeNameDuplicate";
	public static final String INVALID_USER_TYPE_SUPERTYPES_SELF = "invalidUserTypeSuperTypesSelf";
	public static final String INVALID_USER_TYPE_SUPERTYPES_CYCLE = "invalidUserTypeSuperTypesCycle";

	public static final String INVALID_CONTEXT_TYPE_NAME = "invalidContextTypeName";
	public static final String INVALID_CONTEXT_TYPE_NAME_DUPLICATE = "invalidContextTypeNameDuplicate";

	public static final String INVALID_RESOURCE_TYPE_NAME = "invalidResourceTypeName";
	public static final String INVALID_RESOURCE_TYPE_NAME_LENGTH = "invalidResourceTypeNameLength";
	public static final String INVALID_RESOURCE_TYPE_NAME_DUPLICATE = "invalidResourceTypeNameDuplicate";
	public static final String INVALID_RESOURCE_TYPE_SUPERTYPES_SELF = "invalidResourceTypeSuperTypesSelf";
	public static final String INVALID_RESOURCE_TYPE_SUPERTYPES_CYCLE = "invalidResourceTypeSuperTypesCycle";

	public static final String INVALID_ATTRIBUTE_NAME_DUPLICATE = "invalidAttributeNameDuplicate";
	public static final String INVALID_ATTRIBUTE_NAME_CASE = "invalidAttributeNameCase";

	public static final String INVALID_RESOURCE_RELATION_SAME_ENDS = "invalidResourceRelationSameEnds";
	public static final String INVALID_RESOURCE_RELATION_NAME_DUPLICATE = "invalidResourceRelationNameDuplicate";

	public static final String INVALID_FEEDBACK_TYPE_NAME = "invalidFeedbackTypeName";
	public static final String INVALID_FEEDBACK_TYPE_NAME_DUPLICATE = "invalidFeedbackTypeNameDuplicate";

	public static final String INVALID_FEEDBACK_DEFINITION_NAME = "invalidFeedbackDefinitionName";
	public static final String INVALID_FEEDBACK_DEFINITION_NAME_DUPLICATE = "invalidFeedbackDefinitionNameDuplicate";
	public static final String INVALID_FEEDBACK_DEFINITION_TARGETS = "invalidFeedbackDefinitionTargets";
	public static final String INVALID_FEEDBACK_DEFINITION_AUTHOR = "invalidFeedbackDefinitionAuthor";
	public static final String INVALID_FEEDBACK_DEFINITION_RATING = "invalidFeedbackDefinitionRating";
	public static final String INVALID_FEEDBACK_DEFINITION_SUBJECT_FEEDBACK_TYPE = "invalidFeedbackDefinitionSubjectFeedbackType";
	public static final String INVALID_FEEDBACK_DEFINITION_SUBJECT_FEEDBACK_SELF = "invalidFeedbackDefinitionSubjectFeedbackSelf";

	public static final String INVALID_RATING_MIN_MAX = "invalidRatingMinMax";
	public static final String INVALID_RATING_STEP_POSITIVE = "invalidRatingStepPositive";
	public static final String INVALID_RATING_STEP_DIVIDES = "invalidRatingStepDivides";

	public static final String INVALID_VALIDATION_RULE_TARGETS = "invalidValidationRuleTargets";
	public static final String INVALID_VALIDATION_RULE_NAME_DUPLICATE = "invalidValidationRuleNameDuplicate";
	public static final String INVALID_VALIDATION_RULE_NAME = "invalidValidationRuleName";
	public static final String INVALID_VALIDATION_RULE_IMPL_ID = "invalidValidationRuleImplId";
	public static final String INVALID_VALIDATION_RULE_EXPRESSION_AUTO = "invalidValidationRuleExpressionAuto";

	public static final String INVALID_MODERATION_POLICY_NAME_DUPLICATE = "invalidModerationPolicyNameDuplicate";
	public static final String INVALID_MODERATION_POLICY_EXECUTED_BY = "invalidModerationPolicyExecutedBy";
	public static final String INVALID_MODERATION_POLICY_TRIGGER_AUTO = "invalidModerationPolicyTriggerAuto";

	public static final String INVALID_AUTHORIZATION_ACTOR = "invalidAuthorizationActor";
	public static final String INVALID_AUTHORIZATION_TARGETS = "invalidAuthorizationTargets";

	public static final String INVALID_AUTOMATION_RULE_NAME_DUPLICATE = "invalidAutomationRuleNameDuplicate";
	public static final String INVALID_AUTOMATION_RULE_NAME = "invalidAutomationRuleName";
	public static final String INVALID_AUTOMATION_RULE_TRIGGER = "invalidAutomationRuleTrigger";
	public static final String INVALID_AUTOMATION_RULE_ACTION = "invalidAutomationRuleAction";

	public static final String INVALID_VERIFICATION_POLICY_NAME_DUPLICATE = "invalidVerificationPolicyNameDuplicate";
	public static final String INVALID_VERIFICATION_POLICY_VERIFIES = "invalidVerificationPolicyVerifies";

	public static final String MC_G1_RATING_REQUIRED = "mcG1RatingRequired";
	public static final String MC_G2_REVIEW_SCOPE = "mcG2ReviewScope";
	public static final String MC_G3_REACTION_VOTE = "mcG3ReactionVote";
	public static final String MC_G4_SUBSCRIPTION = "mcG4Subscription";
	public static final String MC_G5_RECURSIVE_SCOPE = "mcG5RecursiveScope";
	public static final String MC_G8_VERIFIED_CONTEXT = "mcG8VerifiedContext";
	public static final String MC_G9_UNIQUE_PER_AUTHOR = "mcG9UniquePerAuthor";
	public static final String MC_G10_AUTHZ_CONTEXT = "mcG10AuthzContext";
	public static final String MC_G11_MOD_CONTEXT = "mcG11ModContext";
	public static final String MC_G12_AUTO_CONTEXT = "mcG12AutoContext";

	// ——— RefModel C1.x ———

	@Check
	public void checkRefModelNameNotEmpty(RefModel model) {
		if (model.getName() == null || model.getName().trim().isEmpty()) {
			error("RefModel name must not be empty.", RefDslPackage.Literals.REF_MODEL__NAME, INVALID_REF_MODEL_NAME_EMPTY);
		}
	}

	@Check
	public void checkRefModelNameStartsWithUppercase(RefModel model) {
		String n = model.getName();
		if (n != null && !n.isEmpty() && !Character.isUpperCase(n.charAt(0))) {
			warning("RefModel name should start with uppercase.", RefDslPackage.Literals.REF_MODEL__NAME, INVALID_REF_MODEL_NAME);
		}
	}

	@Check
	public void checkRefModelNameLength(RefModel model) {
		String n = model.getName();
		if (n != null && n.length() > 0 && n.length() <= 2) {
			error("RefModel name must have more than 2 characters.", RefDslPackage.Literals.REF_MODEL__NAME,
					INVALID_REF_MODEL_NAME_LENGTH);
		}
	}

	@Check
	public void checkRefModelVersionSemver(RefModel model) {
		String v = model.getVersion();
		if (v != null && !v.isEmpty() && !SEMVER.matcher(v).matches()) {
			warning("Version should follow semantic versioning (e.g., 1.0.0).", RefDslPackage.Literals.REF_MODEL__VERSION,
					INVALID_REF_MODEL_VERSION_SEMVER);
		}
	}

	// ——— UserType C2.x ———

	@Check
	public void checkUserTypeNameStartsWithUppercase(UserType userType) {
		String n = userType.getName();
		if (n != null && !n.isEmpty() && !Character.isUpperCase(n.charAt(0))) {
			warning("UserType name should start with uppercase.", RefDslPackage.Literals.USER_TYPE__NAME, INVALID_USER_TYPE_NAME);
		}
	}

	@Check
	public void checkUserTypeNameUnique(UserType userType) {
		String name = userType.getName();
		if (name == null)
			return;
		RefModel root = root(userType);
		if (root == null)
			return;
		for (UserType o : root.getUserTypes()) {
			if (o != userType && name.equals(o.getName())) {
				error("UserType names must be unique within the model.", RefDslPackage.Literals.USER_TYPE__NAME,
						INVALID_USER_TYPE_NAME_DUPLICATE);
				return;
			}
		}
	}

	@Check
	public void checkUserTypeSuperTypesNoSelf(UserType userType) {
		if (userType.getSuperTypes() != null && userType.getSuperTypes().contains(userType)) {
			error("UserType cannot be its own supertype.", RefDslPackage.Literals.USER_TYPE__SUPER_TYPES,
					INVALID_USER_TYPE_SUPERTYPES_SELF);
		}
	}

	@Check
	public void checkUserTypeSuperTypesNoCycle(UserType userType) {
		if (userType.getSuperTypes() == null || userType.getSuperTypes().isEmpty())
			return;
		for (UserType parent : userType.getSuperTypes()) {
			if (parent == null)
				continue;
			Set<UserType> visited = new HashSet<>();
			if (hasUserCycle(parent, userType, visited)) {
				error("UserType superTypes must not form cycles.", RefDslPackage.Literals.USER_TYPE__SUPER_TYPES,
						INVALID_USER_TYPE_SUPERTYPES_CYCLE);
				return;
			}
		}
	}

	// ——— ContextType C2.5–C2.6 ———

	@Check
	public void checkContextTypeNameUppercase(ContextType ctx) {
		String n = ctx.getName();
		if (n != null && !n.isEmpty() && !Character.isUpperCase(n.charAt(0))) {
			warning("ContextType name should start with uppercase.", RefDslPackage.Literals.CONTEXT_TYPE__NAME,
					INVALID_CONTEXT_TYPE_NAME);
		}
	}

	@Check
	public void checkContextTypeNameUnique(ContextType ctx) {
		String name = ctx.getName();
		if (name == null)
			return;
		RefModel rm = root(ctx);
		if (rm == null)
			return;
		for (ContextType o : rm.getContextTypes()) {
			if (o != ctx && name.equals(o.getName())) {
				error("ContextType names must be unique within the model.", RefDslPackage.Literals.CONTEXT_TYPE__NAME,
						INVALID_CONTEXT_TYPE_NAME_DUPLICATE);
				return;
			}
		}
	}

	// ——— ResourceType C3.x ———

	@Check
	public void checkResourceTypeNameUppercase(ResourceType rt) {
		String n = rt.getName();
		if (n != null && !n.isEmpty() && !Character.isUpperCase(n.charAt(0))) {
			warning("ResourceType name should start with uppercase.", RefDslPackage.Literals.RESOURCE_TYPE__NAME,
					INVALID_RESOURCE_TYPE_NAME);
		}
	}

	@Check
	public void checkResourceTypeNameLength(ResourceType rt) {
		String n = rt.getName();
		if (n != null && n.length() > 0 && n.length() <= 2) {
			error("ResourceType name must have more than 2 characters.", RefDslPackage.Literals.RESOURCE_TYPE__NAME,
					INVALID_RESOURCE_TYPE_NAME_LENGTH);
		}
	}

	@Check
	public void checkResourceTypeNameUnique(ResourceType rt) {
		String name = rt.getName();
		if (name == null)
			return;
		RefModel rm = root(rt);
		if (rm == null)
			return;
		for (ResourceType o : rm.getResourceTypes()) {
			if (o != rt && name.equals(o.getName())) {
				error("ResourceType names must be unique within the model.", RefDslPackage.Literals.RESOURCE_TYPE__NAME,
						INVALID_RESOURCE_TYPE_NAME_DUPLICATE);
				return;
			}
		}
	}

	@Check
	public void checkResourceTypeSuperTypesNoSelf(ResourceType rt) {
		if (rt.getSuperTypes() != null && rt.getSuperTypes().contains(rt)) {
			error("ResourceType cannot be its own supertype.", RefDslPackage.Literals.RESOURCE_TYPE__SUPER_TYPES,
					INVALID_RESOURCE_TYPE_SUPERTYPES_SELF);
		}
	}

	@Check
	public void checkResourceTypeSuperTypesNoCycle(ResourceType rt) {
		if (rt.getSuperTypes() == null || rt.getSuperTypes().isEmpty())
			return;
		for (ResourceType parent : rt.getSuperTypes()) {
			if (parent == null)
				continue;
			Set<ResourceType> visited = new HashSet<>();
			if (hasResourceCycle(parent, rt, visited)) {
				error("ResourceType superTypes must not form cycles.", RefDslPackage.Literals.RESOURCE_TYPE__SUPER_TYPES,
						INVALID_RESOURCE_TYPE_SUPERTYPES_CYCLE);
				return;
			}
		}
	}

	// ——— Attribute C3.6–C3.7 ———

	@Check
	public void checkAttributeNameUnique(Attribute attribute) {
		String name = attribute.getName();
		if (name == null)
			return;
		EObject container = attribute.eContainer();
		if (container instanceof ResourceType) {
			ResourceType rt = (ResourceType) container;
			for (Attribute a : rt.getAttributes()) {
				if (a != attribute && name.equals(a.getName())) {
					error("Attribute names must be unique within the ResourceType.", RefDslPackage.Literals.ATTRIBUTE__NAME,
							INVALID_ATTRIBUTE_NAME_DUPLICATE);
					return;
				}
			}
		}
	}

	@Check
	public void checkAttributeNameLowercase(Attribute attribute) {
		String n = attribute.getName();
		if (n != null && !n.isEmpty() && !Character.isLowerCase(n.charAt(0))) {
			warning("Attribute name should start with lowercase.", RefDslPackage.Literals.ATTRIBUTE__NAME,
					INVALID_ATTRIBUTE_NAME_CASE);
		}
	}

	// ——— ResourceRelation C3.8–C3.9 ———

	@Check
	public void checkResourceRelationEnds(ResourceRelation rel) {
		if (!rel.isRecursive() && rel.getSource() != null && rel.getTarget() != null && rel.getSource() == rel.getTarget()) {
			error("Non-recursive relation cannot have the same source and target.", RefDslPackage.Literals.RESOURCE_RELATION__SOURCE,
					INVALID_RESOURCE_RELATION_SAME_ENDS);
		}
	}

	@Check
	public void checkResourceRelationNameUnique(ResourceRelation rel) {
		String name = rel.getName();
		if (name == null)
			return;
		RefModel rm = root(rel);
		if (rm == null)
			return;
		for (ResourceRelation o : rm.getResourceRelations()) {
			if (o != rel && name.equals(o.getName())) {
				error("ResourceRelation names must be unique within the model.", RefDslPackage.Literals.RESOURCE_RELATION__NAME,
						INVALID_RESOURCE_RELATION_NAME_DUPLICATE);
				return;
			}
		}
	}

	// ——— FeedbackType C4.1–C4.2 + G2–G5 ———

	@Check
	public void checkFeedbackTypeNameUppercase(FeedbackType ft) {
		String n = ft.getName();
		if (n != null && !n.isEmpty() && !Character.isUpperCase(n.charAt(0))) {
			warning("FeedbackType name should start with uppercase.", RefDslPackage.Literals.FEEDBACK_TYPE__NAME,
					INVALID_FEEDBACK_TYPE_NAME);
		}
	}

	@Check
	public void checkFeedbackTypeNameUnique(FeedbackType ft) {
		String name = ft.getName();
		if (name == null)
			return;
		RefModel rm = root(ft);
		if (rm == null)
			return;
		for (FeedbackType o : rm.getFeedbackTypes()) {
			if (o != ft && name.equals(o.getName())) {
				error("FeedbackType names must be unique within the model.", RefDslPackage.Literals.FEEDBACK_TYPE__NAME,
						INVALID_FEEDBACK_TYPE_NAME_DUPLICATE);
				return;
			}
		}
	}

	@Check
	public void checkFeedbackKindReviewScope(FeedbackType ft) {
		if (ft.getKind() == FeedbackKind.REVIEW
				&& (ft.getSubjectScope() == null || ft.getSubjectScope() != FeedbackSubjectScope.RESOURCE_ONLY)) {
			error("REVIEW feedback must use subjectScope RESOURCE_ONLY.", RefDslPackage.Literals.FEEDBACK_TYPE__SUBJECT_SCOPE,
					MC_G2_REVIEW_SCOPE);
		}
	}

	@Check
	public void checkFeedbackKindReactionVote(FeedbackType ft) {
		if (ft.getKind() == FeedbackKind.REACTION || ft.getKind() == FeedbackKind.VOTE) {
			if (ft.isHasRating() || ft.isRecursive()) {
				error("REACTION/VOTE must have hasRating=false and recursive=false.",
						RefDslPackage.Literals.FEEDBACK_TYPE__HAS_RATING, MC_G3_REACTION_VOTE);
			}
		}
	}

	@Check
	public void checkFeedbackKindSubscription(FeedbackType ft) {
		if (ft.getKind() == FeedbackKind.SUBSCRIPTION) {
			if (ft.getSubjectScope() != FeedbackSubjectScope.RESOURCE_ONLY || ft.isRecursive()) {
				error("SUBSCRIPTION feedback must be RESOURCE_ONLY and non-recursive.",
						RefDslPackage.Literals.FEEDBACK_TYPE__SUBJECT_SCOPE, MC_G4_SUBSCRIPTION);
			}
		}
	}

	@Check
	public void checkRecursiveFeedbackScope(FeedbackType ft) {
		if (ft.isRecursive() && ft.getSubjectScope() == FeedbackSubjectScope.RESOURCE_ONLY) {
			error("Recursive feedback must allow FEEDBACK targets (not RESOURCE_ONLY only).",
					RefDslPackage.Literals.FEEDBACK_TYPE__SUBJECT_SCOPE, MC_G5_RECURSIVE_SCOPE);
		}
	}

	// ——— FeedbackDefinition C4.3–C4.7, C4.11–C4.12, G1, G6–G9 ———

	@Check
	public void checkFeedbackDefinitionNameUppercase(FeedbackDefinition fd) {
		String n = fd.getName();
		if (n != null && !n.isEmpty() && !Character.isUpperCase(n.charAt(0))) {
			warning("FeedbackDefinition name should start with uppercase.", RefDslPackage.Literals.FEEDBACK_DEFINITION__NAME,
					INVALID_FEEDBACK_DEFINITION_NAME);
		}
	}

	@Check
	public void checkFeedbackDefinitionNameUnique(FeedbackDefinition fd) {
		String name = fd.getName();
		if (name == null)
			return;
		RefModel rm = root(fd);
		if (rm == null)
			return;
		for (FeedbackDefinition o : rm.getFeedbackDefinitions()) {
			if (o != fd && name.equals(o.getName())) {
				error("FeedbackDefinition names must be unique within the model.",
						RefDslPackage.Literals.FEEDBACK_DEFINITION__NAME, INVALID_FEEDBACK_DEFINITION_NAME_DUPLICATE);
				return;
			}
		}
	}

	@Check
	public void checkFeedbackDefinitionAuthor(FeedbackDefinition fd) {
		if (fd.getAuthor() == null) {
			error("FeedbackDefinition must have an author (UserType).", RefDslPackage.Literals.FEEDBACK_DEFINITION__AUTHOR,
					INVALID_FEEDBACK_DEFINITION_AUTHOR);
		}
	}

	@Check
	public void checkFeedbackDefinitionTargetsForScope(FeedbackDefinition fd) {
		FeedbackType t = fd.getType();
		if (t == null)
			return;
		FeedbackSubjectScope scope = t.getSubjectScope();
		if (scope == null)
			return;

		switch (scope) {
		case RESOURCE_ONLY:
			if (fd.getSubjectResource() == null) {
				error("FeedbackDefinition with RESOURCE_ONLY scope must have subjectResource.",
						RefDslPackage.Literals.FEEDBACK_DEFINITION__SUBJECT_RESOURCE, INVALID_FEEDBACK_DEFINITION_TARGETS);
			}
			if (fd.getSubjectFeedback() != null) {
				error("FeedbackDefinition with RESOURCE_ONLY scope cannot have subjectFeedback.",
						RefDslPackage.Literals.FEEDBACK_DEFINITION__SUBJECT_FEEDBACK, INVALID_FEEDBACK_DEFINITION_TARGETS);
			}
			break;
		case FEEDBACK_ONLY:
			if (fd.getSubjectFeedback() == null) {
				error("FeedbackDefinition with FEEDBACK_ONLY scope must have subjectFeedback.",
						RefDslPackage.Literals.FEEDBACK_DEFINITION__SUBJECT_FEEDBACK, INVALID_FEEDBACK_DEFINITION_TARGETS);
			}
			if (fd.getSubjectResource() != null) {
				error("FeedbackDefinition with FEEDBACK_ONLY scope cannot have subjectResource.",
						RefDslPackage.Literals.FEEDBACK_DEFINITION__SUBJECT_RESOURCE, INVALID_FEEDBACK_DEFINITION_TARGETS);
			}
			break;
		case RESOURCE_OR_FEEDBACK:
			if (fd.getSubjectResource() == null && fd.getSubjectFeedback() == null) {
				error("FeedbackDefinition must have at least one subject (resource or feedback).",
						RefDslPackage.Literals.FEEDBACK_DEFINITION__SUBJECT_RESOURCE, INVALID_FEEDBACK_DEFINITION_TARGETS);
			}
			break;
		default:
			break;
		}
	}

	@Check
	public void checkRatingOnlyWhenHasRating(FeedbackDefinition fd) {
		if (fd.getRating() != null && fd.getType() != null && !fd.getType().isHasRating()) {
			error("RatingPolicy can only be set when FeedbackType.hasRating is true.", RefDslPackage.Literals.FEEDBACK_DEFINITION__RATING,
					INVALID_FEEDBACK_DEFINITION_RATING);
		}
	}

	@Check
	public void checkRatingRequiredWhenHasRating(FeedbackDefinition fd) {
		if (fd.getType() != null && fd.getType().isHasRating() && fd.getRating() == null) {
			error("FeedbackDefinition with hasRating=true must define a RatingPolicy.", RefDslPackage.Literals.FEEDBACK_DEFINITION__RATING,
					MC_G1_RATING_REQUIRED);
		}
	}

	@Check
	public void checkReactionVoteNoRatingOnDefinition(FeedbackDefinition fd) {
		if (fd.getType() != null && (fd.getType().getKind() == FeedbackKind.REACTION || fd.getType().getKind() == FeedbackKind.VOTE)
				&& fd.getRating() != null) {
			error("REACTION/VOTE feedback cannot define RatingPolicy.", RefDslPackage.Literals.FEEDBACK_DEFINITION__RATING,
					MC_G3_REACTION_VOTE);
		}
	}

	@Check
	public void checkSubjectFeedbackSameType(FeedbackDefinition fd) {
		if (fd.getSubjectFeedback() != null && fd.getType() != null && fd.getSubjectFeedback().getType() != null
				&& fd.getSubjectFeedback().getType() != fd.getType()) {
			warning("FeedbackDefinition subjectFeedback should be of the same FeedbackType.",
					RefDslPackage.Literals.FEEDBACK_DEFINITION__SUBJECT_FEEDBACK, INVALID_FEEDBACK_DEFINITION_SUBJECT_FEEDBACK_TYPE);
		}
	}

	@Check
	public void checkSubjectFeedbackNotSelf(FeedbackDefinition fd) {
		if (fd.getSubjectFeedback() == fd) {
			error("FeedbackDefinition cannot target itself via subjectFeedback.",
					RefDslPackage.Literals.FEEDBACK_DEFINITION__SUBJECT_FEEDBACK, INVALID_FEEDBACK_DEFINITION_SUBJECT_FEEDBACK_SELF);
		}
	}

	@Check
	public void checkG8VerifiedContext(FeedbackDefinition fd) {
		if (!fd.isRequiresVerifiedContext())
			return;
		RefModel rm = root(fd);
		if (rm == null)
			return;
		boolean ok = false;
		for (VerificationPolicy vp : rm.getVerificationPolicies()) {
			if (vp.getVerifies() == fd) {
				ok = true;
				break;
			}
		}
		if (!ok) {
			error("FeedbackDefinition requiring verified context must have a VerificationPolicy that verifies it.",
					RefDslPackage.Literals.FEEDBACK_DEFINITION__REQUIRES_VERIFIED_CONTEXT, MC_G8_VERIFIED_CONTEXT);
		}
	}

	@Check
	public void checkG9UniquePerAuthor(FeedbackDefinition fd) {
		if (fd.isUniquePerAuthorTarget() && fd.getSubjectResource() != null && fd.getSubjectFeedback() != null) {
			error("uniquePerAuthorTarget requires a single target to avoid ambiguity.",
					RefDslPackage.Literals.FEEDBACK_DEFINITION__UNIQUE_PER_AUTHOR_TARGET, MC_G9_UNIQUE_PER_AUTHOR);
		}
	}

	// ——— RatingPolicy C4.8–C4.9 ———

	@Check
	public void checkRatingMinMax(RatingPolicy rp) {
		if (rp.getMinValue() >= rp.getMaxValue()) {
			error("RatingPolicy minValue must be less than maxValue.", RefDslPackage.Literals.RATING_POLICY__MIN_VALUE,
					INVALID_RATING_MIN_MAX);
		}
	}

	@Check
	public void checkRatingStep(RatingPolicy rp) {
		double step = rp.getStep();
		if (step <= 0) {
			error("RatingPolicy step must be positive.", RefDslPackage.Literals.RATING_POLICY__STEP, INVALID_RATING_STEP_POSITIVE);
			return;
		}
		double range = rp.getMaxValue() - rp.getMinValue();
		double q = range / step;
		if (Math.abs(q - Math.rint(q)) > 1e-9) {
			warning("RatingPolicy step should divide the range evenly.", RefDslPackage.Literals.RATING_POLICY__STEP,
					INVALID_RATING_STEP_DIVIDES);
		}
	}

	// ——— ValidationRule C5.1–C5.5 ———

	@Check
	public void checkValidationRuleTargets(ValidationRule rule) {
		if (rule.getAppliesToResource() == null && rule.getAppliesToFeedback() == null) {
			error("ValidationRule must target at least one element (resource or feedback).",
					RefDslPackage.Literals.VALIDATION_RULE__APPLIES_TO_RESOURCE, INVALID_VALIDATION_RULE_TARGETS);
		}
	}

	@Check
	public void checkValidationRuleNameUnique(ValidationRule rule) {
		String name = rule.getName();
		if (name == null || name.isEmpty())
			return;
		RefModel rm = root(rule);
		if (rm == null)
			return;
		for (ValidationRule o : rm.getValidationRules()) {
			if (o != rule && name.equals(o.getName())) {
				error("ValidationRule names must be unique within the model.", RefDslPackage.Literals.VALIDATION_RULE__NAME,
						INVALID_VALIDATION_RULE_NAME_DUPLICATE);
				return;
			}
		}
	}

	@Check
	public void checkValidationRuleNameUppercase(ValidationRule rule) {
		String n = rule.getName();
		if (n != null && !n.isEmpty() && !Character.isUpperCase(n.charAt(0))) {
			warning("ValidationRule name should start with uppercase.", RefDslPackage.Literals.VALIDATION_RULE__NAME,
					INVALID_VALIDATION_RULE_NAME);
		}
	}

	@Check
	public void checkValidationRuleImplIdLength(ValidationRule rule) {
		String id = rule.getImplementationId();
		if (id != null && !id.isEmpty() && id.length() < 3) {
			warning("ValidationRule implementationId should have at least 3 characters.",
					RefDslPackage.Literals.VALIDATION_RULE__IMPLEMENTATION_ID, INVALID_VALIDATION_RULE_IMPL_ID);
		}
	}

	@Check
	public void checkValidationRuleExpressionForAutomatic(ValidationRule rule) {
		if (rule.getKind() == ValidationKind.AUTOMATIC) {
			String ex = rule.getExpression();
			if (ex == null || ex.trim().isEmpty()) {
				error("ValidationRule expression must not be empty when kind is AUTOMATIC.",
						RefDslPackage.Literals.VALIDATION_RULE__EXPRESSION, INVALID_VALIDATION_RULE_EXPRESSION_AUTO);
			}
		}
	}

	// ——— ModerationPolicy C5.6–C5.8 + G11 ———

	@Check
	public void checkModerationPolicyNameUnique(ModerationPolicy mp) {
		String name = mp.getName();
		if (name == null || name.isEmpty())
			return;
		RefModel rm = root(mp);
		if (rm == null)
			return;
		for (ModerationPolicy o : rm.getModerationPolicies()) {
			if (o != mp && name.equals(o.getName())) {
				error("ModerationPolicy names must be unique within the model.", RefDslPackage.Literals.MODERATION_POLICY__NAME,
						INVALID_MODERATION_POLICY_NAME_DUPLICATE);
				return;
			}
		}
	}

	@Check
	public void checkModerationPolicyExecutedBy(ModerationPolicy mp) {
		if (mp.getExecutedBy() == null) {
			error("ModerationPolicy must have executedBy.", RefDslPackage.Literals.MODERATION_POLICY__EXECUTED_BY,
					INVALID_MODERATION_POLICY_EXECUTED_BY);
		}
	}

	@Check
	public void checkModerationPolicyTriggerForAuto(ModerationPolicy mp) {
		if (mp.getMode() == ModerationMode.AUTOMATIC) {
			String t = mp.getTrigger();
			if (t == null || t.trim().isEmpty()) {
				error("ModerationPolicy trigger must not be empty when mode is AUTOMATIC.",
						RefDslPackage.Literals.MODERATION_POLICY__TRIGGER, INVALID_MODERATION_POLICY_TRIGGER_AUTO);
			}
		}
	}

	@Check
	public void checkG11ModerationContext(ModerationPolicy mp) {
		if (mp.getInContext() == null || mp.getMonitorsResource() == null)
			return;
		if (!mp.getInContext().getContains().contains(mp.getMonitorsResource())) {
			error("ModerationPolicy monitorsResource must belong to the selected inContext.",
					RefDslPackage.Literals.MODERATION_POLICY__MONITORS_RESOURCE, MC_G11_MOD_CONTEXT);
		}
	}

	// ——— AuthorizationRule C5.9–C5.10 + G10 ———

	@Check
	public void checkAuthorizationActor(AuthorizationRule ar) {
		if (ar.getActor() == null) {
			error("AuthorizationRule must have an actor.", RefDslPackage.Literals.AUTHORIZATION_RULE__ACTOR, INVALID_AUTHORIZATION_ACTOR);
		}
	}

	@Check
	public void checkAuthorizationTargets(AuthorizationRule ar) {
		if (ar.getResourceTarget() == null || ar.getFeedbackTarget() == null) {
			error("AuthorizationRule must have both resourceTarget and feedbackTarget.",
					RefDslPackage.Literals.AUTHORIZATION_RULE__RESOURCE_TARGET, INVALID_AUTHORIZATION_TARGETS);
		}
	}

	@Check
	public void checkG10AuthorizationContext(AuthorizationRule ar) {
		if (ar.getContext() == null || ar.getResourceTarget() == null)
			return;
		if (!ar.getContext().getContains().contains(ar.getResourceTarget())) {
			error("AuthorizationRule resourceTarget must belong to the selected context.",
					RefDslPackage.Literals.AUTHORIZATION_RULE__RESOURCE_TARGET, MC_G10_AUTHZ_CONTEXT);
		}
	}

	// ——— AutomationRule C5.11–C5.14 + G12 ———

	@Check
	public void checkAutomationRuleNameUnique(AutomationRule rule) {
		String name = rule.getName();
		if (name == null)
			return;
		RefModel rm = root(rule);
		if (rm == null)
			return;
		for (AutomationRule o : rm.getAutomationRules()) {
			if (o != rule && name.equals(o.getName())) {
				error("AutomationRule names must be unique within the model.", RefDslPackage.Literals.AUTOMATION_RULE__NAME,
						INVALID_AUTOMATION_RULE_NAME_DUPLICATE);
				return;
			}
		}
	}

	@Check
	public void checkAutomationRuleNameUppercase(AutomationRule rule) {
		String n = rule.getName();
		if (n != null && !n.isEmpty() && !Character.isUpperCase(n.charAt(0))) {
			warning("AutomationRule name should start with uppercase.", RefDslPackage.Literals.AUTOMATION_RULE__NAME,
					INVALID_AUTOMATION_RULE_NAME);
		}
	}

	@Check
	public void checkAutomationRuleTrigger(AutomationRule rule) {
		if (rule.getTrigger() == null || rule.getTrigger().trim().isEmpty()) {
			error("AutomationRule trigger must not be empty.", RefDslPackage.Literals.AUTOMATION_RULE__TRIGGER,
					INVALID_AUTOMATION_RULE_TRIGGER);
		}
	}

	@Check
	public void checkAutomationRuleAction(AutomationRule rule) {
		if (rule.getActionDescription() == null || rule.getActionDescription().trim().isEmpty()) {
			error("AutomationRule actionDescription must not be empty.", RefDslPackage.Literals.AUTOMATION_RULE__ACTION_DESCRIPTION,
					INVALID_AUTOMATION_RULE_ACTION);
		}
	}

	@Check
	public void checkG12AutomationContext(AutomationRule rule) {
		if (rule.getInContext() == null || rule.getContext() == null)
			return;
		if (!rule.getInContext().getContains().contains(rule.getContext())) {
			error("AutomationRule context resource must belong to inContext.", RefDslPackage.Literals.AUTOMATION_RULE__CONTEXT,
					MC_G12_AUTO_CONTEXT);
		}
	}

	// ——— VerificationPolicy C5.15–C5.16 ———

	@Check
	public void checkVerificationPolicyNameUnique(VerificationPolicy vp) {
		String name = vp.getName();
		if (name == null || name.isEmpty())
			return;
		RefModel rm = root(vp);
		if (rm == null)
			return;
		for (VerificationPolicy o : rm.getVerificationPolicies()) {
			if (o != vp && name.equals(o.getName())) {
				error("VerificationPolicy names must be unique within the model.", RefDslPackage.Literals.VERIFICATION_POLICY__NAME,
						INVALID_VERIFICATION_POLICY_NAME_DUPLICATE);
				return;
			}
		}
	}

	@Check
	public void checkVerificationPolicyVerifies(VerificationPolicy vp) {
		if (vp.getVerifies() == null) {
			error("VerificationPolicy must verify a FeedbackDefinition.", RefDslPackage.Literals.VERIFICATION_POLICY__VERIFIES,
					INVALID_VERIFICATION_POLICY_VERIFIES);
		}
	}

	// ——— helpers ———

	private RefModel root(EObject o) {
		while (o != null) {
			if (o instanceof RefModel)
				return (RefModel) o;
			o = o.eContainer();
		}
		return null;
	}

	private boolean hasUserCycle(UserType current, UserType target, Set<UserType> visited) {
		if (!visited.add(current))
			return false;
		if (current == target)
			return true;
		if (current.getSuperTypes() == null)
			return false;
		for (UserType p : current.getSuperTypes()) {
			if (p != null && hasUserCycle(p, target, visited))
				return true;
		}
		return false;
	}

	private boolean hasResourceCycle(ResourceType current, ResourceType target, Set<ResourceType> visited) {
		if (!visited.add(current))
			return false;
		if (current == target)
			return true;
		if (current.getSuperTypes() == null)
			return false;
		for (ResourceType p : current.getSuperTypes()) {
			if (p != null && hasResourceCycle(p, target, visited))
				return true;
		}
		return false;
	}
}
