/*
 * Quick fixes aligned with Metamodel_Constraints.md refactorings (Activity 5).
 * Regenerate Xtext (MWE2) after grammar changes so issue codes match RefDslValidator.
 */
package pt.isep.enorm.refdsl.ui.quickfix;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;

import pt.isep.enorm.refdsl.refDsl.Attribute;
import pt.isep.enorm.refdsl.refDsl.Action;
import pt.isep.enorm.refdsl.refDsl.ActionResultKind;
import pt.isep.enorm.refdsl.refDsl.Condition;
import pt.isep.enorm.refdsl.refDsl.ConditionOperator;
import pt.isep.enorm.refdsl.refDsl.AuthorizationRule;
import pt.isep.enorm.refdsl.refDsl.AutomationRule;
import pt.isep.enorm.refdsl.refDsl.ContextType;
import pt.isep.enorm.refdsl.refDsl.FeedbackDefinition;
import pt.isep.enorm.refdsl.refDsl.FeedbackSubjectScope;
import pt.isep.enorm.refdsl.refDsl.FeedbackType;
import pt.isep.enorm.refdsl.refDsl.ModerationPolicy;
import pt.isep.enorm.refdsl.refDsl.RatingPolicy;
import pt.isep.enorm.refdsl.refDsl.RefModel;
import pt.isep.enorm.refdsl.refDsl.RefDslFactory;
import pt.isep.enorm.refdsl.refDsl.ResourceRelation;
import pt.isep.enorm.refdsl.refDsl.ResourceType;
import pt.isep.enorm.refdsl.refDsl.TriggerEvent;
import pt.isep.enorm.refdsl.refDsl.UserKind;
import pt.isep.enorm.refdsl.refDsl.UserType;
import pt.isep.enorm.refdsl.refDsl.ValidationKind;
import pt.isep.enorm.refdsl.refDsl.ValidationRule;
import pt.isep.enorm.refdsl.refDsl.VerificationPolicy;
import pt.isep.enorm.refdsl.validation.RefDslValidator;

public class RefDslQuickfixProvider extends DefaultQuickfixProvider {

