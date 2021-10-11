package com.qa.owlBear;

import com.qa.myth.MythologicalCreature;

public class OwlBear extends MythologicalCreature {
	
	private String name;
	private int wingSpan;
	private boolean agressive;
	private float speed;
	
	public OwlBear(boolean isMagical, String name, int wingSpan, boolean agressive, float speed) {
		super(isMagical);
		this.name = name;
		this.wingSpan = wingSpan;
		this.agressive = agressive;
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(int wingSpan) {
		this.wingSpan = wingSpan;
	}

	public boolean isAgressive() {
		return agressive;
	}

	public void setAgressive(boolean agressive) {
		this.agressive = agressive;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "OwlBear [name=" + name + ", wingSpan=" + wingSpan + ", agressive=" + agressive + ", speed=" + speed
				+ ", isMagical=" + isMagical + "]";
	}
	

}
