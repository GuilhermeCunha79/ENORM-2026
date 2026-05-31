package pt.isep.enorm.ref.youtube.domain.generated;

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
import pt.isep.enorm.ref.youtube.domain.Comment;
import pt.isep.enorm.ref.youtube.domain.Video;
import pt.isep.enorm.ref.youtube.domain.YoutubeUser;
import pt.isep.enorm.ref.youtube.domain.enums.ValidationPolicyType;
import pt.isep.enorm.ref.youtube.domain.enums.ValidationSeverity;
import pt.isep.enorm.ref.youtube.domain.enums.ValidationTarget;

@MappedSuperclass
public abstract class GeneratedContentValidationRule {

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
    @JoinColumn(name = "video_id")
    private Video video;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "comment_id")
    private Comment comment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reviewed_by_id")
    private YoutubeUser reviewedBy;

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

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public YoutubeUser getReviewedBy() {
        return reviewedBy;
    }

    public void setReviewedBy(YoutubeUser reviewedBy) {
        this.reviewedBy = reviewedBy;
    }
}

