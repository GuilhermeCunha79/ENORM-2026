package generated.youTube.service;

import generated.youTube.dto.ChannelDto;
import generated.youTube.repository.ChannelRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ChannelService {
    private final ChannelRepository repository;

    public ChannelService(ChannelRepository repository) {
        this.repository = repository;
    }

    public List<ChannelDto> list() {
        return repository.findAll();
    }

    public ChannelDto get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Channel not found"));
    }

    public ChannelDto create(ChannelDto dto) {
        return repository.save(dto);
    }

    public ChannelDto update(String id, ChannelDto dto) {
        get(id);
        return repository.save(new ChannelDto(id , dto.name() , dto.description() , dto.creationDate()));
    }

    public void delete(String id) {
        get(id);
        repository.delete(id);
    }
}
