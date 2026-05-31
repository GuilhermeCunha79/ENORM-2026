package pt.isep.enorm.ref.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.domain.generated.GeneratedSortingPolicy;

/** Manual extension point — add bespoke behaviour here. */
@Entity
@Table(name = "sorting_policies")
public class SortingPolicy extends GeneratedSortingPolicy {
}
