package pt.isep.enorm.ref.youtube.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.youtube.domain.generated.GeneratedReport;

@Entity(name = "Report")
@Table(name = "reports")
public class Report extends GeneratedReport {
}

