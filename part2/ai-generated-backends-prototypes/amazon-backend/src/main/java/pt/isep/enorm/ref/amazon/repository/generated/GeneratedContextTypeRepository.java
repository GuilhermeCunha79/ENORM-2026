package pt.isep.enorm.ref.amazon.repository.generated;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import pt.isep.enorm.ref.amazon.domain.ContextType;

@NoRepositoryBean
public interface GeneratedContextTypeRepository extends JpaRepository<ContextType, Long> {
}
