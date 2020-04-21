package ApplicationStarter.Controllers.QueryController;

import ApplicationStarter.Model.Repositories.StreamRepository;
import ApplicationStarter.Model.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("querystream")
public class StreamQueryController {
    @Autowired
    private StreamRepository streamRepository;
    @GetMapping("/stream")
    public List<Stream> getAllStream(){
        List<Stream> streamList;
        streamList=  (List<Stream>) streamRepository.findAll();
        return streamList;
    }
}
