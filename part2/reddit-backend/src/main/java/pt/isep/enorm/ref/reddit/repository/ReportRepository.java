package pt.isep.enorm.ref.reddit.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import pt.isep.enorm.ref.reddit.domain.Report;
import pt.isep.enorm.ref.reddit.domain.enums.ReportStatus;
import pt.isep.enorm.ref.reddit.repository.generated.GeneratedReportRepository;

@Repository
public interface ReportRepository extends GeneratedReportRepository {

	Optional<Report> findFirstByPostIdAndStatusOrderByTimestampDesc(Long postId, ReportStatus status);

	Optional<Report> findFirstByCommentIdAndStatusOrderByTimestampDesc(Long commentId, ReportStatus status);

	List<Report> findByPostIdAndStatus(Long postId, ReportStatus status);

	List<Report> findByCommentIdAndStatus(Long commentId, ReportStatus status);
}

