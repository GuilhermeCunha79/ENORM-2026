package generated.youTube.repository;

import generated.youTube.domain.CommentModerationCheck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentModerationCheckRepository extends JpaRepository<CommentModerationCheck, String> {
}
