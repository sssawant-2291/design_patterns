package com.app.models.impl;

import com.app.models.Pizza;

public class NYVeggiePizza extends Pizza {
	public NYVeggiePizza() {
		name = "NY Style Sauce and Veggie Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";

		toppings.add("Grated Reggiano Cheese");
	}
}
