package pt.isep.enorm.ref.reddit.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.reddit.domain.generated.GeneratedSortingPolicy;

@Entity(name = "SortingPolicy")
@Table(name = "sorting_policies")
public class SortingPolicy extends GeneratedSortingPolicy {
}

