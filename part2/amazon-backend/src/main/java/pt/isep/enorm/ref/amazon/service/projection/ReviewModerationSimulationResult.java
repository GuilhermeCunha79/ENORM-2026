package pt.isep.enorm.ref.amazon.service.projection;

public record ReviewModerationSimulationResult(
    Long reviewId,
    String moderator,
    String previousStatus,
    String newStatus,
    String decision,
    String explanation
) {
}
