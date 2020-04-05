package ApplicationStarter.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataQueryController {
    @RequestMapping("/data")
    public String Movies() {
        return "Akash Roy";
    }
}
