package generated.reddit.repository.generated;

import generated.reddit.domain.Content;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneratedContentRepository extends JpaRepository<Content, String> {
}
