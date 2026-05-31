package pt.isep.enorm.ref.repository.generated;

import pt.isep.enorm.ref.domain.ProductReview;
import pt.isep.enorm.ref.domain.enums.ModerationDecision;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneratedProductReviewRepository extends JpaRepository<ProductReview, Long> {
    List<ProductReview> findByStatus(ModerationDecision status);
}
