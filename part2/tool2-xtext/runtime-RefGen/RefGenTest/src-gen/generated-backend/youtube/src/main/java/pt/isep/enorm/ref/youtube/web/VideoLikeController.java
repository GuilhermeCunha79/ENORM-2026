package pt.isep.enorm.ref.youtube.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.youtube.service.VideoLikeService;
import pt.isep.enorm.ref.youtube.web.generated.GeneratedVideoLikeController;

@RestController
@RequestMapping("/api/video-likes")
public class VideoLikeController extends GeneratedVideoLikeController {
    public VideoLikeController(VideoLikeService service) {
        super(service);
    }
}
