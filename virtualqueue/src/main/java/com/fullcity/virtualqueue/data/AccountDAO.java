package com.fullcity.virtualqueue.data;

import com.fullcity.virtualqueue.model.Account;

public interface AccountDAO {

    public Account createAccount(Account account);
    public Account updateAccount(Account account);
    public Account readAccount(long accountId);
    public void deleteAccount(Account account);

}
