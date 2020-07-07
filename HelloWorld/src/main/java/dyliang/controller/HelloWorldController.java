package dyliang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @RequestMapping(path = "/hello")
    public String Hello(){
        System.out.println("Hello...");
        return "success";
    }
}
