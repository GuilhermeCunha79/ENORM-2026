package pt.isep.enorm.ref.reddit.domain.generated;

import pt.isep.enorm.ref.reddit.domain.enums.ContentStatus;
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
    @Column(length = 1000)
    private String body;
    private LocalDate creationDate;
    @Enumerated(EnumType.STRING)
    private ContentStatus status = ContentStatus.ACTIVE;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getText() { return text == null ? body : text; }
    public void setText(String text) { this.text = text; }
    public String getBody() { return body; }
    public void setBody(String body) { this.body = body; }
    public LocalDate getCreationDate() { return creationDate; }
    public void setCreationDate(LocalDate creationDate) { this.creationDate = creationDate; }
    public ContentStatus getStatus() { return status; }
    public void setStatus(ContentStatus status) { this.status = status; }
}
