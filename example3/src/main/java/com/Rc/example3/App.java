package com.Rc.example3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.Rc.example3.beans.Vehicle;
import com.Rc.example3.configuration.ProjectConfig;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        
        //@Bean(name = "Audi")
        Vehicle veh1 = context.getBean("Audi",Vehicle.class);
        System.out.println(veh1.getName());
        
        
        //	@Bean(value = "VolksWagon")
        Vehicle veh2 = context.getBean("VolksWagon",Vehicle.class);
        System.out.println(veh2.getName());
        
        /*@Primary
    	@Bean("Benz")*/
        Vehicle veh3 = context.getBean("Benz",Vehicle.class);
        System.out.println(veh3.getName());
        
        //primary annotation
        Vehicle veh4 = context.getBean(Vehicle.class);
        System.out.println(veh4.getName());
    }
}
