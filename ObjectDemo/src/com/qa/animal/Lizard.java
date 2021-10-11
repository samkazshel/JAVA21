package com.qa.animal;

public class Lizard {
	public String Name;
	public int lifeExpectancy;
	public boolean hibernates;
	public float length;
	public boolean venomous;
	public Lizard(String name, int lifeExpectancy, boolean hibernates, float length) {
		super();
		Name = name;
		this.lifeExpectancy = lifeExpectancy;
		this.hibernates = hibernates;
		this.length = length;
	}
	public Lizard(String name, int lifeExpectancy, float length) {
		super();
		Name = name;
		this.lifeExpectancy = lifeExpectancy;
		this.length = length;
	}
	public Lizard(String name, int lifeExpectancy, boolean hibernates, float length, boolean venomous) {
		super();
		Name = name;
		this.lifeExpectancy = lifeExpectancy;
		this.hibernates = hibernates;
		this.length = length;
		this.venomous = venomous;
	}
	
	//Getters and Setters
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getLifeExpectancy() {
		return lifeExpectancy;
	}
	public void setLifeExpectancy(int lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}
	public boolean isHibernates() {
		return hibernates;
	}
	public void setHibernates(boolean hibernates) {
		this.hibernates = hibernates;
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public boolean isVenomous() {
		return venomous;
	}
	public void setVenomous(boolean venomous) {
		this.venomous = venomous;
	}
	//to string
	@Override
	public String toString() {
		return "Lizard [Name=" + Name + ", lifeExpectancy=" + lifeExpectancy + ", hibernates=" + hibernates
				+ ", length=" + length + ", venomous=" + venomous + "]";
	}
	
	
	

	


}
