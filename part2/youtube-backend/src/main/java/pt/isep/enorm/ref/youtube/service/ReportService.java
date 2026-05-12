package pt.isep.enorm.ref.youtube.service;

import org.springframework.stereotype.Service;

import pt.isep.enorm.ref.youtube.repository.CommentRepository;
import pt.isep.enorm.ref.youtube.repository.ReportRepository;
import pt.isep.enorm.ref.youtube.repository.VideoRepository;
import pt.isep.enorm.ref.youtube.service.generated.GeneratedReportService;

@Service
public class ReportService extends GeneratedReportService {

    public ReportService(ReportRepository reportRepository, VideoRepository videoRepository, CommentRepository commentRepository) {
        super(reportRepository, videoRepository, commentRepository);
    }
}

