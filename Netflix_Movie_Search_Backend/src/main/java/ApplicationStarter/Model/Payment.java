package ApplicationStarter.Model;

import javax.persistence.*;

@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="payment_plan",nullable = false)
    String payment_plan;
    @Column(name="payment_amount",nullable = false)
    int payment_amount;
    @Column(name="late_charge",nullable = false)
    int late_charge;

    public Payment() {
    }

    public Payment(String payment_plan, int payment_amount, int late_charge) {
        this.payment_plan = payment_plan;
        this.payment_amount = payment_amount;
        this.late_charge = late_charge;
    }

    public String getPayment_plan() {
        return payment_plan;
    }

    public void setPayment_plan(String payment_plan) {
        this.payment_plan = payment_plan;
    }

    public int getPayment_amount() {
        return payment_amount;
    }

    public void setPayment_amount(int payment_amount) {
        this.payment_amount = payment_amount;
    }

    public int getLate_charge() {
        return late_charge;
    }

    public void setLate_charge(int late_charge) {
        this.late_charge = late_charge;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "payment_plan=" + payment_plan +
                ", payment_amount=" + payment_amount +
                ", late_charge=" + late_charge +
                '}';
    }
}
