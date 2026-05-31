package pt.isep.enorm.ref.repository.generated;

import pt.isep.enorm.ref.domain.CommentModerationCheck;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneratedCommentModerationCheckRepository extends JpaRepository<CommentModerationCheck, Long> {
    List<CommentModerationCheck> findByCommentId(Long commentId);
}
