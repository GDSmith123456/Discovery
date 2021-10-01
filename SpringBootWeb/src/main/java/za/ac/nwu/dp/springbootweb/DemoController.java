package za.ac.nwu.dp.springbootweb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping
    public String helloWorld(){
        return "Hello World from Spring Boot";
    }


}
