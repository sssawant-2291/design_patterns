package com.app.models.concrete;

import com.app.models.Pizza;

public class PlainPizza extends Pizza {
	
	public PlainPizza() {
		description = "Plain Pizza";
	}
	
	
	@Override
	public Double cost() {
		return 100.0;
	}

}
