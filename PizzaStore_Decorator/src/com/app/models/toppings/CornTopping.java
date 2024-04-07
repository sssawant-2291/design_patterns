package com.app.models.toppings;

import com.app.models.Pizza;
import com.app.models.PizzaToppingDecorator;

public class CornTopping extends PizzaToppingDecorator {
	private Pizza pizza;

	public CornTopping(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return this.pizza.getDescription() + " + Corn Topping";
	}

	@Override
	public Double cost() {
		return 15 + this.pizza.cost();
	}

}
