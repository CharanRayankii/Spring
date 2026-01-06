package com.Rc.example6.beans;

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
	public void tyresRotate() {
		System.out.println("tyres got rotated from vehicle class");
		tyres.rotate();
	}

}
