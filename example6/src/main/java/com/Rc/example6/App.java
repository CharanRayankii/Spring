package com.Rc.example6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Rc.example6.beans.Vehicle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        Vehicle veh = (Vehicle)context.getBean("vehicle");
        veh.setName("Audi - 8");
        System.out.println(veh.getName());
        
        Vehicle veh1 = (Vehicle)context.getBean("vehicle");
        System.out.println(veh.getName());
    }
}
