package com.qa.calculator;

public class CalcMethods {
	
	//Add 
	public static int addNums(int num1, int num2) {
		int result = num1 + num2;
		return result;
		
	}
	
	//Subtract
	public static int subNums(int num1, int num2) {
		int result = num1 - num2;
		return result;
		
	}
	
	//Multiply
	public static int multiNums(int num1, int num2) {
		int result = num1 * num2;
		return result;
		
	}
	
	//Divide
	public static int divideNums(int num1, int num2) {
		int result = num1 / num2;
		return result;
		
	}
	
	//Power Of
	public static int powerNums(int num1, int num2) {
		int result = (int) (Math.pow(num1, num2));
		return result;	
	}

}
