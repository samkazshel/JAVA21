package com.qa.demo;

public class Arrays {

	//What are arrays
	//Arrays are lists of data, and contain multiple pieces of data that can be accessed.
	// Java Arrays MUST contain collections of like values (int, string, char, boolean etc.)
	
	//Strings are just arrays of chars
	//"Hello World" = 'H', 'e', etc.
	
	//Arrays are immutable, the length and data type of an array CANNOT be changed
	//But the values in the array can
	//Arrays are like trains, a train mid journey must all be passengers and the amount of cars cannot
	//change. BUT the people getting on the train can change
	
	//There are a few ways of creating them
	//Specify the DATA TYPE
	//Specify the name
	
	public static void arrayDemo() {
		//String colour = "red";
		
		//[] denotes an array
		//Created an empty colour array
		//String [] colourArray;
		
		String[] colourArray = {"Red", "Blue", "Green", "Yellow"};
		
		//Creating an empty array BUT specifying the length of it
		int[] favNumsArray = new int[4];
		
		//Task
		//Create 4 Arrays with 4 Values; Name (sting), favLetter(char), favNum(int or float), likesPineappleOnPizza (boolean)
		
		String [] Name = {"James", "Bob", "Steve", "Alan"};
		char [] favLetter = {'c', 'b', 'z', 'q'};
		int [] favNumber = {23, 47, 88, 45};
		boolean [] likesPineappleOnPizza = {true, false, false, true};
		
		//When printing an array, you print the reference to the memory
		//Complex objects are references to primitive datas
		System.out.println(Name);
		
		//Manipulating Arrays/ Indexing
		
		//With Java, arrays are indexed at 0
		//The first element of an array is id'd as 0, with each subsequent one being 1 higher
		
		System.out.println(Name[0]);
		System.out.println(Name[1]);
		
		//By accessing the index of the array, I can modify the data
		Name[1] = "Bobby";
		System.out.println(Name[1]);
		
		
			
		}
	
	public static void arrayMatch() {
		
		int[] array10 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] arrayIn = new int[10];
		
		for (int i = 0; i < array10.length; i++) {
			int square = array10[i] *= array10[i];
			arrayIn[i] = square;
			System.out.println(square);
		}
		
		for (int i = 0; i < array10.length; i++) {
			System.out.println(arrayIn[i]);
		}
		
		for (int i = arrayIn.length-1;i >= 0; i--) {
			System.out.println(arrayIn[i]);
		}
		
	}
	
	public static void enhancedForLoop() {
		
		String [] pizzas = {"Pepperoni", "Meat Feast", "Hawaiian", "Calzone", "Veggie"};
		
		
		for(int i = 0; i < pizzas.length;i++) {
			System.out.println(pizzas[i]);
		}
		
		
		//Enhanced for loop
		//Data type and stand in variable : array
		for(String pizza : pizzas) {
			System.out.println(pizza);
			
		}
		
		
		
	}
	
	
	}
