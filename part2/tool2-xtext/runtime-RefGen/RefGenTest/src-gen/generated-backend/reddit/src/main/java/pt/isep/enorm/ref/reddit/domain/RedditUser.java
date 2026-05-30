package pt.isep.enorm.ref.reddit.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.reddit.domain.generated.GeneratedRedditUser;

/** Manual extension point — edit scenario-specific user logic here. */
@Entity
@Table(name = "users")
public class RedditUser extends GeneratedRedditUser {
}
