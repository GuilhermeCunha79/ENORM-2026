package pt.isep.enorm.ref.reddit.service.projection;

public class ModerationSimulationResult {
    private final String targetType;
    private final Long targetId;
    private final Long moderationCheckId;
    private final Long reportId;
    private final String signal;
    private final String decision;
    private final String status;
    private final String explanation;

    public ModerationSimulationResult(
        String targetType,
        Long targetId,
        Long moderationCheckId,
        Long reportId,
        String signal,
        String decision,
        String status,
        String explanation
    ) {
        this.targetType = targetType;
        this.targetId = targetId;
        this.moderationCheckId = moderationCheckId;
        this.reportId = reportId;
        this.signal = signal;
        this.decision = decision;
        this.status = status;
        this.explanation = explanation;
    }

    public String getTargetType() {
        return targetType;
    }

    public Long getTargetId() {
        return targetId;
    }

    public Long getModerationCheckId() {
        return moderationCheckId;
    }

    public Long getReportId() {
        return reportId;
    }

    public String getSignal() {
        return signal;
    }

    public String getDecision() {
        return decision;
    }

    public String getStatus() {
        return status;
    }

    public String getExplanation() {
        return explanation;
    }
}
