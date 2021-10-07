package com.qa.demo;

public class ForLoopsExercises {
	
	public static void flowChart() {
		int a = 100;
		
		while (a < 200) {
			System.out.println("Value of a is: " + a);
			a++;
		}
	}

	public static void flowChart2() {
		int a = 100;
		
		while (a <= 200) {
			int mod = a % 2;
			if (mod == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
			a++;
		}
		System.out.println("end");
	}
	
	public static void flowChart3() {
		for (int i = 1; i <= 10; i++) {
			for (int y = 1; y <= 10; y++) {
				System.out.println(y);
			}
		}
	}
	
	public static void flowChart4() {
		for (int i = 0; i < 10; i++) {
			for (int y = 0; y < i; y++) {
				System.out.println(i);
			}
		}
		
	}
	public static void coins(float cost, float amount) {
		
		//A method that takes in a float (cost) and a float (amount paid)
		//Returns the correct change for the amount paid - cost
		//Item costs $3.21 and we pay $10 we need to return $6.79 in change
		
		float change = amount - cost;
		
		//initialise variables
		int twenty = 0;
		int ten = 0;
		int five = 0;
		int two = 0;
		int one = 0;
		int fiftyPence = 0;
		int twentyPence = 0;
		int tenPence = 0;
		int fivePence = 0;
		int onePence = 0;
		
		
		//While there is more change than 20, add another 20
		while (change > 20f) {
			twenty++;
			change -= 20;
		}
		
		while (change > 10f) {
			ten++;
			change -= 10;
		}
		
		while (change > 5f) {
			five++;
			change -= 5;
		}
		
		//This still needs to be completed
		
		System.out.println("Twenty : " + twenty);
		System.out.println("Ten :" + ten);
		System.out.println("Five :" + five);
		
	}
	
	public static void num1(int amount) {
		
		int num1 = amount / 10;
		int num2 = amount % 10;
		
		int total = num1 + num2;
		
		System.out.println(total);
	}
	
	public static void num2() {
		
	}
	
	
}
