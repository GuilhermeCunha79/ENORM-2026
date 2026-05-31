package pt.isep.enorm.ref.youtube.web.generated;

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
import pt.isep.enorm.ref.youtube.domain.ChannelPermissionPolicy;
import pt.isep.enorm.ref.youtube.domain.ContentValidationRule;
import pt.isep.enorm.ref.youtube.domain.SortingPolicy;
import pt.isep.enorm.ref.youtube.domain.YoutubeUser;
import pt.isep.enorm.ref.youtube.service.PolicyService;

public abstract class GeneratedPolicyController {

    private final PolicyService policyService;

    protected GeneratedPolicyController(PolicyService policyService) {
        this.policyService = policyService;
    }

    @GetMapping("/policies/channels/{channelId}/permissions")
    public List<ChannelPermissionPolicy> listChannelPolicies(@PathVariable Long channelId) {
        return policyService.listChannelPolicies(channelId);
    }

    @PostMapping("/policies/channels/{channelId}/permissions")
    public ResponseEntity<ChannelPermissionPolicy> createChannelPolicy(
        @AuthenticationPrincipal YoutubeUser currentUser,
        @PathVariable Long channelId,
        @Valid @RequestBody ChannelPermissionPolicy request
    ) {
        ChannelPermissionPolicy policy = policyService.createChannelPolicy(currentUser, channelId, request);
        return ResponseEntity.status(HttpStatus.CREATED).body(policy);
    }

    @GetMapping("/policies/channels/{channelId}/sorting")
    public List<SortingPolicy> listSortingPolicies(@PathVariable Long channelId) {
        return policyService.listSortingPolicies(channelId);
    }

    @PostMapping("/policies/channels/{channelId}/sorting")
    public ResponseEntity<SortingPolicy> createSortingPolicy(
        @PathVariable Long channelId,
        @Valid @RequestBody SortingPolicy request
    ) {
        SortingPolicy policy = policyService.createSortingPolicy(channelId, request);
        return ResponseEntity.status(HttpStatus.CREATED).body(policy);
    }

    @GetMapping("/policies/validation-rules")
    public List<ContentValidationRule> listValidationRules(
        @RequestParam(required = false) Long videoId,
        @RequestParam(required = false) Long commentId
    ) {
        return policyService.listValidationRules(videoId, commentId);
    }

    @PostMapping("/policies/validation-rules")
    public ResponseEntity<ContentValidationRule> createValidationRule(
        @AuthenticationPrincipal YoutubeUser currentUser,
        @RequestParam(required = false) Long videoId,
        @RequestParam(required = false) Long commentId,
        @Valid @RequestBody ContentValidationRule request
    ) {
        ContentValidationRule rule = policyService.createValidationRule(currentUser, videoId, commentId, request);
        return ResponseEntity.status(HttpStatus.CREATED).body(rule);
    }
}

