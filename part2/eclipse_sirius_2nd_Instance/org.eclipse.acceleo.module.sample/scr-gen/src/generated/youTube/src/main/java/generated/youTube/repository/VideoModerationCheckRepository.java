package generated.youTube.repository;

import generated.youTube.domain.VideoModerationCheck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoModerationCheckRepository extends JpaRepository<VideoModerationCheck, String> {
}
