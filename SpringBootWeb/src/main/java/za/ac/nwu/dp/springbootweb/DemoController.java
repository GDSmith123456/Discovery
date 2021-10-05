package za.ac.nwu.dp.springbootweb;

import org.apache.catalina.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.nwu.dp.springbootweb.Member;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


@RestController
public class DemoController {
    Logger logger = LoggerFactory.getLogger(DemoController.class);

}

