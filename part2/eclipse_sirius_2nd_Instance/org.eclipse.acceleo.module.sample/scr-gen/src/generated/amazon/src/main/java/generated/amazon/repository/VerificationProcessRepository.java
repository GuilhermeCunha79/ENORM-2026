package generated.amazon.repository;

import generated.amazon.domain.VerificationProcess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerificationProcessRepository extends JpaRepository<VerificationProcess, String> {
}
