package pt.isep.enorm.ref.amazon.web.generated;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import pt.isep.enorm.ref.amazon.domain.AmazonUser;
import pt.isep.enorm.ref.amazon.service.ModerationService;
// Simulation projection removed

public abstract class GeneratedModerationController {

    private final ModerationService moderationService;

    protected GeneratedModerationController(ModerationService moderationService) {
        this.moderationService = moderationService;
    }

    // Simulation endpoints removed; moderation is background-only and manual approves are available via service methods.
}
