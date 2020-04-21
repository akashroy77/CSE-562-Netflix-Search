package ApplicationStarter.Model.Repositories;

import ApplicationStarter.Model.Actors;
import ApplicationStarter.Model.Stream;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StreamRepository extends CrudRepository<Stream,Long> {
    @Query("select s.streamid, s.movie_id, s.pixel_quality, s.stream_rating from Stream s where s.pixel_quality = ?1")
    List<Stream> findAllStream(String s);
}
