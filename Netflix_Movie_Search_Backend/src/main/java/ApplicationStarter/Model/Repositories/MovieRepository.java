package ApplicationStarter.Model.Repositories;

import ApplicationStarter.Model.Movie;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MovieRepository extends CrudRepository<Movie,Long> {

    @Query("select m.title, m.language from Movie m where m.title LIKE ?1%")
    List<Movie> findByMovieName(String name);
}
