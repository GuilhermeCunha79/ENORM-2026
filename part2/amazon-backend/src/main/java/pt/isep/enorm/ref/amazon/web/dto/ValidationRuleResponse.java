package pt.isep.enorm.ref.amazon.web.dto;

import pt.isep.enorm.ref.amazon.domain.enums.Role;
import pt.isep.enorm.ref.amazon.domain.enums.RuleSeverity;
import pt.isep.enorm.ref.amazon.domain.enums.ValidationKind;

public record ValidationRuleResponse(
    Long id,
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
}
