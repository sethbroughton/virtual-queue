package com.fullcity.virtualqueue.model;

public class Account {


    private long accountId;
    private String accountName;
    private String accountPhoneNumber;

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountPhoneNumber() {
        return accountPhoneNumber;
    }

    public void setAccountPhoneNumber(String accountPhoneNumber) {
        this.accountPhoneNumber = accountPhoneNumber;
    }

}
