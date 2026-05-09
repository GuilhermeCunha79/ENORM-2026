package pt.isep.enorm.ref.amazon.web.dto;

import pt.isep.enorm.ref.amazon.domain.enums.SortCriterion;
import pt.isep.enorm.ref.amazon.domain.enums.SortDirection;

public record SortingPolicyResponse(
    Long id,
    String name,
    SortCriterion criterion,
    SortDirection direction,
    String appliesToResource,
    String appliesToFeedback,
    Long contextId
) {
}
