package com.stackroute;

import com.stackroute.domain.AppConfig;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
 public static void main(String[] args) {
  AnnotationConfigApplicationContext annotationConfigApplicationContext =  new AnnotationConfigApplicationContext(AppConfig.class);
  Movie movie = annotationConfigApplicationContext.getBean("movie1",Movie.class);
 movie.displayActor();
 }

}
