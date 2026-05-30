package pt.isep.enorm.ref.youtube.repository.generated;

import pt.isep.enorm.ref.youtube.domain.Report;
import pt.isep.enorm.ref.youtube.domain.enums.ReportStatus;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneratedReportRepository extends JpaRepository<Report, Long> {
    List<Report> findByStatus(ReportStatus status);
    Optional<Report> findFirstByVideoIdAndStatusOrderByTimestampDesc(Long videoId, ReportStatus status);
    Optional<Report> findFirstByCommentIdAndStatusOrderByTimestampDesc(Long commentId, ReportStatus status);
}
