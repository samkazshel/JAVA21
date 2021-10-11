package com.qa.dragon;

public class Dragon {

	//Encapsulation
	//The idea that data should be accessible on a principle of less 
	//Only Stuff that needs to know that data has access to it
	
	//What methods can change data
	//What methods can read data
	//What the data can be changed to
	//If the data should be changeable at all
	
	// This is achieved through getters and setters
	
	private String breathType;
	private boolean canFly;
	private String name;
	private int wingSpan;
	
	public Dragon(String breathType, boolean canFly, String name, int wingSpan) {
		super();
		this.breathType = breathType;
		this.canFly = canFly;
		this.name = name;
		this.wingSpan = wingSpan;
	}
	
	//All objects of type dragon have PUBLIC read/write access to the variables
	//Anything can get the variables and set them to whatever

	public String getBreathType() {
		return breathType;
	}

	public void setBreathType(String breathType) {
		this.breathType = breathType;
	}

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if (name == "charizard") {
			System.out.println("Don't do that we'll get sued");
			this.name = "charlie";
		} else {
			this.name = name;
		}
	}

	public int getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(int wingSpan) {
		
		if(wingSpan > 50) {
			System.out.println("Wingspan too great");
			this.wingSpan = 50;
		} else {
		this.wingSpan = wingSpan;
		}
	}
	
	
	
	
}
