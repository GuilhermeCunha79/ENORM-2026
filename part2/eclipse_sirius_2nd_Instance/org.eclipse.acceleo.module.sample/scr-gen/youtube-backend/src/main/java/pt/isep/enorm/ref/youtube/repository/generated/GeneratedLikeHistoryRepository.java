package pt.isep.enorm.ref.youtube.repository.generated;

import pt.isep.enorm.ref.youtube.domain.LikeHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneratedLikeHistoryRepository extends JpaRepository<LikeHistory, Long> {
}
