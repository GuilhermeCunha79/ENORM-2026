package pt.isep.enorm.ref.youtube.repository.generated;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import pt.isep.enorm.ref.youtube.domain.Subscription;

@NoRepositoryBean
public interface GeneratedSubscriptionRepository extends JpaRepository<Subscription, Long> {

    List<Subscription> findBySubscriberId(Long subscriberId);

    boolean existsBySubscriberIdAndChannelId(Long subscriberId, Long channelId);
}

