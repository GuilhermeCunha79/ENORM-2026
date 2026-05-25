package generated.amazon.service;

import generated.amazon.dto.VerificationProcessDto;
import generated.amazon.repository.VerificationProcessRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class VerificationProcessService {
    private final VerificationProcessRepository repository;

    public VerificationProcessService(VerificationProcessRepository repository) {
        this.repository = repository;
    }

    public List<VerificationProcessDto> list() {
        return repository.findAll();
    }

    public VerificationProcessDto get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "VerificationProcess not found"));
    }

    public VerificationProcessDto create(VerificationProcessDto dto) {
        return repository.save(dto);
    }

    public VerificationProcessDto update(String id, VerificationProcessDto dto) {
        get(id);
        return repository.save(new VerificationProcessDto(id , dto.type() , dto.status() , dto.timestamp()));
    }

    public void delete(String id) {
        get(id);
        repository.delete(id);
    }
}
