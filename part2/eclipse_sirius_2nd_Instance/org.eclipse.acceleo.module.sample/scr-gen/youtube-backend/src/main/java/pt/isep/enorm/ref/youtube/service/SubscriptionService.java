package pt.isep.enorm.ref.youtube.service;

import pt.isep.enorm.ref.youtube.service.generated.GeneratedSubscriptionService;
import pt.isep.enorm.ref.youtube.repository.SubscriptionRepository;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionService extends GeneratedSubscriptionService {
    public SubscriptionService(SubscriptionRepository repository) {
        super(repository);
    }
}
