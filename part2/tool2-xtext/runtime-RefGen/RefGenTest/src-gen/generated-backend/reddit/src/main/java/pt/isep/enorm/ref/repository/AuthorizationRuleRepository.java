package pt.isep.enorm.ref.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.isep.enorm.ref.domain.AuthorizationRule;

public interface AuthorizationRuleRepository extends JpaRepository<AuthorizationRule, Long> {
}
