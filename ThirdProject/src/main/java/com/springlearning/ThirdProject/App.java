package com.springlearning.ThirdProject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.appconfig.AppConfig;
import com.spring.model.Vehicle;

public class App 
{
    public static void main( String[] args )
    {
       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
       // creting bean by name
       Vehicle veh = context.getBean("ferrari",Vehicle.class);
       System.out.println(veh.getName());
       
       // primary annotation without any name creates with primary as Default
       Vehicle veh1 = context.getBean(Vehicle.class);
       System.out.println(veh1.getName());
    }
}
