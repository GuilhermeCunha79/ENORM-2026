package pt.isep.enorm.ref.reddit.service;

import org.springframework.stereotype.Service;

import pt.isep.enorm.ref.reddit.repository.CommentRepository;
import pt.isep.enorm.ref.reddit.repository.ReportRepository;
import pt.isep.enorm.ref.reddit.repository.PostRepository;
import pt.isep.enorm.ref.reddit.service.generated.GeneratedReportService;

@Service
public class ReportService extends GeneratedReportService {

    public ReportService(ReportRepository reportRepository, PostRepository postRepository, CommentRepository commentRepository) {
        super(reportRepository, postRepository, commentRepository);
    }
}



