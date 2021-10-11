package com.qa.demo;

import com.qa.calculator.CalcMethods;

public class Runner {
	
	public static void main(String [] args) {
		CalcMethods enter56 = new CalcMethods(5, 6);
		
		System.out.println(enter56.addNums());
		System.out.println(enter56.subNums());
		System.out.println(enter56.multiNums());
		System.out.println(enter56.divideNums());
		System.out.println(enter56.powerNums());
	}

}
