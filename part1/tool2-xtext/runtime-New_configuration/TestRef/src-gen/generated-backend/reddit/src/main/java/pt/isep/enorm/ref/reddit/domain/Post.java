package pt.isep.enorm.ref.reddit.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.reddit.domain.generated.GeneratedPost;

/** Manual extension point — add domain invariants or helpers here. */
@Entity
@Table(name = "posts")
public class Post extends GeneratedPost {
}
