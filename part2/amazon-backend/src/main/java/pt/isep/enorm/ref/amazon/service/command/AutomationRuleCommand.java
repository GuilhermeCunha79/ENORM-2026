package pt.isep.enorm.ref.amazon.service.command;

import java.util.List;
import java.util.Objects;

import pt.isep.enorm.ref.amazon.domain.enums.TriggerEvent;

public record AutomationRuleCommand(
    String name,
    TriggerEvent trigger,
    String contextResource,
    String onFeedback,
    Long contextId,
    Long usesValidationId,
    List<AutomationConditionCommand> conditions,
    List<AutomationActionCommand> actions
) {

    public AutomationRuleCommand {
        name = Objects.requireNonNull(name, "name is required").trim();
        trigger = Objects.requireNonNull(trigger, "trigger is required");
        conditions = conditions == null ? List.of() : List.copyOf(conditions);
        actions = actions == null ? List.of() : List.copyOf(actions);
    }
}
