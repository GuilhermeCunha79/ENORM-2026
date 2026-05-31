package pt.isep.enorm.ref.amazon.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.amazon.domain.generated.GeneratedValidationRule;

@Entity(name = "ValidationRule")
@Table(name = "validation_rules")
public class ValidationRule extends GeneratedValidationRule {
}
