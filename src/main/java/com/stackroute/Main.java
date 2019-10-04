package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
 public static void main(String[] args) {
  AnnotationConfigApplicationContext annotationConfigApplicationContext =  new AnnotationConfigApplicationContext(AppConfig.class);
  Movie movie = annotationConfigApplicationContext.getBean("movie",Movie.class);
 // Movie movie2 = annotationConfigApplicationContext.getBean("movie2",Movie.class);
 movie.displayActor();

 }

}
