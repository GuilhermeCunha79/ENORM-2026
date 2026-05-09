package pt.isep.enorm.ref.amazon.web.dto;

import java.time.Instant;

import pt.isep.enorm.ref.amazon.domain.enums.VoteValue;

public record HelpfulVoteResponse(Long id, Long commentId, VoteValue value, String voterUsername, Instant createdAt) {
}
