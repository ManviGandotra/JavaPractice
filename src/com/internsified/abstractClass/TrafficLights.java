package com.internsified.abstractClass;

public abstract class TrafficLights {
	
	public abstract void redLight();
	
	public abstract void yellowLight();
	
	public abstract void greenLight();
	
	public void allLightsOn() {
		System.out.println("Error in lights");
	}

}
