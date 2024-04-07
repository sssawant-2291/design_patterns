package com.app.models.toppings;

import com.app.models.Pizza;
import com.app.models.PizzaToppingDecorator;

public class OnionTopping extends PizzaToppingDecorator {
	private Pizza pizza;

	public OnionTopping(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return this.pizza.getDescription() + " + Onion Topping";
	}

	@Override
	public Double cost() {
		return 10 + this.pizza.cost();
	}

}
