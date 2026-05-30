package pt.isep.enorm.ref.reddit.repository.generated;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import pt.isep.enorm.ref.reddit.domain.RedditUser;

public interface GeneratedRedditUserRepository extends JpaRepository<RedditUser, Long> {
    Optional<RedditUser> findByUsername(String username);
}
