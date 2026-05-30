package pt.isep.enorm.ref.amazon.governance.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "automation_actions")
public class AutomationAction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 1000)
    private String name;
    @Column(length = 1000)
    private String actionKind;
    @Column(length = 1000)
    private String message;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getActionKind() { return actionKind; }
    public void setActionKind(String actionKind) { this.actionKind = actionKind; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}
