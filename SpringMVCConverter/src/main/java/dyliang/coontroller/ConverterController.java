package dyliang.coontroller;

import dyliang.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConverterController {

    @RequestMapping("testConv")
    private String testConv(Account account){
        System.out.println(account);
        return "success";
    }
}
