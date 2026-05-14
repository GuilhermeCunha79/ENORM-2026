package pt.isep.enorm.ref.reddit.service.generated;

import java.time.LocalDate;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import pt.isep.enorm.ref.reddit.domain.Subreddit;
import pt.isep.enorm.ref.reddit.domain.Subscription;
import pt.isep.enorm.ref.reddit.domain.RedditUser;
import pt.isep.enorm.ref.reddit.repository.SubredditRepository;
import pt.isep.enorm.ref.reddit.repository.SubscriptionRepository;
import pt.isep.enorm.ref.reddit.web.error.ResourceNotFoundException;

@Transactional(readOnly = true)
public abstract class GeneratedSubscriptionService {

    private final SubscriptionRepository subscriptionRepository;
    private final SubredditRepository subredditRepository;

    protected GeneratedSubscriptionService(
        SubscriptionRepository subscriptionRepository,
        SubredditRepository subredditRepository
    ) {
        this.subscriptionRepository = subscriptionRepository;
        this.subredditRepository = subredditRepository;
    }

    public List<Subscription> listSubscriptionsForUser(Long userId) {
        return subscriptionRepository.findBySubscriberId(userId);
    }

    @Transactional
    public Subscription createSubscription(RedditUser subscriber, Long subredditId) {
        if (subscriber == null) {
            throw new IllegalArgumentException("Subscriber is required.");
        }

        if (subscriptionRepository.existsBySubscriberIdAndSubredditId(subscriber.getId(), subredditId)) {
            throw new IllegalStateException("Already subscribed to this subreddit.");
        }

        Subreddit subreddit = subredditRepository.findById(subredditId)
            .orElseThrow(() -> new ResourceNotFoundException("Subreddit '%s' was not found.".formatted(subredditId)));

        Subscription subscription = new Subscription();
        subscription.setSubscriber(subscriber);
        subscription.setSubreddit(subreddit);
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




