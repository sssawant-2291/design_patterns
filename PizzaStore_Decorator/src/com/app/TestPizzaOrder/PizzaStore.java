package com.app.TestPizzaOrder;

import com.app.models.Pizza;
import com.app.models.concrete.PlainPizza;
import com.app.models.concrete.ThinCrust;
import com.app.models.toppings.CheeseTopping;
import com.app.models.toppings.CornTopping;
import com.app.models.toppings.OnionTopping;

public class PizzaStore {

	public static void main(String[] args) {
		Pizza p1 = new PlainPizza();
		System.out.println("you ordered "+ p1.getDescription() + "=" + p1.cost());
		
		p1 = new CheeseTopping(p1);
		p1 = new OnionTopping(p1);
		System.out.println("You ordered "+ p1.getDescription() + "=" + p1.cost());
		
		Pizza p2 = new ThinCrust();
		p2 = new OnionTopping(p2);
		p2 = new CornTopping(p2);
		System.out.println("You ordered "+ p2.getDescription() + "=" + p2.cost());
		
	}

}
