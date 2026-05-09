package pt.isep.enorm.ref.amazon.service.generated;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import pt.isep.enorm.ref.amazon.domain.AutomationAction;
import pt.isep.enorm.ref.amazon.domain.AutomationCondition;
import pt.isep.enorm.ref.amazon.domain.AutomationRule;
import pt.isep.enorm.ref.amazon.domain.AuthorizationRule;
import pt.isep.enorm.ref.amazon.domain.ConditionValue;
import pt.isep.enorm.ref.amazon.domain.ContextType;
import pt.isep.enorm.ref.amazon.domain.ModerationPolicy;
import pt.isep.enorm.ref.amazon.domain.SortingPolicy;
import pt.isep.enorm.ref.amazon.domain.ValidationRule;
import pt.isep.enorm.ref.amazon.domain.VerificationPolicy;
import pt.isep.enorm.ref.amazon.repository.AutomationRuleRepository;
import pt.isep.enorm.ref.amazon.repository.AuthorizationRuleRepository;
import pt.isep.enorm.ref.amazon.repository.ContextTypeRepository;
import pt.isep.enorm.ref.amazon.repository.ModerationPolicyRepository;
import pt.isep.enorm.ref.amazon.repository.SortingPolicyRepository;
import pt.isep.enorm.ref.amazon.repository.ValidationRuleRepository;
import pt.isep.enorm.ref.amazon.repository.VerificationPolicyRepository;
import pt.isep.enorm.ref.amazon.service.command.AutomationActionCommand;
import pt.isep.enorm.ref.amazon.service.command.AutomationConditionCommand;
import pt.isep.enorm.ref.amazon.service.command.AutomationRuleCommand;
import pt.isep.enorm.ref.amazon.service.command.AuthorizationRuleCommand;
import pt.isep.enorm.ref.amazon.service.command.ModerationPolicyCommand;
import pt.isep.enorm.ref.amazon.service.command.SortingPolicyCommand;
import pt.isep.enorm.ref.amazon.service.command.ValidationRuleCommand;
import pt.isep.enorm.ref.amazon.service.command.VerificationPolicyCommand;
import pt.isep.enorm.ref.amazon.web.error.ResourceNotFoundException;

@Transactional(readOnly = true)
public abstract class GeneratedPolicyService {

    private final ContextTypeRepository contextTypeRepository;
    private final SortingPolicyRepository sortingPolicyRepository;
    private final ValidationRuleRepository validationRuleRepository;
    private final ModerationPolicyRepository moderationPolicyRepository;
    private final VerificationPolicyRepository verificationPolicyRepository;
    private final AuthorizationRuleRepository authorizationRuleRepository;
    private final AutomationRuleRepository automationRuleRepository;

    protected GeneratedPolicyService(
        ContextTypeRepository contextTypeRepository,
        SortingPolicyRepository sortingPolicyRepository,
        ValidationRuleRepository validationRuleRepository,
        ModerationPolicyRepository moderationPolicyRepository,
        VerificationPolicyRepository verificationPolicyRepository,
        AuthorizationRuleRepository authorizationRuleRepository,
        AutomationRuleRepository automationRuleRepository
    ) {
        this.contextTypeRepository = contextTypeRepository;
        this.sortingPolicyRepository = sortingPolicyRepository;
        this.validationRuleRepository = validationRuleRepository;
        this.moderationPolicyRepository = moderationPolicyRepository;
        this.verificationPolicyRepository = verificationPolicyRepository;
        this.authorizationRuleRepository = authorizationRuleRepository;
        this.automationRuleRepository = automationRuleRepository;
    }

    public List<SortingPolicy> listSortingPolicies() {
        return sortingPolicyRepository.findAll();
    }

    public SortingPolicy getSortingPolicy(Long policyId) {
        return loadSortingPolicy(policyId);
    }

    @Transactional
    public SortingPolicy createSortingPolicy(SortingPolicyCommand command) {
        SortingPolicy policy = new SortingPolicy();
        applySortingPolicy(policy, command);
        return sortingPolicyRepository.save(policy);
    }

    @Transactional
    public SortingPolicy updateSortingPolicy(Long policyId, SortingPolicyCommand command) {
        SortingPolicy policy = loadSortingPolicy(policyId);
        applySortingPolicy(policy, command);
        return sortingPolicyRepository.save(policy);
    }

    @Transactional
    public void deleteSortingPolicy(Long policyId) {
        sortingPolicyRepository.delete(loadSortingPolicy(policyId));
    }

    public List<ValidationRule> listValidationRules() {
        return validationRuleRepository.findAll();
    }

    public ValidationRule getValidationRule(Long ruleId) {
        return loadValidationRule(ruleId);
    }

    @Transactional
    public ValidationRule createValidationRule(ValidationRuleCommand command) {
        ValidationRule rule = new ValidationRule();
        applyValidationRule(rule, command);
        return validationRuleRepository.save(rule);
    }

