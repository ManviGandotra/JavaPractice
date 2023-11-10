package com.internsified.abstractClass;

public class RulesOfTrafficLights extends TrafficLights {

	@Override
	public void redLight() {
		// TODO Auto-generated method stub
		System.out.println("Red means stop");
		
	}

	@Override
	public void yellowLight() {
		// TODO Auto-generated method stub
		System.out.println("Yellow means wait");
		
	}

	@Override
	public void greenLight() {
		// TODO Auto-generated method stub
		System.out.println("Green means go");
		
	}

}
