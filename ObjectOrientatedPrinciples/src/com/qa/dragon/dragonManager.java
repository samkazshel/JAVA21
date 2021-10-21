package com.qa.dragon;

import java.util.ArrayList;

public class dragonManager {
	
	ArrayList<Dragon> manager = new ArrayList<>();
	
	Dragon Jeff = new Dragon("Electricity", true, "Jeff", 10);
	Dragon Puff = new Dragon("Fire", false, "Puff", 80);
	
	
	public void viewDragons() {
			System.out.println(manager);
	}
	
	public void addDragon() {
		manager.add(Jeff);
		manager.add(Puff);
	}
	
	public void addDragon5() {
		
	}
	
	
	
	
}
