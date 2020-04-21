package ApplicationStarter.Model;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="genreid",nullable = false)
    long genreid;
    @Column(name="duration",nullable = false)
    int duration;
    @Column(name="genre",nullable = false)
    String genre;
    @Column(name="imdb_rating",nullable = false)
    int imdb_rating;
    @Column(name="total_revenue",nullable = false)
    int total_revenue;
    @Column(name = "movieid",nullable = false)
    long movieid;

    public Category() {
    }

    public Category(long genreid, int duration, String genre, int imdb_rating, int total_revenue, long movieid) {
        this.genreid = genreid;
        this.duration = duration;
        this.genre = genre;
        this.imdb_rating = imdb_rating;
        this.total_revenue = total_revenue;
        this.movieid = movieid;
    }


    public long getGenreid() {
        return genreid;
    }

    public void setGenreid(long genreid) {
        this.genreid = genreid;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getImdb_rating() {
        return imdb_rating;
    }

    public void setImdb_rating(int imdb_rating) {
        this.imdb_rating = imdb_rating;
    }

    public int getTotal_revenue() {
        return total_revenue;
    }

    public void setTotal_revenue(int total_revenue) {
        this.total_revenue = total_revenue;
    }

    public long getMovieid() {
        return movieid;
    }

    public void setMovieid(long movieid) {
        this.movieid = movieid;
    }

    @Override
    public String toString() {
        return "Category{" +
                "genreid=" + genreid +
                ", duration=" + duration +
                ", genre='" + genre + '\'' +
                ", imdb_rating=" + imdb_rating +
                ", total_revenue=" + total_revenue +
                ", movieid=" + movieid +
                '}';
    }
}
