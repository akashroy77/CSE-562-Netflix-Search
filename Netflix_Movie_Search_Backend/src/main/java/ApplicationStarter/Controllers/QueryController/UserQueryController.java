package ApplicationStarter.Controllers.QueryController;

import ApplicationStarter.Model.*;
import ApplicationStarter.Model.Repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("queryuser")
public class UserQueryController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/user")
    public List<User> getAllUsers(){
        List<User> userList;
        userList = (List<User>) userRepository.findAll();
        return userList;
    }
}
