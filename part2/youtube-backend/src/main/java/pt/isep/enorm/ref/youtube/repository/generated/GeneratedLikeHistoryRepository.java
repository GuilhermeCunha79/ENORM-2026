package pt.isep.enorm.ref.youtube.repository.generated;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import pt.isep.enorm.ref.youtube.domain.LikeHistory;

@NoRepositoryBean
public interface GeneratedLikeHistoryRepository extends JpaRepository<LikeHistory, Long> {

    List<LikeHistory> findByUserId(Long userId);
}

