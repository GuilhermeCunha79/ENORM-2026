package pt.isep.enorm.ref.amazon.repository.generated;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import pt.isep.enorm.ref.amazon.domain.Product;

@NoRepositoryBean
public interface GeneratedProductRepository extends JpaRepository<Product, Long> {

    List<Product> findAllByOrderByNameAsc();
}