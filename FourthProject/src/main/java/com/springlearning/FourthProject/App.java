package com.springlearning.FourthProject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.configuration.AppConfig;
import com.spring.model.Vehicle;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);
        Vehicle veh = con.getBean(Vehicle.class);
        System.out.println(veh.getName());
    }
}
