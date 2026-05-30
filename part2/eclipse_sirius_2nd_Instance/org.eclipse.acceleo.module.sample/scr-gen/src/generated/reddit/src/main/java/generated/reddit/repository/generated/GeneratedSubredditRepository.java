package generated.reddit.repository.generated;

import generated.reddit.domain.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneratedSubredditRepository extends JpaRepository<Subreddit, String> {
}
