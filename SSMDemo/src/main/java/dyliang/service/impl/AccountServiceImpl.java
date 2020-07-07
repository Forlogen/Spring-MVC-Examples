package dyliang.service.impl;

import dyliang.dao.IAccountDao;
import dyliang.domain.Account;
import dyliang.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("service findAll...");
//        List<Account> all = accountDao.findAll();
//        for (Account account : all) {
//            System.out.println(account);
//        }
//        System.out.println("---------------");

        return accountDao.findAll();
    }


    @Override
    public void saveAccount(Account account) {
        System.out.println("service saveAccount....");
        accountDao.saveAccount(account);
    }
}
