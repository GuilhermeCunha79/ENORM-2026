package pt.isep.enorm.ref.amazon.repository.generated;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;

import pt.isep.enorm.ref.amazon.domain.ProductReview;
import pt.isep.enorm.ref.amazon.domain.enums.ReviewStatus;

@NoRepositoryBean
public interface GeneratedProductReviewRepository extends JpaRepository<ProductReview, Long> {

    boolean existsByProductIdAndAuthorId(Long productId, Long authorId);

    long countByProductIdAndStatus(Long productId, ReviewStatus status);

    @Query("""
        select avg(review.grade)
        from ProductReview review
        where review.product.id = :productId
          and review.status = :status
        """)
    Double findAverageGradeByProductIdAndStatus(@Param("productId") Long productId, @Param("status") ReviewStatus status);
}