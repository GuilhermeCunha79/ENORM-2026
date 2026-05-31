package pt.isep.enorm.ref.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.isep.enorm.ref.domain.ModerationPolicy;

public interface ModerationPolicyRepository extends JpaRepository<ModerationPolicy, Long> {
}
