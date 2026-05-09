package pt.isep.enorm.ref.amazon.service.command;

import java.util.List;
import java.util.Objects;

import pt.isep.enorm.ref.amazon.domain.enums.ContextKind;

public record CreateContextCommand(String name, ContextKind kind, List<String> resources) {

    public CreateContextCommand {
        name = Objects.requireNonNull(name, "name is required").trim();
        kind = Objects.requireNonNull(kind, "kind is required");
        resources = resources == null ? List.of() : List.copyOf(resources);
    }
}
