package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.models.Vehicle;

@Configuration
public class AppConfig {
	
	
	@Bean
	Vehicle vehicle1() {
		Vehicle vehicle = new Vehicle();
		vehicle.setName("RR");
		return vehicle;
	}
	
	@Bean(name = "rr")
	Vehicle vehicle2() {
		Vehicle vehicle = new Vehicle();
		vehicle.setName("Ferrari");
		return vehicle;
	}
	@Bean(value = "audi")
	Vehicle vehicle3() {
		Vehicle vehicle = new Vehicle();
		vehicle.setName("AUDI");
		return vehicle;
	}
	@Bean("Gwagon")
	Vehicle vehicle4() {
		Vehicle vehicle = new Vehicle();
		vehicle.setName("G-Wagon");
		return vehicle;
	}

}
