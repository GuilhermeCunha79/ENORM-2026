package generated.reddit.api;

import generated.reddit.dto.PostDto;
import generated.reddit.service.PostService;
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
@RequestMapping("/api/posts")
public class PostController {
    private final PostService service;

    public PostController(PostService service) {
        this.service = service;
    }

    @GetMapping
    public List<PostDto> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PostDto get(@PathVariable String id) {
        return service.get(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PostDto create(@RequestBody PostDto dto) {
        return service.create(dto);
    }

    @PutMapping("/{id}")
    public PostDto update(@PathVariable String id, @RequestBody PostDto dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/{id}/postCheckedByModerationCheck")
    public String postModerationChecks(@PathVariable String id) {
        service.get(id);
        return "Generated relation endpoint for postCheckedByModerationCheck";
    }

    @PostMapping("/{id}/votes")
    public String vote(@PathVariable String id) {
        service.get(id);
        return "Upvote or downvote content";
    }

    @PostMapping("/{id}/reports")
    public String report(@PathVariable String id) {
        service.get(id);
        return "Report content";
    }

    @PostMapping("/{id}/comments")
    public String commentOnPost(@PathVariable String id) {
        service.get(id);
        return "Reply to post";
    }
}
