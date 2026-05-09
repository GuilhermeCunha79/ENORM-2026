package pt.isep.enorm.ref.amazon.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import pt.isep.enorm.ref.amazon.domain.enums.ActionKind;
import pt.isep.enorm.ref.amazon.domain.enums.Role;

public record AuthorizationRuleRequest(
    @NotBlank String name,
    @NotNull ActionKind allowedAction,
    @NotNull Role actorRole,
    String resourceTarget,
    String feedbackTarget,
    Long contextId
) {

    public AuthorizationRuleRequest {
        name = name == null ? null : name.trim();
    }
}
