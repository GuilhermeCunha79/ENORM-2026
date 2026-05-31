package pt.isep.enorm.ref.repository.generated;

import pt.isep.enorm.ref.domain.Report;
import pt.isep.enorm.ref.domain.enums.ReportStatus;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneratedReportRepository extends JpaRepository<Report, Long> {
    List<Report> findByStatus(ReportStatus status);
    Optional<Report> findFirstByPostIdAndStatusOrderByTimestampDesc(Long postId, ReportStatus status);
    Optional<Report> findFirstByCommentIdAndStatusOrderByTimestampDesc(Long commentId, ReportStatus status);
}
