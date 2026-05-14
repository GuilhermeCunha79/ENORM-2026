package pt.isep.enorm.ref.reddit.service.generated;

import java.time.Instant;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import pt.isep.enorm.ref.reddit.domain.Comment;
import pt.isep.enorm.ref.reddit.domain.Report;
import pt.isep.enorm.ref.reddit.domain.Post;
import pt.isep.enorm.ref.reddit.domain.RedditUser;
import pt.isep.enorm.ref.reddit.domain.enums.ReportStatus;
import pt.isep.enorm.ref.reddit.repository.CommentRepository;
import pt.isep.enorm.ref.reddit.repository.ReportRepository;
import pt.isep.enorm.ref.reddit.repository.PostRepository;
import pt.isep.enorm.ref.reddit.web.error.ResourceNotFoundException;

@Transactional(readOnly = true)
public abstract class GeneratedReportService {

    private final ReportRepository reportRepository;
    private final PostRepository postRepository;
    private final CommentRepository commentRepository;

    protected GeneratedReportService(
        ReportRepository reportRepository,
        PostRepository postRepository,
        CommentRepository commentRepository
    ) {
        this.reportRepository = reportRepository;
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
    }

    public List<Report> listReports(ReportStatus status) {
        if (status == null) {
            return reportRepository.findAll();
        }
        return reportRepository.findByStatus(status);
    }

    @Transactional
    public Report createReport(RedditUser submitter, Long postId, Long commentId, Report request) {
        if (submitter == null) {
            throw new IllegalArgumentException("Submitter is required.");
        }

        if ((postId == null && commentId == null) || (postId != null && commentId != null)) {
            throw new IllegalArgumentException("Provide either postId or commentId.");
        }

        if (request == null || request.getReason() == null || request.getReason().isBlank()) {
            throw new IllegalArgumentException("Report reason is required.");
        }

        Report report = new Report();
        report.setSubmitter(submitter);
        report.setReason(request.getReason());
        report.setStatus(ReportStatus.PENDING);
        report.setTimestamp(Instant.now());

        if (postId != null) {
            report.setPost(loadPost(postId));
        } else {
            report.setComment(loadComment(commentId));
        }

        return reportRepository.save(report);
    }

    private Post loadPost(Long postId) {
        return postRepository.findById(postId)
            .orElseThrow(() -> new ResourceNotFoundException("Post '%s' was not found.".formatted(postId)));
    }

    private Comment loadComment(Long commentId) {
        return commentRepository.findById(commentId)
            .orElseThrow(() -> new ResourceNotFoundException("Comment '%s' was not found.".formatted(commentId)));
    }
}




