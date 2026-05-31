package pt.isep.enorm.ref.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.repository.TopVideoCommentRepository;
import pt.isep.enorm.ref.service.generated.GeneratedTopVideoCommentService;

@Service
public class TopVideoCommentService extends GeneratedTopVideoCommentService {
    public TopVideoCommentService(TopVideoCommentRepository repository) {
        super(repository);
    }
}
