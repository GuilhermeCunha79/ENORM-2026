package pt.isep.enorm.ref.reddit.repository.generated;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import pt.isep.enorm.ref.reddit.domain.Subscription;

@NoRepositoryBean
public interface GeneratedSubscriptionRepository extends JpaRepository<Subscription, Long> {

    List<Subscription> findBySubscriberId(Long subscriberId);

    boolean existsBySubscriberIdAndSubredditId(Long subscriberId, Long subredditId);
}



