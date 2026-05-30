package pt.isep.enorm.ref.reddit.domain;

import pt.isep.enorm.ref.reddit.domain.generated.GeneratedVoteHistory;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "voteHistory")
public class VoteHistory extends GeneratedVoteHistory {
}
