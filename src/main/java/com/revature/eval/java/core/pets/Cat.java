package com.revature.eval.java.core.pets;

public class Cat extends Pets {
	private static final int foodBowlCapacity = 100;
	private int foodBowl;
	public Cat (String name, String color, int nLegs, int oneBite, int foodBowl) {
		super(name, color, nLegs, oneBite);
		this.foodBowl = foodBowl;
	}
	public int lookInFoodBowl () { return foodBowl; }
	public void fillFoodBowl () { foodBowl = foodBowlCapacity; }
	protected void Call () { System.out.println("meow!"); }
}
