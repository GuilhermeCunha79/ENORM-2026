package pt.isep.enorm.ref.reddit.governance.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "authorization_rules")
public class AuthorizationRule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

@Column(length = 1000)
private String name;

@Column(length = 1000)
private String allowedAction;

@Column(length = 1000)
private String actor;

@Column(length = 1000)
private String contextName;

@Column(length = 1000)
private String resourceTarget;

@Column(length = 1000)
private String feedbackTarget;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
public String getName() { return name; }
public void setName(String name) { this.name = name; }
public String getAllowedAction() { return allowedAction; }
public void setAllowedAction(String allowedAction) { this.allowedAction = allowedAction; }
public String getActor() { return actor; }
public void setActor(String actor) { this.actor = actor; }
public String getContextName() { return contextName; }
public void setContextName(String contextName) { this.contextName = contextName; }
public String getResourceTarget() { return resourceTarget; }
public void setResourceTarget(String resourceTarget) { this.resourceTarget = resourceTarget; }
public String getFeedbackTarget() { return feedbackTarget; }
public void setFeedbackTarget(String feedbackTarget) { this.feedbackTarget = feedbackTarget; }
}
