package com.app.Pizzahut;

import com.app.models.Pizza;
import com.app.models.PizzaFactory;

public class PizzahutOrders {

	public static void main(String[] args) {
		
		Pizza pizza = null;
		
		PizzaFactory factory = new PizzaFactory();
		
		pizza = factory.createPizza("CheesePizza");
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		

	}

}
