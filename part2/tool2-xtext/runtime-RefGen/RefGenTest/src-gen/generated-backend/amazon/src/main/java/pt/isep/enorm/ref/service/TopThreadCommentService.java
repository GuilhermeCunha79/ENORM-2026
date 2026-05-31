package pt.isep.enorm.ref.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.repository.TopThreadCommentRepository;
import pt.isep.enorm.ref.service.generated.GeneratedTopThreadCommentService;

@Service
public class TopThreadCommentService extends GeneratedTopThreadCommentService {
    public TopThreadCommentService(TopThreadCommentRepository repository) {
        super(repository);
    }
}
