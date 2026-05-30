package pt.isep.enorm.ref.amazon.service;

import pt.isep.enorm.ref.amazon.service.generated.GeneratedHelpfulVoteService;
import pt.isep.enorm.ref.amazon.repository.HelpfulVoteRepository;
import org.springframework.stereotype.Service;

@Service
public class HelpfulVoteService extends GeneratedHelpfulVoteService {
    public HelpfulVoteService(HelpfulVoteRepository repository) {
        super(repository);
    }
}
