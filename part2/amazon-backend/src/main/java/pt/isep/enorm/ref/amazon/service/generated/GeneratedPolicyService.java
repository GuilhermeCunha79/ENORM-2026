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
    public SortingPolicy createSortingPolicy(SortingPolicy request) {
        SortingPolicy policy = new SortingPolicy();
        applySortingPolicy(policy, request);
        return sortingPolicyRepository.save(policy);
    }

    @Transactional
    public SortingPolicy updateSortingPolicy(Long policyId, SortingPolicy request) {
        SortingPolicy policy = loadSortingPolicy(policyId);
        applySortingPolicy(policy, request);
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
    public ValidationRule createValidationRule(ValidationRule request) {
        ValidationRule rule = new ValidationRule();
        applyValidationRule(rule, request);
        return validationRuleRepository.save(rule);
    }

    @Transactional
    public ValidationRule updateValidationRule(Long ruleId, ValidationRule request) {
        ValidationRule rule = loadValidationRule(ruleId);
        applyValidationRule(rule, request);
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
    public ModerationPolicy createModerationPolicy(ModerationPolicy request) {
        ModerationPolicy policy = new ModerationPolicy();
        applyModerationPolicy(policy, request);
        return moderationPolicyRepository.save(policy);
    }

    @Transactional
    public ModerationPolicy updateModerationPolicy(Long policyId, ModerationPolicy request) {
        ModerationPolicy policy = loadModerationPolicy(policyId);
        applyModerationPolicy(policy, request);
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
    public VerificationPolicy createVerificationPolicy(VerificationPolicy request) {
        VerificationPolicy policy = new VerificationPolicy();
        applyVerificationPolicy(policy, request);
        return verificationPolicyRepository.save(policy);
    }

    @Transactional
    public VerificationPolicy updateVerificationPolicy(Long policyId, VerificationPolicy request) {
        VerificationPolicy policy = loadVerificationPolicy(policyId);
        applyVerificationPolicy(policy, request);
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
    public AuthorizationRule createAuthorizationRule(AuthorizationRule request) {
        AuthorizationRule rule = new AuthorizationRule();
        applyAuthorizationRule(rule, request);
        return authorizationRuleRepository.save(rule);
    }

    @Transactional
    public AuthorizationRule updateAuthorizationRule(Long ruleId, AuthorizationRule request) {
        AuthorizationRule rule = loadAuthorizationRule(ruleId);
        applyAuthorizationRule(rule, request);
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
    public AutomationRule createAutomationRule(AutomationRule request) {
        AutomationRule rule = new AutomationRule();
        applyAutomationRule(rule, request);
        return automationRuleRepository.save(rule);
    }

    @Transactional
    public AutomationRule updateAutomationRule(Long ruleId, AutomationRule request) {
        AutomationRule rule = loadAutomationRule(ruleId);
        applyAutomationRule(rule, request);
        return automationRuleRepository.save(rule);
    }

    @Transactional
    public void deleteAutomationRule(Long ruleId) {
        automationRuleRepository.delete(loadAutomationRule(ruleId));
    }

    private void applySortingPolicy(SortingPolicy policy, SortingPolicy request) {
        policy.setName(request.getName());
        policy.setCriterion(request.getCriterion());
        policy.setDirection(request.getDirection());
        policy.setAppliesToResource(request.getAppliesToResource());
        policy.setAppliesToFeedback(request.getAppliesToFeedback());
        policy.setContext(resolveContext(request.getContext()));
    }

    private void applyValidationRule(ValidationRule rule, ValidationRule request) {
        rule.setName(request.getName());
        rule.setKind(request.getKind());
        rule.setSeverity(request.getSeverity());
        rule.setExpression(request.getExpression());
        rule.setImplementationId(request.getImplementationId());
        rule.setAppliesToResource(request.getAppliesToResource());
        rule.setAppliesToFeedback(request.getAppliesToFeedback());
        rule.setAppliesToRole(request.getAppliesToRole());
        rule.setInvokedBy(resolveAutomationRule(request.getInvokedBy()));
    }

    private void applyModerationPolicy(ModerationPolicy policy, ModerationPolicy request) {
        policy.setName(request.getName());
        policy.setMode(request.getMode());
        policy.setTrigger(request.getTrigger());
        policy.setDecision(request.getDecision());
        policy.setMonitorsResource(request.getMonitorsResource());
        policy.setMonitorsFeedback(request.getMonitorsFeedback());
        policy.setExecutedByRole(request.getExecutedByRole());
        policy.setContext(resolveContext(request.getContext()));
    }

    private void applyVerificationPolicy(VerificationPolicy policy, VerificationPolicy request) {
        policy.setName(request.getName());
        policy.setMode(request.getMode());
        policy.setAppliesWhen(request.getAppliesWhen());
        policy.setVerifiesFeedback(request.getVerifiesFeedback());
    }

    private void applyAuthorizationRule(AuthorizationRule rule, AuthorizationRule request) {
        rule.setName(request.getName());
        rule.setAllowedAction(request.getAllowedAction());
        rule.setActorRole(request.getActorRole());
        rule.setResourceTarget(request.getResourceTarget());
        rule.setFeedbackTarget(request.getFeedbackTarget());
        rule.setContext(resolveContext(request.getContext()));
    }

    private void applyAutomationRule(AutomationRule rule, AutomationRule request) {
        rule.setName(request.getName());
        rule.setTrigger(request.getTrigger());
        rule.setContextResource(request.getContextResource());
        rule.setOnFeedback(request.getOnFeedback());
        rule.setContext(resolveContext(request.getContext()));
        rule.setUsesValidation(resolveValidation(request.getUsesValidation()));

        rule.getConditions().clear();
        if (request.getConditions() != null) {
            for (AutomationCondition conditionRequest : request.getConditions()) {
                rule.addCondition(toCondition(conditionRequest));
            }
        }

        rule.getActions().clear();
        if (request.getActions() != null) {
            for (AutomationAction actionRequest : request.getActions()) {
                rule.addAction(toAction(actionRequest));
            }
        }
    }

    private AutomationCondition toCondition(AutomationCondition request) {
        AutomationCondition condition = new AutomationCondition();
        condition.setName(request.getName());
        condition.setAttributeName(request.getAttributeName());
        condition.setOperator(request.getOperator());
        if (request.getValues() != null) {
            for (ConditionValue valueRequest : request.getValues()) {
                ConditionValue conditionValue = new ConditionValue();
                conditionValue.setValue(valueRequest.getValue());
                condition.addValue(conditionValue);
            }
        }
        return condition;
    }

    private AutomationAction toAction(AutomationAction request) {
        AutomationAction action = new AutomationAction();
        action.setName(request.getName());
        action.setKind(request.getKind());
        action.setMessage(request.getMessage());
        return action;
    }

    private ContextType resolveContext(ContextType requestContext) {
        if (requestContext == null || requestContext.getId() == null) {
            return null;
        }
        return contextTypeRepository.findById(requestContext.getId())
            .orElseThrow(() -> new ResourceNotFoundException("Context '%s' was not found.".formatted(requestContext.getId())));
    }

    private ValidationRule resolveValidation(ValidationRule requestValidation) {
        if (requestValidation == null || requestValidation.getId() == null) {
            return null;
        }
        return loadValidationRule(requestValidation.getId());
    }

    private AutomationRule resolveAutomationRule(AutomationRule requestRule) {
        if (requestRule == null || requestRule.getId() == null) {
            return null;
        }
        return loadAutomationRule(requestRule.getId());
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
