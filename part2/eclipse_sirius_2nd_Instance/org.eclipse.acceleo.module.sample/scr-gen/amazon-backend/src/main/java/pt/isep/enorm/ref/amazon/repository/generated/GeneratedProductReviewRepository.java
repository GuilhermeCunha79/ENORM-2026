package pt.isep.enorm.ref.amazon.repository.generated;

import pt.isep.enorm.ref.amazon.domain.ProductReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneratedProductReviewRepository extends JpaRepository<ProductReview, Long> {
}
