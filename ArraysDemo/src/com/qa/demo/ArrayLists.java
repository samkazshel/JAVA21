package com.qa.demo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

	//ArrayList are RESIZABLE
	//You can create an array list of 4 items, if you need to add more... you can add more
	//Use inbuilt functions to add, remove, update etc.
	
	//They require importing, they add extra data / memory to the project
	
	//Create an arraylist as a global variable
	
	public static String [] pizzaListOld = {"pizza", "cheese"};
	
	public static ArrayList<String> pizzaList = new ArrayList<>();
	
	public static void arrayListDemo() {
		
		System.out.println(pizzaList);
//		System.out.println(pizzaListOld);
		
		//How can we add items to our arrayList
		//ArrayLists use semantic key words
		
		//ArrayListName.function("whatever you want to pass in")
		
		pizzaList.add("Meat Feast");
		System.out.println(pizzaList);
		
		//Add a pepperoni pizza to my list
		pizzaList.add("Pepperoni");
		pizzaList.add("Hawaiaan");
		pizzaList.add("Veggie Volcano");
		System.out.println(pizzaList);
		
		//Remove an item from the arrayList
		pizzaList.remove(1);
		System.out.println(pizzaList);
		
		//Arraylist.get(index) -> Gets the Element
		pizzaList.get(1);
		System.out.println(pizzaList.get(1));
		
		//length = size()
		//Returns the length/size of an array list
		
		System.out.println(pizzaList.size());
		
		//Set -> Updating elements in our array list
		
		pizzaList.set(1, "Hawaiian");
		System.out.println(pizzaList);
		
		pizzaList.add(2, "Calzone");
		System.out.println(pizzaList);
		
		
		//Clear -> removes all elements from a list
//		pizzaList.clear();
//		System.out.println(pizzaList);
		
		//Sorting
		Collections.sort(pizzaList);
		System.out.println(pizzaList);
		
	}
}
