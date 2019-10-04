package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {
    @Autowired
    private Actor actor;


    public Movie(Actor actor) {
        this.actor = actor;
    }

    public Movie() {
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public void displayActor(){
        System.out.println(actor.getName());
    }

}
