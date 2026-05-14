package pt.isep.enorm.ref.reddit.repository.generated;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import pt.isep.enorm.ref.reddit.domain.SortingPolicy;

@NoRepositoryBean
public interface GeneratedSortingPolicyRepository extends JpaRepository<SortingPolicy, Long> {

    List<SortingPolicy> findBySubredditId(Long subredditId);
}



