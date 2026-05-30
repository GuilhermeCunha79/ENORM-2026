package pt.isep.enorm.ref.reddit.governance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.isep.enorm.ref.reddit.governance.domain.SortingPolicy;

public interface SortingPolicyRepository extends JpaRepository<SortingPolicy, Long> {
}
