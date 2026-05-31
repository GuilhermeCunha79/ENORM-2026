package pt.isep.enorm.ref.domain;

import pt.isep.enorm.ref.domain.generated.GeneratedSubreddit;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "subreddit")
public class Subreddit extends GeneratedSubreddit {
}
