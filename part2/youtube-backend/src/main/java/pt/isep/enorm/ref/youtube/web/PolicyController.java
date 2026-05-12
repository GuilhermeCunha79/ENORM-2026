package pt.isep.enorm.ref.youtube.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.isep.enorm.ref.youtube.service.PolicyService;
import pt.isep.enorm.ref.youtube.web.generated.GeneratedPolicyController;

@RestController
@RequestMapping("/api")
public class PolicyController extends GeneratedPolicyController {

    public PolicyController(PolicyService policyService) {
        super(policyService);
    }
}

