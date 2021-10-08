package com.qa.runner;

import com.qa.demo.CoffeeOrders_Methods;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoffeeOrders_Methods.addNewOrder("Small Espresso w/ Chocolate");
		CoffeeOrders_Methods.addNewOrder("Large Cold Brew w/ Double Shot");
		CoffeeOrders_Methods.addNewOrder("Medium Cappucino w/ Oat Milk");
		CoffeeOrders_Methods.addNewOrder("Medium Flat White");
//		CoffeeOrders_Methods.returnOrders();
//		CoffeeOrders_Methods.modifyOrder(1, "Large Cold Brew");
//		CoffeeOrders_Methods.returnOrders();
//		CoffeeOrders_Methods.removeOrder(0);
//		CoffeeOrders_Methods.returnOrders();
		CoffeeOrders_Methods.moveOrderToDone(2);
		CoffeeOrders_Methods.arrayLength();
		CoffeeOrders_Methods.cleardoneOrders();
		CoffeeOrders_Methods.clearOrders();
		
		
	}

}
