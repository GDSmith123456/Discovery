package za.ac.nwu.dp.springbootweb;

import org.apache.catalina.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.nwu.dp.springbootweb.Member;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoController {

    Logger logger = LoggerFactory.getLogger(DemoController.class);

    @RequestMapping
    public String helloWorld() {
        logger.error("Give message:");
        return "The user is : has gotten this and that";
    }

    public class memberController {
        @RequestMapping("/Member")
        public Member[] getMemberList() {
            List<Member> memberList = new ArrayList<>();
            memberList.add(new Member("Derwent", "UserID:1", "GD", "Smith", 1000));
            return memberList.toArray(memberList.toArray(new Member[0]));


        }

    }
}
