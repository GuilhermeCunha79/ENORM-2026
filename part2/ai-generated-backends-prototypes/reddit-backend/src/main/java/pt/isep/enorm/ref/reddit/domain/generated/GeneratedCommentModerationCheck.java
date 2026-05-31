package pt.isep.enorm.ref.reddit.domain.generated;

import java.time.Instant;

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
import pt.isep.enorm.ref.reddit.domain.Comment;
import pt.isep.enorm.ref.reddit.domain.RedditUser;
import pt.isep.enorm.ref.reddit.domain.enums.CommentModerationResult;
import pt.isep.enorm.ref.reddit.domain.enums.CommentModerationType;

@MappedSuperclass
public abstract class GeneratedCommentModerationCheck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 16)
    private CommentModerationType type;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 16)
    private CommentModerationResult result;

    @Column(nullable = false)
    private Instant timestamp;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "comment_id", nullable = false)
    private Comment comment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reviewed_by_id")
    private RedditUser reviewedBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CommentModerationType getType() {
        return type;
    }

    public void setType(CommentModerationType type) {
        this.type = type;
    }

    public CommentModerationResult getResult() {
        return result;
    }

    public void setResult(CommentModerationResult result) {
        this.result = result;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public RedditUser getReviewedBy() {
        return reviewedBy;
    }

    public void setReviewedBy(RedditUser reviewedBy) {
        this.reviewedBy = reviewedBy;
    }
}


