package pt.isep.enorm.ref.amazon.governance.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "validation_rules")
public class ValidationRule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

@Column(length = 1000)
private String name;

@Column(length = 1000)
private String kind;

@Column(length = 1000)
private String severity;

@Column(length = 1000)
private String expression;

@Column(length = 1000)
private String implementationId;

@Column(length = 1000)
private String appliesToResource;

@Column(length = 1000)
private String appliesToFeedback;

@Column(length = 1000)
private String invokedBy;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
public String getName() { return name; }
public void setName(String name) { this.name = name; }
public String getKind() { return kind; }
public void setKind(String kind) { this.kind = kind; }
public String getSeverity() { return severity; }
public void setSeverity(String severity) { this.severity = severity; }
public String getExpression() { return expression; }
public void setExpression(String expression) { this.expression = expression; }
public String getImplementationId() { return implementationId; }
public void setImplementationId(String implementationId) { this.implementationId = implementationId; }
public String getAppliesToResource() { return appliesToResource; }
public void setAppliesToResource(String appliesToResource) { this.appliesToResource = appliesToResource; }
public String getAppliesToFeedback() { return appliesToFeedback; }
public void setAppliesToFeedback(String appliesToFeedback) { this.appliesToFeedback = appliesToFeedback; }
public String getInvokedBy() { return invokedBy; }
public void setInvokedBy(String invokedBy) { this.invokedBy = invokedBy; }
}
