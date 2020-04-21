package ApplicationStarter.Model;

import javax.persistence.*;

@Entity
@Table(name="stream")
public class Stream {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="stream_id",nullable = false)
    long id;
    @Column(name="movie_id",nullable = false)
    long movie_id;
    @Column(name="pixel_quality",nullable = false)
    String pixel_quality;
    @Column(name="payment_plan",nullable = false)
    String payment_plan;
    @Column(name="stream_rating")
    int stream_rating;
    @Column(name="total_view",nullable = false)
    int total_view =0;

    public Stream() {
    }

    public Stream(long id, long movieID, String pixelQuality, String paymentPlan, int streamRating, int totalView) {
        this.id = id;
        this.movie_id = movieID;
        this.pixel_quality = pixelQuality;
        this.payment_plan = paymentPlan;
        this.stream_rating = streamRating;
        this.total_view = totalView;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Stream{" +
                "id=" + id +
                ", movieID=" + movie_id +
                ", pixelQuality='" + pixel_quality + '\'' +
                ", paymentPlan='" + payment_plan + '\'' +
                ", streamRating=" + stream_rating +
                ", totalView=" + total_view +
                '}';
    }
}
