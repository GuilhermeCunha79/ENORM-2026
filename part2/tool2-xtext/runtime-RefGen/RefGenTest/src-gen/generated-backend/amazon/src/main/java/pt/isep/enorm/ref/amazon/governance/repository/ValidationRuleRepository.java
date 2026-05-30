package pt.isep.enorm.ref.amazon.governance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.isep.enorm.ref.amazon.governance.domain.ValidationRule;

public interface ValidationRuleRepository extends JpaRepository<ValidationRule, Long> {
}
