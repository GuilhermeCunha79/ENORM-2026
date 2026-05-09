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
import pt.isep.enorm.ref.amazon.domain.AutomationCondition;
import pt.isep.enorm.ref.amazon.domain.AutomationRule;
import pt.isep.enorm.ref.amazon.domain.ConditionValue;
import pt.isep.enorm.ref.amazon.domain.enums.ConditionOperator;

@MappedSuperclass
public abstract class GeneratedAutomationCondition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 120)
    private String name;

    @Column(name = "attribute_name", length = 120)
    private String attributeName;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 30)
    private ConditionOperator operator;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "automation_rule_id", nullable = false)
    private AutomationRule automationRule;

    @OneToMany(mappedBy = "condition", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ConditionValue> values = new ArrayList<>();

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

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public ConditionOperator getOperator() {
        return operator;
    }

    public void setOperator(ConditionOperator operator) {
        this.operator = operator;
    }

    public AutomationRule getAutomationRule() {
        return automationRule;
    }

    public void setAutomationRule(AutomationRule automationRule) {
        this.automationRule = automationRule;
    }

    public List<ConditionValue> getValues() {
        return values;
    }

    public void addValue(ConditionValue value) {
        value.setCondition((AutomationCondition) this);
        values.add(value);
    }
}
