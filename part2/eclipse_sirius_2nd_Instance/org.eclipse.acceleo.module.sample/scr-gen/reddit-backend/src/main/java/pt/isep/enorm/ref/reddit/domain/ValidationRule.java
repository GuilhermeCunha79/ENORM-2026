package pt.isep.enorm.ref.reddit.domain;

import pt.isep.enorm.ref.reddit.domain.generated.GeneratedValidationRule;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "validationRule")
public class ValidationRule extends GeneratedValidationRule {
}
