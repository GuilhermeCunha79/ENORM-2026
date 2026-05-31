package pt.isep.enorm.ref.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.isep.enorm.ref.domain.ContextType;

public interface ContextTypeRepository extends JpaRepository<ContextType, Long> {
}
