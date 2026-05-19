package pt.isep.enorm.ref.youtube.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.youtube.service.VideoreviewService;
import pt.isep.enorm.ref.youtube.web.generated.GeneratedVideoreviewController;

@RestController
@RequestMapping("/api/videoreviews")
public class VideoreviewController extends GeneratedVideoreviewController {
    public VideoreviewController(VideoreviewService service) {
        super(service);
    }
}
