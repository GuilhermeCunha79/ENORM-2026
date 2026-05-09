package pt.isep.enorm.ref.amazon.web.dto;

import pt.isep.enorm.ref.amazon.domain.enums.ActionKind;
import pt.isep.enorm.ref.amazon.domain.enums.Role;

public record AuthorizationRuleResponse(
    Long id,
    String name,
    ActionKind allowedAction,
    Role actorRole,
    String resourceTarget,
    String feedbackTarget,
    Long contextId
) {
}
