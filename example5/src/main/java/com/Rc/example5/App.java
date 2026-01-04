package com.Rc.example5;

import java.util.Random;
import java.util.function.Supplier;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Rc.example5.beans.Vehicle;
import com.Rc.example5.beans.configuration.ProjectConfig;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        
        Vehicle volks = new Vehicle();
        volks.setName("volksWagon");
        
        Supplier<Vehicle> volkswagonSupplier = ()->volks;
        
        Supplier<Vehicle> audiSupplier = () -> {
        		Vehicle audi = new Vehicle();
        		audi.setName("Audi");
        		return audi;
        };
        
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println("random Number is "+ randomNumber);
        
        if(randomNumber % 2 == 0 ) {
        	context.registerBean("volks", Vehicle.class,volkswagonSupplier);
        }else {
        	context.registerBean("audi", Vehicle.class,audiSupplier);
        }
        
        Vehicle volksWagon = null;
        Vehicle audi = null;
        
        try {
        	volksWagon = context.getBean("volks",Vehicle.class);
        }catch(NoSuchBeanDefinitionException beanDefinitionException){
        	System.out.println("Error while creating the Bean of VolksWagon");
        }
        try {
        	audi = context.getBean("audi",Vehicle.class);
        }catch(NoSuchBeanDefinitionException beanDefinitionException) {
        	System.out.println("Error while creating the bean of Audi");
        }
        
        if(null != volksWagon) {
        	System.out.println("programatically bean got created Volkswagon");
        }else {
        	System.out.println("programatically bean got created audi");
        }
    }
}
