package pt.isep.enorm.ref.amazon.service.command;

import java.util.Objects;

import pt.isep.enorm.ref.amazon.domain.enums.SortCriterion;
import pt.isep.enorm.ref.amazon.domain.enums.SortDirection;

public record SortingPolicyCommand(
    String name,
    SortCriterion criterion,
    SortDirection direction,
    String appliesToResource,
    String appliesToFeedback,
    Long contextId
) {

    public SortingPolicyCommand {
        name = Objects.requireNonNull(name, "name is required").trim();
        criterion = Objects.requireNonNull(criterion, "criterion is required");
        direction = Objects.requireNonNull(direction, "direction is required");
    }
}
