package pt.isep.enorm.ref.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.domain.generated.GeneratedModerationPolicy;

/** Manual extension point — add bespoke behaviour here. */
@Entity
@Table(name = "moderation_policies")
public class ModerationPolicy extends GeneratedModerationPolicy {
}
