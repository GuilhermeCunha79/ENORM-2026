package pt.isep.enorm.ref.amazon.service.command;

import java.util.Objects;

import pt.isep.enorm.ref.amazon.domain.enums.Role;
import pt.isep.enorm.ref.amazon.domain.enums.RuleSeverity;
import pt.isep.enorm.ref.amazon.domain.enums.ValidationKind;

public record ValidationRuleCommand(
    String name,
    ValidationKind kind,
    RuleSeverity severity,
    String expression,
    String implementationId,
    String appliesToResource,
    String appliesToFeedback,
    Role appliesToRole,
    Long invokedByRuleId
) {

    public ValidationRuleCommand {
        name = Objects.requireNonNull(name, "name is required").trim();
        kind = Objects.requireNonNull(kind, "kind is required");
        severity = Objects.requireNonNull(severity, "severity is required");
    }
}
