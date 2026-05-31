package pt.isep.enorm.ref.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.isep.enorm.ref.domain.VerificationPolicy;

public interface VerificationPolicyRepository extends JpaRepository<VerificationPolicy, Long> {
}
