package pt.isep.enorm.ref.reddit.domain;

import pt.isep.enorm.ref.reddit.domain.generated.GeneratedSubreddit;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "subreddit")
public class Subreddit extends GeneratedSubreddit {
}
