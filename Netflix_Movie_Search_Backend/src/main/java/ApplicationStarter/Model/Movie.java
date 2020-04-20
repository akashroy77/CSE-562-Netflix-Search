package ApplicationStarter.Model;

import javax.persistence.*;

@Entity
@Table(name = "movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="movieID",nullable = false)
    long id;
    @Column(name="title",nullable = false)
    String title;
    @Column(name="userID",nullable = false)
    long userID;
    @Column(name="leadCast")
    String leadCast;
    @Column(name="releaseDate",nullable = false)
    String releaseDate;
    @Column(name="language",nullable = false)
    String language;

    public Movie(long id, String title, long userID, String leadCast, String releaseDate, String language) {
        this.id = id;
        this.title = title;
        this.userID = userID;
        this.leadCast = leadCast;
        this.releaseDate = releaseDate;
        this.language = language;
    }

    public Movie() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
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
