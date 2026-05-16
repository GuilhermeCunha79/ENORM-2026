package pt.isep.enorm.ref.amazon.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.isep.enorm.ref.amazon.service.ModerationService;
import pt.isep.enorm.ref.amazon.web.generated.GeneratedModerationController;

@RestController
@RequestMapping("/api/moderation")
public class ModerationController extends GeneratedModerationController {

    public ModerationController(ModerationService moderationService) {
        super(moderationService);
    }
}
