package dyliang.coontroller;

import dyliang.domain.Account;
import dyliang.domain.Pet;
import dyliang.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;
import java.util.Set;


@Controller
@RequestMapping(path = "/param")
public class ParamsController {

    @RequestMapping(path = "/testParam")
    public String testParams(String account){
        System.out.println("testParams... -----" + account);
        return "success";
    }

    @RequestMapping(path = "/saveAccount")
    public String testSaveAccount(Account account){
        System.out.println(account);
        return "success";
    }

    @RequestMapping(path = "/saveUser")
    public String testSaveAccount(User user){
        System.out.println(user.getUsername());
        System.out.println(user.getList());
        System.out.println(user.getMap());
        return "success";
    }

    @RequestMapping(path = "/testServletAPI")
    public String testServletAPI(HttpServletRequest request,
                                 HttpServletResponse response,
                                 HttpSession session){
        System.out.println(request);
        System.out.println(response);
        System.out.println(session);
        return "success";
    }
}
