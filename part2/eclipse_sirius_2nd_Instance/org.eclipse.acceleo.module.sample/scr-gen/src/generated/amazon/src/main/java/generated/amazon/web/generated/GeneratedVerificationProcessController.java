package generated.amazon.web.generated;

import generated.amazon.domain.VerificationProcess;
import generated.amazon.service.generated.GeneratedVerificationProcessService;
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
@RequestMapping("/api/verificationProcesss")
public class GeneratedVerificationProcessController {
    protected final GeneratedVerificationProcessService service;

    public GeneratedVerificationProcessController(GeneratedVerificationProcessService service) {
        this.service = service;
    }

    @GetMapping
    public List<VerificationProcess> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public VerificationProcess get(@PathVariable String id) {
        return service.get(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public VerificationProcess create(@RequestBody VerificationProcess entity) {
        return service.create(entity);
    }

    @PutMapping("/{id}")
    public VerificationProcess update(@PathVariable String id, @RequestBody VerificationProcess entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
