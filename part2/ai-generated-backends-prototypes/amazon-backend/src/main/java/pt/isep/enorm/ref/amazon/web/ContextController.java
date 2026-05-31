package pt.isep.enorm.ref.amazon.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.isep.enorm.ref.amazon.service.ContextService;
import pt.isep.enorm.ref.amazon.web.generated.GeneratedContextController;

@RestController
@RequestMapping("/api/contexts")
public class ContextController extends GeneratedContextController {

    public ContextController(ContextService contextService) {
        super(contextService);
    }
}
