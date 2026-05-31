package pt.isep.enorm.ref.web.generated;

import pt.isep.enorm.ref.domain.ChannelPermissionPolicy;
import pt.isep.enorm.ref.domain.ContentValidationRule;
import pt.isep.enorm.ref.domain.SortingPolicy;
import pt.isep.enorm.ref.repository.ChannelPermissionPolicyRepository;
import pt.isep.enorm.ref.repository.ContentValidationRuleRepository;
import pt.isep.enorm.ref.repository.SortingPolicyRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/policies")
public class GeneratedPolicyController {
    private final ChannelPermissionPolicyRepository channelPermissionPolicyRepository;
    private final SortingPolicyRepository sortingPolicyRepository;
    private final ContentValidationRuleRepository contentValidationRuleRepository;

    public GeneratedPolicyController(ChannelPermissionPolicyRepository channelPermissionPolicyRepository, SortingPolicyRepository sortingPolicyRepository, ContentValidationRuleRepository contentValidationRuleRepository) {
        this.channelPermissionPolicyRepository = channelPermissionPolicyRepository;
        this.sortingPolicyRepository = sortingPolicyRepository;
        this.contentValidationRuleRepository = contentValidationRuleRepository;
    }

    @GetMapping("/channels/{channelId}/permissions") public List<ChannelPermissionPolicy> permissions(@PathVariable String channelId) { return channelPermissionPolicyRepository.findAll(); }
    @PostMapping("/channels/{channelId}/permissions") @ResponseStatus(HttpStatus.CREATED) public ChannelPermissionPolicy createPermission(@PathVariable String channelId, @RequestBody ChannelPermissionPolicy payload) { return channelPermissionPolicyRepository.save(payload); }
    @GetMapping("/channels/{channelId}/sorting") public List<SortingPolicy> sorting(@PathVariable String channelId) { return sortingPolicyRepository.findAll(); }
    @PostMapping("/channels/{channelId}/sorting") @ResponseStatus(HttpStatus.CREATED) public SortingPolicy createSorting(@PathVariable String channelId, @RequestBody SortingPolicy payload) { return sortingPolicyRepository.save(payload); }
    @GetMapping("/validation-rules") public List<ContentValidationRule> validationRules(@RequestParam(required = false) String videoId, @RequestParam(required = false) String commentId) { return contentValidationRuleRepository.findAll(); }
    @PostMapping("/validation-rules") @ResponseStatus(HttpStatus.CREATED) public ContentValidationRule createValidationRule(@RequestParam(required = false) String videoId, @RequestParam(required = false) String commentId, @RequestBody ContentValidationRule payload) { return contentValidationRuleRepository.save(payload); }
}
