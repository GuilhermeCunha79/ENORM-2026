package generated.amazon.repository;

import generated.amazon.domain.ReviewModerationCheck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewModerationCheckRepository extends JpaRepository<ReviewModerationCheck, String> {
}
