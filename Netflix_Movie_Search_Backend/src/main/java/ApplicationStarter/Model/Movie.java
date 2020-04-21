package ApplicationStarter.Model;

import javax.persistence.*;

@Entity
@Table(name = "movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="movieid",nullable = false)
    long movieid;
    @Column(name="language",nullable = false)
    String language;
    @Column(name="lead_cast")
    String lead_cast;
    @Column(name="title",nullable = false)
    String title;
    @Column(name="userid",nullable = false)
    long userid;
    @Column(name="release_date",nullable = false)
    String release_date;

    public Movie(long movieid, String language, String lead_cast, long userid, String title, String release_date) {
        this.movieid = movieid;
        this.language = language;
        this.lead_cast = lead_cast;
        this.userid = userid;
        this.title = title;
        this.release_date = release_date;
    }

    public Movie() {
    }


    public long getMovieid() {
        return movieid;
    }

    public void setMovieid(long movieid) {
        this.movieid = movieid;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLead_cast() {
        return lead_cast;
    }

    public void setLead_cast(String lead_cast) {
        this.lead_cast = lead_cast;
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieid=" + movieid +
                ", language='" + language + '\'' +
                ", lead_cast='" + lead_cast + '\'' +
                ", title='" + title + '\'' +
                ", userid=" + userid +
                ", release_date='" + release_date + '\'' +
                '}';
    }
}
