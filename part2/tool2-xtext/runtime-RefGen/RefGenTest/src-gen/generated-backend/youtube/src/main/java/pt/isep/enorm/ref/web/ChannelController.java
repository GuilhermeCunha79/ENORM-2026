package pt.isep.enorm.ref.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.service.ChannelService;
import pt.isep.enorm.ref.web.generated.GeneratedChannelController;

@RestController
@RequestMapping("/api/channels")
public class ChannelController extends GeneratedChannelController {
    public ChannelController(ChannelService service) {
        super(service);
    }
}
