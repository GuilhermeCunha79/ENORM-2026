package pt.isep.enorm.ref.repository.generated;

import pt.isep.enorm.ref.domain.VoteHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneratedVoteHistoryRepository extends JpaRepository<VoteHistory, Long> {
}
