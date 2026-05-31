package pt.isep.enorm.ref.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.service.VideoReviewService;
import pt.isep.enorm.ref.web.generated.GeneratedVideoReviewController;

@RestController
@RequestMapping("/api/video-reviews")
public class VideoReviewController extends GeneratedVideoReviewController {
    public VideoReviewController(VideoReviewService service) {
        super(service);
    }
}
