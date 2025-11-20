package com.springlearning.ThirdProject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.appconfig.AppConfig;
import com.spring.model.Vehicle;

public class App 
{
    public static void main( String[] args )
    {
       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
       Vehicle veh = context.getBean("ferrari",Vehicle.class);
       System.out.println(veh.getName());
    }
}
