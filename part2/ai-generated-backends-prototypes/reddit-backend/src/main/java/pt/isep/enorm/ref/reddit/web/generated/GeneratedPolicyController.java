package pt.isep.enorm.ref.reddit.web.generated;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.Valid;
import pt.isep.enorm.ref.reddit.domain.ParticipationPolicy;
import pt.isep.enorm.ref.reddit.domain.ValidationRule;
import pt.isep.enorm.ref.reddit.domain.SortingPolicy;
import pt.isep.enorm.ref.reddit.domain.RedditUser;
import pt.isep.enorm.ref.reddit.service.PolicyService;

public abstract class GeneratedPolicyController {

    private final PolicyService policyService;

    protected GeneratedPolicyController(PolicyService policyService) {
        this.policyService = policyService;
    }

    @GetMapping("/policies/subreddits/{subredditId}/permissions")
    public List<ParticipationPolicy> listSubredditPolicies(@PathVariable Long subredditId) {
        return policyService.listSubredditPolicies(subredditId);
    }

    @PostMapping("/policies/subreddits/{subredditId}/permissions")
    public ResponseEntity<ParticipationPolicy> createSubredditPolicy(
        @AuthenticationPrincipal RedditUser currentUser,
        @PathVariable Long subredditId,
        @Valid @RequestBody ParticipationPolicy request
    ) {
        ParticipationPolicy policy = policyService.createSubredditPolicy(currentUser, subredditId, request);
        return ResponseEntity.status(HttpStatus.CREATED).body(policy);
    }

    @GetMapping("/policies/subreddits/{subredditId}/sorting")
    public List<SortingPolicy> listSortingPolicies(@PathVariable Long subredditId) {
        return policyService.listSortingPolicies(subredditId);
    }

    @PostMapping("/policies/subreddits/{subredditId}/sorting")
    public ResponseEntity<SortingPolicy> createSortingPolicy(
        @PathVariable Long subredditId,
        @Valid @RequestBody SortingPolicy request
    ) {
        SortingPolicy policy = policyService.createSortingPolicy(subredditId, request);
        return ResponseEntity.status(HttpStatus.CREATED).body(policy);
    }

    @GetMapping("/policies/validation-rules")
    public List<ValidationRule> listValidationRules(
        @RequestParam(required = false) Long postId,
        @RequestParam(required = false) Long commentId
    ) {
        return policyService.listValidationRules(postId, commentId);
    }

    @PostMapping("/policies/validation-rules")
    public ResponseEntity<ValidationRule> createValidationRule(
        @AuthenticationPrincipal RedditUser currentUser,
        @RequestParam(required = false) Long postId,
        @RequestParam(required = false) Long commentId,
        @Valid @RequestBody ValidationRule request
    ) {
        ValidationRule rule = policyService.createValidationRule(currentUser, postId, commentId, request);
        return ResponseEntity.status(HttpStatus.CREATED).body(rule);
    }
}




