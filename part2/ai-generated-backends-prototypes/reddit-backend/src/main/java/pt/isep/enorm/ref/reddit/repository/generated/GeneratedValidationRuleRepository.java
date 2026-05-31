package pt.isep.enorm.ref.reddit.repository.generated;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import pt.isep.enorm.ref.reddit.domain.ValidationRule;

@NoRepositoryBean
public interface GeneratedValidationRuleRepository extends JpaRepository<ValidationRule, Long> {

    List<ValidationRule> findByPostId(Long postId);

    List<ValidationRule> findByCommentId(Long commentId);
}



