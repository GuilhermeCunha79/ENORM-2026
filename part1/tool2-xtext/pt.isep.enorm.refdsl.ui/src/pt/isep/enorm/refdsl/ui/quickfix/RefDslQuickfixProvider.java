/*
 * Custom quick fixes for REF DSL.
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
package pt.isep.enorm.refdsl.ui.quickfix;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;

import pt.isep.enorm.ref.ref.AutomationRule;
import pt.isep.enorm.ref.ref.FeedbackDefinition;
import pt.isep.enorm.ref.ref.RefModel;
import pt.isep.enorm.ref.ref.ResourceType;
import pt.isep.enorm.ref.ref.UserType;
import pt.isep.enorm.ref.ref.FeedbackType;
import pt.isep.enorm.ref.ref.ValidationRule;
import pt.isep.enorm.refdsl.validation.RefDslValidator;

public class RefDslQuickfixProvider extends DefaultQuickfixProvider {

	@Fix(RefDslValidator.INVALID_REF_MODEL_NAME)
	public void fixRefModelNameCapitalization(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Capitalize RefModel name", "Set the first letter to uppercase.", "upcase.png",
				new ISemanticModification() {
					@Override
					public void apply(EObject element, IModificationContext context) throws Exception {
						if (element instanceof RefModel) {
							RefModel m = (RefModel) element;
							String name = m.getName();
							if (name != null && !name.isEmpty())
								m.setName(name.substring(0, 1).toUpperCase() + name.substring(1));
						}
					}
				});
	}

	@Fix(RefDslValidator.INVALID_USER_TYPE_NAME)
	public void fixUserTypeNameCapitalization(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Capitalize UserType name", "Set the first letter to uppercase.", "upcase.png",
				new ISemanticModification() {
					@Override
					public void apply(EObject element, IModificationContext context) throws Exception {
						if (element instanceof UserType) {
							UserType u = (UserType) element;
							String name = u.getName();
							if (name != null && !name.isEmpty())
								u.setName(name.substring(0, 1).toUpperCase() + name.substring(1));
						}
					}
				});
	}

	@Fix(RefDslValidator.INVALID_USER_TYPE_SUPERTYPES_SELF)
	public void fixUserTypeRemoveSelfFromSuperTypes(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Remove self from superTypes", "Remove the self-reference from superTypes.", "remove.png",
				new ISemanticModification() {
					@Override
					public void apply(EObject element, IModificationContext context) throws Exception {
						if (element instanceof UserType) {
							UserType u = (UserType) element;
							u.getSuperTypes().remove(u);
						}
					}
				});
	}

	@Fix(RefDslValidator.INVALID_RESOURCE_TYPE_NAME)
	public void fixResourceTypeNameCapitalization(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Capitalize ResourceType name", "Set the first letter to uppercase.", "upcase.png",
				new ISemanticModification() {
					@Override
					public void apply(EObject element, IModificationContext context) throws Exception {
						if (element instanceof ResourceType) {
							ResourceType r = (ResourceType) element;
							String name = r.getName();
							if (name != null && !name.isEmpty())
								r.setName(name.substring(0, 1).toUpperCase() + name.substring(1));
						}
					}
				});
	}

	@Fix(RefDslValidator.INVALID_FEEDBACK_TYPE_NAME)
	public void fixFeedbackTypeNameCapitalization(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Capitalize FeedbackType name", "Set the first letter to uppercase.", "upcase.png",
				new ISemanticModification() {
					@Override
					public void apply(EObject element, IModificationContext context) throws Exception {
						if (element instanceof FeedbackType) {
							FeedbackType f = (FeedbackType) element;
							String name = f.getName();
							if (name != null && !name.isEmpty())
								f.setName(name.substring(0, 1).toUpperCase() + name.substring(1));
						}
					}
				});
	}

	@Fix(RefDslValidator.INVALID_FEEDBACK_DEFINITION_WRITERS)
	public void fixFeedbackDefinitionAddDefaultWriter(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Add first UserType as writer", "Add the first UserType from the model as default writer.", "add_writer.png",
				new ISemanticModification() {
					@Override
					public void apply(EObject element, IModificationContext context) throws Exception {
						if (element instanceof FeedbackDefinition) {
							FeedbackDefinition fd = (FeedbackDefinition) element;
							RefModel root = (RefModel) fd.eContainer();
							if (root != null && !root.getUserTypes().isEmpty() && (fd.getWriters() == null || fd.getWriters().isEmpty()))
								fd.getWriters().add(root.getUserTypes().get(0));
						}
					}
				});
	}

	@Fix(RefDslValidator.INVALID_VALIDATION_RULE_IMPL_ID_LENGTH)
	public void fixValidationRuleImplIdPad(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Pad implementationId to 3 characters", "Prepend default prefix so length >= 3.", "pad.png",
				new ISemanticModification() {
					@Override
					public void apply(EObject element, IModificationContext context) throws Exception {
						if (element instanceof ValidationRule) {
							ValidationRule r = (ValidationRule) element;
							String id = r.getImplementationId();
							if (id != null && id.length() < 3) {
								while (id.length() < 3) id = "v" + id;
								r.setImplementationId(id);
							}
						}
					}
				});
	}

	@Fix(RefDslValidator.INVALID_AUTOMATION_RULE_NAME)
	public void fixAutomationRuleNameCapitalization(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Capitalize AutomationRule name", "Set the first letter to uppercase.", "upcase.png",
				new ISemanticModification() {
					@Override
					public void apply(EObject element, IModificationContext context) throws Exception {
						if (element instanceof AutomationRule) {
							AutomationRule a = (AutomationRule) element;
							String name = a.getName();
							if (name != null && !name.isEmpty())
								a.setName(name.substring(0, 1).toUpperCase() + name.substring(1));
						}
					}
				});
	}
}
