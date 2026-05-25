package generated.youTube.service;

import generated.youTube.dto.VideoDto;
import generated.youTube.repository.VideoRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class VideoService {
    private final VideoRepository repository;

    public VideoService(VideoRepository repository) {
        this.repository = repository;
    }

    public List<VideoDto> list() {
        return repository.findAll();
    }

    public VideoDto get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Video not found"));
    }

    public VideoDto create(VideoDto dto) {
        return repository.save(dto);
    }

    public VideoDto update(String id, VideoDto dto) {
        get(id);
        return repository.save(new VideoDto(id , dto.title() , dto.description() , dto.uploadDate() , dto.duration() , dto.commentStatus()));
    }

    public void delete(String id) {
        get(id);
        repository.delete(id);
    }
}
