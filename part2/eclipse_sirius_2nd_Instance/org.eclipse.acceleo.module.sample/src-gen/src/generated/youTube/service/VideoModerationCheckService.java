package generated.youTube.service;

import generated.youTube.dto.VideoModerationCheckDto;
import generated.youTube.repository.VideoModerationCheckRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class VideoModerationCheckService {
    private final VideoModerationCheckRepository repository;

    public VideoModerationCheckService(VideoModerationCheckRepository repository) {
        this.repository = repository;
    }

    public List<VideoModerationCheckDto> list() {
        return repository.findAll();
    }

    public VideoModerationCheckDto get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "VideoModerationCheck not found"));
    }

    public VideoModerationCheckDto create(VideoModerationCheckDto dto) {
        return repository.save(dto);
    }

    public VideoModerationCheckDto update(String id, VideoModerationCheckDto dto) {
        get(id);
        return repository.save(new VideoModerationCheckDto(id , dto.type() , dto.result() , dto.timestamp()));
    }

    public void delete(String id) {
        get(id);
        repository.delete(id);
    }
}
