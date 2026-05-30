package pt.isep.enorm.ref.reddit.service;

import pt.isep.enorm.ref.reddit.service.generated.GeneratedCommentService;
import pt.isep.enorm.ref.reddit.repository.CommentRepository;
import org.springframework.stereotype.Service;

@Service
public class CommentService extends GeneratedCommentService {
    public CommentService(CommentRepository repository) {
        super(repository);
    }
}
