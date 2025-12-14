package com.springlearning.example1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springlearning.example1.configurations.AppConfig;
import com.springlearning.example1.models.Vehicle;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Vehicle veh = context.getBean(Vehicle.class);
        
    }
}
