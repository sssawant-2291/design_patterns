package com.app.models;

import com.app.enums.PizzaTypes;

/*
 * Pizza Store is made abstract and orderPizza is implemented and createPizza is made abstract
 * So impl subclasses has to impl createPizza by their own depending upon specific needs like:
 		There are few franchises:
 		1. Newyork, Chicago, Texas
 		2. Each franchise will have specific types of pizza so Factory method will be implemented inside crreatePizza method inside impl class
 		3. And original owner of pizzastore can keep quality assurance as prepare, bake, cut, box methods are in its supervision now
 * */
public abstract class PizzaStore {
	public Pizza orderPizza(PizzaTypes type) {
		Pizza pizza;
		
		pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	protected abstract Pizza createPizza(PizzaTypes type);
}
