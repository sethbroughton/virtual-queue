package com.fullcity.virtualqueue.data;

import com.fullcity.virtualqueue.model.Account;
import org.springframework.stereotype.Component;

@Component
public class JdbcAccountDao implements AccountDAO{
    @Override
    public Account createAccount(Account account) {
        return null;
    }

    @Override
    public Account updateAccount(Account account) {
        return null;
    }

    @Override
    public Account readAccount(long accountId) {
        return null;
    }

    @Override
    public void deleteAccount(Account account) {

    }
}
