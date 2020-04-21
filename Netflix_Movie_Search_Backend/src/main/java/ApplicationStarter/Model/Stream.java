package ApplicationStarter.Model;

import javax.persistence.*;

@Entity
@Table(name="stream")
public class Stream {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="streamid",nullable = false)
    long streamid;
    @Column(name="movieid",nullable = false)
    long movieid;
    @Column(name="pixel_quality",nullable = false)
    String pixel_quality;
    @Column(name="payment_plan",nullable = false)
    String payment_plan;
    @Column(name="stream_rating")
    int stream_rating;
    @Column(name="total_view",nullable = false)
    int total_view=0;

    public Stream() {
    }

    public Stream(long streamid, long movieid, String pixel_quality, String payment_plan, int stream_rating, int total_view) {
        this.streamid = streamid;
        this.movieid = movieid;
        this.pixel_quality = pixel_quality;
        this.payment_plan = payment_plan;
        this.stream_rating = stream_rating;
        this.total_view = total_view;
    }


    public long getStreamid() {
        return streamid;
    }

    public void setStreamid(long streamid) {
        this.streamid = streamid;
    }

    public long getMovieid() {
        return movieid;
    }

    public void setMovieid(long movieid) {
        this.movieid = movieid;
    }

    public String getPixel_quality() {
        return pixel_quality;
    }

    public void setPixel_quality(String pixel_quality) {
        this.pixel_quality = pixel_quality;
    }

    public String getPayment_plan() {
        return payment_plan;
    }

    public void setPayment_plan(String payment_plan) {
        this.payment_plan = payment_plan;
    }

    public int getStream_rating() {
        return stream_rating;
    }

    public void setStream_rating(int stream_rating) {
        this.stream_rating = stream_rating;
    }

    public int getTotal_view() {
        return total_view;
    }

    public void setTotal_view(int total_view) {
        this.total_view = total_view;
    }

    @Override
    public String toString() {
        return "Stream{" +
                "streamid=" + streamid +
                ", movieid=" + movieid +
                ", pixel_quality='" + pixel_quality + '\'' +
                ", payment_plan='" + payment_plan + '\'' +
                ", stream_rating=" + stream_rating +
                ", total_view=" + total_view +
                '}';
    }
}
