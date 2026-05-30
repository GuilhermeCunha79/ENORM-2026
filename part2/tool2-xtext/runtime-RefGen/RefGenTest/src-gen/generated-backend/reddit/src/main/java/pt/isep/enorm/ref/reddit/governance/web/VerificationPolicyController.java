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
import pt.isep.enorm.ref.reddit.governance.domain.VerificationPolicy;
import pt.isep.enorm.ref.reddit.governance.repository.VerificationPolicyRepository;

@RestController
@RequestMapping("/api/policies/verification-policies")
public class VerificationPolicyController {
    private final VerificationPolicyRepository repository;

    public VerificationPolicyController(VerificationPolicyRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<VerificationPolicy> list() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public VerificationPolicy get(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("VerificationPolicy not found: " + id));
    }

    @PostMapping
    public ResponseEntity<VerificationPolicy> create(@RequestBody VerificationPolicy body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(body));
    }
}
