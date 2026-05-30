package pt.isep.enorm.ref.reddit.repository.generated;

import pt.isep.enorm.ref.reddit.domain.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneratedSubscriptionRepository extends JpaRepository<Subscription, Long> {
}
