package com.qa.demo;

public class Scope {
	
	//There are three types of scope
	// What has access to the variables and methods you're creating
	
	//Class level / Instance Scope - Variables defined INSIDE a class BUT OUTSIDE of methods
	// Method / Local Scope - Variables defined INSIDE of methods
	//And generally only used for that method
	
	//Class level scope variable
	//Accessible to ALL methods within class
	
	static int numberVar = 123;
	
	static int bankDetails = 64342656;
	
	public static void methodDemo() {
		System.out.println(numberVar);
	}
	
	public static void conflictingDemo() {
		int numberVar = 20;
		System.out.println(numberVar);
	}
	
	//Method level or local scope
	//These are variables create within a method, that disappear after the method ceases to exist
	
	public static String localDemo() {
		String password = "unicorn1234";
		System.out.println(password);
		return password;
	}

	public static void printPassword(){
		System.out.println(password);
	}
}
