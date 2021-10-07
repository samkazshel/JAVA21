package com.qa.demo;

import java.util.Random;

public class DiceRoller {

	// Task
	// Rolling 4 Separate 6 sided dice and getting the total
	// 3 Separate 6 sided dice, returning the total. Rolling 2 eight sided dice,
	// returning that total
	// Adding both totals together
	// Roll a 2 sided, 3 sided, 4 sided, 5 sided, 6 sided, 8 sided add the total

	public static int getRandNum(int num) {
		return new Random().nextInt(num);
	}

	public static int roll4d6() {
		int result = 0;
		
		// This conditional statement seems to only work on the lower bound here
		result += new Random().nextInt(6+1);
		if (result == 6) {
			System.out.println("Critical Success");
			result += new Random().nextInt(6+1);
			result += new Random().nextInt(6+1);
			result += new Random().nextInt(6+1);
		} else if (result == 1) {
			System.out.println("Critical Failure");
			return result;
		} else {
		result += new Random().nextInt(6+1);
		result += new Random().nextInt(6+1);
		result += new Random().nextInt(6+1);
		}
		return result;
	}

	public static int roll3d6_2d8() {
		int resultd6 = 0;
		
		resultd6 += new Random().nextInt(6);
		resultd6 += new Random().nextInt(6);
		resultd6 += new Random().nextInt(6);

		int total = 0;

		total = resultd6 + roll2d8();

		return total;
	}

	public static int roll2d8() {
		int resultd8 = 0;
		
		resultd8 += new Random().nextInt(8);
		resultd8 += new Random().nextInt(8);

		return resultd8;
	}

	public static int rollFull() {
		int resultFull = 0;

		resultFull += new Random().nextInt(2);
		resultFull += new Random().nextInt(3);
		resultFull += new Random().nextInt(4);
		resultFull += new Random().nextInt(5);
		resultFull += new Random().nextInt(6);
		resultFull += new Random().nextInt(8);
		

		return resultFull;

	}

	public static String log(int num) {
		
		String log = "Dice roll with a result of :";
		
		System.out.println(log + num);
		
		return log;
	}
}
