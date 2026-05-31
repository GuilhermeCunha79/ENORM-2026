package pt.isep.enorm.ref.config;

import pt.isep.enorm.ref.domain.AuthorizationRule;
import pt.isep.enorm.ref.domain.ModerationPolicy;
import pt.isep.enorm.ref.repository.AuthorizationRuleRepository;
import pt.isep.enorm.ref.repository.ModerationPolicyRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitialDataConfiguration {
    @Bean
    ApplicationRunner seedDslAuthorizationRules(AuthorizationRuleRepository authorizationRuleRepository) {
        return args -> seedAuthorizationRule(authorizationRuleRepository, "DefaultAuthorizationRule");
    }

    @Bean
    ApplicationRunner seedDslModerationPolicies(ModerationPolicyRepository moderationPolicyRepository) {
        return args -> seedModerationPolicy(moderationPolicyRepository, "DefaultModerationPolicy");
    }

    private void seedAuthorizationRule(AuthorizationRuleRepository authorizationRuleRepository, String name) {
        boolean exists = authorizationRuleRepository.findAll().stream()
            .anyMatch(rule -> name.equals(rule.getAttributes().get("name")));
        if (exists) {
            return;
        }
        AuthorizationRule rule = new AuthorizationRule();
        rule.setAttribute("name", name);
        authorizationRuleRepository.save(rule);
    }

    private void seedModerationPolicy(ModerationPolicyRepository moderationPolicyRepository, String name) {
        boolean exists = moderationPolicyRepository.findAll().stream()
            .anyMatch(policy -> name.equals(policy.getAttributes().get("name")));
        if (exists) {
            return;
        }
        ModerationPolicy policy = new ModerationPolicy();
        policy.setAttribute("name", name);
        moderationPolicyRepository.save(policy);
    }
}
