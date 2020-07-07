package dyliang.controller;

import dyliang.domain.Account;
import dyliang.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @RequestMapping("/findAll")
    public String testFindAll(Model model){
        System.out.println("SpringMVC findAll....");
        List<Account> list = accountService.findAll();
        model.addAttribute("list", list);

        return "success";
    }


    @RequestMapping("/save")
    public String testSaveAccount(Account account,
                                HttpServletRequest request,
                                HttpServletResponse response) throws Exception{
        System.out.println("testSaveAccount");
        accountService.saveAccount(account);
        // response.sendRedirect(request.getContextPath() + "/account/findAll");
        return "success";
    }
}
