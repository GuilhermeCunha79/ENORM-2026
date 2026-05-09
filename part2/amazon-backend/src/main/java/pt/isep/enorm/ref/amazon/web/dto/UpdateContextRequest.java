package pt.isep.enorm.ref.amazon.web.dto;

import java.util.List;

import pt.isep.enorm.ref.amazon.domain.enums.ContextKind;

public record UpdateContextRequest(String name, ContextKind kind, List<String> resources) {

    public UpdateContextRequest {
        name = name == null ? null : name.trim();
        resources = resources == null ? List.of() : List.copyOf(resources);
    }
}
