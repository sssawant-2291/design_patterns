package com.app.entites.actual;

import com.app.entites.impl.Duck;
import com.app.entites.impl.FlyNoWay;
import com.app.entites.impl.Squek;

public class PlasticDuck extends Duck {

	public PlasticDuck() {
		super();
		flyBehaviour = new FlyNoWay();
		quackBehaviour = new Squek();
	}

	@Override
	public void display() {
		System.out.println("This is plastic duck...");
		
	}

}
