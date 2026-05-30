package pt.isep.enorm.ref.youtube.domain.generated;

import pt.isep.enorm.ref.youtube.domain.enums.VideoModerationResult;
import pt.isep.enorm.ref.youtube.domain.enums.VideoModerationType;
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
public abstract class GeneratedVideoModerationCheck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private VideoModerationType type;
    @Enumerated(EnumType.STRING)
    private VideoModerationResult result;
    @Column(nullable = false)
    private Instant timestamp;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "video_id")
    private Video video;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reviewed_by_id")
    private YoutubeUser reviewedBy;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public VideoModerationType getType() { return type; }
    public void setType(VideoModerationType type) { this.type = type; }
    public VideoModerationResult getResult() { return result; }
    public void setResult(VideoModerationResult result) { this.result = result; }
    public Instant getTimestamp() { return timestamp; }
    public void setTimestamp(Instant timestamp) { this.timestamp = timestamp; }
    public Video getVideo() { return video; }
    public void setVideo(Video video) { this.video = video; }
    public YoutubeUser getReviewedBy() { return reviewedBy; }
    public void setReviewedBy(YoutubeUser reviewedBy) { this.reviewedBy = reviewedBy; }
}
