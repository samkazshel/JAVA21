package com.qa.demo;

public class ReturnTypes {
	//Primitives - Simpler single value things 5,a, true, 0
	//Complex - References to multiple primitive data types, such as "Hello Everyone"
	
	//Returns - Methods within Java should return something
	
	//All this method does is return 36
	//returnInt() = 36
	//Expliciting telling the complier that this method returns int

	//Tasks
//	Create Method to return the following
//			- String
//			-Int
//			-boolean
//			-char
//			-float
//			-nothing
	
	
	public static int returnInt(){
		return 36;
	}
	
	public static String returnString(){
		return "Hey, this is a String";
	}

	public static Boolean returnBool() {
		return true;
	}
	
	public static char returnChar() {
		return 'a';
	}
	
	public static float returnFloat() {
		return 1.5f;
	}
	
	public static Object returnNULL() {
		return null;
	}
	
	public static void string7() {
		String s = "7";
		System.out.println(Integer.parseInt(s));
	}
	
}
