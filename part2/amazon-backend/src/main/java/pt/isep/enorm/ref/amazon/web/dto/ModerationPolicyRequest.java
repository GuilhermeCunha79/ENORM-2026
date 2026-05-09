package pt.isep.enorm.ref.amazon.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import pt.isep.enorm.ref.amazon.domain.enums.ModerationDecision;
import pt.isep.enorm.ref.amazon.domain.enums.ModerationMode;
import pt.isep.enorm.ref.amazon.domain.enums.Role;
import pt.isep.enorm.ref.amazon.domain.enums.TriggerEvent;

public record ModerationPolicyRequest(
    @NotBlank String name,
    @NotNull ModerationMode mode,
    @NotNull TriggerEvent trigger,
    @NotNull ModerationDecision decision,
    String monitorsResource,
    String monitorsFeedback,
    Role executedByRole,
    Long contextId
) {

    public ModerationPolicyRequest {
        name = name == null ? null : name.trim();
    }
}
