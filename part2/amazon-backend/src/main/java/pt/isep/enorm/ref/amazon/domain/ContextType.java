package pt.isep.enorm.ref.amazon.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.amazon.domain.generated.GeneratedContextType;

@Entity(name = "ContextType")
@Table(name = "context_types")
public class ContextType extends GeneratedContextType {
}
