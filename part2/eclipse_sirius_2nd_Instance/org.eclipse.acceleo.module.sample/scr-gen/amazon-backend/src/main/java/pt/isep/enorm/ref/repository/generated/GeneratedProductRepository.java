package pt.isep.enorm.ref.repository.generated;

import pt.isep.enorm.ref.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneratedProductRepository extends JpaRepository<Product, Long> {
}
