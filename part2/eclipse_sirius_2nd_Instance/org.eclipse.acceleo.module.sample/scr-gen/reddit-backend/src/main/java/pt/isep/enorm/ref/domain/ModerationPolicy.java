package pt.isep.enorm.ref.domain;

import pt.isep.enorm.ref.domain.generated.GeneratedModerationPolicy;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "moderationPolicy")
public class ModerationPolicy extends GeneratedModerationPolicy {
}
