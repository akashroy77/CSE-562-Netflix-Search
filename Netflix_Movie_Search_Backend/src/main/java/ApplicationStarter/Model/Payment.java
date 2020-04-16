package ApplicationStarter.Model;

import javax.persistence.*;

@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="paymentPlan",nullable = false)
    int paymentPlan;
    @Column(name="paymentAmount",nullable = false)
    int paymentAmount;
    @Column(name="lateCharge",nullable = false)
    int lateCharge;

    public Payment(int paymentPlan, int paymentAmount, int lateCharge) {
        this.paymentPlan = paymentPlan;
        this.paymentAmount = paymentAmount;
        this.lateCharge = lateCharge;
    }

    public Payment() {
    }

    public int getPaymentPlan() {
        return paymentPlan;
    }

    public void setPaymentPlan(int paymentPlan) {
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
