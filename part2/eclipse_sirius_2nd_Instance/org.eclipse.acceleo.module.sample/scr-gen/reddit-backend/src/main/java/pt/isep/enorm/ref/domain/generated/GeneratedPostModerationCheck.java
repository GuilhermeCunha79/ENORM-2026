package pt.isep.enorm.ref.domain.generated;

import pt.isep.enorm.ref.domain.enums.ModerationDecision;
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
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@MappedSuperclass
public abstract class GeneratedPostModerationCheck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    @Enumerated(EnumType.STRING)
    private ModerationDecision result;
    @Column(nullable = false)
    private Instant timestamp;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "post_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Post post;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "reviewed_by_id")
    private UserType reviewedBy;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public ModerationDecision getResult() { return result; }
    public void setResult(ModerationDecision result) { this.result = result; }
    public Instant getTimestamp() { return timestamp; }
    public void setTimestamp(Instant timestamp) { this.timestamp = timestamp; }
    public Post getPost() { return post; }
    public void setPost(Post post) { this.post = post; }
    public UserType getReviewedBy() { return reviewedBy; }
    public void setReviewedBy(UserType reviewedBy) { this.reviewedBy = reviewedBy; }
}
