package pt.isep.enorm.ref.youtube.repository.generated;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import pt.isep.enorm.ref.youtube.domain.CommentModerationCheck;

@NoRepositoryBean
public interface GeneratedCommentModerationCheckRepository extends JpaRepository<CommentModerationCheck, Long> {

    List<CommentModerationCheck> findByCommentId(Long commentId);
}

