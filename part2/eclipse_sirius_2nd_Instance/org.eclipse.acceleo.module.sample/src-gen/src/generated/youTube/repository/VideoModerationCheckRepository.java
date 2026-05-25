package generated.youTube.repository;

import generated.youTube.dto.VideoModerationCheckDto;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class VideoModerationCheckRepository {
    private final Map<String, VideoModerationCheckDto> store = new LinkedHashMap<>();

    public List<VideoModerationCheckDto> findAll() {
        return List.copyOf(store.values());
    }

    public Optional<VideoModerationCheckDto> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    public VideoModerationCheckDto save(VideoModerationCheckDto dto) {
        store.put(dto.id(), dto);
        return dto;
    }

    public void delete(String id) {
        store.remove(id);
    }
}
