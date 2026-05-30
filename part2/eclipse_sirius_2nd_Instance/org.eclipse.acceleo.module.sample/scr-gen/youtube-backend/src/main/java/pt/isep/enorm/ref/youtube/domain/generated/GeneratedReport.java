package pt.isep.enorm.ref.youtube.domain.generated;

import pt.isep.enorm.ref.youtube.domain.enums.ReportStatus;
import pt.isep.enorm.ref.youtube.domain.Comment;
import pt.isep.enorm.ref.youtube.domain.Video;
import pt.isep.enorm.ref.youtube.domain.YoutubeUser;
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
public abstract class GeneratedReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 500)
    private String reason;
    @Enumerated(EnumType.STRING)
    private ReportStatus status = ReportStatus.PENDING;
    private Instant timestamp = Instant.now();
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "submitter_id")
    private YoutubeUser submitter;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "video_id")
    private Video video;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "comment_id")
    private Comment comment;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reviewed_by_id")
    private YoutubeUser reviewedBy;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getReason() { return reason; }
    public void setReason(String reason) { this.reason = reason; }
    public ReportStatus getStatus() { return status; }
    public void setStatus(ReportStatus status) { this.status = status; }
    public Instant getTimestamp() { return timestamp; }
    public void setTimestamp(Instant timestamp) { this.timestamp = timestamp; }
    public YoutubeUser getSubmitter() { return submitter; }
    public void setSubmitter(YoutubeUser submitter) { this.submitter = submitter; }
    public Video getVideo() { return video; }
    public void setVideo(Video video) { this.video = video; }
    public Comment getComment() { return comment; }
    public void setComment(Comment comment) { this.comment = comment; }
    public YoutubeUser getReviewedBy() { return reviewedBy; }
    public void setReviewedBy(YoutubeUser reviewedBy) { this.reviewedBy = reviewedBy; }
}
