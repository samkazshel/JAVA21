package com.qa.runner;

import com.qa.penguin.Penguin;

public class Runner {

	public static void main(String[] args) {
		Penguin paulie = new Penguin(true, "Paulie", 3.0f);
		Penguin patrica = new Penguin (false, "Patricia", 2.8f);
		
		System.out.println(paulie.name);
		System.out.println(patrica.name);
		System.out.println(paulie.animal);
		System.out.println(patrica.animal);
		
		
		//We cant do this because the method is not static
//		Penguin.noise();
		
		
		//Paulie is an object of class penguin, so it can access the instanced method
		paulie.noise();
		patrica.noise();
		
		//Instaced objects can access static methods but not the other way around
		paulie.staticNoise();
		Penguin.staticNoise();
	}
}
