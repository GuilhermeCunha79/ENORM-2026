package pt.isep.enorm.ref.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.repository.AutomationRuleRepository;
import pt.isep.enorm.ref.service.generated.GeneratedAutomationEngineService;

@Service
public class AutomationEngineService extends GeneratedAutomationEngineService {
    public AutomationEngineService(AutomationRuleRepository automationRuleRepository) {
        super(automationRuleRepository);
    }
}
