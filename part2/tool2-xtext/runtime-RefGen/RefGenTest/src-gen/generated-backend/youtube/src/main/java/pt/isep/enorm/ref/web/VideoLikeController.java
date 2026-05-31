package pt.isep.enorm.ref.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.service.VideoLikeService;
import pt.isep.enorm.ref.web.generated.GeneratedVideoLikeController;

@RestController
@RequestMapping("/api/video-likes")
public class VideoLikeController extends GeneratedVideoLikeController {
    public VideoLikeController(VideoLikeService service) {
        super(service);
    }
}
