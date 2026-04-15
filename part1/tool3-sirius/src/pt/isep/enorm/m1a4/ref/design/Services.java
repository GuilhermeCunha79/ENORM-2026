package pt.isep.enorm.m1a4.ref.design;

import org.eclipse.emf.ecore.EObject;
import pt.isep.enorm.m1a4.sirius.AuthorizationRule;
import pt.isep.enorm.m1a4.sirius.AutomationRule;
import pt.isep.enorm.m1a4.sirius.FeedbackDefinition;
import pt.isep.enorm.m1a4.sirius.ModerationPolicy;
import pt.isep.enorm.m1a4.sirius.RefFactory;
import pt.isep.enorm.m1a4.sirius.RefModel;
import pt.isep.enorm.m1a4.sirius.VerificationPolicy;
import pt.isep.enorm.m1a4.sirius.ValidationKind;

/**
 * Services exposed to Sirius expressions. Keeping a stable service class
 * allows future quick fixes to call Java helpers when AQL-only operations
 * are not enough.
 */
public class Services {

    public EObject identity(EObject self) {
        return self;
    }

    // G8 quick-fix helper: create a default VerificationPolicy when required.
    public boolean ensureVerificationPolicy(FeedbackDefinition self) {
        if (self == null || !self.isRequiresVerifiedContext()) {
            return self != null && self.isRequiresVerifiedContext();
        }
        if (!(self.eContainer() instanceof RefModel model)) {
            return self.isRequiresVerifiedContext();
        }

        boolean exists = model.getVerificationPolicies().stream().anyMatch(vp -> vp.getVerifies() == self);
        if (!exists) {
            VerificationPolicy vp = RefFactory.eINSTANCE.createVerificationPolicy();
            String baseName = self.getName() == null || self.getName().isEmpty() ? "Feedback" : self.getName();
            vp.setName(baseName + "Verification");
            vp.setMode(ValidationKind.MANUAL);
            vp.setAppliesWhen("onCreate");
            vp.setVerifies(self);
            model.getVerificationPolicies().add(vp);
        }
        return self.isRequiresVerifiedContext();
    }

    // G10 quick-fix helper: ensure selected context contains resourceTarget.
    public EObject ensureAuthorizationContextContainsResourceTarget(AuthorizationRule self) {
        if (self != null && self.getContext() != null && self.getResourceTarget() != null
                && !self.getContext().getContains().contains(self.getResourceTarget())) {
            self.getContext().getContains().add(self.getResourceTarget());
        }
        return self == null ? null : self.getContext();
    }

    // G11 quick-fix helper: ensure inContext contains monitorsResource.
    public EObject ensureModerationContextContainsMonitorsResource(ModerationPolicy self) {
        if (self != null && self.getInContext() != null && self.getMonitorsResource() != null
                && !self.getInContext().getContains().contains(self.getMonitorsResource())) {
            self.getInContext().getContains().add(self.getMonitorsResource());
        }
        return self == null ? null : self.getInContext();
    }

    // G12 quick-fix helper: ensure inContext contains automation context resource.
    public EObject ensureAutomationInContextContainsContextResource(AutomationRule self) {
        if (self != null && self.getInContext() != null && self.getContext() != null
                && !self.getInContext().getContains().contains(self.getContext())) {
            self.getInContext().getContains().add(self.getContext());
        }
        return self == null ? null : self.getInContext();
    }
}

