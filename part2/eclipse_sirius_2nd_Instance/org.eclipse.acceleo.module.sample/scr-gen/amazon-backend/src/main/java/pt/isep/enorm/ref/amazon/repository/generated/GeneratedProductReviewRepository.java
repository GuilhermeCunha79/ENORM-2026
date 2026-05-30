package pt.isep.enorm.ref.amazon.repository.generated;

import pt.isep.enorm.ref.amazon.domain.ProductReview;
import pt.isep.enorm.ref.amazon.domain.enums.ReviewStatus;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneratedProductReviewRepository extends JpaRepository<ProductReview, Long> {
    List<ProductReview> findByStatus(ReviewStatus status);
}
