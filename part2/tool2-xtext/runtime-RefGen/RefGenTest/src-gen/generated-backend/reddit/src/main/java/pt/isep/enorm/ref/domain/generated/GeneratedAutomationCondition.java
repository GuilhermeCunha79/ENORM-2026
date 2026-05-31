package pt.isep.enorm.ref.domain.generated;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import pt.isep.enorm.ref.domain.ConditionValue;

@MappedSuperclass
public abstract class GeneratedAutomationCondition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 1000)
    private String name;
    @Column(length = 1000)
    private String operator;
    @Column(length = 1000)
    private String attributeName;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "automation_condition_id")
    private List<ConditionValue> values = new ArrayList<>();

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getOperator() { return operator; }
    public void setOperator(String operator) { this.operator = operator; }
    public String getAttributeName() { return attributeName; }
    public void setAttributeName(String attributeName) { this.attributeName = attributeName; }
    public List<ConditionValue> getValues() { return values; }
    public void setValues(List<ConditionValue> values) { this.values = values; }
}
