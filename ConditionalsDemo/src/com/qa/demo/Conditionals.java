package com.qa.demo;

public class Conditionals {

	public static void kettleDemo() {
		
		boolean kettleOn = false;
		
		// if is the keyword 
		//I'm questioning IF the variable kettleOn is equal to true
		//= assignment
		//kettleOn = true
		
		//== checking IF kettleOn is equal to true
		
		if(kettleOn == true) {
			System.out.println("kettle is on");
		} else {
			System.out.println("kettle is off");
		}
	}
	
	public static void numberDemo() {
		int number = 11;
		
		if(number > 10) {
			System.out.println("Number greater than 10");
		} else if (number == 10){
			System.out.println("Numer is equal to 10");
		} else {
			System.out.println("Number is less than 10");
		}
	}
	
	public static void oddEvenDemo() {
		int number = 12;
		
		if(number % 2 == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}
	}
	
	
	//Conditional Operators
	// == 
	// > | <
	// >= | <=
	// != - not equal
	// && - AND
	// || or
	
	public static void complexConditionals() {
		int number = 15;
		String colour = "red";
		
		if (number < 10 || colour == "red") {
			System.out.println("True!");
		} else {
			System.out.println("False!");
		}
	}
	
	
	public static int boolAdding(int num1, int num2, boolean dO) {
		if (dO == true) {
			int result = num1 + num2;
			return result;
		} else if (dO == false) {
			int result = num1 * num2;
			return result;
		}
		return 0;
	}
	
	//horrid horrid mess of if statements, never do this, ITS AWFUL TO READ AND LOOK AT
	public static void flowChart1(int a) {
		if(a > 2000) {
			System.out.println("A");
			if (a > 6000) {
				System.out.println("C");
			} else if (a < 6000) {
				System.out.println("B");
				if (a > 4000) {
					System.out.println("D");
				} else if (a < 4000) {
					System.out.println("E");
				}
			}
		} else if (a < 2000) {
			System.out.println(1);
			if (a > 100) {
				System.out.println(3);
				if (a > 600) {
					System.out.println(5);
				} else if (a < 600) {
					System.out.println(4);
					if (a > 500) {
						System.out.println(6);
					} else {
						System.out.println(7);
					}
				}
			} else {
				System.out.println(2);
			}
		}
	}

	public static int blackJack(int num1, int num2) {
		int closest = 0;
		if(num1 != 0 && num2 != 0) {
			if (21 - num1 < 0 && 21 - num2 <0) {
				closest = 0;
			} else if (21 - num1 > 0) {
				closest = num2;
			} else if (21 - num2  > 0) {
				closest = num1;
			}
		} else if (num1 < num2) {
			closest = num1;
		} else if (num2 < num1) {
			closest = num2;
		} else {
			closest = 0;
		}	
		return closest;
	}
}
