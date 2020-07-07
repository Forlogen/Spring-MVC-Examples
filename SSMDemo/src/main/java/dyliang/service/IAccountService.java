package dyliang.service;

import dyliang.domain.Account;

import java.util.List;

public interface IAccountService {

    public List<Account> findAll();

    public void saveAccount(Account account);
}