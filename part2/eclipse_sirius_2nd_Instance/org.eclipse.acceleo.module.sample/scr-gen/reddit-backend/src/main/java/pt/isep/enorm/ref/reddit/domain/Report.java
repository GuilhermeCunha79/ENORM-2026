package pt.isep.enorm.ref.reddit.domain;

import pt.isep.enorm.ref.reddit.domain.generated.GeneratedReport;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "report")
public class Report extends GeneratedReport {
}
