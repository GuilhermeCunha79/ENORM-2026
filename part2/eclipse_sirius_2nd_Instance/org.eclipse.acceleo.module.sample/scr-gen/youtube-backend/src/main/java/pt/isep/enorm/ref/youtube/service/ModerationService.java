package pt.isep.enorm.ref.youtube.service;

import pt.isep.enorm.ref.youtube.service.generated.GeneratedModerationService;
import pt.isep.enorm.ref.youtube.domain.Comment;
import pt.isep.enorm.ref.youtube.domain.Report;
import pt.isep.enorm.ref.youtube.domain.Video;
import pt.isep.enorm.ref.youtube.domain.YoutubeUser;
import pt.isep.enorm.ref.youtube.domain.enums.ContentStatus;
import pt.isep.enorm.ref.youtube.domain.enums.ReportStatus;
import pt.isep.enorm.ref.youtube.repository.CommentModerationCheckRepository;
import pt.isep.enorm.ref.youtube.repository.CommentRepository;
import pt.isep.enorm.ref.youtube.repository.ReportRepository;
import pt.isep.enorm.ref.youtube.repository.VideoModerationCheckRepository;
import pt.isep.enorm.ref.youtube.repository.VideoRepository;
import pt.isep.enorm.ref.youtube.service.projection.ModerationSimulationResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ModerationService extends GeneratedModerationService {
    private final VideoRepository videoRepository;
    private final CommentRepository commentRepository;
    private final ReportRepository reportRepository;

    public ModerationService(
            VideoRepository videoRepository,
            CommentRepository commentRepository,
            ReportRepository reportRepository,
            VideoModerationCheckRepository videoModerationCheckRepository,
            CommentModerationCheckRepository commentModerationCheckRepository) {
        super(null, commentRepository, videoRepository, null, commentModerationCheckRepository, videoModerationCheckRepository);
        this.videoRepository = videoRepository;
        this.commentRepository = commentRepository;
        this.reportRepository = reportRepository;
    }

    @Transactional
    public void approveVideo(YoutubeUser moderator, Long videoId) {
        Video video = loadVideo(videoId);
        video.setStatus(ContentStatus.ACTIVE);
        videoRepository.save(video);
    }

    @Transactional
    public void approveComment(YoutubeUser moderator, Long commentId) {
        Comment comment = loadComment(commentId);
        comment.setStatus(ContentStatus.ACTIVE);
        commentRepository.save(comment);
    }

    @Transactional
    public void approveReport(YoutubeUser moderator, Long reportId) {
        Report report = loadReport(reportId);
        report.setReviewedBy(moderator);
        report.setStatus(ReportStatus.REVIEWED);
        reportRepository.save(report);
    }

    @Transactional
    public ModerationSimulationResult simulateVideoModeration(YoutubeUser moderator, Long videoId) {
        Video video = loadVideo(videoId);
        Map<String, Object> check = moderateVideo(videoId.toString(), video);
        return result("VIDEO", video.getId(), check, null, video.getStatus().name(), "Video title and description inspected and moderation check persisted.");
    }

    @Transactional
    public ModerationSimulationResult simulateCommentModeration(YoutubeUser moderator, Long commentId) {
        Comment comment = loadComment(commentId);
        Map<String, Object> check = moderateComment(commentId.toString(), comment);
        return result("COMMENT", comment.getId(), check, null, comment.getStatus().name(), "Comment text inspected and moderation check persisted.");
    }

    @Transactional
    public List<ModerationSimulationResult> simulateReportModeration(YoutubeUser moderator) {
        List<ModerationSimulationResult> results = new ArrayList<>();
        for (Report report : reportRepository.findByStatus(ReportStatus.PENDING)) {
            if (report.getVideo() != null) {
                results.add(moderateReportedVideo(report, moderator));
            } else if (report.getComment() != null) {
                results.add(moderateReportedComment(report, moderator));
            }
        }
        return results;
    }

    @Transactional
    public void moderateAutomaticallyOnVideoCreated(Video video) {
        if (video != null) {
            moderateVideo(idOf(video), video);
        }
    }

    @Transactional
    public void moderateAutomaticallyOnCommentCreated(Comment comment) {
        if (comment != null) {
            moderateComment(idOf(comment), comment);
        }
    }

    @Transactional
    public void moderateAutomaticallyOnReportCreated(Report report) {
        if (report == null) {
            return;
        }
        // Report-threshold moderation is exposed through the simulation endpoint.
    }

    private ModerationSimulationResult moderateReportedVideo(Report report, YoutubeUser moderator) {
        Video video = report.getVideo();
        Map<String, Object> check = moderateVideo(idOf(video), video);
        closeReport(report, moderator);
        return result("VIDEO", video.getId(), check, report.getId(), video.getStatus().name(), "Pending report triggered video moderation.");
    }

    private ModerationSimulationResult moderateReportedComment(Report report, YoutubeUser moderator) {
        Comment comment = report.getComment();
        Map<String, Object> check = moderateComment(idOf(comment), comment);
        closeReport(report, moderator);
        return result("COMMENT", comment.getId(), check, report.getId(), comment.getStatus().name(), "Pending report triggered comment moderation.");
    }

    private void closeReport(Report report, YoutubeUser moderator) {
        report.setReviewedBy(moderator);
        report.setStatus(ReportStatus.REVIEWED);
        reportRepository.save(report);
    }

    private Video loadVideo(Long videoId) {
        return videoRepository.findById(videoId).orElseThrow();
    }

    private Comment loadComment(Long commentId) {
        return commentRepository.findById(commentId).orElseThrow();
    }

    private Report loadReport(Long reportId) {
        return reportRepository.findById(reportId).orElseThrow();
    }

    private ModerationSimulationResult result(String targetType, Long targetId, Map<String, Object> check, Long reportId, String status, String explanation) {
        Object checkId = check.get("id");
        Object decision = check.get("result");
        Object matches = check.get("matchedRules");
        return new ModerationSimulationResult(
            targetType,
            targetId,
            longId(checkId),
            reportId,
            "ON_REPORT_THRESHOLD",
            "HYBRID",
            decision == null ? "APPROVED" : decision.toString(),
            status,
            matches instanceof List<?> list ? list.stream().map(Object::toString).toList() : List.of(),
            explanation
        );
    }

    private String idOf(Object entity) {
        try {
            Object id = entity.getClass().getMethod("getId").invoke(entity);
            return id == null ? null : id.toString();
        } catch (Exception ignored) {
            return null;
        }
    }

    private Long longId(Object value) {
        if (value == null) {
            return null;
        }
        try {
            return Long.valueOf(value.toString());
        } catch (NumberFormatException ignored) {
            return null;
        }
    }
}
