package com.qa.demo;

public class IterationMethods {
	
	//Iterations allow you to repeat blocks of code until a specific condition is met
	//Loops, iteration in ANY programming language keep running code until the condition is met
	
	//While - Does the code WHILE a boolean / other statement is true
	//Do - While - Does the code at least once THEN checks then condition
	//For - Does the code for a set number of iterations
	
	public static void whileDemo() {
		
		int housePlants = 0;
		
		//while is our keyword, acts like an if statement
		while(housePlants < 10) {
			System.out.println("Current number of plants: " + housePlants);
			System.out.println("Grab Another!");
			housePlants++;
		}
		
		System.out.println("Final Number of plants: " + housePlants);
	}

	
	public static void doWhileDemo() {
		
		int hoursSlept = 0;
		
		do {
			System.out.println("Hours slept: " + hoursSlept);
			hoursSlept++;
		} while (hoursSlept > 7);
	}
	
	//Task - Create a method that takes in a starting amount of money (300)
	// - The same amount of money is deducted every time (30)
	// - When the total money left goes under a different value (50), the loop stops 
	// - And prints out "stop spending money!"
	
	//This should really be a do or do while loop, as the for loop is not actually making use
	//of the integer i
	public static void forLoopDemo(int money, int stop) {
		
		int min = 50;
		int max = 200;
		
		int deduction = (int)(Math.random()*(max-min+1)+min);
		
		for (int i = 0; money > stop; i++) {
			money -= deduction;
			System.out.println(money);
		}
		System.out.println("Stop Spending Money!");
		
	}
}
