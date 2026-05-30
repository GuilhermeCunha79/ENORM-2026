package pt.isep.enorm.ref.youtube.web.generated;

import pt.isep.enorm.ref.youtube.domain.Video;
import pt.isep.enorm.ref.youtube.service.generated.GeneratedModerationService;
import pt.isep.enorm.ref.youtube.service.generated.GeneratedVideoService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/videos")
public class GeneratedVideoController {
    private final GeneratedVideoService service;
    private final GeneratedModerationService moderationService;

    public GeneratedVideoController(GeneratedVideoService service, GeneratedModerationService moderationService) { this.service = service; this.moderationService = moderationService; }

    @GetMapping public List<Video> list(@RequestParam(required = false) String channelId) { return service.list(); }
    @GetMapping("/{videoId}") public Video get(@PathVariable String videoId) { return service.get(videoId); }
    @PostMapping @ResponseStatus(HttpStatus.CREATED) public Video create(@RequestBody Video payload) { moderationService.moderateVideo(null, payload); return service.create(payload); }
    @PutMapping("/{videoId}") public Video update(@PathVariable String videoId, @RequestBody Video payload) { moderationService.moderateVideo(videoId, payload); return service.update(videoId, payload); }
    @DeleteMapping("/{videoId}") @ResponseStatus(HttpStatus.NO_CONTENT) public void delete(@PathVariable String videoId) { service.delete(videoId); }
}
