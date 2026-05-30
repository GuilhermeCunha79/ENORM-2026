package pt.isep.enorm.ref.reddit.repository.generated;

import pt.isep.enorm.ref.reddit.domain.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneratedReportRepository extends JpaRepository<Report, Long> {
}
