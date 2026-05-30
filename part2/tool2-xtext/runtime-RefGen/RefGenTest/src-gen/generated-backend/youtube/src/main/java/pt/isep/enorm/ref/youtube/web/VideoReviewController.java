package pt.isep.enorm.ref.youtube.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.youtube.service.VideoReviewService;
import pt.isep.enorm.ref.youtube.web.generated.GeneratedVideoReviewController;

@RestController
@RequestMapping("/api/video-reviews")
public class VideoReviewController extends GeneratedVideoReviewController {
    public VideoReviewController(VideoReviewService service) {
        super(service);
    }
}
