package com.spring.model;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
