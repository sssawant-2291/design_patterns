package com.app.models.concrete;

import com.app.models.Pizza;

public class ThinCrust extends Pizza {
	
	public ThinCrust() {
		description = "Thin Crust";
	}
	@Override
	public Double cost() {
		return 80.0;
	}

}
