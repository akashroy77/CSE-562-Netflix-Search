package ApplicationStarter.Controllers;

//import ApplicationStarter.Model.Movie;
import ApplicationStarter.Model.*;
//import ApplicationStarter.Model.Repositories.MovieRepository;
import ApplicationStarter.Model.Repositories.*;
//import ApplicationStarter.Model.Repositories.UserRepository;
//import ApplicationStarter.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
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

    @Autowired
    private CastRepository castRepository;
    @GetMapping("/NetflixDB/cast")
    public List<Actors> getAllCasts(){

        List<Actors> castList;
        castList = (List<Actors>) castRepository.findAll();
        return castList;
    }

    @Autowired
    private CategoryRepository categoryRepository1;
    @RequestMapping("/NetflixDB/category/search")
    public List<Category> test2(@RequestParam("selectedNumber") int selectedNumber) {
        System.out.println(selectedNumber);
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

    @Autowired
    private CastRepository castRepository2;
    @RequestMapping("/NetflixDB/category/search/actor")
    public List<Actors> actorSearch(@RequestParam("selectedNumber") String selectedNumber) {
        System.out.println(selectedNumber);
        List<Actors> actorsList = (List<Actors>) castRepository2.findAllCast(selectedNumber);
        return actorsList;
    }

    @Autowired
    private StreamRepository streamRepository;
    @RequestMapping("/NetflixDB/category/search/stream")
    public List<Stream> streamSearch(@RequestParam("selectedNumber") String selectedNumber) {
        System.out.println(selectedNumber);
        List<Stream> streamList = (List<Stream>) streamRepository.findAllStream(selectedNumber);
        return streamList;
    }

    @Autowired
    private TempRepository tempRepository;
    @RequestMapping("/NetflixDB/add/user")
    public String addNewUser(@RequestParam("selectedNumber") String selectedNumber) {
        System.out.println(selectedNumber);
        tempRepository.insertIntoTemp(selectedNumber);
//        List<Category> categoryList = (List<Category>) categoryRepository1.findByNameEndsWith(selectedNumber);
        return "First Name is ";
    }

    @GetMapping("/index.html")
    public String index() {
        return "index"; // this returns the template name to be rendered from resources/templates. You don't need to provide the extension.
    }
}
