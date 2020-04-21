package ApplicationStarter.Controllers;

//import ApplicationStarter.Model.Movie;
import ApplicationStarter.Model.Category;
import ApplicationStarter.Model.Movie;
import ApplicationStarter.Model.Payment;
//import ApplicationStarter.Model.Repositories.MovieRepository;
import ApplicationStarter.Model.Repositories.CategoryRepository;
import ApplicationStarter.Model.Repositories.MovieRepository;
import ApplicationStarter.Model.Repositories.PaymentRepository;
//import ApplicationStarter.Model.Repositories.UserRepository;
//import ApplicationStarter.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

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

    @Autowired
    private CategoryRepository categoryRepository1;
    @RequestMapping("/NetflixDB/category/search")
    public List<Category> test2(@RequestParam("selectedNumber") int selectedNumber) {
        System.out.println(selectedNumber);
//        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        List<Category> categoryList = (List<Category>) categoryRepository1.findByNameEndsWith(selectedNumber);
        return categoryList;
    }

    @Autowired
    private MovieRepository movieRepository;
    @RequestMapping("/NetflixDB/category/search/movie")
    public List<Movie> movieNameSearch(@RequestParam("selectedNumber") String selectedNumber) {
        System.out.println(selectedNumber);
        List<Movie> movieList = (List<Movie>) movieRepository.findByMovieName(selectedNumber);
        return movieList;
    }

    @GetMapping("/index.html")
    public String index() {
        return "index"; // this returns the template name to be rendered from resources/templates. You don't need to provide the extension.
    }
}
