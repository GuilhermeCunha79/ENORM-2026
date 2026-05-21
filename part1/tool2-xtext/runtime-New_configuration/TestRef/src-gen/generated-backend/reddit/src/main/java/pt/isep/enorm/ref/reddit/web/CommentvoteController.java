package pt.isep.enorm.ref.reddit.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.reddit.service.CommentvoteService;
import pt.isep.enorm.ref.reddit.web.generated.GeneratedCommentvoteController;

@RestController
@RequestMapping("/api/commentvotes")
public class CommentvoteController extends GeneratedCommentvoteController {
    public CommentvoteController(CommentvoteService service) {
        super(service);
    }
}
