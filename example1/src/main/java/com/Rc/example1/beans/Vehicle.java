package com.Rc.example1.beans;

import com.Rc.example1.FactoryClasses.SpeakerFactory;

public class Vehicle {
	
	
	public void makeVehicle() {
		Sonyspeakers speaker =new Sonyspeakers();
		speaker.makeSound();
	}
	public void makevehicle1() {
		SpeakerFactory sf = new SpeakerFactory();
		Speakers s= sf.getSpeakers("bosh");
		s.makeSound();
	}

}
