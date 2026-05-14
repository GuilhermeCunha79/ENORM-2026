package pt.isep.enorm.ref.reddit.repository.generated;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import pt.isep.enorm.ref.reddit.domain.CommunityRule;

@NoRepositoryBean
public interface GeneratedCommunityRuleRepository extends JpaRepository<CommunityRule, Long> {

    List<CommunityRule> findByPostId(Long postId);
}



