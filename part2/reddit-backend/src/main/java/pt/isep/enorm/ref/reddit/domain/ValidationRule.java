package pt.isep.enorm.ref.reddit.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.reddit.domain.generated.GeneratedValidationRule;

@Entity(name = "ValidationRule")
@Table(name = "content_validation_rules")
public class ValidationRule extends GeneratedValidationRule {
}


