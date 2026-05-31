package pt.isep.enorm.ref.youtube.repository.generated;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import pt.isep.enorm.ref.youtube.domain.Report;
import pt.isep.enorm.ref.youtube.domain.enums.ReportStatus;

@NoRepositoryBean
public interface GeneratedReportRepository extends JpaRepository<Report, Long> {

    List<Report> findByStatus(ReportStatus status);
}

