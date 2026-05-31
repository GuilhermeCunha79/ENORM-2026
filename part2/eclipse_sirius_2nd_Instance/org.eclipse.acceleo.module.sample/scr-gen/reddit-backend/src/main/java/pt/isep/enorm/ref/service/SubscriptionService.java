package pt.isep.enorm.ref.service;

import pt.isep.enorm.ref.service.generated.GeneratedSubscriptionService;
import pt.isep.enorm.ref.repository.SubscriptionRepository;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionService extends GeneratedSubscriptionService {
    public SubscriptionService(SubscriptionRepository repository) {
        super(repository);
    }
}
