package ApplicationStarter.Model.Repositories;

import ApplicationStarter.Model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
