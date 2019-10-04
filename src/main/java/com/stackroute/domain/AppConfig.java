package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Scope("prototype")
    @Bean(name={"movie1","movie2"})
    public Movie getMovie()
    {
        return new Movie(setActor());
    }
    @Bean(name="actor1")
    public Actor setActor()
    {
        Actor actor = new Actor("Ranbir Kapoor","male",30);

        return actor;
    }
}
