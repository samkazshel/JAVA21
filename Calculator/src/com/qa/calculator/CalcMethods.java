package com.qa.calculator;

public class CalcMethods {
	
	public int num1;
	public int num2;
	
	
	
	//We no longer need to pass the num1 and num2 parameters in each method
	//As our object already takes in the numbers, so we can just used whatever object we've made
	//and pass in the numbers using the new object
	public CalcMethods(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	//Add 
	public int addNums() {
		int result = num1 + num2;
		return result;
		
	}
	
	//Subtract
	public int subNums() {
		int result = num1 - num2;
		return result;
		
	}
	
	//Multiply
	public int multiNums() {
		int result = num1 * num2;
		return result;
		
	}
	
	//Divide
	public int divideNums() {
		int result = num1 / num2;
		return result;
		
	}
	
	//Power Of
	public int powerNums() {
		int result = (int) (Math.pow(num1, num2));
		return result;	
	}

}
