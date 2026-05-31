package pt.isep.enorm.ref.amazon.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.amazon.domain.generated.GeneratedModerationPolicy;

@Entity(name = "ModerationPolicy")
@Table(name = "moderation_policies")
public class ModerationPolicy extends GeneratedModerationPolicy {
}
