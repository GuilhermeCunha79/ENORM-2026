package pt.isep.enorm.ref.youtube.web.generated;

import pt.isep.enorm.ref.youtube.service.ModerationService;
import pt.isep.enorm.ref.youtube.service.projection.ModerationSimulationResult;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/moderation")
public class GeneratedModerationController {
    private final ModerationService service;

    public GeneratedModerationController(ModerationService service) { this.service = service; }

    @GetMapping("/videos/{videoId}/checks") public List<Map<String, Object>> videoChecks(@PathVariable String videoId) { return service.checksFor("video", videoId); }
    @PostMapping("/videos/{videoId}/checks") public Map<String, Object> createVideoCheck(@PathVariable String videoId, @RequestBody(required = false) Map<String, Object> payload) { return service.moderateVideo(videoId, payload == null ? Map.of() : payload); }
    @GetMapping("/comments/{commentId}/checks") public List<Map<String, Object>> commentChecks(@PathVariable String commentId) { return service.checksFor("comment", commentId); }
    @PostMapping("/comments/{commentId}/checks") public Map<String, Object> createCommentCheck(@PathVariable String commentId, @RequestBody(required = false) Map<String, Object> payload) { return service.moderateComment(commentId, payload == null ? Map.of() : payload); }
    @PostMapping("/videos/{videoId}/status") public Map<String, Object> changeVideoStatus(@PathVariable String videoId, @RequestParam String status) { return service.changeContentStatus("video", videoId, status); }
    @PostMapping("/comments/{commentId}/status") public Map<String, Object> changeCommentStatus(@PathVariable String commentId, @RequestParam String status) { return service.changeContentStatus("comment", commentId, status); }
    @PostMapping("/videos/{videoId}/comment-status") public Map<String, Object> changeVideoCommentStatus(@PathVariable String videoId, @RequestParam String status) { return service.changeContentStatus("video-comment-settings", videoId, status); }
    @PostMapping("/videos/{videoId}/simulate") public ModerationSimulationResult simulateVideo(@PathVariable Long videoId) { return service.simulateVideoModeration(null, videoId); }
    @PostMapping("/comments/{commentId}/simulate") public ModerationSimulationResult simulateComment(@PathVariable Long commentId) { return service.simulateCommentModeration(null, commentId); }
    @PostMapping("/reports/simulate") public List<ModerationSimulationResult> simulateReports() { return service.simulateReportModeration(null); }
}
