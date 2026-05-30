package pt.isep.enorm.ref.youtube.governance.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "moderation_policies")
public class ModerationPolicy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

@Column(length = 1000)
private String name;

@Column(length = 1000)
private String mode;

@Column(length = 1000)
private String triggerEvent;

@Column(length = 1000)
private String decision;

@Column(length = 1000)
private String monitorsResource;

@Column(length = 1000)
private String monitorsFeedback;

@Column(length = 1000)
private String executedBy;

@Column(length = 1000)
private String inContext;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
public String getName() { return name; }
public void setName(String name) { this.name = name; }
public String getMode() { return mode; }
public void setMode(String mode) { this.mode = mode; }
public String getTriggerEvent() { return triggerEvent; }
public void setTriggerEvent(String triggerEvent) { this.triggerEvent = triggerEvent; }
public String getDecision() { return decision; }
public void setDecision(String decision) { this.decision = decision; }
public String getMonitorsResource() { return monitorsResource; }
public void setMonitorsResource(String monitorsResource) { this.monitorsResource = monitorsResource; }
public String getMonitorsFeedback() { return monitorsFeedback; }
public void setMonitorsFeedback(String monitorsFeedback) { this.monitorsFeedback = monitorsFeedback; }
public String getExecutedBy() { return executedBy; }
public void setExecutedBy(String executedBy) { this.executedBy = executedBy; }
public String getInContext() { return inContext; }
public void setInContext(String inContext) { this.inContext = inContext; }
}
