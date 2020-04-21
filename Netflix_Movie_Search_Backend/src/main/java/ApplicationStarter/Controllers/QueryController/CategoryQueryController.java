package ApplicationStarter.Controllers.QueryController;

import ApplicationStarter.Model.Category;
import ApplicationStarter.Model.Repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("querycategory")
public class CategoryQueryController {
    @Autowired
    private CategoryRepository categoryRepository;
    @GetMapping("/category")
    public List<Category> getAllCategories(){
        List<Category> categoryList;
        categoryList=  (List<Category>) categoryRepository.findAll();
        return categoryList;
    }
}
