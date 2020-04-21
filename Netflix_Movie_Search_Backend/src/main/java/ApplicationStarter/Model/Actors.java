package ApplicationStarter.Model;

import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;

@Entity
@Table(name = "actors")
@CrossOrigin("*")
public class Actors {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="actorid",nullable = false)
    long actorid;
    @Column(name="actorname",nullable = false)
    String actorname;
    @Column(name="movie_id",nullable = false)
    long movie_id;
    @Column(name="country",nullable = false)
    String country;
    @Column(name="actordob",nullable = false)
    String actordob;
    @Column(name="address",nullable = false)
    String address;

    public Actors(long id, String actorname, int movie_id, String country, String actordob, String address) {
        this.actorid = id;
        this.actorname = actorname;
        this.movie_id = movie_id;
        this.country = country;
        this.actordob = actordob;
        this.address = address;
    }

    public Actors() {
    }

    public long getActorid() {
        return actorid;
    }

    public void setActorid(long id) {
        this.actorid = id;
    }

    public String getActorname() {
        return actorname;
    }

    public void setActorname(String actorname) {
        this.actorname = actorname;
    }

    public long getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(long movie_id) {
        this.movie_id = movie_id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getActordob() {
        return actordob;
    }

    public void setActordob(String actordob) {
        this.actordob = actordob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Cast{" +
                "id=" + actorid +
                ", castName='" + actorname + '\'' +
                ", movieID=" + movie_id +
                ", country='" + country + '\'' +
                ", castDob='" + actordob + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
