package pt.isep.enorm.ref.youtube.domain.generated;

import java.time.LocalDate;

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
import pt.isep.enorm.ref.youtube.domain.Channel;
import pt.isep.enorm.ref.youtube.domain.enums.CommentStatus;
import pt.isep.enorm.ref.youtube.domain.enums.ContentStatus;

@MappedSuperclass
public abstract class GeneratedVideo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 200)
    private String title;

    @Column(nullable = false, length = 1000)
    private String description;

    @Column(nullable = false)
    private LocalDate uploadDate;

    @Column(nullable = false)
    private Integer duration;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 16)
    private CommentStatus commentStatus;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 16)
    private ContentStatus status;

    @Column(nullable = false)
    private LocalDate creationDate;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "channel_id", nullable = false)
    private Channel channel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(LocalDate uploadDate) {
        this.uploadDate = uploadDate;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public CommentStatus getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(CommentStatus commentStatus) {
        this.commentStatus = commentStatus;
    }

    public ContentStatus getStatus() {
        return status;
    }

    public void setStatus(ContentStatus status) {
        this.status = status;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }
}

