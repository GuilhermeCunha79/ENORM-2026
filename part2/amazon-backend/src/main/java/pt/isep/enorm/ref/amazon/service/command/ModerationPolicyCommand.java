package pt.isep.enorm.ref.amazon.service.command;

import java.util.Objects;

import pt.isep.enorm.ref.amazon.domain.enums.ModerationDecision;
import pt.isep.enorm.ref.amazon.domain.enums.ModerationMode;
import pt.isep.enorm.ref.amazon.domain.enums.Role;
import pt.isep.enorm.ref.amazon.domain.enums.TriggerEvent;

public record ModerationPolicyCommand(
    String name,
    ModerationMode mode,
    TriggerEvent trigger,
    ModerationDecision decision,
    String monitorsResource,
    String monitorsFeedback,
    Role executedByRole,
    Long contextId
) {

    public ModerationPolicyCommand {
        name = Objects.requireNonNull(name, "name is required").trim();
        mode = Objects.requireNonNull(mode, "mode is required");
        trigger = Objects.requireNonNull(trigger, "trigger is required");
        decision = Objects.requireNonNull(decision, "decision is required");
    }
}
