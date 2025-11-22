package com.springlearning.FourthProject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.configuration.AppConfig;
import com.spring.model.Vehicle;

public class App 
{
    public static void main( String[] args )
    {
    	   var context = new AnnotationConfigApplicationContext
                   (AppConfig.class);
     Vehicle vehicle = context.getBean(Vehicle.class);
     System.out.println("Component Vehicle name from " +
             "Spring Context is: " + vehicle.getName());
     vehicle.printHello();
     context.close();
    }
}
