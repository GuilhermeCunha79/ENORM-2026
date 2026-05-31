package pt.isep.enorm.ref.service.generated;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import pt.isep.enorm.ref.web.error.ResourceNotFoundException;
import pt.isep.enorm.ref.domain.ValidationRule;
import pt.isep.enorm.ref.repository.ValidationRuleRepository;
import pt.isep.enorm.ref.domain.AuthorizationRule;
import pt.isep.enorm.ref.repository.AuthorizationRuleRepository;
import pt.isep.enorm.ref.domain.ModerationPolicy;
import pt.isep.enorm.ref.repository.ModerationPolicyRepository;
import pt.isep.enorm.ref.domain.VerificationPolicy;
import pt.isep.enorm.ref.repository.VerificationPolicyRepository;
import pt.isep.enorm.ref.domain.SortingPolicy;
import pt.isep.enorm.ref.repository.SortingPolicyRepository;
import pt.isep.enorm.ref.domain.AutomationRule;
import pt.isep.enorm.ref.repository.AutomationRuleRepository;

/** Centralized CRUD for all governance policies (mirrors the manual GeneratedPolicyService). */
public class GeneratedPolicyService {
@Autowired private ValidationRuleRepository validationRuleRepository;
@Autowired private AuthorizationRuleRepository authorizationRuleRepository;
@Autowired private ModerationPolicyRepository moderationPolicyRepository;
@Autowired private VerificationPolicyRepository verificationPolicyRepository;
@Autowired private SortingPolicyRepository sortingPolicyRepository;
@Autowired private AutomationRuleRepository automationRuleRepository;

public List<ValidationRule> listValidationRules() { return validationRuleRepository.findAll(); }
public ValidationRule getValidationRule(Long id) { return validationRuleRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("ValidationRule not found: " + id)); }
public ValidationRule createValidationRule(ValidationRule request) { return validationRuleRepository.save(request); }

public List<AuthorizationRule> listAuthorizationRules() { return authorizationRuleRepository.findAll(); }
public AuthorizationRule getAuthorizationRule(Long id) { return authorizationRuleRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("AuthorizationRule not found: " + id)); }
public AuthorizationRule createAuthorizationRule(AuthorizationRule request) { return authorizationRuleRepository.save(request); }

public List<ModerationPolicy> listModerationPolicies() { return moderationPolicyRepository.findAll(); }
public ModerationPolicy getModerationPolicy(Long id) { return moderationPolicyRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("ModerationPolicy not found: " + id)); }
public ModerationPolicy createModerationPolicy(ModerationPolicy request) { return moderationPolicyRepository.save(request); }

public List<VerificationPolicy> listVerificationPolicies() { return verificationPolicyRepository.findAll(); }
public VerificationPolicy getVerificationPolicy(Long id) { return verificationPolicyRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("VerificationPolicy not found: " + id)); }
public VerificationPolicy createVerificationPolicy(VerificationPolicy request) { return verificationPolicyRepository.save(request); }

public List<SortingPolicy> listSortingPolicies() { return sortingPolicyRepository.findAll(); }
public SortingPolicy getSortingPolicy(Long id) { return sortingPolicyRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("SortingPolicy not found: " + id)); }
public SortingPolicy createSortingPolicy(SortingPolicy request) { return sortingPolicyRepository.save(request); }

public List<AutomationRule> listAutomationRules() { return automationRuleRepository.findAll(); }
public AutomationRule getAutomationRule(Long id) { return automationRuleRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("AutomationRule not found: " + id)); }
public AutomationRule createAutomationRule(AutomationRule request) { return automationRuleRepository.save(request); }
}
