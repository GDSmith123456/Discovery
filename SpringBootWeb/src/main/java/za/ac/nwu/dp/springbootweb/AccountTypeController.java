package za.ac.nwu.dp.springbootweb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;





@RestController
public class AccountTypeController {
    Logger logger = LoggerFactory.getLogger(AccountTypeController.class);

    @GetMapping("/")
    public String helloworld(){
        return "Hello world";

    }

}

