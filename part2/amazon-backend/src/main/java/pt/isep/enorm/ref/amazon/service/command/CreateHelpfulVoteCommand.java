package pt.isep.enorm.ref.amazon.service.command;

import java.util.Objects;

import pt.isep.enorm.ref.amazon.domain.enums.VoteValue;

public record CreateHelpfulVoteCommand(Long commentId, VoteValue value) {

    public CreateHelpfulVoteCommand {
        commentId = Objects.requireNonNull(commentId, "commentId is required");
        value = Objects.requireNonNull(value, "value is required");
    }
}
