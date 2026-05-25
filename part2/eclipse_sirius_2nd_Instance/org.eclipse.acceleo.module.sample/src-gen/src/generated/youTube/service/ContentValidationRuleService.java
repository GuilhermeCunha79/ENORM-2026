package generated.youTube.service;

import generated.youTube.dto.ContentValidationRuleDto;
import generated.youTube.repository.ContentValidationRuleRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ContentValidationRuleService {
    private final ContentValidationRuleRepository repository;

    public ContentValidationRuleService(ContentValidationRuleRepository repository) {
        this.repository = repository;
    }

    public List<ContentValidationRuleDto> list() {
        return repository.findAll();
    }

    public ContentValidationRuleDto get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ContentValidationRule not found"));
    }

    public ContentValidationRuleDto create(ContentValidationRuleDto dto) {
        return repository.save(dto);
    }

    public ContentValidationRuleDto update(String id, ContentValidationRuleDto dto) {
        get(id);
        return repository.save(new ContentValidationRuleDto(id , dto.target() , dto.policyType() , dto.severity()));
    }

    public void delete(String id) {
        get(id);
        repository.delete(id);
    }
}
