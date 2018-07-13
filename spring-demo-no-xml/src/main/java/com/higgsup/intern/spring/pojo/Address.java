package com.higgsup.intern.spring.pojo;

import org.springframework.beans.factory.annotation.Value;

public class Address {

    @Value("Bình Định")
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return address ;
    }
}
