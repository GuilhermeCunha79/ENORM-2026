package pt.isep.enorm.ref.repository.generated;

import pt.isep.enorm.ref.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneratedPostRepository extends JpaRepository<Post, Long> {
}
