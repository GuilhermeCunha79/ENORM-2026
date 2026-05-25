package generated.youTube.api;

import generated.youTube.dto.VideoModerationCheckDto;
import generated.youTube.service.VideoModerationCheckService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/videoModerationChecks")
public class VideoModerationCheckController {
    private final VideoModerationCheckService service;

    public VideoModerationCheckController(VideoModerationCheckService service) {
        this.service = service;
    }

    @GetMapping
    public List<VideoModerationCheckDto> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public VideoModerationCheckDto get(@PathVariable String id) {
        return service.get(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public VideoModerationCheckDto create(@RequestBody VideoModerationCheckDto dto) {
        return service.create(dto);
    }

    @PutMapping("/{id}")
    public VideoModerationCheckDto update(@PathVariable String id, @RequestBody VideoModerationCheckDto dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
