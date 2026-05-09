package pt.isep.enorm.ref.amazon.web.dto;

import pt.isep.enorm.ref.amazon.domain.enums.TriggerEvent;
import pt.isep.enorm.ref.amazon.domain.enums.ValidationKind;

public record VerificationPolicyResponse(
    Long id,
    String name,
    ValidationKind mode,
    TriggerEvent appliesWhen,
    String verifiesFeedback
) {
}
