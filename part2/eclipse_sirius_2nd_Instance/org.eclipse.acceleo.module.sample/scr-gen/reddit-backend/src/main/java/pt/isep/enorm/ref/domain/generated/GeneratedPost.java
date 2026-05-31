package pt.isep.enorm.ref.domain.generated;

import pt.isep.enorm.ref.domain.enums.CommentStatus;
import pt.isep.enorm.ref.domain.enums.ContentStatus;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import java.time.LocalDate;

@MappedSuperclass
public abstract class GeneratedPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 200)
    private String title;
    @Column(length = 1000)
    private String body;
    @Column(length = 1000)
    private String description;
    private LocalDate creationDate;
    private LocalDate uploadDate;
    private Integer duration;
    @Enumerated(EnumType.STRING)
    private CommentStatus commentStatus;
    @Enumerated(EnumType.STRING)
    private ContentStatus status = ContentStatus.ACTIVE;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getBody() { return body; }
    public void setBody(String body) { this.body = body; }
    public String getDescription() { return description == null ? body : description; }
    public void setDescription(String description) { this.description = description; }
    public LocalDate getCreationDate() { return creationDate; }
    public void setCreationDate(LocalDate creationDate) { this.creationDate = creationDate; }
    public LocalDate getUploadDate() { return uploadDate; }
    public void setUploadDate(LocalDate uploadDate) { this.uploadDate = uploadDate; }
    public Integer getDuration() { return duration; }
    public void setDuration(Integer duration) { this.duration = duration; }
    public CommentStatus getCommentStatus() { return commentStatus; }
    public void setCommentStatus(CommentStatus commentStatus) { this.commentStatus = commentStatus; }
    public ContentStatus getStatus() { return status; }
    public void setStatus(ContentStatus status) { this.status = status; }
}
