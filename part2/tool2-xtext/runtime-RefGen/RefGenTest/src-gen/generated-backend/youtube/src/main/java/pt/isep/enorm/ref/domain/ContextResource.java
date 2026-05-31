package pt.isep.enorm.ref.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.domain.generated.GeneratedContextResource;

/** Manual extension point — add bespoke behaviour here. */
@Entity
@Table(name = "context_resources")
public class ContextResource extends GeneratedContextResource {
}
