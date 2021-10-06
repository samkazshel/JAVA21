package com.qa.demo;


public class Runner {
	public static void main (String [] args) {
		boo();
		helloWorld();
		System.out.println(ReturnTypes.returnInt());
		System.out.println(ReturnTypes.returnString());
		System.out.println(ReturnTypes.returnBool());
		System.out.println(ReturnTypes.returnFloat());
		System.out.println(ReturnTypes.returnChar());
		System.out.println(Integer.parseInt(ReturnTypes.string7()));
	}
	
	//Creating a method that prints hello world
	//getting our main to run that method
	
	// this is what we'd put in MAIN
	
	public static void helloWorld() {
		System.out.println("Hello World!");
	}
	
	public static void boo() {
		System.out.println("spoooooky!");
	}
}
