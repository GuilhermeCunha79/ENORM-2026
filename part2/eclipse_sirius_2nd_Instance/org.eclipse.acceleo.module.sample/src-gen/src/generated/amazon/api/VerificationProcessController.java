package generated.amazon.api;

import generated.amazon.dto.VerificationProcessDto;
import generated.amazon.service.VerificationProcessService;
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
public class VerificationProcessController {
    private final VerificationProcessService service;

    public VerificationProcessController(VerificationProcessService service) {
        this.service = service;
    }

    @GetMapping
    public List<VerificationProcessDto> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public VerificationProcessDto get(@PathVariable String id) {
        return service.get(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public VerificationProcessDto create(@RequestBody VerificationProcessDto dto) {
        return service.create(dto);
    }

    @PutMapping("/{id}")
    public VerificationProcessDto update(@PathVariable String id, @RequestBody VerificationProcessDto dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
