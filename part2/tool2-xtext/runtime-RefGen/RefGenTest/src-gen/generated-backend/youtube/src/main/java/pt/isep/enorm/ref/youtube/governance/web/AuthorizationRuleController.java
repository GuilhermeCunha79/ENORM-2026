package pt.isep.enorm.ref.youtube.governance.web;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.youtube.governance.domain.AuthorizationRule;
import pt.isep.enorm.ref.youtube.governance.repository.AuthorizationRuleRepository;

@RestController
@RequestMapping("/api/policies/authorization-rules")
public class AuthorizationRuleController {
    private final AuthorizationRuleRepository repository;

    public AuthorizationRuleController(AuthorizationRuleRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<AuthorizationRule> list() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public AuthorizationRule get(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("AuthorizationRule not found: " + id));
    }

    @PostMapping
    public ResponseEntity<AuthorizationRule> create(@RequestBody AuthorizationRule body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(body));
    }
}
