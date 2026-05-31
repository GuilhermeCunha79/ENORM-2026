package pt.isep.enorm.ref.youtube.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.youtube.domain.generated.GeneratedLike;

@Entity(name = "Like")
@Table(name = "likes")
public class Like extends GeneratedLike {
}

