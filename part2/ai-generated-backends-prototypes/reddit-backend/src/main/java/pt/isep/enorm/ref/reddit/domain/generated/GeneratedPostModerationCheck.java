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
import pt.isep.enorm.ref.reddit.domain.Post;
import pt.isep.enorm.ref.reddit.domain.RedditUser;
import pt.isep.enorm.ref.reddit.domain.enums.PostModerationResult;
import pt.isep.enorm.ref.reddit.domain.enums.PostModerationType;

@MappedSuperclass
public abstract class GeneratedPostModerationCheck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 16)
    private PostModerationType type;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 16)
    private PostModerationResult result;

    @Column(nullable = false)
    private Instant timestamp;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reviewed_by_id")
    private RedditUser reviewedBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PostModerationType getType() {
        return type;
    }

    public void setType(PostModerationType type) {
        this.type = type;
    }

    public PostModerationResult getResult() {
        return result;
    }

    public void setResult(PostModerationResult result) {
        this.result = result;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public RedditUser getReviewedBy() {
        return reviewedBy;
    }

    public void setReviewedBy(RedditUser reviewedBy) {
        this.reviewedBy = reviewedBy;
    }
}




