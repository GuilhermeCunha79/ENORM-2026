package pt.isep.enorm.ref.web;

import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.dto.AutomationActionResult;
import pt.isep.enorm.ref.service.AutomationEngineService;

@RestController
@RequestMapping("/api/automation")
public class AutomationController {
    private final AutomationEngineService automationEngineService;

    public AutomationController(AutomationEngineService automationEngineService) {
        this.automationEngineService = automationEngineService;
    }

    @PostMapping("/evaluate")
    public List<AutomationActionResult> evaluate(
            @RequestParam(required = false) String trigger,
            @RequestBody(required = false) Map<String, String> content) {
        return automationEngineService.evaluate(trigger, content);
    }
}
