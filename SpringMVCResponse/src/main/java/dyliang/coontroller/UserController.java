package dyliang.coontroller;

import dyliang.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {

//    @RequestMapping("/testString")
//    public String testString(){
//        System.out.println("testString...");
//        return "success";
//    }

    @RequestMapping("/testString")
    public String testString(Model model){
        System.out.println("testString...");
        User user = User.builder().username("Forlgoen").age(8).build();
        model.addAttribute("user", user);
        return "success";
    }

    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("Hello...");

        return;
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        ModelAndView mv = new ModelAndView();
        User user = User.builder().username("Forlgoen").age(8).build();
        mv.addObject("user", user);
        mv.setViewName("success");

        return mv;
    }

    // 使用关键字的方式进行转发或者重定向
    @RequestMapping("/testForwardOrRedirect")
    public String testForwardOrRedirect(){
        System.out.println("testForwardOrRedirect...");

        // 请求的转发
        return "forward:/WEB-INF/pages/success.jsp";

        // 重定向
        // return "redirect:/index.jsp";
    }
}
