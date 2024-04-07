package com.app.models;

public class MargaritaPizza implements Pizza{
	private String type;

	public MargaritaPizza() {
		type = "MargaritaPizza";
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

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "MargaritaPizza";
	}

}
