package ApplicationStarter.Controllers.QueryController;

import ApplicationStarter.Model.Payment;
import ApplicationStarter.Model.Repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("querypayment")
public class PaymentQueryController {
    @Autowired
    private PaymentRepository paymentRepository;
    @GetMapping("/payment")
    public List<Payment> getAllPayment(){
        List<Payment> paymentList;
        paymentList=  (List<Payment>) paymentRepository.findAll();
        return paymentList;
    }
}
