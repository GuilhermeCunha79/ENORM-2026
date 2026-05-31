package pt.isep.enorm.ref.domain.generated;

import pt.isep.enorm.ref.domain.enums.PostModerationResult;
import pt.isep.enorm.ref.domain.enums.PostModerationType;
import pt.isep.enorm.ref.domain.Post;
import pt.isep.enorm.ref.domain.UserType;
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
import java.time.Instant;

@MappedSuperclass
public abstract class GeneratedPostModerationCheck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private PostModerationType type;
    @Enumerated(EnumType.STRING)
    private PostModerationResult result;
    @Column(nullable = false)
    private Instant timestamp;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "post_id")
    private Post post;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "reviewed_by_id")
    private UserType reviewedBy;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public PostModerationType getType() { return type; }
    public void setType(PostModerationType type) { this.type = type; }
    public PostModerationResult getResult() { return result; }
    public void setResult(PostModerationResult result) { this.result = result; }
    public Instant getTimestamp() { return timestamp; }
    public void setTimestamp(Instant timestamp) { this.timestamp = timestamp; }
    public Post getPost() { return post; }
    public void setPost(Post post) { this.post = post; }
    public UserType getReviewedBy() { return reviewedBy; }
    public void setReviewedBy(UserType reviewedBy) { this.reviewedBy = reviewedBy; }
}
