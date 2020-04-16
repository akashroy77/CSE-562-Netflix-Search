package ApplicationStarter.Model;

import javax.persistence.*;

@Entity
@Table(name="cast")
public class Cast {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="castID",nullable = false)
    long id;
    @Column(name="castName",nullable = false)
    String castName;
    @Column(name="movieID",nullable = false)
    long movieID;
    @Column(name="country",nullable = false)
    String country;
    @Column(name="castDob",nullable = false)
    String castDob;
    @Column(name="address",nullable = false)
    String address;

    public Cast(long id, String castName, long movieID, String country, String castDob, String address) {
        this.id = id;
        this.castName = castName;
        this.movieID = movieID;
        this.country = country;
        this.castDob = castDob;
        this.address = address;
    }

    public Cast() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCastName() {
        return castName;
    }

    public void setCastName(String castName) {
        this.castName = castName;
    }

    public long getMovieID() {
        return movieID;
    }

    public void setMovieID(long movieID) {
        this.movieID = movieID;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCastDob() {
        return castDob;
    }

    public void setCastDob(String castDob) {
        this.castDob = castDob;
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
                "id=" + id +
                ", castName='" + castName + '\'' +
                ", movieID=" + movieID +
                ", country='" + country + '\'' +
                ", castDob='" + castDob + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
