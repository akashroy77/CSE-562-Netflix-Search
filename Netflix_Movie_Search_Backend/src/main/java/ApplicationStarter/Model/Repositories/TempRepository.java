package ApplicationStarter.Model.Repositories;

import ApplicationStarter.Model.Category;
import ApplicationStarter.Model.Temp;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

public interface TempRepository extends CrudRepository<Temp, Long> {

    @Modifying
    @Query(value = "insert into Temp (name) VALUES (:name)", nativeQuery = true)
    @Transactional
    void insertIntoTemp(@Param("name") String name);
}
