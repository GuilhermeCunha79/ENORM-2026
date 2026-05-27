package generated.youTube.repository;

import generated.youTube.domain.CommentSettingsChange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentSettingsChangeRepository extends JpaRepository<CommentSettingsChange, String> {
}
