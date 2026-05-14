package pt.isep.enorm.ref.reddit.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.isep.enorm.ref.reddit.service.ModerationService;
import pt.isep.enorm.ref.reddit.web.generated.GeneratedModerationController;

@RestController
@RequestMapping("/api")
public class ModerationController extends GeneratedModerationController {

    public ModerationController(ModerationService moderationService) {
        super(moderationService);
    }
}

