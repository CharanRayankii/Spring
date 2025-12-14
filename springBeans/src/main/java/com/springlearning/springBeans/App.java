package com.springlearning.springBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springlearning.springBeans.models.Vehicle;

import io.micrometer.observation.Observation.Context;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       Vehicle veh=(Vehicle) context.getBean("alien");
       veh.run();
    }
}
