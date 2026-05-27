package generated.youTube.repository;

import generated.youTube.domain.ContentValidationRule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentValidationRuleRepository extends JpaRepository<ContentValidationRule, String> {
}
