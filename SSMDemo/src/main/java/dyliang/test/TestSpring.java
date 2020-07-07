package dyliang.test;

import dyliang.domain.Account;
import dyliang.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpring {

    @Test
    public void test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        // 获取对象
        IAccountService as = (IAccountService) ac.getBean("accountService");
        // 调用方法
        List<Account> all = as.findAll();
        for (Account account : all) {
            System.out.println(account);
        }
    }
}
