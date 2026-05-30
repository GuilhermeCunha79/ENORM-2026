package pt.isep.enorm.ref.youtube.governance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.isep.enorm.ref.youtube.governance.domain.AuthorizationRule;

public interface AuthorizationRuleRepository extends JpaRepository<AuthorizationRule, Long> {
}
