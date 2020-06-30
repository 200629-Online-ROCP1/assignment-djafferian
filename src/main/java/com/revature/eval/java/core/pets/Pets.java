package com.revature.eval.java.core.pets;

public abstract class Pets {
	String name;
	String color;
	int nLegs;
	int oneBite;
	
	Pets () {}
	Pets (String name, String color, int nLegs, int oneBite) {
		this.name = name;
		this.color = color;
		this.nLegs = nLegs;
		this.oneBite = oneBite;
	}
	protected void Call () {};
	public void Eat (int food) {
		for (int i=food; 0<i; i-=this.oneBite) Call();
	}
}
