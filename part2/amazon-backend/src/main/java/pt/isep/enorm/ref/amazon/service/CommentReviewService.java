package pt.isep.enorm.ref.amazon.service;

import org.springframework.stereotype.Service;

import pt.isep.enorm.ref.amazon.repository.CommentReviewRepository;
import pt.isep.enorm.ref.amazon.repository.ProductRepository;
import pt.isep.enorm.ref.amazon.service.generated.GeneratedCommentReviewService;

@Service
public class CommentReviewService extends GeneratedCommentReviewService {

    public CommentReviewService(CommentReviewRepository commentReviewRepository, ProductRepository productRepository) {
        super(commentReviewRepository, productRepository);
    }
}
