package dyliang.controller;

import dyliang.utils.CustomException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("exception")
public class ExceptionController {


    @RequestMapping("/testException")
    public String testException() throws CustomException {
        System.out.println("testException...");
        try{
            int a = 10 / 0;
        } catch (Exception e){
            e.printStackTrace();
            throw new CustomException("查询出现了错误...");
        }
        return "success";
    }
}
