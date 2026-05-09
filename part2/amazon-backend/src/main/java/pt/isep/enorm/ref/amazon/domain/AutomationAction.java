package pt.isep.enorm.ref.amazon.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.amazon.domain.generated.GeneratedAutomationAction;

@Entity(name = "AutomationAction")
@Table(name = "automation_actions")
public class AutomationAction extends GeneratedAutomationAction {
}
