package pt.isep.enorm.ref.domain.generated;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class GeneratedSortingPolicy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

@Column(length = 1000)
private String name;

@Column(length = 1000)
private String criterion;

@Column(length = 1000)
private String direction;

@Column(length = 1000)
private String appliesToResource;

@Column(length = 1000)
private String appliesToFeedback;

@Column(length = 1000)
private String inContext;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
public String getName() { return name; }
public void setName(String name) { this.name = name; }
public String getCriterion() { return criterion; }
public void setCriterion(String criterion) { this.criterion = criterion; }
public String getDirection() { return direction; }
public void setDirection(String direction) { this.direction = direction; }
public String getAppliesToResource() { return appliesToResource; }
public void setAppliesToResource(String appliesToResource) { this.appliesToResource = appliesToResource; }
public String getAppliesToFeedback() { return appliesToFeedback; }
public void setAppliesToFeedback(String appliesToFeedback) { this.appliesToFeedback = appliesToFeedback; }
public String getInContext() { return inContext; }
public void setInContext(String inContext) { this.inContext = inContext; }
}
