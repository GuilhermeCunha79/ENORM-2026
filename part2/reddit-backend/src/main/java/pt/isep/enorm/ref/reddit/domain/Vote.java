package pt.isep.enorm.ref.reddit.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.reddit.domain.generated.GeneratedVote;

@Entity(name = "Vote")
@Table(name = "votes")
public class Vote extends GeneratedVote {
}



