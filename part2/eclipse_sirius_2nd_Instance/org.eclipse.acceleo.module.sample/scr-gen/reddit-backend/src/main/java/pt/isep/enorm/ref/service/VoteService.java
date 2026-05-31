package pt.isep.enorm.ref.service;

import pt.isep.enorm.ref.service.generated.GeneratedVoteService;
import pt.isep.enorm.ref.repository.VoteRepository;
import org.springframework.stereotype.Service;

@Service
public class VoteService extends GeneratedVoteService {
    public VoteService(VoteRepository repository) {
        super(repository);
    }
}
