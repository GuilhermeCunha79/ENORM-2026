package pt.isep.enorm.ref.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.repository.HelpfulVoteRepository;
import pt.isep.enorm.ref.service.generated.GeneratedHelpfulVoteService;

@Service
public class HelpfulVoteService extends GeneratedHelpfulVoteService {
    public HelpfulVoteService(HelpfulVoteRepository repository) {
        super(repository);
    }
}
