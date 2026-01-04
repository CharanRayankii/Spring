package com.Rc.example3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Rc.example3.beans.Vehicle;
import com.Rc.example3.configuration.ProjectConfig;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh1 = context.getBean("Audi",Vehicle.class);
        System.out.println(veh1.getName());
        
        Vehicle veh2 = context.getBean("VolksWagon",Vehicle.class);
        System.out.println(veh2.getName());
        
        Vehicle veh3 = context.getBean("Benz",Vehicle.class);
        System.out.println(veh3.getName());
    }
}
