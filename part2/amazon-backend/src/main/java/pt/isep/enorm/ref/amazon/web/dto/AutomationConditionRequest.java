package pt.isep.enorm.ref.amazon.web.dto;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import pt.isep.enorm.ref.amazon.domain.enums.ConditionOperator;

public record AutomationConditionRequest(
    @NotBlank String name,
    String attributeName,
    @NotNull ConditionOperator operator,
    List<String> values
) {

    public AutomationConditionRequest {
        name = name == null ? null : name.trim();
        values = values == null ? List.of() : List.copyOf(values);
    }
}
