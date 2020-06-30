package com.revature.eval.java.core.pets.driver;

import com.revature.eval.java.core.pets.Cat;

public class Driver {
	
	public static void main (String[] args) {
		Cat cat = new Cat("Tiger", "Orange", 4, 13, 0);
		if (cat.lookInFoodBowl() == 0) cat.fillFoodBowl();
		cat.Eat(cat.lookInFoodBowl());
	}
}
