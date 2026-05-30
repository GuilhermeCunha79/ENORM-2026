package pt.isep.enorm.ref.youtube.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.youtube.repository.TopVideoCommentRepository;
import pt.isep.enorm.ref.youtube.service.generated.GeneratedTopVideoCommentService;

@Service
public class TopVideoCommentService extends GeneratedTopVideoCommentService {
    public TopVideoCommentService(TopVideoCommentRepository repository) {
        super(repository);
    }
}
