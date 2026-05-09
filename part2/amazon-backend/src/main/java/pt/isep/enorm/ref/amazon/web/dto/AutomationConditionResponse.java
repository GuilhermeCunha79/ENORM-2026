package pt.isep.enorm.ref.amazon.web.dto;

import java.util.List;

import pt.isep.enorm.ref.amazon.domain.enums.ConditionOperator;

public record AutomationConditionResponse(
    Long id,
    String name,
    String attributeName,
    ConditionOperator operator,
    List<String> values
) {

    public AutomationConditionResponse {
        values = values == null ? List.of() : List.copyOf(values);
    }
}
