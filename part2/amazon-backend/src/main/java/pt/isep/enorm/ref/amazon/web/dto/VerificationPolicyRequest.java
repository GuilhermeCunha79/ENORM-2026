package pt.isep.enorm.ref.amazon.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import pt.isep.enorm.ref.amazon.domain.enums.TriggerEvent;
import pt.isep.enorm.ref.amazon.domain.enums.ValidationKind;

public record VerificationPolicyRequest(
    @NotBlank String name,
    @NotNull ValidationKind mode,
    @NotNull TriggerEvent appliesWhen,
    String verifiesFeedback
) {

    public VerificationPolicyRequest {
        name = name == null ? null : name.trim();
    }
}
