package pt.isep.enorm.ref.reddit.service.projection;

public record ModerationSimulationResult(
    String targetType,
    Long targetId,
    Long moderationCheckId,
    Long reportId,
    String signal,
    String decision,
    String status,
    String explanation
) {
}
