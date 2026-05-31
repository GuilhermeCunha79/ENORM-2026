package pt.isep.enorm.ref.youtube.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.youtube.domain.generated.GeneratedLikeHistory;

@Entity(name = "LikeHistory")
@Table(name = "like_history")
public class LikeHistory extends GeneratedLikeHistory {
}

