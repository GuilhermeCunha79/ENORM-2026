package generated.amazon.repository;

import generated.amazon.domain.HelpfulVote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelpfulVoteRepository extends JpaRepository<HelpfulVote, String> {
}
