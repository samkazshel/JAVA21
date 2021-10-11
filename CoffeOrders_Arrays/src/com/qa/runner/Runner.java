package com.qa.runner;

import com.qa.demo.CoffeeOrders_Methods;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//created a way to access the method using objects
		CoffeeOrders_Methods manager = new CoffeeOrders_Methods();
		
		
		manager.addNewOrder("Small Espresso w/ Chocolate");
		manager.addNewOrder("Large Cold Brew w/ Double Shot");
		manager.addNewOrder("Medium Cappucino w/ Oat Milk");
		manager.addNewOrder("Medium Flat White");
		manager.returnOrders();
		manager.modifyOrder(1, "Large Cold Brew");
		manager.returnOrders();
		manager.removeOrder(0);
		manager.returnOrders();
		manager.moveOrderToDone(2);
		manager.arrayLength();
		manager.cleardoneOrders();
		manager.clearOrders();
		
		
	}

}
