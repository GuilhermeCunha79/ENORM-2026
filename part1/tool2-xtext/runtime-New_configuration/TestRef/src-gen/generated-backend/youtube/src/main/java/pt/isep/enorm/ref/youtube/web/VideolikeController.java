package pt.isep.enorm.ref.youtube.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.youtube.service.VideolikeService;
import pt.isep.enorm.ref.youtube.web.generated.GeneratedVideolikeController;

@RestController
@RequestMapping("/api/videolikes")
public class VideolikeController extends GeneratedVideolikeController {
    public VideolikeController(VideolikeService service) {
        super(service);
    }
}
