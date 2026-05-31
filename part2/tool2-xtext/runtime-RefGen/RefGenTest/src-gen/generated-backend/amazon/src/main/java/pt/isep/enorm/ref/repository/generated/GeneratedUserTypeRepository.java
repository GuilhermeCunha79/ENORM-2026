package pt.isep.enorm.ref.repository.generated;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import pt.isep.enorm.ref.domain.UserType;

public interface GeneratedUserTypeRepository extends JpaRepository<UserType, Long> {
    Optional<UserType> findByUsername(String username);
}
