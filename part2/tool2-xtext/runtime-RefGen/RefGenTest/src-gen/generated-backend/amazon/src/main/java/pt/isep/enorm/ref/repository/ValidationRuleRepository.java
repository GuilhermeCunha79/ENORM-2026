package pt.isep.enorm.ref.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.isep.enorm.ref.domain.ValidationRule;

public interface ValidationRuleRepository extends JpaRepository<ValidationRule, Long> {
}
