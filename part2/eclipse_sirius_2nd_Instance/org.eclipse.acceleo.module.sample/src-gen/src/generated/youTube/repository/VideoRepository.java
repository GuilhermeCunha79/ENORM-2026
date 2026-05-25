package generated.youTube.repository;

import generated.youTube.dto.VideoDto;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class VideoRepository {
    private final Map<String, VideoDto> store = new LinkedHashMap<>();

    public List<VideoDto> findAll() {
        return List.copyOf(store.values());
    }

    public Optional<VideoDto> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    public VideoDto save(VideoDto dto) {
        store.put(dto.id(), dto);
        return dto;
    }

    public void delete(String id) {
        store.remove(id);
    }
}
