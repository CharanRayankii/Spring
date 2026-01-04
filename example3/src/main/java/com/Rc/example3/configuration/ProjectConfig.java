package com.Rc.example3.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.Rc.example3.beans.Vehicle;

@Configuration
public class ProjectConfig {
	@Bean(name = "Audi")
	public Vehicle vehicle1() {
		Vehicle veh  = new Vehicle();
		veh.setName("Audi 8");
		return veh;
	}
	@Bean(value = "VolksWagon")
	public Vehicle vehicle2() {
		Vehicle veh  = new Vehicle();
		veh.setName("volks wagon");
		return veh;
	}
	@Primary
	@Bean("Benz")
	public Vehicle vehicle3() {
		Vehicle veh  = new Vehicle();
		veh.setName("Benz");
		return veh;
	}

}