    @Transactional
    public ValidationRule updateValidationRule(Long ruleId, ValidationRuleCommand command) {
        ValidationRule rule = loadValidationRule(ruleId);
        applyValidationRule(rule, command);
        return validationRuleRepository.save(rule);
    }

    @Transactional
    public void deleteValidationRule(Long ruleId) {
        validationRuleRepository.delete(loadValidationRule(ruleId));
    }

    public List<ModerationPolicy> listModerationPolicies() {
        return moderationPolicyRepository.findAll();
    }

    public ModerationPolicy getModerationPolicy(Long policyId) {
        return loadModerationPolicy(policyId);
    }

    @Transactional
    public ModerationPolicy createModerationPolicy(ModerationPolicyCommand command) {
        ModerationPolicy policy = new ModerationPolicy();
        applyModerationPolicy(policy, command);
        return moderationPolicyRepository.save(policy);
    }

    @Transactional
    public ModerationPolicy updateModerationPolicy(Long policyId, ModerationPolicyCommand command) {
        ModerationPolicy policy = loadModerationPolicy(policyId);
        applyModerationPolicy(policy, command);
        return moderationPolicyRepository.save(policy);
    }

    @Transactional
    public void deleteModerationPolicy(Long policyId) {
        moderationPolicyRepository.delete(loadModerationPolicy(policyId));
    }

    public List<VerificationPolicy> listVerificationPolicies() {
        return verificationPolicyRepository.findAll();
    }

    public VerificationPolicy getVerificationPolicy(Long policyId) {
        return loadVerificationPolicy(policyId);
    }

    @Transactional
    public VerificationPolicy createVerificationPolicy(VerificationPolicyCommand command) {
        VerificationPolicy policy = new VerificationPolicy();
        applyVerificationPolicy(policy, command);
        return verificationPolicyRepository.save(policy);
    }

    @Transactional
    public VerificationPolicy updateVerificationPolicy(Long policyId, VerificationPolicyCommand command) {
        VerificationPolicy policy = loadVerificationPolicy(policyId);
        applyVerificationPolicy(policy, command);
        return verificationPolicyRepository.save(policy);
    }

    @Transactional
    public void deleteVerificationPolicy(Long policyId) {
        verificationPolicyRepository.delete(loadVerificationPolicy(policyId));
    }

    public List<AuthorizationRule> listAuthorizationRules() {
        return authorizationRuleRepository.findAll();
    }

    public AuthorizationRule getAuthorizationRule(Long ruleId) {
        return loadAuthorizationRule(ruleId);
    }

    @Transactional
    public AuthorizationRule createAuthorizationRule(AuthorizationRuleCommand command) {
        AuthorizationRule rule = new AuthorizationRule();
        applyAuthorizationRule(rule, command);
        return authorizationRuleRepository.save(rule);
    }

    @Transactional
    public AuthorizationRule updateAuthorizationRule(Long ruleId, AuthorizationRuleCommand command) {
        AuthorizationRule rule = loadAuthorizationRule(ruleId);
        applyAuthorizationRule(rule, command);
        return authorizationRuleRepository.save(rule);
    }

    @Transactional
    public void deleteAuthorizationRule(Long ruleId) {
        authorizationRuleRepository.delete(loadAuthorizationRule(ruleId));
    }

    public List<AutomationRule> listAutomationRules() {
        return automationRuleRepository.findAll();
    }

    public AutomationRule getAutomationRule(Long ruleId) {
        return loadAutomationRule(ruleId);
    }

    @Transactional
    public AutomationRule createAutomationRule(AutomationRuleCommand command) {
        AutomationRule rule = new AutomationRule();
        applyAutomationRule(rule, command);
        return automationRuleRepository.save(rule);
    }

    @Transactional
    public AutomationRule updateAutomationRule(Long ruleId, AutomationRuleCommand command) {
        AutomationRule rule = loadAutomationRule(ruleId);
        applyAutomationRule(rule, command);
        return automationRuleRepository.save(rule);
    }

    @Transactional
    public void deleteAutomationRule(Long ruleId) {
        automationRuleRepository.delete(loadAutomationRule(ruleId));
    }

    private void applySortingPolicy(SortingPolicy policy, SortingPolicyCommand command) {
        policy.setName(command.name());
        policy.setCriterion(command.criterion());
        policy.setDirection(command.direction());
        policy.setAppliesToResource(command.appliesToResource());
        policy.setAppliesToFeedback(command.appliesToFeedback());
        policy.setContext(resolveContext(command.contextId()));
    }

