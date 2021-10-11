package com.qa.bird;

import com.qa.interfaces.Flyable;
import com.qa.interfaces.Hatchable;

public class Owl extends Bird implements Flyable, Hatchable{

	private int eyes;
	private String name;
	private boolean spinHead;
	@Override
	public void noise() {
		// TODO Auto-generated method stub
		System.out.println("HOOT HOOT!");
	}
	public Owl(int eyes, String name, boolean spinHead) {
		super();
		this.eyes = eyes;
		this.name = name;
		this.spinHead = spinHead;
	}
	public int getEyes() {
		return eyes;
	}
	public void setEyes(int eyes) {
		this.eyes = eyes;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isSpinHead() {
		return spinHead;
	}
	public void setSpinHead(boolean spinHead) {
		this.spinHead = spinHead;
	}
	@Override
	public void emergeFromEgg() {
		System.out.println("cracking egg...");
		
	}
	@Override
	public void cheep() {
		while (true) {
			System.out.println("cheep");
		}
		
	}
	@Override
	public void spreadWings() {
		System.out.println("spreading wings...");
		
	}
	@Override
	public void takeOff() {
		System.out.println("taking off... WHOOSH!");
		
	}
	
	

}
