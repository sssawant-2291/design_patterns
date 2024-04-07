package com.app.models.impl;

import com.app.models.Pizza;

public class CGCheesePizza implements Pizza {
	private String type;
	private String crust;
	private String cheese;
	
	public CGCheesePizza() {
		cheese = "High Cheese";
		crust = "Thick crust";
		type = "CGCheesePizza";
	}

	@Override
	public void prepare() {
		System.out.println(this + " is prepared...");
	}

	@Override
	public void bake() {
		System.out.println(this + " is baked...");
	}

	@Override
	public void cut() {
		System.out.println(this + " is cut...");
	}

	@Override
	public void box() {
		System.out.println(this + " is boxed...");
	}


	@Override
	public String toString() {
		return "CGCheesePizza [type=" + type + ", crust=" + crust + ", cheese=" + cheese + "]";
	}

	public String getType() {
		return type;
	}

	public String getCrust() {
		return crust;
	}

	public String getCheese() {
		return cheese;
	}

}
