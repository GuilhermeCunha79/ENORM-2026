package pt.isep.enorm.ref.service.generated;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pt.isep.enorm.ref.dto.AutomationActionResult;
import pt.isep.enorm.ref.domain.AutomationAction;
import pt.isep.enorm.ref.domain.AutomationCondition;
import pt.isep.enorm.ref.domain.AutomationRule;
import pt.isep.enorm.ref.domain.ConditionValue;
import pt.isep.enorm.ref.repository.AutomationRuleRepository;

@Service
public class GeneratedAutomationEngineService {
    private final AutomationRuleRepository automationRuleRepository;

    public GeneratedAutomationEngineService(AutomationRuleRepository automationRuleRepository) {
        this.automationRuleRepository = automationRuleRepository;
    }

    /** Evaluate automation rules for a trigger against content (attribute -> value); return the actions that fire. */
    @Transactional(readOnly = true)
    public List<AutomationActionResult> evaluate(String triggerEvent, Map<String, String> content) {
        List<AutomationActionResult> results = new ArrayList<>();
        Map<String, String> safe = content == null ? Map.of() : content;
        for (AutomationRule rule : automationRuleRepository.findAll()) {
            boolean triggerMatches = triggerEvent == null || triggerEvent.isBlank()
                || rule.getTriggerEvent() == null || triggerEvent.equalsIgnoreCase(rule.getTriggerEvent());
            if (!triggerMatches) {
                continue;
            }
            if (allConditionsMatch(rule, safe)) {
                for (AutomationAction action : rule.getActions()) {
                    results.add(new AutomationActionResult(rule.getName(), action.getName(), action.getActionKind(), action.getMessage()));
                }
            }
        }
        return results;
    }

    private boolean allConditionsMatch(AutomationRule rule, Map<String, String> content) {
        for (AutomationCondition condition : rule.getConditions()) {
            if (!conditionMatches(condition, content)) {
                return false;
            }
        }
        return true;
    }

    private boolean conditionMatches(AutomationCondition condition, Map<String, String> content) {
        String operator = condition.getOperator();
        String attribute = condition.getAttributeName();
        String value = attribute == null ? null : content.get(attribute);
        List<String> keywords = new ArrayList<>();
        for (ConditionValue cv : condition.getValues()) {
            if (cv.getMatchValue() != null) {
                keywords.add(cv.getMatchValue());
            }
        }
        if (operator == null) {
            return true;
        }
        switch (operator) {
            case "HAS_PROPERTY":
                return value != null && !value.isBlank();
            case "NOT_HAS_PROPERTY":
                return value == null || value.isBlank();
            case "CONTAINS_KEYWORDS":
                return value != null && keywords.stream().anyMatch(value::contains);
            case "NOT_CONTAINS_KEYWORDS":
                return value == null || keywords.stream().noneMatch(value::contains);
            case "MATCH_REGEX":
                return value != null && !keywords.isEmpty() && Pattern.compile(keywords.get(0)).matcher(value).find();
            case "NOT_MATCH_REGEX":
                return value == null || keywords.isEmpty() || !Pattern.compile(keywords.get(0)).matcher(value).find();
            case "HAS_SPECIFIC_PROPERTY":
                return value != null && keywords.contains(value);
            case "NOT_HAS_SPECIFIC_PROPERTY":
                return value == null || !keywords.contains(value);
            default:
                return true;
        }
    }
}
