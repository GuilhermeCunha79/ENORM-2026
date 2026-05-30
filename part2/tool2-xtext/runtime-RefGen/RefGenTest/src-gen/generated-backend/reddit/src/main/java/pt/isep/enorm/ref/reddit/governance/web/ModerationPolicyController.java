package pt.isep.enorm.ref.reddit.governance.web;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.reddit.governance.domain.ModerationPolicy;
import pt.isep.enorm.ref.reddit.governance.repository.ModerationPolicyRepository;

@RestController
@RequestMapping("/api/policies/moderation-policies")
public class ModerationPolicyController {
    private final ModerationPolicyRepository repository;

    public ModerationPolicyController(ModerationPolicyRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<ModerationPolicy> list() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ModerationPolicy get(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("ModerationPolicy not found: " + id));
    }

    @PostMapping
    public ResponseEntity<ModerationPolicy> create(@RequestBody ModerationPolicy body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(body));
    }
}
