package ApplicationStarter.Controllers;

//import ApplicationStarter.Model.Movie;
import ApplicationStarter.Model.Category;
import ApplicationStarter.Model.Payment;
//import ApplicationStarter.Model.Repositories.MovieRepository;
import ApplicationStarter.Model.Repositories.CategoryRepository;
import ApplicationStarter.Model.Repositories.PaymentRepository;
//import ApplicationStarter.Model.Repositories.UserRepository;
//import ApplicationStarter.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class DataQueryController {

//    @Autowired
//    private UserRepository userRepository;
//    @GetMapping("/NetflixDB")
//    public List<User> getAllUsers(){
//
//        List<User> userList =new ArrayList<User>();
//        userList = (List<User>) userRepository.findAll();
//        return userList;
//    }
//
    @Autowired
    private PaymentRepository paymentRepository;
    @GetMapping("/NetflixDB")
    public List<Payment> getAllUsers(){

        List<Payment> paymentList =new ArrayList<Payment>();
        paymentList = (List<Payment>) paymentRepository.findAll();
        return paymentList;
    }

    @Autowired
    private CategoryRepository categoryRepository;
    @GetMapping("/NetflixDB/category")
    public List<Category> getAllMovies(){

        List<Category> categoryList =new ArrayList<Category>();
        categoryList = (List<Category>) categoryRepository.findAll();
        return categoryList;
    }

    @GetMapping("/index.html")
    public String index() {
        return "index"; // this returns the template name to be rendered from resources/templates. You don't need to provide the extension.
    }
}
