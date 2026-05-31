package pt.isep.enorm.ref.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.isep.enorm.ref.domain.AutomationRule;

public interface AutomationRuleRepository extends JpaRepository<AutomationRule, Long> {
}
