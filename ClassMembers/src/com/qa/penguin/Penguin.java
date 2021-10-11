package com.qa.penguin;

public class Penguin {

	public boolean hasHappyFeet;
	public String name;
	public float height;
	
	//Static
	//Static - Class specific variable
	//Opposite of static = instanced
	//Each instance of that class has unique values
	
	//Up to this point we have been working with CLASSES
	//Now we're working with OBJECTS so variables/ methods
	//do NOT need to be static
	
	//A static variable will be the same across all OBJECTS
	public static String animal = "Penguin";
	
	public Penguin(boolean hasHappyFeet, String name, float height) {
		super();
		this.hasHappyFeet = hasHappyFeet;
		this.name = name;
		this.height = height;
	}
	
	
	
	//created an instance variable 
	public void noise() {
		System.out.println("Noot Noot");
	}
	
	//Create a static method to show the difference
	public static void staticNoise() {
		System.out.println("ZZZZZZZZZ");
	}
	
	
	
	
}
