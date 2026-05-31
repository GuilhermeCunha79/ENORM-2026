package pt.isep.enorm.ref.reddit.service;

import pt.isep.enorm.ref.reddit.service.generated.GeneratedModerationService;
import pt.isep.enorm.ref.reddit.domain.Comment;
import pt.isep.enorm.ref.reddit.domain.Post;
import pt.isep.enorm.ref.reddit.domain.UserType;
import pt.isep.enorm.ref.reddit.domain.Report;
import pt.isep.enorm.ref.reddit.domain.enums.ContentStatus;
import pt.isep.enorm.ref.reddit.domain.enums.ReportStatus;
import pt.isep.enorm.ref.reddit.repository.CommentModerationCheckRepository;
import pt.isep.enorm.ref.reddit.repository.CommentRepository;
import pt.isep.enorm.ref.reddit.repository.PostModerationCheckRepository;
import pt.isep.enorm.ref.reddit.repository.PostRepository;
import pt.isep.enorm.ref.reddit.repository.ReportRepository;
import pt.isep.enorm.ref.reddit.service.projection.ModerationSimulationResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ModerationService extends GeneratedModerationService {
    private final PostRepository postRepository;
    private final CommentRepository commentRepository;
    private final ReportRepository reportRepository;

    public ModerationService(
            PostRepository postRepository,
            CommentRepository commentRepository,
            ReportRepository reportRepository,
            PostModerationCheckRepository postModerationCheckRepository,
            CommentModerationCheckRepository commentModerationCheckRepository) {
        super(postRepository, commentRepository, null, postModerationCheckRepository, commentModerationCheckRepository, null);
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
        this.reportRepository = reportRepository;
    }

    @Transactional
    public void approvePost(UserType moderator, Long postId) {
        Post post = loadPost(postId);
        post.setStatus(ContentStatus.ACTIVE);
        postRepository.save(post);
    }

    @Transactional
    public void approveComment(UserType moderator, Long commentId) {
        Comment comment = loadComment(commentId);
        comment.setStatus(ContentStatus.ACTIVE);
        commentRepository.save(comment);
    }

    @Transactional
    public void approveReport(UserType moderator, Long reportId) {
        Report report = loadReport(reportId);
        report.setReviewedBy(moderator);
        report.setStatus(ReportStatus.REVIEWED);
        reportRepository.save(report);
    }

    @Transactional
    public ModerationSimulationResult simulatePostModeration(UserType moderator, Long postId) {
        Post post = loadPost(postId);
        Map<String, Object> check = moderatePost(postId.toString(), post);
        return result("POST", post.getId(), check, null, post.getStatus().name(), "Post text inspected and moderation check persisted.");
    }

    @Transactional
    public ModerationSimulationResult simulateCommentModeration(UserType moderator, Long commentId) {
        Comment comment = loadComment(commentId);
        Map<String, Object> check = moderateComment(commentId.toString(), comment);
        return result("COMMENT", comment.getId(), check, null, comment.getStatus().name(), "Comment text inspected and moderation check persisted.");
    }

    @Transactional
    public List<ModerationSimulationResult> simulateReportModeration(UserType moderator) {
        List<ModerationSimulationResult> results = new ArrayList<>();
        for (Report report : reportRepository.findByStatus(ReportStatus.PENDING)) {
            if (report.getPost() != null) {
                results.add(moderateReportedPost(report, moderator));
            } else if (report.getComment() != null) {
                results.add(moderateReportedComment(report, moderator));
            }
        }
        return results;
    }

    @Transactional
    public void moderateAutomaticallyOnPostCreated(Post post) {
        if (post != null) {
            moderatePost(idOf(post), post);
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

    private ModerationSimulationResult moderateReportedPost(Report report, UserType moderator) {
        Post post = report.getPost();
        Map<String, Object> check = moderatePost(idOf(post), post);
        closeReport(report, moderator);
        return result("POST", post.getId(), check, report.getId(), post.getStatus().name(), "Pending report triggered post moderation.");
    }

    private ModerationSimulationResult moderateReportedComment(Report report, UserType moderator) {
        Comment comment = report.getComment();
        Map<String, Object> check = moderateComment(idOf(comment), comment);
        closeReport(report, moderator);
        return result("COMMENT", comment.getId(), check, report.getId(), comment.getStatus().name(), "Pending report triggered comment moderation.");
    }

    private void closeReport(Report report, UserType moderator) {
        report.setReviewedBy(moderator);
        report.setStatus(ReportStatus.REVIEWED);
        reportRepository.save(report);
    }

    private Post loadPost(Long postId) {
        return postRepository.findById(postId).orElseThrow();
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
