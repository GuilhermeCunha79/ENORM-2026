package pt.isep.enorm.ref.amazon.web.dto;

import jakarta.validation.constraints.NotNull;
import pt.isep.enorm.ref.amazon.domain.enums.VoteValue;

public record CreateHelpfulVoteRequest(@NotNull VoteValue value) {
}
