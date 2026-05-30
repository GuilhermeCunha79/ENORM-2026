package pt.isep.enorm.ref.amazon.repository.generated;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import pt.isep.enorm.ref.amazon.domain.AmazonUser;

public interface GeneratedAmazonUserRepository extends JpaRepository<AmazonUser, Long> {
    Optional<AmazonUser> findByUsername(String username);
}
