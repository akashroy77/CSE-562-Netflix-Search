package ApplicationStarter.Model;

import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;

@Entity
@Table(name = "category")
@CrossOrigin("*")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="genre_id",nullable = false)
    int id;
    @Column(name="genre",nullable = false)
    String genre;
    @Column(name="duration",nullable = false)
    int duration;
    @Column(name="imdb_rating",nullable = false)
    int imdb_rating;
    @Column(name="total_revenue",nullable = false)
    int total_revenue;

    public Category() {
    }

    public Category(int id, String genre, int duration, int imdb_rating, int total_revenue) {
        this.id = id;
        this.genre = genre;
        this.duration = duration;
        this.imdb_rating = imdb_rating;
        this.total_revenue = total_revenue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
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
}
