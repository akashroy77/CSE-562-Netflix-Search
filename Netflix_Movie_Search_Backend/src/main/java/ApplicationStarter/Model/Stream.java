//package ApplicationStarter.Model;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name="stream")
//public class Stream {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name="streamID",nullable = false)
//    long id;
//    @Column(name="movieID",nullable = false)
//    long movieID;
//    @Column(name="pixelQuality",nullable = false)
//    String pixelQuality;
//    @Column(name="paymentPlan",nullable = false)
//    String paymentPlan;
//    @Column(name="streamRating")
//    int streamRating;
//    @Column(name="totalView",nullable = false)
//    int totalView=0;
//
//    public Stream() {
//    }
//
//    public Stream(long id, long movieID, String pixelQuality, String paymentPlan, int streamRating, int totalView) {
//        this.id = id;
//        this.movieID = movieID;
//        this.pixelQuality = pixelQuality;
//        this.paymentPlan = paymentPlan;
//        this.streamRating = streamRating;
//        this.totalView = totalView;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    @Override
//    public String toString() {
//        return "Stream{" +
//                "id=" + id +
//                ", movieID=" + movieID +
//                ", pixelQuality='" + pixelQuality + '\'' +
//                ", paymentPlan='" + paymentPlan + '\'' +
//                ", streamRating=" + streamRating +
//                ", totalView=" + totalView +
//                '}';
//    }
//}
