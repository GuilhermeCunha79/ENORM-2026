package pt.isep.enorm.ref.reddit.service;

import pt.isep.enorm.ref.reddit.service.generated.GeneratedSubscriptionService;
import pt.isep.enorm.ref.reddit.repository.SubscriptionRepository;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionService extends GeneratedSubscriptionService {
    public SubscriptionService(SubscriptionRepository repository) {
        super(repository);
    }
}
