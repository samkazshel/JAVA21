package com.qa.operators;

import com.qa.demo.OperatorMethods;

public class Runner {
	
	public static void main(String [] args) {
		OperatorMethods.addNumbers();
		OperatorMethods.minusNumbers();
		System.out.println(OperatorMethods.addTwoNums(5, 6));
	}

}
