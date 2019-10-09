package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.*;

@Configuration
public class AppConfig {
    @Bean
    public Actor actor() {

        return new Actor("Ranbir", "male", 32);
    }


    @Bean("moviex")
    public Movie movie() {
        return new Movie(actor());
    }

}