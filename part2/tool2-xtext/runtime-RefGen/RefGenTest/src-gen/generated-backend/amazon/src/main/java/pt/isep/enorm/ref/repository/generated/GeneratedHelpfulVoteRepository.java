package pt.isep.enorm.ref.repository.generated;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.isep.enorm.ref.domain.HelpfulVote;

public interface GeneratedHelpfulVoteRepository extends JpaRepository<HelpfulVote, Long> {
boolean existsByAuthor_IdAndParentFeedback_Id(Long authorId, Long parentFeedbackId);
}
