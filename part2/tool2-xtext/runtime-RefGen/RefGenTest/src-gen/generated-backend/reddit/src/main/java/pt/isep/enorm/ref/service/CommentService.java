package pt.isep.enorm.ref.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.repository.CommentRepository;
import pt.isep.enorm.ref.service.generated.GeneratedCommentService;

@Service
public class CommentService extends GeneratedCommentService {
    public CommentService(CommentRepository repository) {
        super(repository);
    }
}