	@Fix(RefDslValidator.INVALID_REF_MODEL_NAME_EMPTY)
	public void fixRefModelNameDefault(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Set default RefModel name", "Use MyRefModel as name.", "add.png", sem(e -> {
			if (e instanceof RefModel) {
				String n = ((RefModel) e).getName();
				if (n == null || n.trim().isEmpty())
					((RefModel) e).setName("MyRefModel");
			}
		}));
	}

	@Fix(RefDslValidator.INVALID_REF_MODEL_NAME_LENGTH)
	public void fixRefModelNameLengthen(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Extend name past 2 characters", "Appends letters until length > 2.", "add.png", sem(e -> {
			if (e instanceof RefModel) {
				String n = ((RefModel) e).getName();
				if (n == null)
					n = "";
				while (n.length() <= 2)
					n = n + "X";
				((RefModel) e).setName(n);
			}
		}));
	}

	// Capitalizes the first character of the RefModel name.
	@Fix(RefDslValidator.INVALID_REF_MODEL_NAME)
	public void fixRefModelNameCapitalize(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Capitalize RefModel name", "Set the first letter to uppercase.", "upcase.png", sem(e -> {
			if (e instanceof RefModel) {
				RefModel m = (RefModel) e;
				String n = m.getName();
				if (n != null && !n.isEmpty())
					m.setName(n.substring(0, 1).toUpperCase() + n.substring(1));
			}
		}));
	}

	// Replaces an invalid version with the default semantic version 1.0.0.
	@Fix(RefDslValidator.INVALID_REF_MODEL_VERSION_SEMVER)
	public void fixRefModelVersionDefault(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Set version to 1.0.0", "Use semantic version 1.0.0.", "add.png", sem(e -> {
			if (e instanceof RefModel) {
				((RefModel) e).setVersion("1.0.0");
			}
		}));
	}

	// Capitalizes the first character of the UserType name.
	@Fix(RefDslValidator.INVALID_USER_TYPE_NAME)
	public void fixUserTypeCapitalize(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Capitalize UserType name", null, "upcase.png", sem(e -> {
			if (e instanceof UserType) {
				UserType u = (UserType) e;
				String n = u.getName();
				if (n != null && !n.isEmpty())
					u.setName(n.substring(0, 1).toUpperCase() + n.substring(1));
			}
		}));
	}

	// Removes self-reference from UserType superTypes.
	@Fix(RefDslValidator.INVALID_USER_TYPE_SUPERTYPES_SELF)
	public void fixUserTypeRemoveSelfSuper(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Remove self from superTypes", null, "remove.png", sem(e -> {
			if (e instanceof UserType) {
				((UserType) e).getSuperTypes().remove(e);
			}
		}));
	}

	// Breaks inheritance cycles in UserType by removing one cyclic parent.
	@Fix(RefDslValidator.INVALID_USER_TYPE_SUPERTYPES_CYCLE)
	public void fixUserTypeBreakCycle(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Break superTypes cycle", "Remove one superType that closes the cycle.", "remove.png", sem(e -> {
			if (e instanceof UserType) {
				UserType user = (UserType) e;
				for (int i = 0; i < user.getSuperTypes().size(); i++) {
					UserType parent = user.getSuperTypes().get(i);
					if (parent != null && reachesUser(parent, user, new HashSet<UserType>())) {
						user.getSuperTypes().remove(i);
						return;
					}
				}
			}
		}));
	}

	// Capitalizes the first character of the ContextType name.
	@Fix(RefDslValidator.INVALID_CONTEXT_TYPE_NAME)
	public void fixContextTypeCapitalize(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Capitalize ContextType name", null, "upcase.png", sem(e -> {
			if (e instanceof ContextType) {
				ContextType c = (ContextType) e;
				String n = c.getName();
				if (n != null && !n.isEmpty())
					c.setName(n.substring(0, 1).toUpperCase() + n.substring(1));
			}
		}));
	}

	// Capitalizes the first character of the ResourceType name.
	@Fix(RefDslValidator.INVALID_RESOURCE_TYPE_NAME)
	public void fixResourceTypeCapitalize(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Capitalize ResourceType name", null, "upcase.png", sem(e -> {
			if (e instanceof ResourceType) {
				ResourceType r = (ResourceType) e;
				String n = r.getName();
				if (n != null && !n.isEmpty())
					r.setName(n.substring(0, 1).toUpperCase() + n.substring(1));
			}
		}));
	}

	// Removes self-reference from ResourceType superTypes.
	@Fix(RefDslValidator.INVALID_RESOURCE_TYPE_SUPERTYPES_SELF)
	public void fixResourceTypeRemoveSelfSuper(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Remove self from superTypes", null, "remove.png", sem(e -> {
			if (e instanceof ResourceType) {
				((ResourceType) e).getSuperTypes().remove(e);
			}
		}));
	}

	// Breaks inheritance cycles in ResourceType by removing one cyclic parent.
	@Fix(RefDslValidator.INVALID_RESOURCE_TYPE_SUPERTYPES_CYCLE)
	public void fixResourceTypeBreakCycle(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Break superTypes cycle", null, "remove.png", sem(e -> {
			if (e instanceof ResourceType) {
				ResourceType rt = (ResourceType) e;
				for (int i = 0; i < rt.getSuperTypes().size(); i++) {
					ResourceType parent = rt.getSuperTypes().get(i);
					if (parent != null && reachesResource(parent, rt, new HashSet<ResourceType>())) {
						rt.getSuperTypes().remove(i);
						return;
					}
				}
			}
		}));
	}

	// Forces Attribute names to start with a lowercase letter.
	@Fix(RefDslValidator.INVALID_ATTRIBUTE_NAME_CASE)
	public void fixAttributeLowercase(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Start name with lowercase", null, "upcase.png", sem(e -> {
			if (e instanceof Attribute) {
				Attribute a = (Attribute) e;
				String n = a.getName();
				if (n != null && !n.isEmpty())
					a.setName(n.substring(0, 1).toLowerCase() + n.substring(1));
			}
		}));
	}

	// Marks a relation as recursive when source and target are the same.
	@Fix(RefDslValidator.INVALID_RESOURCE_RELATION_SAME_ENDS)
	public void fixResourceRelationSetRecursive(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Set recursive to true", "Allows source and target to be the same.", "add.png", sem(e -> {
			if (e instanceof ResourceRelation) {
				((ResourceRelation) e).setRecursive(true);
			}
		}));
	}

	// Capitalizes the first character of the FeedbackType name.
	@Fix(RefDslValidator.INVALID_FEEDBACK_TYPE_NAME)
	public void fixFeedbackTypeCapitalize(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Capitalize FeedbackType name", null, "upcase.png", sem(e -> {
			if (e instanceof FeedbackType) {
				FeedbackType f = (FeedbackType) e;
				String n = f.getName();
				if (n != null && !n.isEmpty())
					f.setName(n.substring(0, 1).toUpperCase() + n.substring(1));
			}
		}));
	}

	// Capitalizes the first character of the FeedbackDefinition name.
	@Fix(RefDslValidator.INVALID_FEEDBACK_DEFINITION_NAME)
	public void fixFeedbackDefinitionCapitalize(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Capitalize FeedbackDefinition name", null, "upcase.png", sem(e -> {
			if (e instanceof FeedbackDefinition) {
				FeedbackDefinition f = (FeedbackDefinition) e;
				String n = f.getName();
				if (n != null && !n.isEmpty())
					f.setName(n.substring(0, 1).toUpperCase() + n.substring(1));
			}
		}));
	}

	@Fix(RefDslValidator.INVALID_FEEDBACK_DEFINITION_TYPE)
	public void fixFeedbackDefinitionTypeFirst(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Set first FeedbackType", null, "add.png", sem(e -> {
			if (e instanceof FeedbackDefinition) {
				FeedbackDefinition fd = (FeedbackDefinition) e;
				RefModel rm = root(fd);
				if (rm != null && !rm.getFeedbackTypes().isEmpty())
					fd.setType(rm.getFeedbackTypes().get(0));
			}
		}));
	}

	// Assigns the first available UserType as FeedbackDefinition author.
	@Fix(RefDslValidator.INVALID_FEEDBACK_DEFINITION_AUTHOR)
	public void fixFeedbackDefinitionAuthor(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Set first UserType as author", null, "add.png", sem(e -> {
			if (e instanceof FeedbackDefinition) {
				FeedbackDefinition fd = (FeedbackDefinition) e;
				RefModel rm = root(fd);
				if (rm != null && !rm.getUserTypes().isEmpty())
					fd.setAuthor(rm.getUserTypes().get(0));
			}
		}));
	}

	// Enables hasRating on FeedbackType when the definition requires rating.
	@Fix(RefDslValidator.INVALID_FEEDBACK_DEFINITION_RATING)
	public void fixSetHasRatingTrue(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Set FeedbackType.hasRating to true", null, "add.png", sem(e -> {
			if (e instanceof FeedbackDefinition) {
				FeedbackDefinition fd = (FeedbackDefinition) e;
				if (fd.getType() != null)
					fd.getType().setHasRating(true);
			}
		}));
	}

	// Clears invalid self-referential subjectFeedback in FeedbackDefinition.
	@Fix(RefDslValidator.INVALID_FEEDBACK_DEFINITION_SUBJECT_FEEDBACK_SELF)
	public void fixClearSubjectFeedback(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Clear subjectFeedback", null, "remove.png", sem(e -> {
			if (e instanceof FeedbackDefinition) {
				((FeedbackDefinition) e).setSubjectFeedback(null);
			}
		}));
	}

	// Swaps min and max values when the rating interval is inverted.
	@Fix(RefDslValidator.INVALID_RATING_MIN_MAX)
	public void fixSwapMinMax(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Swap min and max", null, "add.png", sem(e -> {
			if (e instanceof RatingPolicy) {
				RatingPolicy r = (RatingPolicy) e;
				double t = r.getMinValue();
				r.setMinValue(r.getMaxValue());
				r.setMaxValue(t);
			}
		}));
	}

	// Normalizes invalid rating step values by setting step to 1.0.
	@Fix(RefDslValidator.INVALID_RATING_STEP_POSITIVE)
	@Fix(RefDslValidator.INVALID_RATING_STEP_DIVIDES)
	public void fixRatingStepOne(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Set step to 1", null, "add.png", sem(e -> {
			if (e instanceof RatingPolicy) {
				((RatingPolicy) e).setStep(1.0);
			}
		}));
	}

	// Capitalizes the first character of the ValidationRule name.
	@Fix(RefDslValidator.INVALID_VALIDATION_RULE_NAME)
	public void fixValidationRuleCapitalize(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Capitalize ValidationRule name", null, "upcase.png", sem(e -> {
			if (e instanceof ValidationRule) {
				ValidationRule r = (ValidationRule) e;
				String n = r.getName();
				if (n != null && !n.isEmpty())
					r.setName(n.substring(0, 1).toUpperCase() + n.substring(1));
			}
		}));
	}

	// Pads implementationId to satisfy the minimum length constraint.
	@Fix(RefDslValidator.INVALID_VALIDATION_RULE_IMPL_ID)
	public void fixValidationRulePadId(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Pad implementationId", null, "pad.png", sem(e -> {
			if (e instanceof ValidationRule) {
				ValidationRule r = (ValidationRule) e;
				String id = r.getImplementationId();
				if (id != null) {
					String p = id;
					while (p.length() < 3)
						p = "v" + p;
					r.setImplementationId(p);
				}
			}
		}));
	}

	// Assigns a MODERATOR user (or fallback first user) as executedBy.
	@Fix(RefDslValidator.INVALID_MODERATION_POLICY_EXECUTED_BY)
	public void fixModerationExecutedByModerator(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Assign first MODERATOR UserType", null, "add.png", sem(e -> {
			if (e instanceof ModerationPolicy) {
				ModerationPolicy mp = (ModerationPolicy) e;
				RefModel rm = root(mp);
				if (rm == null)
					return;
				for (UserType u : rm.getUserTypes()) {
					if (u.getKind() == UserKind.MODERATOR) {
						mp.setExecutedBy(u);
						return;
					}
				}
				if (!rm.getUserTypes().isEmpty())
					mp.setExecutedBy(rm.getUserTypes().get(0));
			}
		}));
	}

	// Sets a default trigger for automatic moderation policies.
	@Fix(RefDslValidator.INVALID_MODERATION_POLICY_TRIGGER_AUTO)
	public void fixModerationDefaultTrigger(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Set default trigger", null, "add.png", sem(e -> {
			if (e instanceof ModerationPolicy) {
				ModerationPolicy mp = (ModerationPolicy) e;
				if (mp.getTrigger() == null)
					mp.setTrigger(TriggerEvent.ON_FEEDBACK_CREATE);
			}
		}));
	}

	// Assigns the first available UserType as AuthorizationRule actor.
	@Fix(RefDslValidator.INVALID_AUTHORIZATION_ACTOR)
	public void fixAuthorizationActor(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Set first UserType as actor", null, "add.png", sem(e -> {
			if (e instanceof AuthorizationRule) {
				AuthorizationRule ar = (AuthorizationRule) e;
				RefModel rm = root(ar);
				if (rm != null && !rm.getUserTypes().isEmpty())
					ar.setActor(rm.getUserTypes().get(0));
			}
		}));
	}

	// Capitalizes the first character of the AutomationRule name.
	@Fix(RefDslValidator.INVALID_AUTOMATION_RULE_NAME)
	public void fixAutomationRuleCapitalize(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Capitalize AutomationRule name", null, "upcase.png", sem(e -> {
			if (e instanceof AutomationRule) {
				AutomationRule a = (AutomationRule) e;
				String n = a.getName();
				if (n != null && !n.isEmpty())
					a.setName(n.substring(0, 1).toUpperCase() + n.substring(1));
			}
		}));
	}

	// Sets a default trigger for AutomationRule when missing.
	@Fix(RefDslValidator.INVALID_AUTOMATION_RULE_TRIGGER)
	public void fixAutomationTrigger(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Set default trigger", null, "add.png", sem(e -> {
			if (e instanceof AutomationRule) {
				AutomationRule r = (AutomationRule) e;
				if (r.getTrigger() == null)
					r.setTrigger(TriggerEvent.ON_FEEDBACK_CREATE);
			}
		}));
	}

	/**
	 * v3: adds a minimal Condition referencing the first Attribute in the model (if any).
	 */
	@Fix(RefDslValidator.INVALID_AUTOMATION_RULE_CONDITIONS)
	public void fixAutomationAddSampleCondition(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Add sample Condition", "Uses first Attribute in the model.", "add.png", sem(e -> {
			if (!(e instanceof AutomationRule))
				return;
			AutomationRule ar = (AutomationRule) e;
			RefModel rm = root(ar);
			if (rm == null)
				return;
			Attribute attr = null;
			for (ResourceType rt : rm.getResourceTypes()) {
				if (!rt.getAttributes().isEmpty()) {
					attr = rt.getAttributes().get(0);
					break;
				}
			}
			if (attr == null)
				return;
			Condition cond = RefDslFactory.eINSTANCE.createCondition();
			cond.setName("DefaultCondition");
			cond.setOperator(ConditionOperator.HAS_PROPERTY);
			cond.setAttribute(attr);
			ar.getConditions().add(cond);
		}));
	}

	/** v3: append a minimal Action when the automation has none. */
	@Fix(RefDslValidator.INVALID_AUTOMATION_RULE_ACTION)
	public void fixAutomationAction(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Add default Action", "Adds Action with DISPLAY_MESSAGE.", "add.png", sem(e -> {
			if (e instanceof AutomationRule) {
				AutomationRule r = (AutomationRule) e;
				if (r.getActions() != null && r.getActions().isEmpty()) {
					Action act = RefDslFactory.eINSTANCE.createAction();
					act.setName("DefaultAction");
					act.setKind(ActionResultKind.DISPLAY_MESSAGE);
					act.setMessage("Execute validation");
					r.getActions().add(act);
				}
			}
		}));
	}

	// Creates a default numeric 1..5 RatingPolicy for FeedbackDefinition.
	@Fix(RefDslValidator.MC_G1_RATING_REQUIRED)
	public void fixCreateDefaultRating(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Create default RatingPolicy (1–5, step 1)", null, "add.png", sem(e -> {
			if (e instanceof FeedbackDefinition) {
				FeedbackDefinition fd = (FeedbackDefinition) e;
				RatingPolicy rp = RefDslFactory.eINSTANCE.createRatingPolicy();
				rp.setMinValue(1);
				rp.setMaxValue(5);
				rp.setStep(1);
				fd.setRating(rp);
			}
		}));
	}

	// Restricts review FeedbackType scope to resources only.
	@Fix(RefDslValidator.MC_G2_REVIEW_SCOPE)
	public void fixReviewResourceOnly(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Set subjectScope to RESOURCE_ONLY", null, "add.png", sem(e -> {
			if (e instanceof FeedbackType) {
				((FeedbackType) e).setSubjectScope(FeedbackSubjectScope.RESOURCE_ONLY);
			}
		}));
	}

	// Normalizes REACTION/VOTE by removing rating and recursion settings.
	@Fix(RefDslValidator.MC_G3_REACTION_VOTE)
	public void fixReactionVoteNormalize(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Normalize REACTION/VOTE (no rating, not recursive)", null, "remove.png", sem(e -> {
			if (e instanceof FeedbackType) {
				FeedbackType ft = (FeedbackType) e;
				ft.setHasRating(false);
				ft.setRecursive(false);
			} else if (e instanceof FeedbackDefinition) {
				((FeedbackDefinition) e).setRating(null);
			}
		}));
	}

	// Forces SUBSCRIPTION to be resource-only and non-recursive.
	@Fix(RefDslValidator.MC_G4_SUBSCRIPTION)
	public void fixSubscriptionScope(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Set RESOURCE_ONLY and non-recursive", null, "add.png", sem(e -> {
			if (e instanceof FeedbackType) {
				FeedbackType ft = (FeedbackType) e;
				ft.setSubjectScope(FeedbackSubjectScope.RESOURCE_ONLY);
				ft.setRecursive(false);
			}
		}));
	}

	// Expands recursive feedback scope to allow feedback targets.
	@Fix(RefDslValidator.MC_G5_RECURSIVE_SCOPE)
	public void fixRecursiveAllowFeedback(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Set subjectScope to RESOURCE_OR_FEEDBACK", null, "add.png", sem(e -> {
			if (e instanceof FeedbackType) {
				((FeedbackType) e).setSubjectScope(FeedbackSubjectScope.RESOURCE_OR_FEEDBACK);
			}
		}));
	}

	// Creates and attaches a VerificationPolicy for verified-context feedback.
	@Fix(RefDslValidator.MC_G8_VERIFIED_CONTEXT)
	public void fixCreateVerificationPolicy(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Create VerificationPolicy for this definition", null, "add.png", sem(e -> {
			if (e instanceof FeedbackDefinition) {
				FeedbackDefinition fd = (FeedbackDefinition) e;
				RefModel rm = root(fd);
				if (rm == null)
					return;
				VerificationPolicy vp = RefDslFactory.eINSTANCE.createVerificationPolicy();
				String base = fd.getName() != null ? fd.getName() : "Feedback";
				vp.setName(base + "Verification");
				vp.setMode(ValidationKind.MANUAL);
				vp.setAppliesWhen(TriggerEvent.ON_FEEDBACK_CREATE);
				vp.setVerifies(fd);
				rm.getVerificationPolicies().add(vp);
			}
		}));
	}

	// Enforces unique-per-author target by clearing subjectFeedback.
	@Fix(RefDslValidator.MC_G9_UNIQUE_PER_AUTHOR)
	public void fixUniquePerAuthorClearFeedbackSubject(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Remove subjectFeedback (keep resource)", null, "remove.png", sem(e -> {
			if (e instanceof FeedbackDefinition) {
				((FeedbackDefinition) e).setSubjectFeedback(null);
			}
		}));
	}

	// Enforces unique-per-author target by clearing subjectResource.
	@Fix(RefDslValidator.MC_G9_UNIQUE_PER_AUTHOR)
	public void fixUniquePerAuthorClearResourceSubject(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Remove subjectResource (keep feedback)", null, "remove.png", sem(e -> {
			if (e instanceof FeedbackDefinition) {
				((FeedbackDefinition) e).setSubjectResource(null);
			}
		}));
	}

	// Adds AuthorizationRule resourceTarget to the selected context contains list.
	@Fix(RefDslValidator.MC_G10_AUTHZ_CONTEXT)
	public void fixAuthzAddResourceToContext(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Add resourceTarget to context.contains", null, "add.png", sem(e -> {
			if (e instanceof AuthorizationRule) {
				AuthorizationRule ar = (AuthorizationRule) e;
				if (ar.getContext() != null && ar.getResourceTarget() != null
						&& !ar.getContext().getContains().contains(ar.getResourceTarget())) {
					ar.getContext().getContains().add(ar.getResourceTarget());
				}
			}
		}));
	}

	// Adds ModerationPolicy monitorsResource to inContext contains list.
	@Fix(RefDslValidator.MC_G11_MOD_CONTEXT)
	public void fixModAddResourceToContext(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Add monitorsResource to inContext.contains", null, "add.png", sem(e -> {
			if (e instanceof ModerationPolicy) {
				ModerationPolicy mp = (ModerationPolicy) e;
				if (mp.getInContext() != null && mp.getMonitorsResource() != null
						&& !mp.getInContext().getContains().contains(mp.getMonitorsResource())) {
					mp.getInContext().getContains().add(mp.getMonitorsResource());
				}
			}
		}));
	}

	// Adds AutomationRule context resource to inContext contains list.
	@Fix(RefDslValidator.MC_G12_AUTO_CONTEXT)
	public void fixAutoAddResourceToContext(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Add context resource to inContext.contains", null, "add.png", sem(e -> {
			if (e instanceof AutomationRule) {
				AutomationRule ar = (AutomationRule) e;
				if (ar.getInContext() != null && ar.getContext() != null
						&& !ar.getInContext().getContains().contains(ar.getContext())) {
					ar.getInContext().getContains().add(ar.getContext());
				}
			}
		}));
	}

	private static ISemanticModification sem(java.util.function.Consumer<EObject> c) {
		return (element, context) -> c.accept(element);
	}

	private RefModel root(EObject o) {
		while (o != null) {
			if (o instanceof RefModel)
				return (RefModel) o;
			o = o.eContainer();
		}
		return null;
	}

	private boolean reachesUser(UserType current, UserType target, Set<UserType> visited) {
		if (current == target)
			return true;
		if (!visited.add(current))
			return false;
		for (UserType p : current.getSuperTypes()) {
			if (p != null && reachesUser(p, target, visited))
				return true;
		}
		return false;
	}

	private boolean reachesResource(ResourceType current, ResourceType target, Set<ResourceType> visited) {
		if (current == target)
			return true;
		if (!visited.add(current))
			return false;
		for (ResourceType p : current.getSuperTypes()) {
			if (p != null && reachesResource(p, target, visited))
				return true;
		}
		return false;
	}
}
