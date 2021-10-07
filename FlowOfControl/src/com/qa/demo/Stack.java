package com.qa.demo;

public class Stack {
	
	//Will be called directly by main
	public static int FirstLayer() {
		int total = 5;
		total += secondLayer(4);
		
		return total;
	}
	
	// this will be called by our first layer
	public static int secondLayer (int num) {
		
		//taking in the number and multiplying by 2
		int subtotal = num *2;
		
		return subtotal;
	}

}
