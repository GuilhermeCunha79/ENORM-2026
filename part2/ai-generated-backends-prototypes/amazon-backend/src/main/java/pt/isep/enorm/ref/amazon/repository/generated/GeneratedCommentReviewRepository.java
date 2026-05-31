package pt.isep.enorm.ref.amazon.repository.generated;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import pt.isep.enorm.ref.amazon.domain.CommentReview;

@NoRepositoryBean
public interface GeneratedCommentReviewRepository extends JpaRepository<CommentReview, Long> {

    List<CommentReview> findByProductId(Long productId);
}
