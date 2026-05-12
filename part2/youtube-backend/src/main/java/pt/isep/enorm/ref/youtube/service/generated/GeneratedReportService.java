package pt.isep.enorm.ref.youtube.service.generated;

import java.time.Instant;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import pt.isep.enorm.ref.youtube.domain.Comment;
import pt.isep.enorm.ref.youtube.domain.Report;
import pt.isep.enorm.ref.youtube.domain.Video;
import pt.isep.enorm.ref.youtube.domain.YoutubeUser;
import pt.isep.enorm.ref.youtube.domain.enums.ReportStatus;
import pt.isep.enorm.ref.youtube.repository.CommentRepository;
import pt.isep.enorm.ref.youtube.repository.ReportRepository;
import pt.isep.enorm.ref.youtube.repository.VideoRepository;
import pt.isep.enorm.ref.youtube.web.error.ResourceNotFoundException;

@Transactional(readOnly = true)
public abstract class GeneratedReportService {

    private final ReportRepository reportRepository;
    private final VideoRepository videoRepository;
    private final CommentRepository commentRepository;

    protected GeneratedReportService(
        ReportRepository reportRepository,
        VideoRepository videoRepository,
        CommentRepository commentRepository
    ) {
        this.reportRepository = reportRepository;
        this.videoRepository = videoRepository;
        this.commentRepository = commentRepository;
    }

    public List<Report> listReports(ReportStatus status) {
        if (status == null) {
            return reportRepository.findAll();
        }
        return reportRepository.findByStatus(status);
    }

    @Transactional
    public Report createReport(YoutubeUser submitter, Long videoId, Long commentId, Report request) {
        if (submitter == null) {
            throw new IllegalArgumentException("Submitter is required.");
        }

        if ((videoId == null && commentId == null) || (videoId != null && commentId != null)) {
            throw new IllegalArgumentException("Provide either videoId or commentId.");
        }

        if (request == null || request.getReason() == null || request.getReason().isBlank()) {
            throw new IllegalArgumentException("Report reason is required.");
        }

        Report report = new Report();
        report.setSubmitter(submitter);
        report.setReason(request.getReason());
        report.setStatus(ReportStatus.PENDING);
        report.setTimestamp(Instant.now());

        if (videoId != null) {
            report.setVideo(loadVideo(videoId));
        } else {
            report.setComment(loadComment(commentId));
        }

        return reportRepository.save(report);
    }

    private Video loadVideo(Long videoId) {
        return videoRepository.findById(videoId)
            .orElseThrow(() -> new ResourceNotFoundException("Video '%s' was not found.".formatted(videoId)));
    }

    private Comment loadComment(Long commentId) {
        return commentRepository.findById(commentId)
            .orElseThrow(() -> new ResourceNotFoundException("Comment '%s' was not found.".formatted(commentId)));
    }
}

