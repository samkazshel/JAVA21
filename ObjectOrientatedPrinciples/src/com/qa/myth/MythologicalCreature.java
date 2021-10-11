package com.qa.myth;

//parent class
//our subclasses will inherit from this
public class MythologicalCreature {
	
	//Any attributes or methods we write in here CAN be inherited by our subclass
	//EXCEPT from PRIVATE attributes or fields
	
	//Public - every class within a project has access to it
	//Private - only this class has access to it
	//Protected - This class and any sub packages
	//Default (unspecified) -- accessible ANYWHERE in your package
	
	///These are our fields 
	public boolean isMagical;
	
	
	
	

	public MythologicalCreature(boolean isMagical) {
		super();
		this.isMagical = isMagical;
	}


	//Create a method
	public String magicPower() {
		return "does some power";
	}


	public boolean isMagical() {
		return isMagical;
	}


	public void setMagical(boolean isMagical) {
		this.isMagical = isMagical;
	}


	@Override
	public String toString() {
		return "MythologicalCreature [isMagical=" + isMagical + "]";
	}
	
	
	
	
	
}
