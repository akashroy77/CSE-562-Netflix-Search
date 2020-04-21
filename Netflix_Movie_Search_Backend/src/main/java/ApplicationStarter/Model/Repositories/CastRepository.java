package ApplicationStarter.Model.Repositories;

import ApplicationStarter.Model.Actors;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CastRepository extends CrudRepository<Actors,Long> {

    @Query("select c.actorid, c.actorname, c.country, c.address from Actors c where c.actorname LIKE ?1%")
    List<Actors> findAllCast(String actor);

}
