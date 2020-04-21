package ApplicationStarter.Model;

import javax.persistence.*;

@Entity
@Table(name = "movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="movie_id",nullable = false)
    int id;
    @Column(name="title",nullable = false)
    String title;
    @Column(name="user_id",nullable = false)
    int userID;
    @Column(name="lead_cast")
    String leadCast;
    @Column(name="release_date",nullable = false)
    String releaseDate;
    @Column(name="language",nullable = false)
    String language;
    @Column(name="genre_id",nullable = false)
    int genre_id;


    public long getGenreid() {
        return genre_id;
    }

    public void setGenreid(int genre_id) {
        this.genre_id = genre_id;
    }

    public Movie(int id, String title, int user_id, String lead_cast, String release_date, String language, int genre_id) {
        this.id = id;
        this.title = title;
        this.userID = user_id;
        this.leadCast = lead_cast;
        this.releaseDate = release_date;
        this.language = language;
        this.genre_id = genre_id;
    }

    public Movie() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getLeadCast() {
        return leadCast;
    }

    public void setLeadCast(String leadCast) {
        this.leadCast = leadCast;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", userID=" + userID +
                ", leadCast='" + leadCast + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
