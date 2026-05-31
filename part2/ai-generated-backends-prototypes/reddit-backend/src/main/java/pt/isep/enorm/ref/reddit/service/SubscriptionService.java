package pt.isep.enorm.ref.reddit.service;

import org.springframework.stereotype.Service;

import pt.isep.enorm.ref.reddit.repository.SubredditRepository;
import pt.isep.enorm.ref.reddit.repository.SubscriptionRepository;
import pt.isep.enorm.ref.reddit.service.generated.GeneratedSubscriptionService;

@Service
public class SubscriptionService extends GeneratedSubscriptionService {

    public SubscriptionService(SubscriptionRepository subscriptionRepository, SubredditRepository subredditRepository) {
        super(subscriptionRepository, subredditRepository);
    }
}



