package com.springlearning.FirstProject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learning.models.Vehicle;

@Configuration
public class AppConfig {
	@Bean
	Vehicle vehicle() {
		Vehicle vehicle =  new Vehicle();
		vehicle.setName("rolls royce");
		return vehicle;
	}

}
