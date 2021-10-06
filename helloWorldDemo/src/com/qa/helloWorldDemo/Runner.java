package com.qa.helloWorldDemo;

import java.util.Scanner;

//ctrl + / makes text into a comment
//all of our code should run within the curly brackets {} of our class
public class Runner {
	
	//make a method that prints our "Hello World"
	// This is our main method
	//EVERYTHING that is in here will run when the code runs
	public static void main(String [] args) {
		//Java makes use of lots of dot notation
		//So 'system' had the function 'out'
		//and 'out' had the function 'println'
		//System.out.println("Hello World!");
		//System.out.println("Happy Birthday Reece!");
			helloWorld();
			happyBirthday();
			favColor();
			
	}
	
	//Make other methods that are called by our main

	//created a method called helloWorld
	// all the method does is print our helloWorld
	public static void helloWorld() {
		System.out.println("Hello World!");
	}
	
	public static void happyBirthday() {
		System.out.println("Happy Birthday Reece");
	}
	//these two methods here replace us placing the print statements into main
	
	public static void favColor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your fav color: ");
		String color = sc.nextLine();
		System.out.println("My fav color is "+color);
	}

}
