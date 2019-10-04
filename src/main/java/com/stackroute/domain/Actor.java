package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("actor")
public class Actor {

    @Value("Ranbir Kapoor")
    private String name;
    @Value("male")
    private String gender;
    @Value("30")
    private int age;
    public String getName() {
        return name;
    }


    public String getGender() {
        return gender;
    }



    public int getAge() {
        return age;
    }

}
