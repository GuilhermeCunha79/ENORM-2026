package pt.isep.enorm.ref.amazon.service.command;

import java.util.Objects;

import pt.isep.enorm.ref.amazon.domain.enums.TriggerEvent;
import pt.isep.enorm.ref.amazon.domain.enums.ValidationKind;

public record VerificationPolicyCommand(
    String name,
    ValidationKind mode,
    TriggerEvent appliesWhen,
    String verifiesFeedback
) {

    public VerificationPolicyCommand {
        name = Objects.requireNonNull(name, "name is required").trim();
        mode = Objects.requireNonNull(mode, "mode is required");
        appliesWhen = Objects.requireNonNull(appliesWhen, "appliesWhen is required");
    }
}
