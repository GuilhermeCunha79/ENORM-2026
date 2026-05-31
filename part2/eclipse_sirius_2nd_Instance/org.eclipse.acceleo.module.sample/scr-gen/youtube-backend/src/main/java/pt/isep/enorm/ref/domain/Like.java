package pt.isep.enorm.ref.domain;

import pt.isep.enorm.ref.domain.generated.GeneratedLike;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "likes_table")
public class Like extends GeneratedLike {
}
