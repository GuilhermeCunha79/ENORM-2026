package pt.isep.enorm.ref.service.generated;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pt.isep.enorm.ref.dto.ModerationSimulationResult;
import pt.isep.enorm.ref.domain.ModerationPolicy;
import pt.isep.enorm.ref.repository.ModerationPolicyRepository;

@Service
public class GeneratedModerationService {
    private final ModerationPolicyRepository moderationPolicyRepository;

    public GeneratedModerationService(ModerationPolicyRepository moderationPolicyRepository) {
        this.moderationPolicyRepository = moderationPolicyRepository;
    }

    /** Simulate moderation for a trigger event; AUTOMATIC applies the policy decision, MANUAL/HYBRID needs a human. */
    @Transactional(readOnly = true)
    public List<ModerationSimulationResult> simulate(String triggerEvent) {
        List<ModerationSimulationResult> results = new ArrayList<>();
        for (ModerationPolicy policy : moderationPolicyRepository.findAll()) {
            boolean triggerMatches = triggerEvent == null || triggerEvent.isBlank()
                || triggerEvent.equalsIgnoreCase(policy.getTriggerEvent());
            if (!triggerMatches) {
                continue;
            }
            String mode = policy.getMode();
            boolean manual = "MANUAL".equalsIgnoreCase(mode);
            boolean hybrid = "HYBRID".equalsIgnoreCase(mode);
            boolean requiresHuman = manual || hybrid;
            String decision = manual ? "PENDING_REVIEW" : policy.getDecision();
            results.add(new ModerationSimulationResult(policy.getName(), mode, decision, requiresHuman, describe(policy)));
        }
        return results;
    }

    /** Override in manual ModerationService for scenario-specific moderation logic. */
    protected String describe(ModerationPolicy policy) {
        return "Simulated decision for policy " + policy.getName();
    }
}
