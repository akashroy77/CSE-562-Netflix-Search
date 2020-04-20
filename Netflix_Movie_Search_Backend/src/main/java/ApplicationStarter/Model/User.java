//package ApplicationStarter.Model;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "Users")
//public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name="userID",nullable = false)
//    private long userID;
//    @Column(name="firstname")
//    private String firstname;
//    @Column(name="lastname")
//    private String lastname;
//    @Column(name="emailID",nullable = false)
//    private String emailID;
//    @Column(name="country",nullable = false)
//    private String country;
//    @Column(name="userdob",nullable = false)
//    private String userdob;
//    @Column(name="paymentPlan",nullable = false)
//    private String paymentPlan;
//
//    public User(int userID, String firstname, String lastname, String emailID, String country, String userdob,String paymentPlan) {
//        this.userID = userID;
//        this.firstname = firstname;
//        this.lastname = lastname;
//        this.emailID = emailID;
//        this.country = country;
//        this.userdob = userdob;
//        this.paymentPlan=paymentPlan;
//    }
//
//    public User() {
//    }
//
//    public long getUserID() {
//        return userID;
//    }
//
//    public void setUserID(long userID) {
//        this.userID = userID;
//    }
//
//    public String getfirstname() {
//        return firstname;
//    }
//
//    public void setfirstname(String firstname) {
//        this.firstname = firstname;
//    }
//
//    public String getlastname() {
//        return lastname;
//    }
//
//    public void setlastname(String lastname) {
//        this.lastname = lastname;
//    }
//
//    public String getEmailID() {
//        return emailID;
//    }
//
//    public void setEmailID(String emailID) {
//        this.emailID = emailID;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public void setCountry(String country) {
//        this.country = country;
//    }
//
//    public String getuserdob() {
//        return userdob;
//    }
//
//    public void setuserdob(String userdob) {
//        this.userdob = userdob;
//    }
//
//    public String getPaymentPlan() {
//        return paymentPlan;
//    }
//
//    public void setPaymentPlan(String paymentPlan) {
//        this.paymentPlan = paymentPlan;
//    }
//    @Override
//    public String toString() {
//        return "UserTable{" +
//                "userID=" + userID +
//                ", firstname='" + firstname + '\'' +
//                ", lastname='" + lastname + '\'' +
//                ", emailID='" + emailID + '\'' +
//                ", country='" + country + '\'' +
//                ", userdob='" + userdob + '\'' +
//                '}';
//    }
//}
