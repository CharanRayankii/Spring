package com.Rc.example3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Rc.example3.beans.Vehicle;
import com.Rc.example3.configuration.ProjectConfig;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println(veh.getName());
    }
}
