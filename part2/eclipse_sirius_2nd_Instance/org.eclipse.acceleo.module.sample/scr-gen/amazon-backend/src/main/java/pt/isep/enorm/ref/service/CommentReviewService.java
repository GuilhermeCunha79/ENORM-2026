package pt.isep.enorm.ref.service;

import pt.isep.enorm.ref.service.generated.GeneratedCommentReviewService;
import pt.isep.enorm.ref.repository.CommentReviewRepository;
import org.springframework.stereotype.Service;

@Service
public class CommentReviewService extends GeneratedCommentReviewService {
    public CommentReviewService(CommentReviewRepository repository) {
        super(repository);
    }
}
