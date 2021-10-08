package exception;

import controller.AccountTypeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestServiceApplication {

    public static void main(String[] args){

        SpringApplication.run(AccountTypeController.class);


    }
}
