package pt.isep.enorm.ref.domain.generated;

import pt.isep.enorm.ref.domain.enums.ModerationDecision;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import java.time.LocalDate;

@MappedSuperclass
public abstract class GeneratedComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 1000)
    private String text;
    private LocalDate creationDate;
    @Enumerated(EnumType.STRING)
    private ModerationDecision status = ModerationDecision.APPROVED;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getText() { return text; }
    public void setText(String text) { this.text = text; }
    public LocalDate getCreationDate() { return creationDate; }
    public void setCreationDate(LocalDate creationDate) { this.creationDate = creationDate; }
    public ModerationDecision getStatus() { return status; }
    public void setStatus(ModerationDecision status) { this.status = status; }
}
