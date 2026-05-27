package generated.reddit.repository;

import generated.reddit.domain.ContentValidationRule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentValidationRuleRepository extends JpaRepository<ContentValidationRule, String> {
}
