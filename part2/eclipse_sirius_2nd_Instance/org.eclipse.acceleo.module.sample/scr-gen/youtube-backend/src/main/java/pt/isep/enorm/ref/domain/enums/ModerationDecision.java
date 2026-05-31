package pt.isep.enorm.ref.domain.enums;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum ModerationDecision {
    APPROVED, FLAGGED, HIDDEN, REMOVED, BLOCKED, REJECTED;

    @JsonCreator
    public static ModerationDecision fromJson(String value) {
        if (value == null || value.isBlank()) {
            return null;
        }
        String normalized = value.trim().toUpperCase();
        if ("PENDING".equals(normalized) || "UNDER_REVIEW".equals(normalized)) {
            return FLAGGED;
        }
        if ("ACTIVE".equals(normalized) || "REVIEWED".equals(normalized)) {
            return APPROVED;
        }
        return valueOf(normalized);
    }
}
