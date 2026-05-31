package pt.isep.enorm.ref.youtube.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.youtube.domain.generated.GeneratedContentValidationRule;

@Entity(name = "ContentValidationRule")
@Table(name = "content_validation_rules")
public class ContentValidationRule extends GeneratedContentValidationRule {
}

