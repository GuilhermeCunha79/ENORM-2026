package generated.amazon.service;

import generated.amazon.dto.ProductDto;
import generated.amazon.repository.ProductRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ProductService {
    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<ProductDto> list() {
        return repository.findAll();
    }

    public ProductDto get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found"));
    }

    public ProductDto create(ProductDto dto) {
        return repository.save(dto);
    }

    public ProductDto update(String id, ProductDto dto) {
        get(id);
        return repository.save(new ProductDto(id , dto.name() , dto.description()));
    }

    public void delete(String id) {
        get(id);
        repository.delete(id);
    }
}
