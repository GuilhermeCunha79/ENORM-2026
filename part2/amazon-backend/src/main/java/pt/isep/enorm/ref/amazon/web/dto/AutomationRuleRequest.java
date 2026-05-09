package pt.isep.enorm.ref.amazon.web.dto;

import java.util.List;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import pt.isep.enorm.ref.amazon.domain.enums.TriggerEvent;

public record AutomationRuleRequest(
    @NotBlank String name,
    @NotNull TriggerEvent trigger,
    String contextResource,
    String onFeedback,
    Long contextId,
    Long usesValidationId,
    List<@Valid AutomationConditionRequest> conditions,
    List<@Valid AutomationActionRequest> actions
) {

    public AutomationRuleRequest {
        name = name == null ? null : name.trim();
        conditions = conditions == null ? List.of() : List.copyOf(conditions);
        actions = actions == null ? List.of() : List.copyOf(actions);
    }
}
