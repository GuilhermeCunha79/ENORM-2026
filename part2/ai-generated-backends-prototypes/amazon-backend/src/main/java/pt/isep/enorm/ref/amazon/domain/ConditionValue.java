package pt.isep.enorm.ref.amazon.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.amazon.domain.generated.GeneratedConditionValue;

@Entity(name = "ConditionValue")
@Table(name = "condition_values")
public class ConditionValue extends GeneratedConditionValue {
}
