package pt.isep.enorm.ref.amazon.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import pt.isep.enorm.ref.amazon.domain.enums.ActionResultKind;

public record AutomationActionRequest(
    @NotBlank String name,
    @NotNull ActionResultKind kind,
    String message
) {

    public AutomationActionRequest {
        name = name == null ? null : name.trim();
    }
}
