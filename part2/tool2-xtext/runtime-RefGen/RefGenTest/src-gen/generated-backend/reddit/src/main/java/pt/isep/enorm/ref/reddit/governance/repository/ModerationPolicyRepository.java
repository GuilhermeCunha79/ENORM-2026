package pt.isep.enorm.ref.reddit.governance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.isep.enorm.ref.reddit.governance.domain.ModerationPolicy;

public interface ModerationPolicyRepository extends JpaRepository<ModerationPolicy, Long> {
}
