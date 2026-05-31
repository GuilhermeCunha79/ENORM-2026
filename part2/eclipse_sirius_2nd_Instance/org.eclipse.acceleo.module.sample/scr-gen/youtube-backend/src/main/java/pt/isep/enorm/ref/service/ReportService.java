package pt.isep.enorm.ref.service;

import pt.isep.enorm.ref.service.generated.GeneratedReportService;
import pt.isep.enorm.ref.repository.ReportRepository;
import pt.isep.enorm.ref.domain.Report;
import org.springframework.stereotype.Service;

@Service
public class ReportService extends GeneratedReportService {
    private final ModerationService moderationService;

    public ReportService(ReportRepository repository, ModerationService moderationService) {
        super(repository);
        this.moderationService = moderationService;
    }

    @Override
    public Report create(Report entity) {
        Report saved = super.create(entity);
        moderationService.moderateAutomaticallyOnReportCreated(saved);
        return saved;
    }
}
