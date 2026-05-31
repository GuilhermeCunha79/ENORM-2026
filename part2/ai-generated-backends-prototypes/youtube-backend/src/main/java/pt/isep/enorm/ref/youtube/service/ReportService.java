package pt.isep.enorm.ref.youtube.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pt.isep.enorm.ref.youtube.domain.Report;
import pt.isep.enorm.ref.youtube.domain.YoutubeUser;
import pt.isep.enorm.ref.youtube.repository.CommentRepository;
import pt.isep.enorm.ref.youtube.repository.ReportRepository;
import pt.isep.enorm.ref.youtube.repository.VideoRepository;
import pt.isep.enorm.ref.youtube.service.generated.GeneratedReportService;

@Service
public class ReportService extends GeneratedReportService {

    private final ModerationService moderationService;

    public ReportService(
        ReportRepository reportRepository,
        VideoRepository videoRepository,
        CommentRepository commentRepository,
        ModerationService moderationService
    ) {
        super(reportRepository, videoRepository, commentRepository);
        this.moderationService = moderationService;
    }

    @Override
    @Transactional
    public Report createReport(YoutubeUser submitter, Long videoId, Long commentId, Report request) {
        Report report = super.createReport(submitter, videoId, commentId, request);
        moderationService.moderateAutomaticallyOnReportCreated(report);
        return report;
    }
}

