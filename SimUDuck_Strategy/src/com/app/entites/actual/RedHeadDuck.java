package com.app.entites.actual;

import com.app.entites.impl.Duck;
import com.app.entites.impl.FlyWithWings;
import com.app.entites.impl.Quack;

public class RedHeadDuck extends Duck {
	
	public RedHeadDuck() {
		flyBehaviour = new FlyWithWings();
		quackBehaviour = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I am red head duck");
		
	}

}
