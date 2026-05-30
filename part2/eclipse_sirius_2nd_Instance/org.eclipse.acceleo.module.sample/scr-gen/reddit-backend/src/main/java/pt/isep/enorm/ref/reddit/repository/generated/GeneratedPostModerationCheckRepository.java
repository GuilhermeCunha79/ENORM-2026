package pt.isep.enorm.ref.reddit.repository.generated;

import pt.isep.enorm.ref.reddit.domain.PostModerationCheck;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneratedPostModerationCheckRepository extends JpaRepository<PostModerationCheck, Long> {
    List<PostModerationCheck> findByPostId(Long postId);
}
