package com.appconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.model.Vehicle;
@Configuration
public class AppConfig {
	@Bean(name = "ferrari")
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
