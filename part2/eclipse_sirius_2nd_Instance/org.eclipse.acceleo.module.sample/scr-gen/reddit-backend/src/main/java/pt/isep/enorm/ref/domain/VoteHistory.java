package pt.isep.enorm.ref.domain;

import pt.isep.enorm.ref.domain.generated.GeneratedVoteHistory;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "voteHistory")
public class VoteHistory extends GeneratedVoteHistory {
}
