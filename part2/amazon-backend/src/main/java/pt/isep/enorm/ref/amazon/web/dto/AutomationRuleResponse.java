package pt.isep.enorm.ref.amazon.web.dto;

import java.util.List;

import pt.isep.enorm.ref.amazon.domain.enums.TriggerEvent;

public record AutomationRuleResponse(
    Long id,
    String name,
    TriggerEvent trigger,
    String contextResource,
    String onFeedback,
    Long contextId,
    Long usesValidationId,
    List<AutomationConditionResponse> conditions,
    List<AutomationActionResponse> actions
) {

    public AutomationRuleResponse {
        conditions = conditions == null ? List.of() : List.copyOf(conditions);
        actions = actions == null ? List.of() : List.copyOf(actions);
    }
}
