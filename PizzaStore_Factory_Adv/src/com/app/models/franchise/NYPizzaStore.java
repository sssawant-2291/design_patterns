package com.app.models.franchise;

import com.app.enums.PizzaTypes;
import com.app.models.Pizza;
import com.app.models.PizzaStore;
import com.app.models.impl.NYCheesePizza;
import com.app.models.impl.NYPepperoniPizza;
import com.app.models.impl.NYVeggiePizza;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(PizzaTypes type) {
		Pizza pizza = null;

		if (type.equals(PizzaTypes.CheesePizza))
			pizza = new NYCheesePizza();
		else if (type.equals(PizzaTypes.PepperoniPizza))
			pizza = new NYPepperoniPizza();
		else if (type.equals(PizzaTypes.VeggiePizza))
			pizza = new NYVeggiePizza();
		return pizza;
	}

}
