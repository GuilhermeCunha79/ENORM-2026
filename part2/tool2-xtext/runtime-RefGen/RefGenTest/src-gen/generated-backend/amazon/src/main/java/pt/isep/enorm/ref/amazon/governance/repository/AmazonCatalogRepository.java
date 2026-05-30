package pt.isep.enorm.ref.amazon.governance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.isep.enorm.ref.amazon.governance.domain.AmazonCatalog;

public interface AmazonCatalogRepository extends JpaRepository<AmazonCatalog, Long> {
}
