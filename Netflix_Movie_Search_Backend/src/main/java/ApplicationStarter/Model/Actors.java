package ApplicationStarter.Model;

import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;

@Entity
@Table(name = "cast")
@CrossOrigin("*")
public class Cast {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="castid",nullable = false)
    int id;
    @Column(name="castname",nullable = false)
    String cast_name;
    @Column(name="movie_id",nullable = false)
    int movie_id;
    @Column(name="country",nullable = false)
    String country;
    @Column(name="castdob",nullable = false)
    String cast_dob;
    @Column(name="address",nullable = false)
    String address;

    public Cast(int id, String cast_name, int movie_id, String country, String cast_dob, String address) {
        this.id = id;
        this.cast_name = cast_name;
        this.movie_id = movie_id;
        this.country = country;
        this.cast_dob = cast_dob;
        this.address = address;
    }

    public Cast() {
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCast_name() {
        return cast_name;
    }

    public void setCast_name(String cast_name) {
        this.cast_name = cast_name;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCast_dob() {
        return cast_dob;
    }

    public void setCast_dob(String cast_dob) {
        this.cast_dob = cast_dob;
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
                ", castName='" + cast_name + '\'' +
                ", movieID=" + movie_id +
                ", country='" + country + '\'' +
                ", castDob='" + cast_dob + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
