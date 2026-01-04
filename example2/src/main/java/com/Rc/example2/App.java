package com.Rc.example2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Rc.example2.beans.Vehicle;
import com.Rc.example2.configuration.Config;
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Vehicle veh  = context.getBean(Vehicle.class);
        System.out.println(veh.getName());
    }
}
