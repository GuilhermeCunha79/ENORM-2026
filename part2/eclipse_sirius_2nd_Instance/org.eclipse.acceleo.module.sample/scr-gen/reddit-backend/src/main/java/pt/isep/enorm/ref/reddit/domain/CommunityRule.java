package pt.isep.enorm.ref.reddit.domain;

import pt.isep.enorm.ref.reddit.domain.generated.GeneratedCommunityRule;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "communityRule")
public class CommunityRule extends GeneratedCommunityRule {
}
