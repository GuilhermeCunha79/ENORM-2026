package pt.isep.enorm.ref.reddit.domain;

import pt.isep.enorm.ref.reddit.domain.generated.GeneratedRedditUser;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "redditUser")
public class RedditUser extends GeneratedRedditUser {
}
