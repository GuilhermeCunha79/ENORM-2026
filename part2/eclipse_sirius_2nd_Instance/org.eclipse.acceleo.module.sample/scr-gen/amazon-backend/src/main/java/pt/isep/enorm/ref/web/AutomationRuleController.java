package pt.isep.enorm.ref.web;

import pt.isep.enorm.ref.domain.AutomationRule;
import pt.isep.enorm.ref.repository.AutomationRuleRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/policies/automation-rules")
public class AutomationRuleController {
    private final AutomationRuleRepository repository;

    public AutomationRuleController(AutomationRuleRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<AutomationRule> list() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public AutomationRule get(@PathVariable Long id) {
        return repository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("AutomationRule not found: " + id));
    }

    @PostMapping
    @Transactional
    public ResponseEntity<AutomationRule> create(@RequestBody AutomationRule body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(body));
    }
}
