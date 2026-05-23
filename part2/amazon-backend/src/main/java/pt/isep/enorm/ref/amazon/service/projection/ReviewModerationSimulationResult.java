package pt.isep.enorm.ref.amazon.service.projection;

public class ReviewModerationSimulationResult {
    private final Long reviewId;
    private final String moderator;
    private final String previousStatus;
    private final String newStatus;
    private final String decision;
    private final String explanation;

    public ReviewModerationSimulationResult(
        Long reviewId,
        String moderator,
        String previousStatus,
        String newStatus,
        String decision,
        String explanation
    ) {
        this.reviewId = reviewId;
        this.moderator = moderator;
        this.previousStatus = previousStatus;
        this.newStatus = newStatus;
        this.decision = decision;
        this.explanation = explanation;
    }

    public Long getReviewId() {
        return reviewId;
    }

    public String getModerator() {
        return moderator;
    }

    public String getPreviousStatus() {
        return previousStatus;
    }

    public String getNewStatus() {
        return newStatus;
    }

    public String getDecision() {
        return decision;
    }

    public String getExplanation() {
        return explanation;
    }
}
