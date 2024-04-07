package com.app.models.impl;

import com.app.models.Pizza;

public class NYPepperoniPizza extends Pizza {
	public NYPepperoniPizza() {
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";

		toppings.add("Grated Reggiano Cheese");
	}
}
