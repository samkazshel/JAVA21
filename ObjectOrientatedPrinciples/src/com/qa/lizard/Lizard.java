package com.qa.lizard;

//Be our abstarct class
//If something is an abstract class it cannot be instantiated == can't make objects from it
//Abstract classes are used as blueprints for other classes

//Public abstract class <class name>
public abstract class Lizard {
	
	//We do not have a constructor or fields here

	//Is an abstract method
	// no body {} - purpose is to ensure all sub classes have this method
	
	public abstract void sleep();
	
	//regular method
	public void shedSkin() {
		System.out.println("Skin shedded...grim");
	}
}
