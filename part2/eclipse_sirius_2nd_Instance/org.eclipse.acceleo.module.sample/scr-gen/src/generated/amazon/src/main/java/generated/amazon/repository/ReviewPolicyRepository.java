package generated.amazon.repository;

import generated.amazon.domain.ReviewPolicy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewPolicyRepository extends JpaRepository<ReviewPolicy, String> {
}
