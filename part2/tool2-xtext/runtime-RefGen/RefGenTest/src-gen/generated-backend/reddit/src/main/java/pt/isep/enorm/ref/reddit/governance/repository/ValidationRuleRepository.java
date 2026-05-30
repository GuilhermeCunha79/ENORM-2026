package pt.isep.enorm.ref.reddit.governance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.isep.enorm.ref.reddit.governance.domain.ValidationRule;

public interface ValidationRuleRepository extends JpaRepository<ValidationRule, Long> {
}
