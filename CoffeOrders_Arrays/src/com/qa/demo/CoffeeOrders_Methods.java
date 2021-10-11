package com.qa.demo;

import java.util.ArrayList;

public class CoffeeOrders_Methods {

	static ArrayList<String> orders = new ArrayList<>();
	static ArrayList<String> doneOrders = new ArrayList<>();
	
	//changed methods from static 
	
	public void addNewOrder(String coffeeOrder) {
		
		orders.add(coffeeOrder);
		
	}
	
	public void returnOrders() {
		for(int i = 0; i < orders.size(); i++) {
			System.out.println(orders.get(i));
		}
	}
	
	public void modifyOrder(int orderPosition, String mod) {
		orders.set(orderPosition, mod);
	}
	
	public void removeOrder(int orderPosition) {
		orders.remove(orderPosition);
	}
	
	public void moveOrderToDone(int orderPosition) {
		doneOrders.add(orders.get(orderPosition));
		orders.remove(orderPosition);
		for(int i = 0; i < doneOrders.size(); i++) {
			System.out.println(doneOrders.get(i));
		}
	}
	
	public void arrayLength() {
		System.out.println(orders.size());
		System.out.println(doneOrders.size());
	}
	
	public void clearOrders() {
		orders.clear();
		System.out.println(orders.size());
	}
	
	public void cleardoneOrders() {
		doneOrders.clear();
		System.out.println(doneOrders.size());
	}
}
