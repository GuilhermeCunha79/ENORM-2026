package pt.isep.enorm.ref.reddit.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.reddit.domain.generated.GeneratedReport;

@Entity(name = "Report")
@Table(name = "reports")
public class Report extends GeneratedReport {
}

