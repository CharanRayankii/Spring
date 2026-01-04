package com.Rc.example4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Rc.example4.beans.Vehicle;
import com.Rc.example4.configuration.ProjectConfig;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext contect = new AnnotationConfigApplicationContext(ProjectConfig.class);
        
        
        Vehicle veh = contect.getBean(Vehicle.class);
        veh.setName("audi");
        System.out.println(veh.getName());
    }
}
