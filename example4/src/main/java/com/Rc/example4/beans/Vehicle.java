package com.Rc.example4.beans;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Vehicle {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@PostConstruct
	public void method1() {
		System.out.println("method for know about postConstruct annotation");
		System.out.println("this method call happens before creating the beans");
	}

	@PreDestroy
	public void method2() {
		System.out.println("method for know about predestroy annotation");
		System.out.println("this method call happens before clearing the context beans");
	}


	

}
