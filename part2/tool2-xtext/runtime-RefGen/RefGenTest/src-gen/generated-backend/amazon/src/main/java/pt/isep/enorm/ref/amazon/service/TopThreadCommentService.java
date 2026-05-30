package pt.isep.enorm.ref.amazon.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.amazon.repository.TopThreadCommentRepository;
import pt.isep.enorm.ref.amazon.service.generated.GeneratedTopThreadCommentService;

@Service
public class TopThreadCommentService extends GeneratedTopThreadCommentService {
    public TopThreadCommentService(TopThreadCommentRepository repository) {
        super(repository);
    }
}
