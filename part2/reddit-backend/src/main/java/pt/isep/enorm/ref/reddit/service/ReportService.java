package pt.isep.enorm.ref.reddit.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pt.isep.enorm.ref.reddit.domain.Report;
import pt.isep.enorm.ref.reddit.domain.RedditUser;
import pt.isep.enorm.ref.reddit.repository.CommentRepository;
import pt.isep.enorm.ref.reddit.repository.ReportRepository;
import pt.isep.enorm.ref.reddit.repository.PostRepository;
import pt.isep.enorm.ref.reddit.service.generated.GeneratedReportService;

@Service
public class ReportService extends GeneratedReportService {

    private final ModerationService moderationService;

    public ReportService(
        ReportRepository reportRepository,
        PostRepository postRepository,
        CommentRepository commentRepository,
        ModerationService moderationService
    ) {
        super(reportRepository, postRepository, commentRepository);
        this.moderationService = moderationService;
    }

    @Override
    @Transactional
    public Report createReport(RedditUser submitter, Long postId, Long commentId, Report request) {
        Report report = super.createReport(submitter, postId, commentId, request);
        moderationService.moderateAutomaticallyOnReportCreated(report);
        return report;
    }
}



