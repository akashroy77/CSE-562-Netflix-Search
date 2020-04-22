package ApplicationStarter.Model;

import org.springframework.data.jpa.repository.Temporal;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="temp")
@CrossOrigin("*")
public class Temp {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="name",nullable = false)
    String name;

//    public Temp() {
//    }
//
//    public Stream(long id, long movieID, String pixelQuality, String paymentPlan, int streamRating, int totalView) {
//        this.streamid = id;
//        this.movie_id = movieID;
//        this.pixel_quality = pixelQuality;
//        this.payment_plan = paymentPlan;
//        this.stream_rating = streamRating;
//        this.total_view = totalView;
//    }
//
//    public long getId() {
//        return streamid;
//    }
//
//    public void setId(long id) {
//        this.streamid = id;
//    }
//
    @Override
    public String toString() {
        return "Stream{" +
                "id=" + name +
                '}';
    }
}
