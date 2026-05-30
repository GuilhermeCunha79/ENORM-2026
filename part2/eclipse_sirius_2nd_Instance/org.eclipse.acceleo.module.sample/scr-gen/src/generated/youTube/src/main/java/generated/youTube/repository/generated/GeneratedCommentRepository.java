package generated.youTube.repository.generated;

import generated.youTube.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneratedCommentRepository extends JpaRepository<Comment, String> {
}
