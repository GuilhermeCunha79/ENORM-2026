package pt.isep.enorm.ref.amazon.domain;

import pt.isep.enorm.ref.amazon.domain.generated.GeneratedHelpfulVote;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "helpfulVote")
public class HelpfulVote extends GeneratedHelpfulVote {
}
