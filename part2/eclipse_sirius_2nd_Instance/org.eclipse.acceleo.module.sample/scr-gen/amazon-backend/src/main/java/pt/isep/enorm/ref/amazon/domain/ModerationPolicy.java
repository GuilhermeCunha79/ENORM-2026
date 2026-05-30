package pt.isep.enorm.ref.amazon.domain;

import pt.isep.enorm.ref.amazon.domain.generated.GeneratedModerationPolicy;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "moderationPolicy")
public class ModerationPolicy extends GeneratedModerationPolicy {
}
