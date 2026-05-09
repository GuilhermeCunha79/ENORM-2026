package pt.isep.enorm.ref.amazon.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.amazon.domain.generated.GeneratedHelpfulVote;

@Entity(name = "HelpfulVote")
@Table(name = "helpful_votes")
public class HelpfulVote extends GeneratedHelpfulVote {
}
