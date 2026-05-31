package pt.isep.enorm.ref.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.isep.enorm.ref.domain.SortingPolicy;

public interface SortingPolicyRepository extends JpaRepository<SortingPolicy, Long> {
}
