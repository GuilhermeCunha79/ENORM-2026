package pt.isep.enorm.ref.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.domain.generated.GeneratedValidationRule;

/** Manual extension point — add bespoke behaviour here. */
@Entity
@Table(name = "validation_rules")
public class ValidationRule extends GeneratedValidationRule {
}
