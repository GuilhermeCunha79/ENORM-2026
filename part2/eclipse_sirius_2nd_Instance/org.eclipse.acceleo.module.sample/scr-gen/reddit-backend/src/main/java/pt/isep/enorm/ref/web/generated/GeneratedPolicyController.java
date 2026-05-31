package pt.isep.enorm.ref.web.generated;

import pt.isep.enorm.ref.domain.ParticipationPolicy;
import pt.isep.enorm.ref.domain.SortingPolicy;
import pt.isep.enorm.ref.domain.ValidationRule;
import pt.isep.enorm.ref.repository.ParticipationPolicyRepository;
import pt.isep.enorm.ref.repository.SortingPolicyRepository;
import pt.isep.enorm.ref.repository.ValidationRuleRepository;
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
    private final ParticipationPolicyRepository participationPolicyRepository;
    private final SortingPolicyRepository sortingPolicyRepository;
    private final ValidationRuleRepository validationRuleRepository;

    public GeneratedPolicyController(ParticipationPolicyRepository participationPolicyRepository, SortingPolicyRepository sortingPolicyRepository, ValidationRuleRepository validationRuleRepository) {
        this.participationPolicyRepository = participationPolicyRepository;
        this.sortingPolicyRepository = sortingPolicyRepository;
        this.validationRuleRepository = validationRuleRepository;
    }

    @GetMapping("/subreddits/{subredditId}/permissions") public List<ParticipationPolicy> permissions(@PathVariable String subredditId) { return participationPolicyRepository.findAll(); }
    @PostMapping("/subreddits/{subredditId}/permissions") @ResponseStatus(HttpStatus.CREATED) public ParticipationPolicy createPermission(@PathVariable String subredditId, @RequestBody ParticipationPolicy payload) { return participationPolicyRepository.save(payload); }
    @GetMapping("/subreddits/{subredditId}/sorting") public List<SortingPolicy> sorting(@PathVariable String subredditId) { return sortingPolicyRepository.findAll(); }
    @PostMapping("/subreddits/{subredditId}/sorting") @ResponseStatus(HttpStatus.CREATED) public SortingPolicy createSorting(@PathVariable String subredditId, @RequestBody SortingPolicy payload) { return sortingPolicyRepository.save(payload); }
    @GetMapping("/validation-rules") public List<ValidationRule> validationRules(@RequestParam(required = false) String postId, @RequestParam(required = false) String commentId) { return validationRuleRepository.findAll(); }
    @PostMapping("/validation-rules") @ResponseStatus(HttpStatus.CREATED) public ValidationRule createValidationRule(@RequestParam(required = false) String postId, @RequestParam(required = false) String commentId, @RequestBody ValidationRule payload) { return validationRuleRepository.save(payload); }
}
