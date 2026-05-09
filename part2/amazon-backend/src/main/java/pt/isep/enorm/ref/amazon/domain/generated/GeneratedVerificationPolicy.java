package pt.isep.enorm.ref.amazon.domain.generated;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import pt.isep.enorm.ref.amazon.domain.enums.TriggerEvent;
import pt.isep.enorm.ref.amazon.domain.enums.ValidationKind;

@MappedSuperclass
public abstract class GeneratedVerificationPolicy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 120)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 16)
    private ValidationKind mode;

    @Enumerated(EnumType.STRING)
    @Column(name = "applies_when", nullable = false, length = 32)
    private TriggerEvent appliesWhen;

    @Column(name = "verifies_feedback", length = 120)
    private String verifiesFeedback;

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

    public ValidationKind getMode() {
        return mode;
    }

    public void setMode(ValidationKind mode) {
        this.mode = mode;
    }

    public TriggerEvent getAppliesWhen() {
        return appliesWhen;
    }

    public void setAppliesWhen(TriggerEvent appliesWhen) {
        this.appliesWhen = appliesWhen;
    }

    public String getVerifiesFeedback() {
        return verifiesFeedback;
    }

    public void setVerifiesFeedback(String verifiesFeedback) {
        this.verifiesFeedback = verifiesFeedback;
    }
}
