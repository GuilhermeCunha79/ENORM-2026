package pt.isep.enorm.ref.repository.generated;

import pt.isep.enorm.ref.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneratedCommentRepository extends JpaRepository<Comment, Long> {
}
