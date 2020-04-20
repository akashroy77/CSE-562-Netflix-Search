package ApplicationStarter.Model;

import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;

@Entity
@Table(name = "payment")
@CrossOrigin("*")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="paymentPlan",nullable = false)
    String paymentPlan;
    @Column(name="paymentAmount",nullable = false)
    int paymentAmount;
    @Column(name="lateCharge",nullable = false)
    int lateCharge;

    public Payment(String paymentPlan, int paymentAmount, int lateCharge) {
        this.paymentPlan = paymentPlan;
        this.paymentAmount = paymentAmount;
        this.lateCharge = lateCharge;
    }

    public Payment() {
    }

    public String getPaymentPlan() {
        return paymentPlan;
    }

    public void setPaymentPlan(String paymentPlan) {
        this.paymentPlan = paymentPlan;
    }

    public int getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(int paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public int getLateCharge() {
        return lateCharge;
    }

    public void setLateCharge(int lateCharge) {
        this.lateCharge = lateCharge;
    }
}
