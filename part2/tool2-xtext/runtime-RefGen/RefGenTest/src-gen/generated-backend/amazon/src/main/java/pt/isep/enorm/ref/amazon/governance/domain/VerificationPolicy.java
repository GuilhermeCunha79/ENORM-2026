package pt.isep.enorm.ref.amazon.governance.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "verification_policies")
public class VerificationPolicy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

@Column(length = 1000)
private String name;

@Column(length = 1000)
private String mode;

@Column(length = 1000)
private String appliesWhen;

@Column(length = 1000)
private String verifies;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
public String getName() { return name; }
public void setName(String name) { this.name = name; }
public String getMode() { return mode; }
public void setMode(String mode) { this.mode = mode; }
public String getAppliesWhen() { return appliesWhen; }
public void setAppliesWhen(String appliesWhen) { this.appliesWhen = appliesWhen; }
public String getVerifies() { return verifies; }
public void setVerifies(String verifies) { this.verifies = verifies; }
}
