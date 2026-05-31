package pt.isep.enorm.ref.service;

import pt.isep.enorm.ref.service.generated.GeneratedCommentService;
import pt.isep.enorm.ref.repository.CommentRepository;
import org.springframework.stereotype.Service;

@Service
public class CommentService extends GeneratedCommentService {
    public CommentService(CommentRepository repository) {
        super(repository);
    }
}
