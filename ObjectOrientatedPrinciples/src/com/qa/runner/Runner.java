package com.qa.runner;

import com.qa.dragon.Dragon;
import com.qa.myth.MythologicalCreature;
import com.qa.owlBear.OwlBear;
import com.qa.troll.troll;
import com.qa.unicorn.Unicorn;

public class Runner {

	public static void main(String[] args) {
		
//		Dragon charizard = new Dragon("fire", true, "Charlie", 2);
//		
//		System.out.println(charizard.getName());
//		charizard.setName("He should be a dragon type");
//		System.out.println(charizard.getName());
//		
//		charizard.setWingSpan(2349872);
//		System.out.println(charizard.getWingSpan());
//		
//		charizard.setName("charizard");
		
//		troll Reginald = new troll(false, "Reggie", 8, false, "Club", 90.10f);
//		troll Alfie = new troll(false, "Alfie", 7, true, "Pole Arm", 80f);
//		
//		Reginald.setName("Cum Lord");
//		System.out.println(Reginald.getName());
//		Reginald.setHeight(1);
//		System.out.println(Reginald.isMagical());
//		Reginald.setEvil(true);
//		System.out.println(Reginald.isEvil());
//		Alfie.setMagical(true);
//		System.out.println(Alfie.toString());
		
		
		
		
//		Unicorn bill = new Unicorn(6, true, "red");
//		
//		System.out.println(bill.isMagical);
//		System.out.println(bill.magicPower());
		
		OwlBear Jamie = new OwlBear(true, "Jamie", 14, true, 90f);
		System.out.println(Jamie.toString());
		Jamie.setSpeed(55f);
		System.out.println(Jamie.toString());
	}
}
