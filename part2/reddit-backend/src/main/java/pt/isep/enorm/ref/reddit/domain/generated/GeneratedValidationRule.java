package pt.isep.enorm.ref.reddit.domain.generated;

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
import pt.isep.enorm.ref.reddit.domain.Post;
import pt.isep.enorm.ref.reddit.domain.RedditUser;
import pt.isep.enorm.ref.reddit.domain.enums.ValidationPolicyType;
import pt.isep.enorm.ref.reddit.domain.enums.ValidationSeverity;
import pt.isep.enorm.ref.reddit.domain.enums.ValidationTarget;

@MappedSuperclass
public abstract class GeneratedValidationRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 16)
    private ValidationTarget target;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 24)
    private ValidationPolicyType policyType;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 16)
    private ValidationSeverity severity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post post;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "comment_id")
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

    public ValidationTarget getTarget() {
        return target;
    }

    public void setTarget(ValidationTarget target) {
        this.target = target;
    }

    public ValidationPolicyType getPolicyType() {
        return policyType;
    }

    public void setPolicyType(ValidationPolicyType policyType) {
        this.policyType = policyType;
    }

    public ValidationSeverity getSeverity() {
        return severity;
    }

    public void setSeverity(ValidationSeverity severity) {
        this.severity = severity;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
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




