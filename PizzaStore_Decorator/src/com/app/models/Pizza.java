package com.app.models;

public abstract class Pizza {
	protected String description;
	

	public String getDescription() {
		return description;
	}
	
	public abstract Double cost();
}
