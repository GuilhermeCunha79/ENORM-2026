package pt.isep.enorm.ref.service.projection;

import java.util.List;

public record ModerationSimulationResult(
    String targetType,
    Long targetId,
    Long checkId,
    Long reportId,
    String trigger,
    String mode,
    String decision,
    String status,
    List<String> matchedRules,
    String explanation
) {
}
