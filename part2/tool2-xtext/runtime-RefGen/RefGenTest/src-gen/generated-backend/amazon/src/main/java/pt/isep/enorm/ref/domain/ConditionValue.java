package pt.isep.enorm.ref.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.domain.generated.GeneratedConditionValue;

/** Manual extension point — add bespoke behaviour here. */
@Entity
@Table(name = "condition_values")
public class ConditionValue extends GeneratedConditionValue {
}
