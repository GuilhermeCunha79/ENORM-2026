package pt.isep.enorm.ref.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.service.VideoService;
import pt.isep.enorm.ref.web.generated.GeneratedVideoController;

@RestController
@RequestMapping("/api/videos")
public class VideoController extends GeneratedVideoController {
    public VideoController(VideoService service) {
        super(service);
    }
}
