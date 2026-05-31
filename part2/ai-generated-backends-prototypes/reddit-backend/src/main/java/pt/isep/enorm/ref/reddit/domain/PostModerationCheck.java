package pt.isep.enorm.ref.reddit.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.reddit.domain.generated.GeneratedPostModerationCheck;

@Entity(name = "PostModerationCheck")
@Table(name = "post_moderation_checks")
public class PostModerationCheck extends GeneratedPostModerationCheck {
}



