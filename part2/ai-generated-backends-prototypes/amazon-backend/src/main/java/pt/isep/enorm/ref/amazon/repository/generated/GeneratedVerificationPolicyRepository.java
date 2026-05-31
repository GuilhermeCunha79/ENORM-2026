package pt.isep.enorm.ref.amazon.repository.generated;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import pt.isep.enorm.ref.amazon.domain.VerificationPolicy;

@NoRepositoryBean
public interface GeneratedVerificationPolicyRepository extends JpaRepository<VerificationPolicy, Long> {
}
