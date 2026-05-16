package pt.isep.enorm.ref.amazon.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import pt.isep.enorm.ref.amazon.domain.ProductReview;
import pt.isep.enorm.ref.amazon.domain.enums.ReviewStatus;
import pt.isep.enorm.ref.amazon.repository.generated.GeneratedProductReviewRepository;

@Repository
public interface ProductReviewRepository extends GeneratedProductReviewRepository {

    List<ProductReview> findByStatus(ReviewStatus status);
}
