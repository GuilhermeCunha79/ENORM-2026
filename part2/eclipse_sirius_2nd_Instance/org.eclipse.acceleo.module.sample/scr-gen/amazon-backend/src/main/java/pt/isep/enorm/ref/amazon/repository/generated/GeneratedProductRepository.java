package pt.isep.enorm.ref.amazon.repository.generated;

import pt.isep.enorm.ref.amazon.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneratedProductRepository extends JpaRepository<Product, Long> {
}
