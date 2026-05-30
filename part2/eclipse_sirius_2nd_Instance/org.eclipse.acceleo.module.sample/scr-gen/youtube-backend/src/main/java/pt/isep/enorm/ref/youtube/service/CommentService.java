package pt.isep.enorm.ref.youtube.service;

import pt.isep.enorm.ref.youtube.service.generated.GeneratedCommentService;
import pt.isep.enorm.ref.youtube.repository.CommentRepository;
import org.springframework.stereotype.Service;

@Service
public class CommentService extends GeneratedCommentService {
    public CommentService(CommentRepository repository) {
        super(repository);
    }
}
