package generated.reddit.repository.generated;

import generated.reddit.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneratedCommentRepository extends JpaRepository<Comment, String> {
}
