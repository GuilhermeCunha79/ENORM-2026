package pt.isep.enorm.ref.repository.generated;

import pt.isep.enorm.ref.domain.ValidationRule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneratedValidationRuleRepository extends JpaRepository<ValidationRule, Long> {
}
