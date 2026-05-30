package pt.isep.enorm.ref.youtube.repository.generated;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.isep.enorm.ref.youtube.domain.VideoLike;

public interface GeneratedVideoLikeRepository extends JpaRepository<VideoLike, Long> {
boolean existsByAuthor_IdAndSubject_Id(Long authorId, Long subjectId);
}
