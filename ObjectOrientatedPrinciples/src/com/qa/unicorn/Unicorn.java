package com.qa.unicorn;

import com.qa.myth.MythologicalCreature;

//we need to specify that unicorn inherits mythological creature
public class Unicorn extends MythologicalCreature{
	
	private int hornSize;
	private boolean wings;
	private String colour;
	

	
	
	public Unicorn(boolean isMagical, int hornSize, boolean wings, String colour) {
		super(isMagical);
		this.hornSize = hornSize;
		this.wings = wings;
		this.colour = colour;
	}

	public int getHornSize() {
		return hornSize;
	}

	public void setHornSize(int hornSize) {
		this.hornSize = hornSize;
	}

	public boolean isWings() {
		return wings;
	}

	public void setWings(boolean wings) {
		this.wings = wings;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}


	@Override
	public String toString() {
		return "Unicorn [hornSize=" + hornSize + ", wings=" + wings + ", colour=" + colour + ", isMagical=" + isMagical
				+ "]";
	}
	
	
	

}
