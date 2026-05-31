package pt.isep.enorm.ref.repository.generated;

import pt.isep.enorm.ref.domain.UserType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneratedUserTypeRepository extends JpaRepository<UserType, Long> {
}
