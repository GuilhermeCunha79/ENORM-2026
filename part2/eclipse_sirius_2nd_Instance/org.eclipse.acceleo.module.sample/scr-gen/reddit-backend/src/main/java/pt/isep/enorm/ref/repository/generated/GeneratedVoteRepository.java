package pt.isep.enorm.ref.repository.generated;

import pt.isep.enorm.ref.domain.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneratedVoteRepository extends JpaRepository<Vote, Long> {
}
