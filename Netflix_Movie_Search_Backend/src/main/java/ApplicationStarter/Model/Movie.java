//package ApplicationStarter.Model;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "movie")
//public class Movie {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name="movieID",nullable = false)
//    int id;
//    @Column(name="title",nullable = false)
//    String title;
//    @Column(name="userID",nullable = false)
//    int userID;
//    @Column(name="leadCast")
//    String leadCast;
//    @Column(name="releaseDate",nullable = false)
//    String releaseDate;
//    @Column(name="language",nullable = false)
//    String language;
//    @Column(name="genreid",nullable = false)
//    int genreid;
//
//
//    public long getGenreid() {
//        return genreid;
//    }
//
//    public void setGenreid(int genreid) {
//        this.genreid = genreid;
//    }
//
//    public Movie(int id, String title, int userID, String leadCast, String releaseDate, String language, int genreid) {
//        this.id = id;
//        this.title = title;
//        this.userID = userID;
//        this.leadCast = leadCast;
//        this.releaseDate = releaseDate;
//        this.language = language;
//        this.genreid = genreid;
//    }
//
//    public Movie() {
//    }
//
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public int getUserID() {
//        return userID;
//    }
//
//    public void setUserID(int userID) {
//        this.userID = userID;
//    }
//
//    public String getLeadCast() {
//        return leadCast;
//    }
//
//    public void setLeadCast(String leadCast) {
//        this.leadCast = leadCast;
//    }
//
//    public String getReleaseDate() {
//        return releaseDate;
//    }
//
//    public void setReleaseDate(String releaseDate) {
//        this.releaseDate = releaseDate;
//    }
//
//    public String getLanguage() {
//        return language;
//    }
//
//    public void setLanguage(String language) {
//        this.language = language;
//    }
//
//    @Override
//    public String toString() {
//        return "Movie{" +
//                "id=" + id +
//                ", title='" + title + '\'' +
//                ", userID=" + userID +
//                ", leadCast='" + leadCast + '\'' +
//                ", releaseDate='" + releaseDate + '\'' +
//                ", language='" + language + '\'' +
//                '}';
//    }
//}
