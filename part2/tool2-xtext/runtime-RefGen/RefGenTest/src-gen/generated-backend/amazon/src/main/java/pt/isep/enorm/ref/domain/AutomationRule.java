package pt.isep.enorm.ref.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.domain.generated.GeneratedAutomationRule;

/** Manual extension point — add bespoke behaviour here. */
@Entity
@Table(name = "automation_rules")
public class AutomationRule extends GeneratedAutomationRule {
}
