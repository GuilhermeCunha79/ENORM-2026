package pt.isep.enorm.ref.repository.generated;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.isep.enorm.ref.domain.ProductReview;

public interface GeneratedProductReviewRepository extends JpaRepository<ProductReview, Long> {
boolean existsByAuthor_IdAndSubject_Id(Long authorId, Long subjectId);
}
