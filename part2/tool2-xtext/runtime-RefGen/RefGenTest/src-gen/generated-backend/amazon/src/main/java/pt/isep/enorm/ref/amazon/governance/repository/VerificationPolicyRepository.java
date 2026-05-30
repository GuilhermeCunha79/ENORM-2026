package pt.isep.enorm.ref.amazon.governance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.isep.enorm.ref.amazon.governance.domain.VerificationPolicy;

public interface VerificationPolicyRepository extends JpaRepository<VerificationPolicy, Long> {
}
