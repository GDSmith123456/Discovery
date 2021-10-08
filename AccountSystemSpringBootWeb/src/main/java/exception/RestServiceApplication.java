package exception;

import controller.AccountTypeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.Mapping;

@SpringBootApplication
public class RestServiceApplication {

    public static void main(String[] args){
        SpringApplication.run(RestServiceApplication.class, args);

        SpringApplication.run(AccountTypeController.class, args);


    }
}
