package ApplicationStarter.Model.Repositories;

import ApplicationStarter.Model.Category;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoryRepository extends CrudRepository<Category,Long> {

    @Query("select c.genre from Category c where c.imdb_rating = ?1")
    List<Category> findByNameEndsWith(int i);

}
