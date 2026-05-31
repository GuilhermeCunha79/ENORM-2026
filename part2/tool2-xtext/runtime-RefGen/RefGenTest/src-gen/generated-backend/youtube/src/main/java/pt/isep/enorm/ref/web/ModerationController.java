package pt.isep.enorm.ref.web;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.dto.ModerationSimulationResult;
import pt.isep.enorm.ref.service.ModerationService;

@RestController
@RequestMapping("/api/moderation")
public class ModerationController {
    private final ModerationService moderationService;

    public ModerationController(ModerationService moderationService) {
        this.moderationService = moderationService;
    }

    @PostMapping("/simulate")
    public List<ModerationSimulationResult> simulate(@RequestParam(required = false) String trigger) {
        return moderationService.simulate(trigger);
    }
}
