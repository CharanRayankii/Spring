package com.Rc.example1.FactoryClasses;

import com.Rc.example1.beans.BoshSpeakers;
import com.Rc.example1.beans.Sonyspeakers;
import com.Rc.example1.beans.Speakers;

public class SpeakerFactory {
	public Speakers getSpeakers(String speakerType) {
		if(speakerType.equalsIgnoreCase("sony"))
		{
			return new Sonyspeakers();
		}else {
			return new BoshSpeakers();
		}
	}
}
