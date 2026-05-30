package pt.isep.enorm.ref.reddit.web.generated;

import pt.isep.enorm.ref.reddit.domain.Subscription;
import pt.isep.enorm.ref.reddit.service.generated.GeneratedSubscriptionService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/subscriptions")
public class GeneratedSubscriptionController {
    private final GeneratedSubscriptionService service;

    public GeneratedSubscriptionController(GeneratedSubscriptionService service) { this.service = service; }

    @GetMapping public List<Subscription> list(@RequestParam(required = false) String userId) { return service.list(); }
    @PostMapping @ResponseStatus(HttpStatus.CREATED) public Subscription create(@RequestBody Subscription payload) { return service.create(payload); }
    @DeleteMapping("/{subscriptionId}") @ResponseStatus(HttpStatus.NO_CONTENT) public void delete(@PathVariable String subscriptionId) { service.delete(subscriptionId); }
}
