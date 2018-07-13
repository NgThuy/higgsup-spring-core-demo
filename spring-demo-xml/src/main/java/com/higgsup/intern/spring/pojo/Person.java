package com.higgsup.intern.spring.pojo;

import org.springframework.stereotype.Component;


public class Person {
    private String name;
    private int age ;
    private String gender;
    //field injection
    private Account account;
    private Address address;

    public Person() {
    }

    public Person(Account account) {
        this.account=account;
    }

    public Person(Address address) {
        this.address = address;
    }

    public Person(Account account, Address address) {
        this.account = account;
        this.address = address;
    }

    public Person(String name, int age, String gender, Account account, Address address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.account = account;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

   public void showInfo() {
       System.out.println( "Information : \n" + " Name : " + name + "\n Age : " + age + "\n Gender : " + gender + "\n Address : " + address + "\n Account : " + account);
   }

}
