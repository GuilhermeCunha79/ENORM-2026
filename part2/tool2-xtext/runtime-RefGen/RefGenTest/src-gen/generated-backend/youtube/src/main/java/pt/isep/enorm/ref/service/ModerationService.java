package pt.isep.enorm.ref.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.repository.ModerationPolicyRepository;
import pt.isep.enorm.ref.service.generated.GeneratedModerationService;

@Service
public class ModerationService extends GeneratedModerationService {
    public ModerationService(ModerationPolicyRepository moderationPolicyRepository) {
        super(moderationPolicyRepository);
    }
}
