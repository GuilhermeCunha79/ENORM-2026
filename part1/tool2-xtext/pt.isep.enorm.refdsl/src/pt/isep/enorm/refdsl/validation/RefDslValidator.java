/*
 * Custom validation rules for REF DSL.
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
package pt.isep.enorm.refdsl.validation;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;

import pt.isep.enorm.refdsl.refDsl.Attribute;
import pt.isep.enorm.refdsl.refDsl.AutomationRule;
import pt.isep.enorm.refdsl.refDsl.FeedbackDefinition;
import pt.isep.enorm.refdsl.refDsl.FeedbackType;
import pt.isep.enorm.refdsl.refDsl.RefModel;
import pt.isep.enorm.refdsl.refDsl.RefDslPackage;
import pt.isep.enorm.refdsl.refDsl.ResourceType;
import pt.isep.enorm.refdsl.refDsl.UserType;
import pt.isep.enorm.refdsl.refDsl.ValidationRule;

public class RefDslValidator extends AbstractRefDslValidator {

	public static final String INVALID_REF_MODEL_NAME = "invalidRefModelName";
	public static final String INVALID_REF_MODEL_NAME_LENGTH = "invalidRefModelNameLength";
	public static final String INVALID_USER_TYPE_NAME = "invalidUserTypeName";
	public static final String INVALID_USER_TYPE_NAME_DUPLICATE = "invalidUserTypeNameDuplicate";
	public static final String INVALID_USER_TYPE_SUPERTYPES_SELF = "invalidUserTypeSuperTypesSelf";
	public static final String INVALID_RESOURCE_TYPE_NAME = "invalidResourceTypeName";
	public static final String INVALID_RESOURCE_TYPE_NAME_LENGTH = "invalidResourceTypeNameLength";
	public static final String INVALID_RESOURCE_TYPE_NAME_DUPLICATE = "invalidResourceTypeNameDuplicate";
	public static final String INVALID_ATTRIBUTE_NAME_DUPLICATE = "invalidAttributeNameDuplicate";
	public static final String INVALID_FEEDBACK_TYPE_NAME = "invalidFeedbackTypeName";
	public static final String INVALID_FEEDBACK_TYPE_NAME_DUPLICATE = "invalidFeedbackTypeNameDuplicate";
	public static final String INVALID_FEEDBACK_DEFINITION_WRITERS = "invalidFeedbackDefinitionWriters";
	public static final String INVALID_VALIDATION_RULE_IMPL_ID_LENGTH = "invalidValidationRuleImplIdLength";
	public static final String INVALID_AUTOMATION_RULE_NAME = "invalidAutomationRuleName";
	public static final String INVALID_AUTOMATION_RULE_TRIGGER = "invalidAutomationRuleTrigger";

	@Check
	public void checkRefModelNameStartsWithCapital(RefModel model) {
		if (model.getName() != null && !model.getName().isEmpty()
				&& !Character.isUpperCase(model.getName().charAt(0))) {
			warning("RefModel name should start with a capital letter.",
					RefDslPackage.Literals.REF_MODEL__NAME,
					INVALID_REF_MODEL_NAME);
		}
	}

	@Check
	public void checkRefModelNameLength(RefModel model) {
		if (model.getName() != null && model.getName().length() <= 2) {
			error("RefModel name must have more than 2 characters.",
					RefDslPackage.Literals.REF_MODEL__NAME,
					INVALID_REF_MODEL_NAME_LENGTH);
		}
	}

	@Check
	public void checkUserTypeNameStartsWithCapital(UserType userType) {
		if (userType.getName() != null && !userType.getName().isEmpty()
				&& !Character.isUpperCase(userType.getName().charAt(0))) {
			warning("UserType name should start with a capital letter.",
					RefDslPackage.Literals.USER_TYPE__NAME,
					INVALID_USER_TYPE_NAME);
		}
	}

	@Check
	public void checkUserTypeNameUniqueness(UserType userType) {
		String name = userType.getName();
		if (name == null) return;
		RefModel root = (RefModel) userType.eContainer();
		if (root == null) return;
		for (UserType other : root.getUserTypes()) {
			if (other != userType && name.equals(other.getName())) {
				error("UserType name must be unique within the model.",
						RefDslPackage.Literals.USER_TYPE__NAME,
						INVALID_USER_TYPE_NAME_DUPLICATE);
				return;
			}
		}
	}

	@Check
	public void checkUserTypeSuperTypesNoSelf(UserType userType) {
		if (userType.getSuperTypes() != null && userType.getSuperTypes().contains(userType)) {
			error("UserType must not have self in superTypes.",
					RefDslPackage.Literals.USER_TYPE__SUPER_TYPES,
					INVALID_USER_TYPE_SUPERTYPES_SELF);
		}
	}

	@Check
	public void checkResourceTypeNameStartsWithCapital(ResourceType resourceType) {
		if (resourceType.getName() != null && !resourceType.getName().isEmpty()
				&& !Character.isUpperCase(resourceType.getName().charAt(0))) {
			warning("ResourceType name should start with a capital letter.",
					RefDslPackage.Literals.RESOURCE_TYPE__NAME,
					INVALID_RESOURCE_TYPE_NAME);
		}
	}

	@Check
	public void checkResourceTypeNameLength(ResourceType resourceType) {
		if (resourceType.getName() != null && resourceType.getName().length() <= 2) {
			error("ResourceType name must have more than 2 characters.",
					RefDslPackage.Literals.RESOURCE_TYPE__NAME,
					INVALID_RESOURCE_TYPE_NAME_LENGTH);
		}
	}

	@Check
	public void checkResourceTypeNameUniqueness(ResourceType resourceType) {
		String name = resourceType.getName();
		if (name == null) return;
		RefModel root = (RefModel) resourceType.eContainer();
		if (root == null) return;
		for (ResourceType other : root.getResourceTypes()) {
			if (other != resourceType && name.equals(other.getName())) {
				error("ResourceType name must be unique within the model.",
						RefDslPackage.Literals.RESOURCE_TYPE__NAME,
						INVALID_RESOURCE_TYPE_NAME_DUPLICATE);
				return;
			}
		}
	}

	@Check
	public void checkAttributeNameUniqueness(Attribute attribute) {
		String name = attribute.getName();
		if (name == null) return;
		EObject container = attribute.eContainer();
		if (container instanceof ResourceType) {
			ResourceType rt = (ResourceType) container;
			Set<String> names = new HashSet<>();
			for (Attribute a : rt.getAttributes()) {
				if (a != attribute && name.equals(a.getName())) {
					error("Attribute name must be unique within the ResourceType.",
							RefDslPackage.Literals.ATTRIBUTE__NAME,
							INVALID_ATTRIBUTE_NAME_DUPLICATE);
					return;
				}
			}
		}
		if (container instanceof FeedbackType) {
			FeedbackType ft = (FeedbackType) container;
			for (Attribute a : ft.getAttributes()) {
				if (a != attribute && name.equals(a.getName())) {
					error("Attribute name must be unique within the FeedbackType.",
							RefDslPackage.Literals.ATTRIBUTE__NAME,
							INVALID_ATTRIBUTE_NAME_DUPLICATE);
					return;
				}
			}
		}
	}

	@Check
	public void checkFeedbackTypeNameStartsWithCapital(FeedbackType feedbackType) {
		if (feedbackType.getName() != null && !feedbackType.getName().isEmpty()
				&& !Character.isUpperCase(feedbackType.getName().charAt(0))) {
			warning("FeedbackType name should start with a capital letter.",
					RefDslPackage.Literals.FEEDBACK_TYPE__NAME,
					INVALID_FEEDBACK_TYPE_NAME);
		}
	}

	@Check
	public void checkFeedbackTypeNameUniqueness(FeedbackType feedbackType) {
		String name = feedbackType.getName();
		if (name == null) return;
		RefModel root = (RefModel) feedbackType.eContainer();
		if (root == null) return;
		for (FeedbackType other : root.getFeedbackTypes()) {
			if (other != feedbackType && name.equals(other.getName())) {
				error("FeedbackType name must be unique within the model.",
						RefDslPackage.Literals.FEEDBACK_TYPE__NAME,
						INVALID_FEEDBACK_TYPE_NAME_DUPLICATE);
				return;
			}
		}
	}

	@Check
	public void checkFeedbackDefinitionWriters(FeedbackDefinition fd) {
		if (fd.getWriters() == null || fd.getWriters().isEmpty()) {
			warning("FeedbackDefinition should have at least one writer.",
					RefDslPackage.Literals.FEEDBACK_DEFINITION__WRITERS,
					INVALID_FEEDBACK_DEFINITION_WRITERS);
		}
	}

	@Check
	public void checkValidationRuleImplementationIdLength(ValidationRule rule) {
		String id = rule.getImplementationId();
		if (id != null && id.length() > 0 && id.length() < 3) {
			error("ValidationRule implementationId must have at least 3 characters.",
					RefDslPackage.Literals.VALIDATION_RULE__IMPLEMENTATION_ID,
					INVALID_VALIDATION_RULE_IMPL_ID_LENGTH);
		}
	}

	@Check
	public void checkAutomationRuleNameStartsWithCapital(AutomationRule rule) {
		if (rule.getName() != null && !rule.getName().isEmpty()
				&& !Character.isUpperCase(rule.getName().charAt(0))) {
			warning("AutomationRule name should start with a capital letter.",
					RefDslPackage.Literals.AUTOMATION_RULE__NAME,
					INVALID_AUTOMATION_RULE_NAME);
		}
	}

	@Check
	public void checkAutomationRuleTriggerNonEmpty(AutomationRule rule) {
		if (rule.getTrigger() == null || rule.getTrigger().trim().isEmpty()) {
			warning("AutomationRule trigger should be non-empty.",
					RefDslPackage.Literals.AUTOMATION_RULE__TRIGGER,
					INVALID_AUTOMATION_RULE_TRIGGER);
		}
	}
}
