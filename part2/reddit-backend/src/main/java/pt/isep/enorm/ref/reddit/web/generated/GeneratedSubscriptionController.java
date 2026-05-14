package pt.isep.enorm.ref.reddit.web.generated;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pt.isep.enorm.ref.reddit.domain.Subscription;
import pt.isep.enorm.ref.reddit.domain.RedditUser;
import pt.isep.enorm.ref.reddit.service.SubscriptionService;

public abstract class GeneratedSubscriptionController {

    private final SubscriptionService subscriptionService;

    protected GeneratedSubscriptionController(SubscriptionService subscriptionService) {
        this.subscriptionService = subscriptionService;
    }

    @GetMapping("/subscriptions")
    public List<Subscription> listSubscriptions(@RequestParam Long userId) {
        return subscriptionService.listSubscriptionsForUser(userId);
    }

    @PostMapping("/subscriptions/{subredditId}")
    public ResponseEntity<Subscription> createSubscription(
        @AuthenticationPrincipal RedditUser currentUser,
        @PathVariable Long subredditId
    ) {
        Subscription subscription = subscriptionService.createSubscription(currentUser, subredditId);
        return ResponseEntity.status(HttpStatus.CREATED).body(subscription);
    }

    @DeleteMapping("/subscriptions/{subscriptionId}")
    public ResponseEntity<Void> deleteSubscription(@PathVariable Long subscriptionId) {
        subscriptionService.deleteSubscription(subscriptionId);
        return ResponseEntity.noContent().build();
    }
}



