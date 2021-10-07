package com.qa.demo;

public class ForLoops {
	
	//For loops are for when you know how long the loop should go on FOR
	
	//They have four distinct components to make up
	//Initialisation (Initial Value)
	//Condition (What it checks for)
	//Iterator (How the value changes)
	//Code Block (What do you want to loop)
	
	public static void loopDemo() {
		
		//create a loop that count to 10
		
		for (int  i = 0; i <= 10; i++) {
			
			//int i = 0; - the initialisation
			//i < 10; - the condition
			//i++ - the iterator
			
			System.out.println("Value of i is : " + i);
			//This is the code block (what the loop is doing)
		}
		
		//create a loop that count from 10 down to 1
		for (int x = 10; x > 0; x--) {
			System.out.println("Value of x is : " + x);
		}
		
		//create a loop that counts in 5s from 20 to 100
		for (int y = 20; y < 100; y+=5) {
			System.out.println("Value of y is: " + y);
		}
	}

}
