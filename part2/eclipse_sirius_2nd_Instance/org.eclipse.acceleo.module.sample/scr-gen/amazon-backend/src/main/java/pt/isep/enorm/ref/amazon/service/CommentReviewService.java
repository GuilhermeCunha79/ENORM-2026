package pt.isep.enorm.ref.amazon.service;

import pt.isep.enorm.ref.amazon.service.generated.GeneratedCommentReviewService;
import pt.isep.enorm.ref.amazon.repository.CommentReviewRepository;
import org.springframework.stereotype.Service;

@Service
public class CommentReviewService extends GeneratedCommentReviewService {
    public CommentReviewService(CommentReviewRepository repository) {
        super(repository);
    }
}
