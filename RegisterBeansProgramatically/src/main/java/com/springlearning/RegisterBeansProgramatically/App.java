package com.springlearning.RegisterBeansProgramatically;

import java.util.Random;
import java.util.function.Supplier;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springlearning.RegisterBeansProgramatically.appconfig.AppConfig;
import com.springlearning.RegisterBeansProgramatically.models.Vehicle;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context  = new AnnotationConfigApplicationContext(AppConfig.class);
        
        
        Vehicle bz = new Vehicle();
        bz.setName("benz");
        
        Supplier<Vehicle> benzSupplier = () -> bz;
        
       
        int num = 8;
        if(num % 2 == 0) {
        	context.registerBean("benz", Vehicle.class,benzSupplier);
        }
        
       Vehicle bzVehicle = null;
       
       try {
    	   bzVehicle = context.getBean("benz",Vehicle.class);
       }catch (NoSuchBeanDefinitionException e) {
    	   System.out.println("error creatign bean ");
	}
       if(bzVehicle != null) {
    	   System.out.println("created beans programitacally");
       }
    }
}
