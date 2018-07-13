package com.higgsup.intern.spring.demoJava;

import com.higgsup.intern.spring.pojo.Account;
import com.higgsup.intern.spring.pojo.Address;
import com.higgsup.intern.spring.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class AppConfig {
@Autowired
private Account account;
@Autowired
private Address address;
@Bean
    public Person person(){
    return new Person(account,address);
}
@Bean
    public Account account(){
        return new Account();
}
@Bean
public Address address(){
        return new Address();
    }
}
