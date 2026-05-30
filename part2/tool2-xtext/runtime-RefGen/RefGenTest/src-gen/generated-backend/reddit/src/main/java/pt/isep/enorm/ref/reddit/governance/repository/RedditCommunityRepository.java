package pt.isep.enorm.ref.reddit.governance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.isep.enorm.ref.reddit.governance.domain.RedditCommunity;

public interface RedditCommunityRepository extends JpaRepository<RedditCommunity, Long> {
}
