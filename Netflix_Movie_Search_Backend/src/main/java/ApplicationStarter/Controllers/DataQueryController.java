package ApplicationStarter.Controllers;

import ApplicationStarter.Model.Repositories.UserRepository;
import ApplicationStarter.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/get")
public class DataQueryController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/NetflixDB")
    public List<User> getAllUsers(){

        List<User> userList =new ArrayList<User>();
        userList = (List<User>) userRepository.findAll();
        return userList;
    }
}
