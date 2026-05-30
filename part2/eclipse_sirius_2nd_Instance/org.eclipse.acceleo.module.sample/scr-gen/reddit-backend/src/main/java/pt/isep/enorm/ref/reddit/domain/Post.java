package pt.isep.enorm.ref.reddit.domain;

import pt.isep.enorm.ref.reddit.domain.generated.GeneratedPost;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "post")
public class Post extends GeneratedPost {
}
