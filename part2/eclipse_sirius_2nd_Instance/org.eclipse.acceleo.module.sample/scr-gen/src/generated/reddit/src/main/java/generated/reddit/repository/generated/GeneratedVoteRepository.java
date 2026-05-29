package generated.reddit.repository.generated;

import generated.reddit.domain.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneratedVoteRepository extends JpaRepository<Vote, String> {
}
