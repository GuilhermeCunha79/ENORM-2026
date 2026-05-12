package pt.isep.enorm.ref.youtube.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.isep.enorm.ref.youtube.service.ModerationService;
import pt.isep.enorm.ref.youtube.web.generated.GeneratedModerationController;

@RestController
@RequestMapping("/api")
public class ModerationController extends GeneratedModerationController {

    public ModerationController(ModerationService moderationService) {
        super(moderationService);
    }
}

