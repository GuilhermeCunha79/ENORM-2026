package pt.isep.enorm.ref.youtube.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.isep.enorm.ref.youtube.domain.YoutubeUser;
import pt.isep.enorm.ref.youtube.service.ModerationService;
// Simulation endpoints removed; no projection import
import pt.isep.enorm.ref.youtube.web.generated.GeneratedModerationController;

@RestController
@RequestMapping("/api")
public class ModerationController extends GeneratedModerationController {

    private final ModerationService moderationService;

    public ModerationController(ModerationService moderationService) {
        super(moderationService);
        this.moderationService = moderationService;
    }

    // Simulation endpoints removed; moderation is background-only and manual approves are available via service methods.
}

