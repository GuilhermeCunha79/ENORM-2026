package pt.isep.enorm.ref.amazon.web.dto;

import java.util.List;

import pt.isep.enorm.ref.amazon.domain.enums.ContextKind;

public record ContextResponse(Long id, String name, ContextKind kind, List<String> resources) {

    public ContextResponse {
        resources = resources == null ? List.of() : List.copyOf(resources);
    }
}
