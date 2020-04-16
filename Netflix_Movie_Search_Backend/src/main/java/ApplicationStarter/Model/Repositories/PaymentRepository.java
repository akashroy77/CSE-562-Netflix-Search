package ApplicationStarter.Model.Repositories;

import ApplicationStarter.Model.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment,Long> {
}
