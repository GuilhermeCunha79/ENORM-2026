package pt.isep.enorm.ref.amazon.web;

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

import pt.isep.enorm.ref.amazon.domain.AutomationAction;
import pt.isep.enorm.ref.amazon.domain.AutomationCondition;
import pt.isep.enorm.ref.amazon.domain.AutomationRule;
import pt.isep.enorm.ref.amazon.domain.ConditionValue;
import pt.isep.enorm.ref.amazon.repository.AutomationRuleRepository;

/**
 * CRUD endpoint for AutomationRule (POST/GET /api/policies/automation-rules).
 *
 * <p>The AutomationRule aggregate is bidirectional: AutomationCondition and AutomationAction hold a
 * mandatory back-reference to their AutomationRule, and ConditionValue holds one to its
 * AutomationCondition (all {@code optional = false}). Jackson does not populate those back-references
 * when deserializing the request body, so {@link #linkChildren(AutomationRule)} wires them before the
 * cascading save; otherwise the children would be persisted with null foreign keys.</p>
 */
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
        linkChildren(body);
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(body));
    }

    /** Set the bidirectional back-references so the cascade persists the foreign keys. */
    private void linkChildren(AutomationRule rule) {
        if (rule.getConditions() != null) {
            for (AutomationCondition condition : rule.getConditions()) {
                condition.setAutomationRule(rule);
                if (condition.getValues() != null) {
                    for (ConditionValue value : condition.getValues()) {
                        value.setCondition(condition);
                    }
                }
            }
        }
        if (rule.getActions() != null) {
            for (AutomationAction action : rule.getActions()) {
                action.setAutomationRule(rule);
            }
        }
    }
}
