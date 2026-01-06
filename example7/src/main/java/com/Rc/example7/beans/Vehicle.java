package com.Rc.example7.beans;

public class Vehicle {

	private String name;
	private Tyres tyres;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Tyres getTyres() {
		return tyres;
	}
	public void setTyres(Tyres tyres) {
		this.tyres = tyres;
	}
	
	public Vehicle(String name, Tyres tyres) {
		super();
		this.name = name;
		this.tyres = tyres;
	}
	
	
	public void rotateTyres() {
		System.out.println("Rotating from the vehicle class");
		tyres.rotate();
	}
	
	
	
}
