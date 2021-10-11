package com.qa.interfaces;

//An interface rather than a class

//An interface is a wholly abstract class with ONLY abstract methods
//no need to specify whether stuff is abstract (as it has to be)
// They use 'implements' instead of extend, and one class can implement as many as you want
public interface Camoflague {

	//Good interfaces should have as few methods as possible
	
	//Interface contains 2 (but as few as possible) abstract methods
	
	public void camouflague();
	public void hide();
	
}
