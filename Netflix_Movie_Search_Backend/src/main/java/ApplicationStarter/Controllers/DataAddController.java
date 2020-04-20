package ApplicationStarter.Controllers;

import ApplicationStarter.Model.Payment;
import ApplicationStarter.Model.Repositories.PaymentRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceAssembler;

import java.net.URI;
import java.net.URISyntaxException;

@RestController

public class DataAddController {
    private  ResourceAssembler assembler;

    @PostMapping("/employees")
    ResponseEntity<?> newPaymentPlan(@RequestBody Payment newPlan) throws URISyntaxException {

        Resource<Payment> resource = assembler.toResource(PaymentRepository.save(newPaymentPlan()));

        return ResponseEntity
                .created(new URI(resource.getId().expand().getHref()))
                .body(resource);
    }
}
