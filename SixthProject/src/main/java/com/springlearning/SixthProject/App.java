package com.springlearning.SixthProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springlearning.SixthProject.models.Vehicle;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Vehicle vehicle = (Vehicle) context.getBean("veh");
        vehicle.run();
    }
}
