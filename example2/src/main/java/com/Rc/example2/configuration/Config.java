package com.Rc.example2.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.Rc.example2.beans.Vehicle;

@Configuration
public class Config {
	@Bean
	public Vehicle vehicle1() {
		Vehicle vehicle = new Vehicle();
		vehicle.setName("Audi 8");
		return vehicle;
	}

}
