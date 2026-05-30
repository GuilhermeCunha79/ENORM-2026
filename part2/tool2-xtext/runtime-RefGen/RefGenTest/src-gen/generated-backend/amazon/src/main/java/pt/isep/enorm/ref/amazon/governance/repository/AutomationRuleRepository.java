package pt.isep.enorm.ref.amazon.governance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.isep.enorm.ref.amazon.governance.domain.AutomationRule;

public interface AutomationRuleRepository extends JpaRepository<AutomationRule, Long> {
}
