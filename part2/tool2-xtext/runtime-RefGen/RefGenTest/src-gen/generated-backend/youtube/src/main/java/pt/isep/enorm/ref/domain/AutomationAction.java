package pt.isep.enorm.ref.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.domain.generated.GeneratedAutomationAction;

/** Manual extension point — add bespoke behaviour here. */
@Entity
@Table(name = "automation_actions")
public class AutomationAction extends GeneratedAutomationAction {
}
