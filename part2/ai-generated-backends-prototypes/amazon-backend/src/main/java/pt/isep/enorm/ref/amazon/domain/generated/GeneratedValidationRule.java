package pt.isep.enorm.ref.amazon.domain.generated;

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
import pt.isep.enorm.ref.amazon.domain.AutomationRule;
import pt.isep.enorm.ref.amazon.domain.enums.Role;
import pt.isep.enorm.ref.amazon.domain.enums.RuleSeverity;
import pt.isep.enorm.ref.amazon.domain.enums.ValidationKind;

@MappedSuperclass
public abstract class GeneratedValidationRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 120)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 16)
    private ValidationKind kind;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 16)
    private RuleSeverity severity;

    @Column(length = 2000)
    private String expression;

    @Column(name = "implementation_id", length = 120)
    private String implementationId;

    @Column(name = "applies_to_resource", length = 120)
    private String appliesToResource;

    @Column(name = "applies_to_feedback", length = 120)
    private String appliesToFeedback;

    @Enumerated(EnumType.STRING)
    @Column(name = "applies_to_role", length = 20)
    private Role appliesToRole;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "invoked_by_rule_id")
    private AutomationRule invokedBy;

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

    public ValidationKind getKind() {
        return kind;
    }

    public void setKind(ValidationKind kind) {
        this.kind = kind;
    }

    public RuleSeverity getSeverity() {
        return severity;
    }

    public void setSeverity(RuleSeverity severity) {
        this.severity = severity;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getImplementationId() {
        return implementationId;
    }

    public void setImplementationId(String implementationId) {
        this.implementationId = implementationId;
    }

    public String getAppliesToResource() {
        return appliesToResource;
    }

    public void setAppliesToResource(String appliesToResource) {
        this.appliesToResource = appliesToResource;
    }

    public String getAppliesToFeedback() {
        return appliesToFeedback;
    }

    public void setAppliesToFeedback(String appliesToFeedback) {
        this.appliesToFeedback = appliesToFeedback;
    }

    public Role getAppliesToRole() {
        return appliesToRole;
    }

    public void setAppliesToRole(Role appliesToRole) {
        this.appliesToRole = appliesToRole;
    }

    public AutomationRule getInvokedBy() {
        return invokedBy;
    }

    public void setInvokedBy(AutomationRule invokedBy) {
        this.invokedBy = invokedBy;
    }
}
