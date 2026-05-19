package pt.isep.enorm.ref.reddit.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.reddit.repository.CommentRepository;
import pt.isep.enorm.ref.reddit.service.generated.GeneratedCommentService;

@Service
public class CommentService extends GeneratedCommentService {
    public CommentService(CommentRepository repository) {
        super(repository);
    }
}
