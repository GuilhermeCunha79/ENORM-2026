package pt.isep.enorm.ref.reddit.domain;

import pt.isep.enorm.ref.reddit.domain.generated.GeneratedParticipationPolicy;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "participationPolicy")
public class ParticipationPolicy extends GeneratedParticipationPolicy {
}
