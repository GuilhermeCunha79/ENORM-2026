package pt.isep.enorm.ref.youtube.domain;

import pt.isep.enorm.ref.youtube.domain.generated.GeneratedLikeHistory;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "likeHistory")
public class LikeHistory extends GeneratedLikeHistory {
}
