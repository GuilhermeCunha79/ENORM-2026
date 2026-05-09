package pt.isep.enorm.ref.amazon.web.dto;

import pt.isep.enorm.ref.amazon.domain.enums.ModerationDecision;
import pt.isep.enorm.ref.amazon.domain.enums.ModerationMode;
import pt.isep.enorm.ref.amazon.domain.enums.Role;
import pt.isep.enorm.ref.amazon.domain.enums.TriggerEvent;

public record ModerationPolicyResponse(
    Long id,
    String name,
    ModerationMode mode,
    TriggerEvent trigger,
    ModerationDecision decision,
    String monitorsResource,
    String monitorsFeedback,
    Role executedByRole,
    Long contextId
) {
}
