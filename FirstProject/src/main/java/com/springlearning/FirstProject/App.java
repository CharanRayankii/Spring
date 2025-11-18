package com.springlearning.FirstProject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learning.models.Vehicle;

public class App 
{
    public static void main( String[] args )
    {
     AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(AppConfig.class);
      Vehicle v1=context.getBean(Vehicle.class);
      System.out.println(v1.getName());
    }
}
