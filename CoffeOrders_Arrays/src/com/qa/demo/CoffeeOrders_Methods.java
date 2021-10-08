package com.qa.demo;

import java.util.ArrayList;

public class CoffeeOrders_Methods {

	static ArrayList<String> orders = new ArrayList<>();
	static ArrayList<String> doneOrders = new ArrayList<>();
	
	public static void addNewOrder(String coffeeOrder) {
		
		orders.add(coffeeOrder);
		
	}
	
	public static void returnOrders() {
		for(int i = 0; i < orders.size(); i++) {
			System.out.println(orders.get(i));
		}
	}
	
	public static void modifyOrder(int orderPosition, String mod) {
		orders.set(orderPosition, mod);
	}
	
	public static void removeOrder(int orderPosition) {
		orders.remove(orderPosition);
	}
	
	public static void moveOrderToDone(int orderPosition) {
		doneOrders.add(orders.get(orderPosition));
		orders.remove(orderPosition);
		for(int i = 0; i < doneOrders.size(); i++) {
			System.out.println(doneOrders.get(i));
		}
	}
	
	public static void arrayLength() {
		System.out.println(orders.size());
		System.out.println(doneOrders.size());
	}
	
	public static void clearOrders() {
		orders.clear();
		System.out.println(orders.size());
	}
	
	public static void cleardoneOrders() {
		doneOrders.clear();
		System.out.println(doneOrders.size());
	}
}
