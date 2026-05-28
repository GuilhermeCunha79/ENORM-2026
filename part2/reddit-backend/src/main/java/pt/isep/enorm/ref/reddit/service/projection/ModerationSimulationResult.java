package pt.isep.enorm.ref.reddit.service.projection;

public class ModerationSimulationResult {
    private final String targetType;
    private final Long targetId;
    private final Long moderationCheckId;
    private final Long reportId;
    private final String trigger;
    private final String mode;
    private final String decision;
    private final String status;
    private final java.util.List<String> matchedKeywords;
    private final String explanation;

    public ModerationSimulationResult(
        String targetType,
        Long targetId,
        Long moderationCheckId,
        Long reportId,
        String trigger,
        String mode,
        String decision,
        String status,
        java.util.List<String> matchedKeywords,
        String explanation
    ) {
        this.targetType = targetType;
        this.targetId = targetId;
        this.moderationCheckId = moderationCheckId;
        this.reportId = reportId;
        this.trigger = trigger;
        this.mode = mode;
        this.decision = decision;
        this.status = status;
        this.matchedKeywords = matchedKeywords;
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

    public String getMode() {
        return mode;
    }

    public String getTrigger() {
        return trigger;
    }

    public String getDecision() {
        return decision;
    }

    public String getStatus() {
        return status;
    }

    public java.util.List<String> getMatchedKeywords() {
        return matchedKeywords;
    }

    public String getExplanation() {
        return explanation;
    }
}
