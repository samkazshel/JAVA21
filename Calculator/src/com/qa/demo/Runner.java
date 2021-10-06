package com.qa.demo;

import com.qa.calculator.CalcMethods;

public class Runner {
	
	public static void main(String [] args) {
		System.out.println(CalcMethods.addNums(2, 2));
		System.out.println(CalcMethods.subNums(2, 2));
		System.out.println(CalcMethods.multiNums(2, 2));
		System.out.println(CalcMethods.divideNums(2, 2));
		System.out.println(CalcMethods.powerNums(4, 3));
	}

}
