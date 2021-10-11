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
		System.out.println(Komodo.toString());
		
		Lizard Chameleon = new Lizard("Chameleon", 3, 0.6f);
		System.out.println(Chameleon.toString());
		
		Lizard mexicanBeadedLizard = new Lizard("Mexican Beaded Lizard", 50, false, 30f, true);
		System.out.println(mexicanBeadedLizard.toString());
		
		mexicanBeadedLizard.setLifeExpectancy(7);
		System.out.println(mexicanBeadedLizard.toString());
	}
}
