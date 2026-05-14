package pt.isep.enorm.ref.reddit.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.reddit.domain.generated.GeneratedCommunityRule;

@Entity(name = "CommunityRule")
@Table(name = "comment_settings_changes")
public class CommunityRule extends GeneratedCommunityRule {
}


