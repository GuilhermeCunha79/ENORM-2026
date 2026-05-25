package generated.youTube.service;

import generated.youTube.dto.ChannelPermissionPolicyDto;
import generated.youTube.repository.ChannelPermissionPolicyRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ChannelPermissionPolicyService {
    private final ChannelPermissionPolicyRepository repository;

    public ChannelPermissionPolicyService(ChannelPermissionPolicyRepository repository) {
        this.repository = repository;
    }

    public List<ChannelPermissionPolicyDto> list() {
        return repository.findAll();
    }

    public ChannelPermissionPolicyDto get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ChannelPermissionPolicy not found"));
    }

    public ChannelPermissionPolicyDto create(ChannelPermissionPolicyDto dto) {
        return repository.save(dto);
    }

    public ChannelPermissionPolicyDto update(String id, ChannelPermissionPolicyDto dto) {
        get(id);
        return repository.save(new ChannelPermissionPolicyDto(id , dto.action() , dto.allowedFor()));
    }

    public void delete(String id) {
        get(id);
        repository.delete(id);
    }
}
