package pt.isep.enorm.ref.domain;

import pt.isep.enorm.ref.domain.generated.GeneratedVote;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "vote")
public class Vote extends GeneratedVote {
}
