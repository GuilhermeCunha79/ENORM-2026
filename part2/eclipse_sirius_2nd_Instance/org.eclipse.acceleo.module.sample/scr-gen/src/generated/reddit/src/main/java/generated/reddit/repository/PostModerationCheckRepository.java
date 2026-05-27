package generated.reddit.repository;

import generated.reddit.domain.PostModerationCheck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostModerationCheckRepository extends JpaRepository<PostModerationCheck, String> {
}
