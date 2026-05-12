package pt.isep.enorm.ref.youtube.repository.generated;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import pt.isep.enorm.ref.youtube.domain.ContentValidationRule;

@NoRepositoryBean
public interface GeneratedContentValidationRuleRepository extends JpaRepository<ContentValidationRule, Long> {

    List<ContentValidationRule> findByVideoId(Long videoId);

    List<ContentValidationRule> findByCommentId(Long commentId);
}

