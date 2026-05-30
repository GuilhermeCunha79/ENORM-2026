package pt.isep.enorm.ref.amazon.governance.web;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.amazon.governance.domain.ValidationRule;
import pt.isep.enorm.ref.amazon.governance.repository.ValidationRuleRepository;

@RestController
@RequestMapping("/api/policies/validation-rules")
public class ValidationRuleController {
    private final ValidationRuleRepository repository;

    public ValidationRuleController(ValidationRuleRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<ValidationRule> list() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ValidationRule get(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("ValidationRule not found: " + id));
    }

    @PostMapping
    public ResponseEntity<ValidationRule> create(@RequestBody ValidationRule body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(body));
    }
}
