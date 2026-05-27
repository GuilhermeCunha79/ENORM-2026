package generated.youTube.api;

import generated.youTube.domain.LikeHistory;
import generated.youTube.service.LikeHistoryService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/likeHistorys")
public class LikeHistoryController {
    private final LikeHistoryService service;

    public LikeHistoryController(LikeHistoryService service) {
        this.service = service;
    }

    @GetMapping
    public List<LikeHistory> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public LikeHistory get(@PathVariable String id) {
        return service.get(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public LikeHistory create(@RequestBody LikeHistory entity) {
        return service.create(entity);
    }

    @PutMapping("/{id}")
    public LikeHistory update(@PathVariable String id, @RequestBody LikeHistory entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
