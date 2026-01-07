package com.Rc.example7;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Rc.example7.beans.Vehicle;

public class App 
{
    public static void main( String[] args )
    {
       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       
       Vehicle veh = (Vehicle) context.getBean("vehicle");
       veh.rotateTyres();
    }
}
