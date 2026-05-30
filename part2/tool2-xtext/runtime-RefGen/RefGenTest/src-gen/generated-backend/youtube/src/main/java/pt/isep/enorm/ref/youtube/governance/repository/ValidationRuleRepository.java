package pt.isep.enorm.ref.youtube.governance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.isep.enorm.ref.youtube.governance.domain.ValidationRule;

public interface ValidationRuleRepository extends JpaRepository<ValidationRule, Long> {
}
