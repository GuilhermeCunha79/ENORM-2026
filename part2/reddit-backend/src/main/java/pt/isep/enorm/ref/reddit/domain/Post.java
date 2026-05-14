package pt.isep.enorm.ref.reddit.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.reddit.domain.generated.GeneratedPost;

@Entity(name = "Post")
@Table(name = "posts")
public class Post extends GeneratedPost {
}



