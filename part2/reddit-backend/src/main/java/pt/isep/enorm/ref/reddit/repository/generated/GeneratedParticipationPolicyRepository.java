package pt.isep.enorm.ref.reddit.repository.generated;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import pt.isep.enorm.ref.reddit.domain.ParticipationPolicy;

@NoRepositoryBean
public interface GeneratedParticipationPolicyRepository extends JpaRepository<ParticipationPolicy, Long> {

    List<ParticipationPolicy> findBySubredditId(Long subredditId);
}



