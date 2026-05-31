package pt.isep.enorm.ref.amazon.domain.generated;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToMany;
import pt.isep.enorm.ref.amazon.domain.AutomationAction;
import pt.isep.enorm.ref.amazon.domain.AutomationCondition;
import pt.isep.enorm.ref.amazon.domain.AutomationRule;
import pt.isep.enorm.ref.amazon.domain.ContextType;
import pt.isep.enorm.ref.amazon.domain.ValidationRule;
import pt.isep.enorm.ref.amazon.domain.enums.TriggerEvent;

@MappedSuperclass
public abstract class GeneratedAutomationRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 120)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 32)
    private TriggerEvent trigger;

    @Column(name = "context_resource", length = 120)
    private String contextResource;

    @Column(name = "on_feedback", length = 120)
    private String onFeedback;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "context_id")
    private ContextType context;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "uses_validation_id")
    private ValidationRule usesValidation;

    @OneToMany(mappedBy = "automationRule", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AutomationCondition> conditions = new ArrayList<>();

    @OneToMany(mappedBy = "automationRule", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AutomationAction> actions = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TriggerEvent getTrigger() {
        return trigger;
    }

    public void setTrigger(TriggerEvent trigger) {
        this.trigger = trigger;
    }

    public String getContextResource() {
        return contextResource;
    }

    public void setContextResource(String contextResource) {
        this.contextResource = contextResource;
    }

    public String getOnFeedback() {
        return onFeedback;
    }

    public void setOnFeedback(String onFeedback) {
        this.onFeedback = onFeedback;
    }

    public ContextType getContext() {
        return context;
    }

    public void setContext(ContextType context) {
        this.context = context;
    }

    public ValidationRule getUsesValidation() {
        return usesValidation;
    }

    public void setUsesValidation(ValidationRule usesValidation) {
        this.usesValidation = usesValidation;
    }

    public List<AutomationCondition> getConditions() {
        return conditions;
    }

    public void addCondition(AutomationCondition condition) {
        condition.setAutomationRule((AutomationRule) this);
        conditions.add(condition);
    }

    public List<AutomationAction> getActions() {
        return actions;
    }

    public void addAction(AutomationAction action) {
        action.setAutomationRule((AutomationRule) this);
        actions.add(action);
    }
}
