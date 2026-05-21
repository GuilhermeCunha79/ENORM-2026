/*
 * P1 Activity 6: textual + PlantUML projections.
 * P2 Activity 5/6: Spring Boot backend skeleton under generated-backend/<scenario>/.
 */
package pt.isep.enorm.refdsl.generator

import java.lang.StringBuilder
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import pt.isep.enorm.refdsl.refDsl.AuthorizationRule
import pt.isep.enorm.refdsl.refDsl.RefModel

/**
 * Generates projections and REF backend code from .refdsl models.
 */
class RefDslGenerator extends AbstractGenerator {

	val RefBackendGenerator backendGenerator = new RefBackendGenerator

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val roots = resource.contents.filter(RefModel).toList
		if (!roots.isEmpty) {
			for (model : roots) {
				val baseName = safeFileName(model.name)
				val texto = buildTextProjection(model)
				val plantuml = buildPlantUmlProjection(model)
				fsa.generateFile('''projections/«baseName».txt''', texto)
				fsa.generateFile('''projections/«baseName».puml''', plantuml)
				backendGenerator.generate(model, fsa)
			}
		}
	}

	def String safeFileName(String name) {
		if (name === null || name.empty)
			return "UnnamedRefModel"
		name.replaceAll("[^A-Za-z0-9_-]", "_")
	}

	/** Percorre o modelo e devolve texto legível (Activity 6). */
	def String buildTextProjection(RefModel m) {
		val sb = new StringBuilder
		sb.append("REF MODEL: ").append(nullToEmpty(m.name))
		sb.append(" (version=").append(nullToEmpty(m.version)).append(")\n\n")

		sb.append("USER TYPES:\n")
		for (u : m.userTypes) {
			sb.append("- ").append(nullToEmpty(u.name)).append(" kind=").append(u.kind)
			sb.append(" superTypes=").append(u.superTypes.map[name].join(", ")).append("\n")
		}

		sb.append("\nRESOURCE TYPES:\n")
		for (r : m.resourceTypes) {
			sb.append("- ").append(nullToEmpty(r.name)).append(" supportsMedia=").append(r.supportsMedia)
			sb.append(" superTypes=").append(r.superTypes.map[name].join(", ")).append("\n")
			sb.append("  ATTRIBUTES:\n")
			for (a : r.attributes) {
				sb.append("  * ").append(nullToEmpty(a.name)).append(" : ").append(a.type)
				sb.append(" required=").append(a.required).append(" multi=").append(a.multiValued).append("\n")
			}
		}

		sb.append("\nCONTEXT TYPES:\n")
		for (c : m.contextTypes) {
			sb.append("- ").append(nullToEmpty(c.name)).append(" kind=").append(c.kind)
			sb.append(" contains=[").append(c.contains.map[name].join(", ")).append("]\n")
		}

		sb.append("\nRESOURCE RELATIONS:\n")
		for (rr : m.resourceRelations) {
			sb.append("- ").append(nullToEmpty(rr.name))
			sb.append(" source=").append(rr.source?.name).append(" target=").append(rr.target?.name)
			sb.append(" srcCard=").append(nullToEmpty(rr.sourceCardinality)).append(" tgtCard=").append(nullToEmpty(rr.targetCardinality))
			sb.append(" containment=").append(rr.containment).append(" recursive=").append(rr.recursive).append("\n")
		}

		sb.append("\nFEEDBACK TYPES:\n")
		for (f : m.feedbackTypes) {
			sb.append("- ").append(nullToEmpty(f.name)).append(" kind=").append(f.kind)
			sb.append(" scope=").append(f.subjectScope).append(" hasRating=").append(f.hasRating)
			sb.append(" recursive=").append(f.recursive).append(" allowsText=").append(f.allowsText)
			sb.append(" allowsMedia=").append(f.allowsMedia).append(" polarity=").append(f.polarity).append("\n")
		}

		sb.append("\nFEEDBACK DEFINITIONS:\n")
		for (fd : m.feedbackDefinitions) {
			sb.append("- ").append(nullToEmpty(fd.name)).append(" type=").append(fd.type?.name)
			sb.append(" author=").append(fd.author?.name).append(" subjectResource=").append(fd.subjectResource?.name)
			sb.append(" subjectFeedback=").append(fd.subjectFeedback?.name).append("\n")
			sb.append("  requiresVerifiedContext=").append(fd.requiresVerifiedContext).append(" verificationRequirement=").append(fd.verificationRequirement)
			sb.append(" uniquePerAuthorTarget=").append(fd.uniquePerAuthorTarget).append("\n")
			sb.append("  policy.status=").append(fd.policy?.status).append("\n")
			if (fd.rating !== null)
				sb.append("  rating=[min=").append(fd.rating.minValue).append(" max=").append(fd.rating.maxValue)
					.append(" step=").append(fd.rating.step).append("]\n")
		}

		sb.append("\nAUTHORIZATION RULES:\n")
		for (ar : m.authorizationRules) {
			sb.append("- name=").append(ar.name).append(" action=").append(ar.allowedAction).append(" actor=").append(ar.actor?.name)
			sb.append(" context=").append(ar.context?.name).append(" resourceTarget=").append(ar.resourceTarget?.name)
			sb.append(" feedbackTarget=").append(ar.feedbackTarget?.name).append("\n")
		}

		sb.append("\nVALIDATION RULES:\n")
		for (v : m.validationRules) {
			sb.append("- ").append(nullToEmpty(v.name)).append(" kind=").append(v.kind).append(" severity=").append(v.severity)
			sb.append(" expr=").append(nullToEmpty(v.expression)).append(" impl=").append(nullToEmpty(v.implementationId))
			sb.append(" appliesToResource=").append(v.appliesToResource?.name).append(" appliesToFeedback=").append(v.appliesToFeedback?.name)
			sb.append(" invokedBy=").append(v.invokedBy?.name).append("\n")
		}

		sb.append("\nMODERATION POLICIES:\n")
		for (mp : m.moderationPolicies) {
			sb.append("- ").append(nullToEmpty(mp.name)).append(" mode=").append(mp.mode).append(" trigger=").append(mp.trigger)
			sb.append(" decision=").append(mp.decision).append(" executedBy=").append(mp.executedBy?.name).append(" inContext=").append(mp.inContext?.name).append("\n")
			sb.append("  monitorsResource=").append(mp.monitorsResource?.name).append(" monitorsFeedback=").append(mp.monitorsFeedback?.name).append("\n")
		}

		sb.append("\nAUTOMATION RULES:\n")
		for (a : m.automationRules) {
			sb.append("- ").append(nullToEmpty(a.name)).append(" trigger=").append(a.trigger)
			sb.append(" context=").append(a.context?.name).append(" inContext=").append(a.inContext?.name)
			sb.append(" onFeedback=").append(a.onFeedback?.name).append(" uses=").append(a.uses?.name)
			sb.append(" invokedValidationRules=[").append(a.invokedValidationRules.map[name].join(", ")).append("]\n")
			sb.append("  CONDITIONS:\n")
			for (cond : a.conditions) {
				sb.append("    * ").append(nullToEmpty(cond.name)).append(" operator=").append(cond.operator)
				sb.append(" attribute=").append(cond.attribute?.name).append(" values=[")
				sb.append(cond.children.map[value].join(", ")).append("]\n")
			}
			sb.append("  ACTIONS:\n")
			for (act : a.actions) {
				sb.append("    * ").append(nullToEmpty(act.name)).append(" kind=").append(act.kind).append(" message=").append(act.message).append("\n")
			}
		}

		sb.append("\nVERIFICATION POLICIES:\n")
		for (vp : m.verificationPolicies) {
			sb.append("- ").append(nullToEmpty(vp.name)).append(" mode=").append(vp.mode).append(" appliesWhen=").append(vp.appliesWhen)
			sb.append(" verifies=").append(vp.verifies?.name).append("\n")
		}

		sb.append("\nSORTING POLICIES:\n")
		for (sp : m.sortingPolicies) {
			sb.append("- ").append(nullToEmpty(sp.name)).append(" criterion=").append(sp.criterion).append(" direction=").append(sp.direction)
			sb.append(" appliesToResource=").append(sp.appliesToResource?.name).append(" appliesToFeedback=").append(sp.appliesToFeedback?.name)
			sb.append(" inContext=").append(sp.inContext?.name).append("\n")
		}

		sb.toString
	}

	/** Diagrama objeto-relacional compacto para PlantUML. */
	def String buildPlantUmlProjection(RefModel m) {
		val sb = new StringBuilder
		sb.append("@startuml\n")
		sb.append("title REF Model - ").append(nullToEmpty(m.name)).append("\n")
		sb.append("skinparam classAttributeIconSize 0\n\n")

		sb.append("class RefModel {\n  name = ").append(nullToEmpty(m.name))
		sb.append("\n  version = ").append(nullToEmpty(m.version)).append("\n}\n")

		for (u : m.userTypes) {
			sb.append("\nclass UserType_").append(safeId(u.name)).append(" {\n  name = ").append(u.name)
			sb.append("\n  kind = ").append(u.kind).append("\n}\n")
			sb.append("RefModel --> UserType_").append(safeId(u.name)).append("\n")
			for (st : u.superTypes) {
				sb.append("UserType_").append(safeId(u.name)).append(" --|> UserType_").append(safeId(st.name)).append("\n")
			}
		}

		for (r : m.resourceTypes) {
			sb.append("\nclass ResourceType_").append(safeId(r.name)).append(" {\n  name = ").append(r.name)
			sb.append("\n  supportsMedia = ").append(r.supportsMedia).append("\n}\n")
			sb.append("RefModel --> ResourceType_").append(safeId(r.name)).append("\n")
			for (st : r.superTypes) {
				sb.append("ResourceType_").append(safeId(r.name)).append(" --|> ResourceType_").append(safeId(st.name)).append("\n")
			}
			for (a : r.attributes) {
				sb.append("class Attribute_").append(safeId(r.name)).append("_").append(safeId(a.name)).append(" {\n")
				sb.append("  name = ").append(a.name).append("\n  type = ").append(a.type)
				sb.append("\n  required = ").append(a.required).append("\n  multiValued = ").append(a.multiValued).append("\n}\n")
				sb.append("ResourceType_").append(safeId(r.name)).append(" *-- Attribute_").append(safeId(r.name))
				sb.append("_").append(safeId(a.name)).append("\n")
			}
		}

		for (c : m.contextTypes) {
			sb.append("\nclass ContextType_").append(safeId(c.name)).append(" {\n  name = ").append(c.name)
			sb.append("\n  kind = ").append(c.kind).append("\n}\n")
			sb.append("RefModel --> ContextType_").append(safeId(c.name)).append("\n")
			for (ct : c.contains) {
				sb.append("ContextType_").append(safeId(c.name)).append(" --> ResourceType_").append(safeId(ct.name)).append(" : contains\n")
			}
		}

		for (rr : m.resourceRelations) {
			sb.append("ResourceType_").append(safeId(rr.source?.name)).append(" --> ResourceType_")
			sb.append(safeId(rr.target?.name)).append(" : ").append(rr.name).append(" [")
			sb.append(rr.sourceCardinality).append("..").append(rr.targetCardinality).append("] recursive=").append(rr.recursive).append("\n")
		}

		for (f : m.feedbackTypes) {
			sb.append("\nclass FeedbackType_").append(safeId(f.name)).append(" {\n  name = ").append(f.name)
			sb.append("\n  kind = ").append(f.kind).append("\n  subjectScope = ").append(f.subjectScope).append("\n  hasRating = ").append(f.hasRating)
			sb.append("\n  recursive = ").append(f.recursive).append("\n  allowsText = ").append(f.allowsText)
			sb.append("\n  allowsMedia = ").append(f.allowsMedia).append("\n  polarity = ").append(f.polarity).append("\n}\n")
			sb.append("RefModel --> FeedbackType_").append(safeId(f.name)).append("\n")
		}

		for (fd : m.feedbackDefinitions) {
			sb.append("\nclass FeedbackDefinition_").append(safeId(fd.name)).append(" {\n  name = ").append(fd.name)
			sb.append("\n  requiresVerifiedContext = ").append(fd.requiresVerifiedContext).append("\n  verificationRequirement = ").append(fd.verificationRequirement)
			sb.append("\n  uniquePerAuthorTarget = ").append(fd.uniquePerAuthorTarget).append("\n}\n")
			sb.append("RefModel --> FeedbackDefinition_").append(safeId(fd.name)).append("\n")
			sb.append("FeedbackDefinition_").append(safeId(fd.name)).append(" --> FeedbackType_").append(safeId(fd.type?.name)).append(" : type\n")
			sb.append("FeedbackDefinition_").append(safeId(fd.name)).append(" --> UserType_").append(safeId(fd.author?.name)).append(" : author\n")
			if (fd.subjectResource !== null) {
				sb.append("FeedbackDefinition_").append(safeId(fd.name)).append(" --> ResourceType_").append(safeId(fd.subjectResource.name)).append(" : subjectResource\n")
			}
			if (fd.subjectFeedback !== null) {
				sb.append("FeedbackDefinition_").append(safeId(fd.name)).append(" --> FeedbackDefinition_").append(safeId(fd.subjectFeedback.name)).append(" : subjectFeedback\n")
			}
			if (fd.policy !== null) {
				sb.append("class FeedbackPolicy_").append(safeId(fd.name)).append(" {\n  status = ").append(fd.policy.status).append("\n}\n")
				sb.append("FeedbackDefinition_").append(safeId(fd.name)).append(" *-- FeedbackPolicy_").append(safeId(fd.name)).append("\n")
			}
			if (fd.rating !== null) {
				sb.append("class RatingPolicy_").append(safeId(fd.name)).append(" {\n  min = ").append(fd.rating.minValue).append("\n  max = ")
					.append(fd.rating.maxValue).append("\n  step = ").append(fd.rating.step).append("\n}\n")
				sb.append("FeedbackDefinition_").append(safeId(fd.name)).append(" *-- RatingPolicy_").append(safeId(fd.name)).append("\n")
			}
		}

		for (v : m.validationRules) {
			sb.append("\nclass ValidationRule_").append(safeId(v.name)).append(" {\n  name = ").append(v.name)
			sb.append("\n  kind = ").append(v.kind).append("\n  severity = ").append(v.severity)
			sb.append("\n  expression = ").append(v.expression).append("\n  implementationId = ").append(v.implementationId).append("\n}\n")
			sb.append("RefModel --> ValidationRule_").append(safeId(v.name)).append("\n")
			if (v.appliesToResource !== null)
				sb.append("ValidationRule_").append(safeId(v.name)).append(" --> ResourceType_").append(safeId(v.appliesToResource.name)).append(" : appliesToResource\n")
			if (v.appliesToFeedback !== null)
				sb.append("ValidationRule_").append(safeId(v.name)).append(" --> FeedbackDefinition_").append(safeId(v.appliesToFeedback.name)).append(" : appliesToFeedback\n")
		}

		for (ar : m.authorizationRules) {
			val id = authRuleId(ar)
			sb.append("\nclass AuthorizationRule_").append(id).append(" {\n  name = ").append(ar.name).append("\n  allowedAction = ").append(ar.allowedAction).append("\n}\n")
			sb.append("RefModel --> AuthorizationRule_").append(id).append("\n")
			sb.append("AuthorizationRule_").append(id).append(" --> UserType_").append(safeId(ar.actor?.name)).append(" : actor\n")
			sb.append("AuthorizationRule_").append(id).append(" --> ResourceType_").append(safeId(ar.resourceTarget?.name)).append(" : resourceTarget\n")
			if (ar.feedbackTarget !== null)
				sb.append("AuthorizationRule_").append(id).append(" --> FeedbackDefinition_").append(safeId(ar.feedbackTarget.name)).append(" : feedbackTarget\n")
			if (ar.context !== null)
				sb.append("AuthorizationRule_").append(id).append(" --> ContextType_").append(safeId(ar.context.name)).append(" : context\n")
		}

		for (mp : m.moderationPolicies) {
			sb.append("\nclass ModerationPolicy_").append(safeId(mp.name)).append(" {\n  name = ").append(mp.name)
			sb.append("\n  mode = ").append(mp.mode).append("\n  trigger = ").append(mp.trigger).append("\n  decision = ").append(mp.decision).append("\n}\n")
			sb.append("RefModel --> ModerationPolicy_").append(safeId(mp.name)).append("\n")
			sb.append("ModerationPolicy_").append(safeId(mp.name)).append(" --> ResourceType_").append(safeId(mp.monitorsResource?.name)).append(" : monitorsResource\n")
			sb.append("ModerationPolicy_").append(safeId(mp.name)).append(" --> FeedbackDefinition_").append(safeId(mp.monitorsFeedback?.name)).append(" : monitorsFeedback\n")
			sb.append("ModerationPolicy_").append(safeId(mp.name)).append(" --> UserType_").append(safeId(mp.executedBy?.name)).append(" : executedBy\n")
			if (mp.inContext !== null)
				sb.append("ModerationPolicy_").append(safeId(mp.name)).append(" --> ContextType_").append(safeId(mp.inContext.name)).append(" : inContext\n")
		}

		for (a : m.automationRules) {
			sb.append("\nclass AutomationRule_").append(safeId(a.name)).append(" {\n  name = ").append(a.name).append("\n  trigger = ").append(a.trigger).append("\n}\n")
			sb.append("RefModel --> AutomationRule_").append(safeId(a.name)).append("\n")
			if (a.context !== null)
				sb.append("AutomationRule_").append(safeId(a.name)).append(" --> ResourceType_").append(safeId(a.context.name)).append(" : context\n")
			if (a.inContext !== null)
				sb.append("AutomationRule_").append(safeId(a.name)).append(" --> ContextType_").append(safeId(a.inContext.name)).append(" : inContext\n")
			sb.append("AutomationRule_").append(safeId(a.name)).append(" --> FeedbackDefinition_").append(safeId(a.onFeedback?.name)).append(" : onFeedback\n")
			sb.append("AutomationRule_").append(safeId(a.name)).append(" --> ValidationRule_").append(safeId(a.uses?.name)).append(" : uses\n")
			for (cond : a.conditions) {
				sb.append("AutomationRule_").append(safeId(a.name)).append(" --> Condition_").append(safeId(a.name)).append('_').append(safeId(cond.name)).append(" : condition\n")
			}
			for (act : a.actions) {
				sb.append("AutomationRule_").append(safeId(a.name)).append(" --> Action_").append(safeId(a.name)).append('_').append(safeId(act.name)).append(" : action\n")
			}
		}
		for (a : m.automationRules) {
			for (cond : a.conditions) {
				sb.append("class Condition_").append(safeId(a.name)).append('_').append(safeId(cond.name)).append(" {\n")
				sb.append("  name = ").append(cond.name).append("\n  operator = ").append(cond.operator)
				sb.append("\n  attribute = ").append(cond.attribute?.name).append("\n}\n")
			}
			for (act : a.actions) {
				sb.append("class Action_").append(safeId(a.name)).append('_').append(safeId(act.name)).append(" {\n")
				sb.append("  name = ").append(act.name).append("\n  kind = ").append(act.kind).append("\n  message = ").append(act.message).append("\n}\n")
			}
		}

		for (vp : m.verificationPolicies) {
			sb.append("\nclass VerificationPolicy_").append(safeId(vp.name)).append(" {\n  name = ").append(vp.name)
			sb.append("\n  mode = ").append(vp.mode).append("\n  appliesWhen = ").append(vp.appliesWhen).append("\n}\n")
			sb.append("RefModel --> VerificationPolicy_").append(safeId(vp.name)).append("\n")
			sb.append("VerificationPolicy_").append(safeId(vp.name)).append(" --> FeedbackDefinition_").append(safeId(vp.verifies?.name)).append(" : verifies\n")
		}

		for (sp : m.sortingPolicies) {
			sb.append("\nclass SortingPolicy_").append(safeId(sp.name)).append(" {\n  name = ").append(sp.name)
			sb.append("\n  criterion = ").append(sp.criterion).append("\n  direction = ").append(sp.direction).append("\n}\n")
			sb.append("RefModel --> SortingPolicy_").append(safeId(sp.name)).append("\n")
			sb.append("SortingPolicy_").append(safeId(sp.name)).append(" --> ResourceType_").append(safeId(sp.appliesToResource?.name))
			sb.append(" : appliesToResource\n")
			sb.append("SortingPolicy_").append(safeId(sp.name)).append(" --> FeedbackDefinition_").append(safeId(sp.appliesToFeedback?.name))
			sb.append(" : appliesToFeedback\n")
			sb.append("SortingPolicy_").append(safeId(sp.name)).append(" --> ContextType_").append(safeId(sp.inContext?.name)).append(" : inContext\n")
		}

		sb.append("\n@enduml\n")
		sb.toString
	}

	def String nullToEmpty(String s) {
		if (s === null) "" else s
	}

	def String authRuleId(AuthorizationRule ar) {
		if (ar?.name !== null && !ar.name.empty) {
			return safeId(ar.name)
		}
		safeId(ar.allowedAction.literal + '_' + ar.actor?.name)
	}

	def String safeId(String raw) {
		if (raw === null || raw.empty) {
			return "UNNAMED"
		}
		raw.replaceAll("[^A-Za-z0-9_]", "_")
	}
}
