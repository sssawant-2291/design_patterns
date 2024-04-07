package com.app.models.impl;

import com.app.models.Pizza;

public class NYVeggiePizza implements Pizza {

	private String type;
	private String crust;
	private String cheese;
	
	public NYVeggiePizza() {
		cheese = "Low Cheese";
		crust = "Thin crust";
		type = "NYVeggiePizza";
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
		return "NYVeggiePizza [type=" + type + ", crust=" + crust + ", cheese=" + cheese + "]";
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
