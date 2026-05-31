package pt.isep.enorm.ref.service;

import pt.isep.enorm.ref.service.generated.GeneratedHelpfulVoteService;
import pt.isep.enorm.ref.repository.HelpfulVoteRepository;
import org.springframework.stereotype.Service;

@Service
public class HelpfulVoteService extends GeneratedHelpfulVoteService {
    public HelpfulVoteService(HelpfulVoteRepository repository) {
        super(repository);
    }
}
