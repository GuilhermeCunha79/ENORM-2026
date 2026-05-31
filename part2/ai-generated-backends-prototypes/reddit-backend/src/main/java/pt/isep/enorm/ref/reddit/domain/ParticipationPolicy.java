package pt.isep.enorm.ref.reddit.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.reddit.domain.generated.GeneratedParticipationPolicy;

@Entity(name = "ParticipationPolicy")
@Table(name = "subreddit_permission_policies")
public class ParticipationPolicy extends GeneratedParticipationPolicy {
}



