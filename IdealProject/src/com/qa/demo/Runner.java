package com.qa.demo;

import com.qa.printer.Printer;
import com.qa.numPackage.NumClass;

//Each project should have only one runer
//The runner should ONLY contain the main method
public class Runner {
	
	public static void main(String [] args) {
		//The main should only contain references to other methods or prints statements
		Printer.printHello();
		NumClass.printNum();
		
	}
	
	//Projects should be UpperCamelCase (uppercase for every first letter of a word)
	//Classes UpperCamelCase
	//Methods camelCase
	//Packages lowercase w/ .dot.seperation
	//Variables camelCase
	//Final Variables (variables that won't change)
	// - ALLCAPS_WITH_UNDERSCORE
	// e.g. String final GOOGLE_URL = "www.google.com";

	//Two different Variables
	int num;
	int Num;
	
	//General Naming rules for ALL
	//Names should be as simple as possible
	//Prioritise short variable names
	//Begins with alphabetical letter a,b...z or $ or \ or _
	//Subsequent characters after first can be a-z OR 0-9
	//Cannot use Java reserved words, RETURN, BREAK, CONTINUE, STRING, etc.
}
