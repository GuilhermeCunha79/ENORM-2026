package generated.reddit.repository;

import generated.reddit.domain.ParticipationPolicy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipationPolicyRepository extends JpaRepository<ParticipationPolicy, String> {
}
