package pt.isep.enorm.ref.youtube.service;

import org.springframework.stereotype.Service;

import pt.isep.enorm.ref.youtube.repository.ChannelRepository;
import pt.isep.enorm.ref.youtube.repository.SubscriptionRepository;
import pt.isep.enorm.ref.youtube.service.generated.GeneratedSubscriptionService;

@Service
public class SubscriptionService extends GeneratedSubscriptionService {

    public SubscriptionService(SubscriptionRepository subscriptionRepository, ChannelRepository channelRepository) {
        super(subscriptionRepository, channelRepository);
    }
}

