/*
 * Custom scoping: Condition.attribute must resolve to Attribute elements declared under ResourceTypes.
 * Default Xtext scope only searches the containment tree, so "attribute title" failed outside ResourceType.
 */
package pt.isep.enorm.refdsl.scoping;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;

import pt.isep.enorm.refdsl.refDsl.Attribute;
import pt.isep.enorm.refdsl.refDsl.AutomationRule;
import pt.isep.enorm.refdsl.refDsl.Condition;
import pt.isep.enorm.refdsl.refDsl.RefModel;
import pt.isep.enorm.refdsl.refDsl.RefDslPackage;
import pt.isep.enorm.refdsl.refDsl.ResourceType;

public class RefDslScopeProvider extends AbstractRefDslScopeProvider {

	@Override
	public IScope getScope(EObject context, EReference reference) {
		if (reference == RefDslPackage.Literals.CONDITION__ATTRIBUTE) {
			Condition cond = context instanceof Condition ? (Condition) context
					: EcoreUtil2.getContainerOfType(context, Condition.class);
			if (cond == null)
				return super.getScope(context, reference);
			AutomationRule rule = EcoreUtil2.getContainerOfType(cond, AutomationRule.class);
			// Prefer attributes of the rule's context resource (matches metamodel intent).
			if (rule != null && rule.getContext() != null) {
				return Scopes.scopeFor(rule.getContext().getAttributes());
			}
			RefModel rm = getRefModel(cond);
			if (rm != null) {
				List<Attribute> attrs = new ArrayList<>();
				for (ResourceType rt : rm.getResourceTypes()) {
					attrs.addAll(rt.getAttributes());
				}
				return Scopes.scopeFor(attrs);
			}
		}
		return super.getScope(context, reference);
	}

	private static RefModel getRefModel(EObject o) {
		for (EObject cur = o; cur != null; cur = cur.eContainer()) {
			if (cur instanceof RefModel)
				return (RefModel) cur;
		}
		return null;
	}
}
