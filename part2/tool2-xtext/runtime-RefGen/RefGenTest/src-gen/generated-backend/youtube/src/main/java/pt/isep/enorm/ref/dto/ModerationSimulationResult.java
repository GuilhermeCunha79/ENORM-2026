package pt.isep.enorm.ref.dto;

public record ModerationSimulationResult(String policyName, String mode, String decision, boolean requiresHumanReview, String message) {
}
