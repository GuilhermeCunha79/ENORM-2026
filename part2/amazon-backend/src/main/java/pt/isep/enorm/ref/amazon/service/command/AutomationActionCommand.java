package pt.isep.enorm.ref.amazon.service.command;

import java.util.Objects;

import pt.isep.enorm.ref.amazon.domain.enums.ActionResultKind;

public record AutomationActionCommand(String name, ActionResultKind kind, String message) {

    public AutomationActionCommand {
        name = Objects.requireNonNull(name, "name is required").trim();
        kind = Objects.requireNonNull(kind, "kind is required");
    }
}
