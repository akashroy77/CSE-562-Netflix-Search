package ApplicationStarter.Model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="user_id",nullable = false)
    private long user_id;
    @Column(name="first_name")
    private String first_name;
    @Column(name="last_name")
    private String last_name;
    @Column(name="email_id",nullable = false)
    private String email_id;
    @Column(name="country",nullable = false)
    private String country;
    @Column(name="user_dob",nullable = false)
    private String user_dob;
    @Column(name="payment_plan",nullable = false)
    private String payment_plan;

    public User(int user_id, String first_name, String last_name, String email_id, String country, String user_dob,String payment_plan) {
        this.user_id = user_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email_id = email_id;
        this.country = country;
        this.user_dob = user_dob;
        this.payment_plan =payment_plan;
    }

    public User() {
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getfirstname() {
        return first_name;
    }

    public void setfirstname(String firstname) {
        this.first_name = firstname;
    }

    public String getlastname() {
        return last_name;
    }

    public void setlastname(String lastname) {
        this.last_name = lastname;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getuserdob() {
        return user_dob;
    }

    public void setuserdob(String userdob) {
        this.user_dob = userdob;
    }

    public String getPayment_plan() {
        return payment_plan;
    }

    public void setPayment_plan(String payment_plan) {
        this.payment_plan = payment_plan;
    }
    @Override
    public String toString() {
        return "UserTable{" +
                "userID=" + user_id +
                ", firstname='" + first_name + '\'' +
                ", lastname='" + last_name + '\'' +
                ", emailID='" + email_id + '\'' +
                ", country='" + country + '\'' +
                ", userdob='" + user_dob + '\'' +
                '}';
    }
}
