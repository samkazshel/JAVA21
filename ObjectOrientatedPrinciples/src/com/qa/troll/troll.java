package com.qa.troll;

public class troll {
	
	private String name;
	private int height;
	private boolean isEvil;
	private String weapon;
	private float bounty;
	
	
	public troll(String name, int height, boolean isEvil, String weapon, float bounty) {
		super();
		this.name = name;
		this.height = height;
		this.isEvil = isEvil;
		this.weapon = weapon;
		this.bounty = bounty;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		if (name == "Cum Lord") {
			System.out.println("OI! NAUGHTY");
			this.name = "Name too spicy";
		} else {
		this.name = name;
		}
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		if (height < 2) {
			System.out.println("TROLL NOT THAT SMALL");
			this.height = 2;
		} else {
		this.height = height;
		}
	}


	public boolean isEvil() {
		return isEvil;
	}


	public void setEvil(boolean isEvil) {
		this.isEvil = isEvil;
	}


	public String getWeapon() {
		return weapon;
	}


	public void setWeapon(String weapon) {
		if (weapon == "Sword") {
			System.out.println("Not enough dex to use sword");
			this.weapon = "rock";
		}
		this.weapon = weapon;
	}


	public float getBounty() {
		return bounty;
	}


	public void setBounty(float bounty) {
		if (bounty < 10) {
			System.out.println("MY BOY AINT DONE NOTHING! STOP!");
			this.bounty = 0;
		}
		this.bounty = bounty;
	}
	
	
	
	

}
