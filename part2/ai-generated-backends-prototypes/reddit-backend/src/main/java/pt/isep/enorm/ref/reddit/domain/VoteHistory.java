package pt.isep.enorm.ref.reddit.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.reddit.domain.generated.GeneratedVoteHistory;

@Entity(name = "VoteHistory")
@Table(name = "like_history")
public class VoteHistory extends GeneratedVoteHistory {
}


