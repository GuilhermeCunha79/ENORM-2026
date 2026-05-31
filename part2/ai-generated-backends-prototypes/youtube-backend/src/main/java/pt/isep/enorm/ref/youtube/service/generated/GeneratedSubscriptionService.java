package pt.isep.enorm.ref.youtube.service.generated;

import java.time.LocalDate;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import pt.isep.enorm.ref.youtube.domain.Channel;
import pt.isep.enorm.ref.youtube.domain.Subscription;
import pt.isep.enorm.ref.youtube.domain.YoutubeUser;
import pt.isep.enorm.ref.youtube.repository.ChannelRepository;
import pt.isep.enorm.ref.youtube.repository.SubscriptionRepository;
import pt.isep.enorm.ref.youtube.web.error.ResourceNotFoundException;

@Transactional(readOnly = true)
public abstract class GeneratedSubscriptionService {

    private final SubscriptionRepository subscriptionRepository;
    private final ChannelRepository channelRepository;

    protected GeneratedSubscriptionService(
        SubscriptionRepository subscriptionRepository,
        ChannelRepository channelRepository
    ) {
        this.subscriptionRepository = subscriptionRepository;
        this.channelRepository = channelRepository;
    }

    public List<Subscription> listSubscriptionsForUser(Long userId) {
        return subscriptionRepository.findBySubscriberId(userId);
    }

    @Transactional
    public Subscription createSubscription(YoutubeUser subscriber, Long channelId) {
        if (subscriber == null) {
            throw new IllegalArgumentException("Subscriber is required.");
        }

        if (subscriptionRepository.existsBySubscriberIdAndChannelId(subscriber.getId(), channelId)) {
            throw new IllegalStateException("Already subscribed to this channel.");
        }

        Channel channel = channelRepository.findById(channelId)
            .orElseThrow(() -> new ResourceNotFoundException("Channel '%s' was not found.".formatted(channelId)));

        Subscription subscription = new Subscription();
        subscription.setSubscriber(subscriber);
        subscription.setChannel(channel);
        subscription.setDate(LocalDate.now());

        return subscriptionRepository.save(subscription);
    }

    @Transactional
    public void deleteSubscription(Long subscriptionId) {
        Subscription subscription = subscriptionRepository.findById(subscriptionId)
            .orElseThrow(() -> new ResourceNotFoundException("Subscription '%s' was not found.".formatted(subscriptionId)));
        subscriptionRepository.delete(subscription);
    }
}

