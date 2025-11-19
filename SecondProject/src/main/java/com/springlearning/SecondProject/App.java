package com.springlearning.SecondProject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import com.spring.config.AppConfig;
import com.spring.models.Vehicle;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		// No unique Bean Defination occour here.
		// Vehicle veh=context.getBean(Vehicle.class);
		// System.out.println(veh.getName());

		// 1st type
		// Vehicle veh = context.getBean("method name",Vehicle.class);
		//Vehicle veh = context.getBean("vehicle1",Vehicle.class);
		//System.out.println(veh.getName());

		// 2nd type
		// @Bean(name = "rr") --> write in config class
		// the name which we have used at the time of bean creation "rr"
		//Vehicle veh = context.getBean("rr",Vehicle.class);
		//System.out.println(veh.getName());
		
		
		//3rd type
		//by using Value
		//Vehicle veh = context.getBean("audi",Vehicle.class);
		//System.out.println(veh.getName());
		
		//4th type
		Vehicle veh = context.getBean("Gwagon",Vehicle.class);
		System.out.println(veh.getName());

	}
}
