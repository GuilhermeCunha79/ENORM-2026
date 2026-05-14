package pt.isep.enorm.ref.reddit.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.isep.enorm.ref.reddit.service.SubscriptionService;
import pt.isep.enorm.ref.reddit.web.generated.GeneratedSubscriptionController;

@RestController
@RequestMapping("/api")
public class SubscriptionController extends GeneratedSubscriptionController {

    public SubscriptionController(SubscriptionService subscriptionService) {
        super(subscriptionService);
    }
}

