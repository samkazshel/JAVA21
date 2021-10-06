package com.qa.demo;

public class Runner {
	
	public static void main(String [] args) {
        //helloReece();
		helloStudent("Sam");
		printNumber(5);
		printDetails("Sam", true, 7);
		moneyLeftInAccount(6.7f);
		wantPurchase(true, 97.99f);
		owed(65.50f, "Tim");
		blahblah('h', false, 99);
		System.out.println(adding(2, 4));
	}
	
	//Creating a method where we can pass in a name
	//Using parameters to pass in variables
	public static String helloStudent(String name) {
		System.out.println("Hello " + name);
		return name;
	}
	
	//Method that takes in a number and prints it 
	public static void printNumber(int num) {
		System.out.println("The number is " + num);
	}
	
	//create a method that takes in a String (name), Boolean(likes pineapple on pizza, and int (fav number)
	public static void printDetails(String name, boolean pineapplePizza, int favNum) {
		System.out.println("My name is: " + name + " Pineapple should be on pizza: " + pineapplePizza + " My fav number is: " + favNum);
	}
	
	//Task
	//Create a methods that take in the following variables
	//and returns them with some context
//	-int
//	-String
//	-float
//	-boolean, float
//	-float, String
//	-char, boolean, int
	
	public static float moneyLeftInAccount(float balance) {
		System.out.println("Balance left in account: " + balance);
		return balance;
	}
	
	public static void wantPurchase(boolean purchase, float amount) {
		System.out.println("I want to purchase this item: " + purchase + "Amount paying: " + amount);
	}
	
	public static void owed(float amount, String person) {
		System.out.println("The amount I owe is: " + amount + " I owe this to: " + person);
	}
	
	public static void blahblah(char b, boolean l, int a) {
		System.out.println("blah " + b + " blah " + l + "blash " + a);
	}
	
	public static int adding(int num1, int num2) {
		int num3 = num1 + num2;
		return num3;
	}
	
	
	//This process is SLOWWWW for printing our multiple student name
	//We would need to create a new method for each student name
	public static String helloReece() {
		System.out.println("Hello Reece");
		return "Hello Reece";
	}
}
