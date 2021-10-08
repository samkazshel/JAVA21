package com.qa.runner;

import com.qa.animal.Lizard;
import com.qa.caketin.CakeTin;

public class Runner {

	public static void main(String[] args) {
		
		//Run our constructor and create a new cake
		//CakeTin is our datatype
		//newCake is the name of our variable
		//new CakeTin() means return a new cake object using the constructor
		
//		CakeTin newCake = new CakeTin();
		//To get the attributes of our object we need to use dot notation
//		System.out.println(newCake.icing);
		//As it's a complex data type we will only be given the object reference in memory when
		//we try to print it
//		System.out.println(newCake);
		
		Lizard Komodo = new Lizard("Komodo Dragon", 50, false, 2.59f);
		System.out.println(Komodo.Name);
		System.out.println(Komodo.lifeExpectancy);
		System.out.println(Komodo.hibernates);
		System.out.println(Komodo.length);
		
		Lizard Chameleon = new Lizard("Chameleon", 3, false, 0.6f);
		System.out.println(Chameleon.Name);
		System.out.println(Chameleon.lifeExpectancy);
		System.out.println(Chameleon.hibernates);
		System.out.println(Chameleon.length);
		
		
	}
}
