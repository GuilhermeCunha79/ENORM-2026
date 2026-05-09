package pt.isep.enorm.ref.amazon.service.command;

import java.util.List;
import java.util.Objects;

import pt.isep.enorm.ref.amazon.domain.enums.ConditionOperator;

public record AutomationConditionCommand(
    String name,
    String attributeName,
    ConditionOperator operator,
    List<String> values
) {

    public AutomationConditionCommand {
        name = Objects.requireNonNull(name, "name is required").trim();
        operator = Objects.requireNonNull(operator, "operator is required");
        values = values == null ? List.of() : List.copyOf(values);
    }
}
