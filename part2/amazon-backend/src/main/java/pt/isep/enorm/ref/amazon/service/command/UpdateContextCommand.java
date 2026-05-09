package pt.isep.enorm.ref.amazon.service.command;

import java.util.List;

import pt.isep.enorm.ref.amazon.domain.enums.ContextKind;

public record UpdateContextCommand(String name, ContextKind kind, List<String> resources) {
}
