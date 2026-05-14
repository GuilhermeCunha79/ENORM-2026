package pt.isep.enorm.ref.reddit.repository.generated;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import pt.isep.enorm.ref.reddit.domain.VoteHistory;

@NoRepositoryBean
public interface GeneratedVoteHistoryRepository extends JpaRepository<VoteHistory, Long> {

    List<VoteHistory> findByUserId(Long userId);
}


