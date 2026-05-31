package pt.isep.enorm.ref.repository.generated;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.isep.enorm.ref.domain.VideoReview;

public interface GeneratedVideoReviewRepository extends JpaRepository<VideoReview, Long> {
boolean existsByAuthor_IdAndSubject_Id(Long authorId, Long subjectId);
}