    private void applyValidationRule(ValidationRule rule, ValidationRuleCommand command) {
        rule.setName(command.name());
        rule.setKind(command.kind());
        rule.setSeverity(command.severity());
        rule.setExpression(command.expression());
        rule.setImplementationId(command.implementationId());
        rule.setAppliesToResource(command.appliesToResource());
        rule.setAppliesToFeedback(command.appliesToFeedback());
        rule.setAppliesToRole(command.appliesToRole());
        if (command.invokedByRuleId() != null) {
            rule.setInvokedBy(loadAutomationRule(command.invokedByRuleId()));
        }
    }

    private void applyModerationPolicy(ModerationPolicy policy, ModerationPolicyCommand command) {
        policy.setName(command.name());
        policy.setMode(command.mode());
        policy.setTrigger(command.trigger());
        policy.setDecision(command.decision());
        policy.setMonitorsResource(command.monitorsResource());
        policy.setMonitorsFeedback(command.monitorsFeedback());
        policy.setExecutedByRole(command.executedByRole());
        policy.setContext(resolveContext(command.contextId()));
    }

    private void applyVerificationPolicy(VerificationPolicy policy, VerificationPolicyCommand command) {
        policy.setName(command.name());
        policy.setMode(command.mode());
        policy.setAppliesWhen(command.appliesWhen());
        policy.setVerifiesFeedback(command.verifiesFeedback());
    }

    private void applyAuthorizationRule(AuthorizationRule rule, AuthorizationRuleCommand command) {
        rule.setName(command.name());
        rule.setAllowedAction(command.allowedAction());
        rule.setActorRole(command.actorRole());
        rule.setResourceTarget(command.resourceTarget());
        rule.setFeedbackTarget(command.feedbackTarget());
        rule.setContext(resolveContext(command.contextId()));
    }

    private void applyAutomationRule(AutomationRule rule, AutomationRuleCommand command) {
        rule.setName(command.name());
        rule.setTrigger(command.trigger());
        rule.setContextResource(command.contextResource());
        rule.setOnFeedback(command.onFeedback());
        rule.setContext(resolveContext(command.contextId()));
        rule.setUsesValidation(resolveValidation(command.usesValidationId()));

        rule.getConditions().clear();
        for (AutomationConditionCommand conditionCommand : command.conditions()) {
            rule.addCondition(toCondition(conditionCommand));
        }

        rule.getActions().clear();
        for (AutomationActionCommand actionCommand : command.actions()) {
            rule.addAction(toAction(actionCommand));
        }
    }

    private AutomationCondition toCondition(AutomationConditionCommand command) {
        AutomationCondition condition = new AutomationCondition();
        condition.setName(command.name());
        condition.setAttributeName(command.attributeName());
        condition.setOperator(command.operator());
        for (String value : command.values()) {
            ConditionValue conditionValue = new ConditionValue();
            conditionValue.setValue(value);
            condition.addValue(conditionValue);
        }
        return condition;
    }

    private AutomationAction toAction(AutomationActionCommand command) {
        AutomationAction action = new AutomationAction();
        action.setName(command.name());
        action.setKind(command.kind());
        action.setMessage(command.message());
        return action;
    }

    private ContextType resolveContext(Long contextId) {
        if (contextId == null) {
            return null;
        }
        return contextTypeRepository.findById(contextId)
            .orElseThrow(() -> new ResourceNotFoundException("Context '%s' was not found.".formatted(contextId)));
    }

    private ValidationRule resolveValidation(Long validationId) {
        if (validationId == null) {
            return null;
        }
        return loadValidationRule(validationId);
    }

    private SortingPolicy loadSortingPolicy(Long policyId) {
        return sortingPolicyRepository.findById(policyId)
            .orElseThrow(() -> new ResourceNotFoundException("Sorting policy '%s' was not found.".formatted(policyId)));
    }

    private ValidationRule loadValidationRule(Long ruleId) {
        return validationRuleRepository.findById(ruleId)
            .orElseThrow(() -> new ResourceNotFoundException("Validation rule '%s' was not found.".formatted(ruleId)));
    }

    private ModerationPolicy loadModerationPolicy(Long policyId) {
        return moderationPolicyRepository.findById(policyId)
            .orElseThrow(() -> new ResourceNotFoundException("Moderation policy '%s' was not found.".formatted(policyId)));
    }

    private VerificationPolicy loadVerificationPolicy(Long policyId) {
        return verificationPolicyRepository.findById(policyId)
            .orElseThrow(() -> new ResourceNotFoundException("Verification policy '%s' was not found.".formatted(policyId)));
    }

    private AuthorizationRule loadAuthorizationRule(Long ruleId) {
        return authorizationRuleRepository.findById(ruleId)
            .orElseThrow(() -> new ResourceNotFoundException("Authorization rule '%s' was not found.".formatted(ruleId)));
    }

    private AutomationRule loadAutomationRule(Long ruleId) {
        return automationRuleRepository.findById(ruleId)
            .orElseThrow(() -> new ResourceNotFoundException("Automation rule '%s' was not found.".formatted(ruleId)));
    }
}
