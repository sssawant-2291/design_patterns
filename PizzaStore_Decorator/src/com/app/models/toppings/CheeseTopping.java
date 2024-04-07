package com.app.models.toppings;

import com.app.models.Pizza;
import com.app.models.PizzaToppingDecorator;

public class CheeseTopping extends PizzaToppingDecorator {
	private Pizza pizza;

	public CheeseTopping(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return this.pizza.getDescription() + " + Cheese Topping";
	}

	@Override
	public Double cost() {
		return 20 + this.pizza.cost();
	}

}
