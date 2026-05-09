package pt.isep.enorm.ref.amazon.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import pt.isep.enorm.ref.amazon.domain.enums.Role;
import pt.isep.enorm.ref.amazon.domain.enums.RuleSeverity;
import pt.isep.enorm.ref.amazon.domain.enums.ValidationKind;

public record ValidationRuleRequest(
    @NotBlank String name,
    @NotNull ValidationKind kind,
    @NotNull RuleSeverity severity,
    String expression,
    String implementationId,
    String appliesToResource,
    String appliesToFeedback,
    Role appliesToRole,
    Long invokedByRuleId
) {

    public ValidationRuleRequest {
        name = name == null ? null : name.trim();
    }
}
