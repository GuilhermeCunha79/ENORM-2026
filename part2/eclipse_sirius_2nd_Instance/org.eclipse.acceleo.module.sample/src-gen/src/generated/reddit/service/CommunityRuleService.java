package generated.reddit.service;

import generated.reddit.dto.CommunityRuleDto;
import generated.reddit.repository.CommunityRuleRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class CommunityRuleService {
    private final CommunityRuleRepository repository;

    public CommunityRuleService(CommunityRuleRepository repository) {
        this.repository = repository;
    }

    public List<CommunityRuleDto> list() {
        return repository.findAll();
    }

    public CommunityRuleDto get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CommunityRule not found"));
    }

    public CommunityRuleDto create(CommunityRuleDto dto) {
        return repository.save(dto);
    }

    public CommunityRuleDto update(String id, CommunityRuleDto dto) {
        get(id);
        return repository.save(new CommunityRuleDto(id , dto.title() , dto.description()));
    }

    public void delete(String id) {
        get(id);
        repository.delete(id);
    }
}
