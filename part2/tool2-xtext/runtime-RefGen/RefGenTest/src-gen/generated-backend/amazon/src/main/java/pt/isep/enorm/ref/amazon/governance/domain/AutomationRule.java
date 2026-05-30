package pt.isep.enorm.ref.amazon.governance.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "automation_rules")
public class AutomationRule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 1000)
    private String name;
    @Column(length = 1000)
    private String triggerEvent;
    @Column(length = 1000)
    private String contextResource;
    @Column(length = 1000)
    private String inContext;
    @Column(length = 1000)
    private String onFeedback;
    @Column(length = 1000)
    private String uses;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "automation_rule_id")
    private List<AutomationCondition> conditions = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "automation_rule_action_id")
    private List<AutomationAction> actions = new ArrayList<>();

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getTriggerEvent() { return triggerEvent; }
    public void setTriggerEvent(String triggerEvent) { this.triggerEvent = triggerEvent; }
    public String getContextResource() { return contextResource; }
    public void setContextResource(String contextResource) { this.contextResource = contextResource; }
    public String getInContext() { return inContext; }
    public void setInContext(String inContext) { this.inContext = inContext; }
    public String getOnFeedback() { return onFeedback; }
    public void setOnFeedback(String onFeedback) { this.onFeedback = onFeedback; }
    public String getUses() { return uses; }
    public void setUses(String uses) { this.uses = uses; }
    public List<AutomationCondition> getConditions() { return conditions; }
    public void setConditions(List<AutomationCondition> conditions) { this.conditions = conditions; }
    public List<AutomationAction> getActions() { return actions; }
    public void setActions(List<AutomationAction> actions) { this.actions = actions; }
}
