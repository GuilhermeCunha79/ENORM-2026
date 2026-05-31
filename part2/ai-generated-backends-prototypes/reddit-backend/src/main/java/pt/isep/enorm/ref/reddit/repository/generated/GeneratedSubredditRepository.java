package pt.isep.enorm.ref.reddit.repository.generated;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import pt.isep.enorm.ref.reddit.domain.Subreddit;

@NoRepositoryBean
public interface GeneratedSubredditRepository extends JpaRepository<Subreddit, Long> {

    List<Subreddit> findAllByOrderByNameAsc();

    List<Subreddit> findByOwnerId(Long ownerId);
}


