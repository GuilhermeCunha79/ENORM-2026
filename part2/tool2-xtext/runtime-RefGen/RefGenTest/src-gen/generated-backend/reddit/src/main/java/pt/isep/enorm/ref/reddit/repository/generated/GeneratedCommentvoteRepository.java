package pt.isep.enorm.ref.reddit.repository.generated;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.isep.enorm.ref.reddit.domain.CommentVote;

public interface GeneratedCommentVoteRepository extends JpaRepository<CommentVote, Long> {
boolean existsByAuthor_IdAndSubject_Id(Long authorId, Long subjectId);
}
