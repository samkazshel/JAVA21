package com.qa.demo;

public class OperatorMethods {

	//Operators are ways of manipulating numerical data
	
	//= Assign Value
	//num = 5
	
	//+ plus
	//- minus
	// / divide
	// * multiply
	// % modulus
	
	// 10 / 3 = 3
	// remainder = 1
	
	// 10 % 3 = 1 (modulus returns the remainder)
	// 7 % 2 = 1 (odd)
	// 8 % 2 = 0 (even)
	
	// ++ - increment by 1
	// -- - decrement by 1
	// += - increment by 4
	
	//this method will add two numbers togther
	public static void addNumbers() {
		int num1 = 5;
		int num2 = 8; 
		int result = num1 + num2;
		System.out.println(result);
	}
	
	//create a method that subtracts two numbers 
	public static void minusNumbers() {
		int num1 = 10;
		int num2 = 7; 
		int result = num1 - num2;
		System.out.println(result);
	}
	
	public static int addTwoNums(int num1, float num2) {
		int result = (int) (num1 + num2);
		return result;
	}
}
