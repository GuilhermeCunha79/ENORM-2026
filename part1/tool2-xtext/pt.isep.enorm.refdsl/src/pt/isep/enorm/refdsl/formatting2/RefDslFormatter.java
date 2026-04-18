/*
 * Customized after grammar change: authorizationRules moved from ResourceType to RefModel.
 */
package pt.isep.enorm.refdsl.formatting2;

import org.eclipse.xtext.formatting2.AbstractJavaFormatter;
import org.eclipse.xtext.formatting2.IFormattableDocument;

import pt.isep.enorm.refdsl.refDsl.Attribute;
import pt.isep.enorm.refdsl.refDsl.AuthorizationRule;
import pt.isep.enorm.refdsl.refDsl.AutomationRule;
import pt.isep.enorm.refdsl.refDsl.ContextType;
import pt.isep.enorm.refdsl.refDsl.FeedbackDefinition;
import pt.isep.enorm.refdsl.refDsl.FeedbackType;
import pt.isep.enorm.refdsl.refDsl.ModerationPolicy;
import pt.isep.enorm.refdsl.refDsl.RefModel;
import pt.isep.enorm.refdsl.refDsl.ResourceRelation;
import pt.isep.enorm.refdsl.refDsl.ResourceType;
import pt.isep.enorm.refdsl.refDsl.UserType;
import pt.isep.enorm.refdsl.refDsl.ValidationRule;
import pt.isep.enorm.refdsl.refDsl.VerificationPolicy;

public class RefDslFormatter extends AbstractJavaFormatter {

	protected void format(RefModel refModel, IFormattableDocument doc) {
		for (UserType userType : refModel.getUserTypes()) {
			doc.format(userType);
		}
		for (ResourceType resourceType : refModel.getResourceTypes()) {
			doc.format(resourceType);
		}
		for (ContextType contextType : refModel.getContextTypes()) {
			doc.format(contextType);
		}
		for (ResourceRelation resourceRelation : refModel.getResourceRelations()) {
			doc.format(resourceRelation);
		}
		for (FeedbackType feedbackType : refModel.getFeedbackTypes()) {
			doc.format(feedbackType);
		}
		for (FeedbackDefinition feedbackDefinition : refModel.getFeedbackDefinitions()) {
			doc.format(feedbackDefinition);
		}
		for (AuthorizationRule authorizationRule : refModel.getAuthorizationRules()) {
			doc.format(authorizationRule);
		}
		for (ValidationRule validationRule : refModel.getValidationRules()) {
			doc.format(validationRule);
		}
		for (ModerationPolicy moderationPolicy : refModel.getModerationPolicies()) {
			doc.format(moderationPolicy);
		}
		for (AutomationRule automationRule : refModel.getAutomationRules()) {
			doc.format(automationRule);
		}
		for (VerificationPolicy verificationPolicy : refModel.getVerificationPolicies()) {
			doc.format(verificationPolicy);
		}
	}

	protected void format(ResourceType resourceType, IFormattableDocument doc) {
		for (Attribute attribute : resourceType.getAttributes()) {
			doc.format(attribute);
		}
	}
}
