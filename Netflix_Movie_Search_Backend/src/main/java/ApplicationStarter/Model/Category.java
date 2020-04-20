package ApplicationStarter.Model;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="genreID",nullable = false)
    long id;
    @Column(name="genre",nullable = false)
    String genre;
    @Column(name="duration",nullable = false)
    int duration;
    @Column(name="imdbRating",nullable = false)
    int imdbRating;
    @Column(name="totalRevenue",nullable = false)
    int totalRevenue;

    public Category() {
    }

    public Category(long id, String genre, int duration, int imdbRating, int totalRevenue) {
        this.id = id;
        this.genre = genre;
        this.duration = duration;
        this.imdbRating = imdbRating;
        this.totalRevenue = totalRevenue;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public int getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(int imdbRating) {
        this.imdbRating = imdbRating;
    }

    public int getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(int totalRevenue) {
        this.totalRevenue = totalRevenue;
    }
}
