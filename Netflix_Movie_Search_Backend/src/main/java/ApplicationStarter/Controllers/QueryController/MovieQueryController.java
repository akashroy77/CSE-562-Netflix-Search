package ApplicationStarter.Controllers.QueryController;

import ApplicationStarter.Model.Movie;
import ApplicationStarter.Model.Repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("querymovie")
public class MovieQueryController {
    @Autowired
    private MovieRepository movieRepository;
    @GetMapping("/movie")
    public List<Movie> getAllMovies(){
        List<Movie> movieList;
        movieList=  (List<Movie>) movieRepository.findAll();
        return movieList;
    }
}
