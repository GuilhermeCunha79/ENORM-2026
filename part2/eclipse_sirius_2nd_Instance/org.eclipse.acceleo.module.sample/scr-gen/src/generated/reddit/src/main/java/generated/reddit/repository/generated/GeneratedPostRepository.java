package generated.reddit.repository.generated;

import generated.reddit.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneratedPostRepository extends JpaRepository<Post, String> {
}
