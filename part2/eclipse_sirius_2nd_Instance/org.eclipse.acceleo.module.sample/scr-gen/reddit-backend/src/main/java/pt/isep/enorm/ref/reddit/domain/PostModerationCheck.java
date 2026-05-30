package pt.isep.enorm.ref.reddit.domain;

import pt.isep.enorm.ref.reddit.domain.generated.GeneratedPostModerationCheck;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "postModerationCheck")
public class PostModerationCheck extends GeneratedPostModerationCheck {
}
