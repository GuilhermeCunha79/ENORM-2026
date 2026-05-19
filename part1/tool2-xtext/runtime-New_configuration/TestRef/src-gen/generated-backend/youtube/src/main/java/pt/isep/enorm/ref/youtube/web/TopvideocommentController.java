package pt.isep.enorm.ref.youtube.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.youtube.service.TopvideocommentService;
import pt.isep.enorm.ref.youtube.web.generated.GeneratedTopvideocommentController;

@RestController
@RequestMapping("/api/topvideocomments")
public class TopvideocommentController extends GeneratedTopvideocommentController {
    public TopvideocommentController(TopvideocommentService service) {
        super(service);
    }
}
