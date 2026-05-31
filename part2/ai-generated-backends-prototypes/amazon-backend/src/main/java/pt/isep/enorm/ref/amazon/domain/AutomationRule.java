package pt.isep.enorm.ref.amazon.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.amazon.domain.generated.GeneratedAutomationRule;

@Entity(name = "AutomationRule")
@Table(name = "automation_rules")
public class AutomationRule extends GeneratedAutomationRule {
}
