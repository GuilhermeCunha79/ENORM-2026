package pt.isep.enorm.ref.amazon.domain.generated;

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
import pt.isep.enorm.ref.amazon.domain.AmazonUser;
import pt.isep.enorm.ref.amazon.domain.CommentReview;
import pt.isep.enorm.ref.amazon.domain.enums.VoteValue;

@MappedSuperclass
public abstract class GeneratedHelpfulVote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "voter_id", nullable = false)
    private AmazonUser voter;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "comment_id", nullable = false)
    private CommentReview comment;

    @Enumerated(EnumType.STRING)
    @Column(name = "vote_value", nullable = false, length = 16)
    private VoteValue value;

    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AmazonUser getVoter() {
        return voter;
    }

    public void setVoter(AmazonUser voter) {
        this.voter = voter;
    }

    public CommentReview getComment() {
        return comment;
    }

    public void setComment(CommentReview comment) {
        this.comment = comment;
    }

    public VoteValue getValue() {
        return value;
    }

    public void setValue(VoteValue value) {
        this.value = value;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }
}
