package exception;

import exception.Persistance.AccountType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import persistence.AccountTypeRepository;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@RestController
@SpringBootApplication
public class RestServiceApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(RestServiceApplication.class, args);
    }
}
