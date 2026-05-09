package pt.isep.enorm.ref.amazon.service.command;

import java.util.Objects;

import pt.isep.enorm.ref.amazon.domain.enums.ActionKind;
import pt.isep.enorm.ref.amazon.domain.enums.Role;

public record AuthorizationRuleCommand(
    String name,
    ActionKind allowedAction,
    Role actorRole,
    String resourceTarget,
    String feedbackTarget,
    Long contextId
) {

    public AuthorizationRuleCommand {
        name = Objects.requireNonNull(name, "name is required").trim();
        allowedAction = Objects.requireNonNull(allowedAction, "allowedAction is required");
        actorRole = Objects.requireNonNull(actorRole, "actorRole is required");
    }
}
