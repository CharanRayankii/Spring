package com.springlearning.example1.models;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
	
	
	public Vehicle() {
		System.out.println("here this is using the zero param constructor");
	}

}
