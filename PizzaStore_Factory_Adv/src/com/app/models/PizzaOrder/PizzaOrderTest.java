package com.app.models.PizzaOrder;

import com.app.enums.PizzaTypes;
import com.app.models.Pizza;
import com.app.models.PizzaStore;
import com.app.models.franchise.CGPizzaStore;
import com.app.models.franchise.NYPizzaStore;

public class PizzaOrderTest {
	private static PizzaStore store;
	private static Pizza pizza;

	static {
		store = null;
		pizza = null;
	}

	public static void main(String[] args) {
		// Chicago pizza store franchise
		store = new CGPizzaStore();
		pizza = store.orderPizza(PizzaTypes.CheesePizza);

		// New york pizza franchise store
		store = new NYPizzaStore();
		pizza = store.orderPizza(PizzaTypes.CheesePizza);
	}

}
