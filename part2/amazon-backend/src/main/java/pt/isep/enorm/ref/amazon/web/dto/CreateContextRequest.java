package pt.isep.enorm.ref.amazon.web.dto;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import pt.isep.enorm.ref.amazon.domain.enums.ContextKind;

public record CreateContextRequest(
    @NotBlank String name,
    @NotNull ContextKind kind,
    List<String> resources
) {

    public CreateContextRequest {
        name = name == null ? null : name.trim();
        resources = resources == null ? List.of() : List.copyOf(resources);
    }
}
