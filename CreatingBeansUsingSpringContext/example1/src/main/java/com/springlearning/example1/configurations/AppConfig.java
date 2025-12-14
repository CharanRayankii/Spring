package com.springlearning.example1.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springlearning.example1.models.Vehicle;

@Configuration
public class AppConfig {
	@Bean
	public Vehicle vehicle() {
		return new Vehicle();
	}

}
