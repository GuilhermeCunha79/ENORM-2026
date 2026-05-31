package pt.isep.enorm.ref.web.generated;

import pt.isep.enorm.ref.domain.Like;
import pt.isep.enorm.ref.service.generated.GeneratedLikeService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/likes")
public class GeneratedLikeController {
    private final GeneratedLikeService service;

    public GeneratedLikeController(GeneratedLikeService service) { this.service = service; }

    @GetMapping public List<Like> list(@RequestParam(required = false) String videoId, @RequestParam(required = false) String commentId) { return service.list(); }
    @PostMapping @ResponseStatus(HttpStatus.CREATED) public Like create(@RequestParam(required = false) String videoId, @RequestParam(required = false) String commentId, @RequestBody Like payload) { return service.create(payload); }
    @DeleteMapping("/{likeId}") @ResponseStatus(HttpStatus.NO_CONTENT) public void delete(@PathVariable String likeId) { service.delete(likeId); }
}
