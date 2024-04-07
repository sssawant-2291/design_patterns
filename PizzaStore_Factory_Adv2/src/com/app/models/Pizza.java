package com.app.models;

import java.util.ArrayList;

public abstract class Pizza {
	protected String name;
	protected String dough;
	protected String sauce;
	protected ArrayList<String> toppings = new ArrayList<>();

	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough " + dough);
		System.out.println("Adding sauce " + sauce);
		System.out.println("Adding toppings...");
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println("  added" + toppings.get(i));
		}
	}

	public void bake() {
		System.out.println("Bake for 25 mins at 350 degrees");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza in ofﬁcial PizzaStore box");
	}

	public String getName() {
		return name;
	}
	
}
