package generated.youTube.repository;

import generated.youTube.domain.LikeHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeHistoryRepository extends JpaRepository<LikeHistory, String> {
}
