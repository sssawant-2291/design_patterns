package com.app.models;

public class PizzaFactory {
	Pizza pizza;
	
	public Pizza createPizza(String type) {
		pizza = null;
				
		if (type.equals("CheesePizza")) {
			pizza = new CheesePizza();
		}else if(type.equals("PepperoniPizza")) {
			pizza = new PepperoniPizza();
		}else if(type.equals("MargaritaPizza")) {
			pizza = new MargaritaPizza();
		}
		
		return pizza;
		
	}
}
