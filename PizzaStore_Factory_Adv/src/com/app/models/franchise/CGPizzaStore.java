package com.app.models.franchise;

import com.app.enums.PizzaTypes;
import com.app.models.Pizza;
import com.app.models.PizzaStore;
import com.app.models.impl.CGCheesePizza;
import com.app.models.impl.CGPepperoniPizza;
import com.app.models.impl.CGVeggiePizza;

public class CGPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(PizzaTypes type) {
		Pizza pizza = null;

		if (type.equals(PizzaTypes.CheesePizza))
			pizza = new CGCheesePizza();
		else if (type.equals(PizzaTypes.PepperoniPizza))
			pizza = new CGPepperoniPizza();
		else if (type.equals(PizzaTypes.VeggiePizza))
			pizza = new CGVeggiePizza();
		return pizza;
	}

}
