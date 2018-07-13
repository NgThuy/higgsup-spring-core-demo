package com.higgsup.intern.spring.pojo;

import org.springframework.beans.factory.annotation.Value;

public class Account {
    @Value("BIDV bank")
    private String account;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return   account;
    }
}
