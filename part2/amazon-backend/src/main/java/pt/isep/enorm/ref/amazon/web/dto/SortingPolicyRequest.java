package pt.isep.enorm.ref.amazon.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import pt.isep.enorm.ref.amazon.domain.enums.SortCriterion;
import pt.isep.enorm.ref.amazon.domain.enums.SortDirection;

public record SortingPolicyRequest(
    @NotBlank String name,
    @NotNull SortCriterion criterion,
    @NotNull SortDirection direction,
    String appliesToResource,
    String appliesToFeedback,
    Long contextId
) {

    public SortingPolicyRequest {
        name = name == null ? null : name.trim();
    }
}
